package servconn.client;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import servconn.dto.card.Card;
import servconn.dto.card.CardData;
import servconn.dto.league.LeagueData;
import servconn.dto.login.GuestLoginDto;
import servconn.dto.login.Player;
import servconn.dto.login.ServerLoginDto;
import servconn.dto.login.ServerLoginUserInfo;
import servconn.dto.mapstage.MapStageData;
import servconn.dto.rune.Rune;
import servconn.dto.rune.RuneData;
import servconn.dto.skill.Skill;
import servconn.dto.skill.SkillData;
import servconn.util.Constants;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class EkClient {

	private OkHttpClient client;
	private CookieManager cookieManager;

	private static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	
	private Map<String, Card> cardMap;
	private Map<String, Skill> skillMap;
	private Map<String, Rune> runeMap;
	private LoginData loginData;
	
	public EkClient() {
		client = new OkHttpClient();
		cookieManager = new CookieManager();
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		client.setCookieHandler(cookieManager);
		loginData = new LoginData();		

	}

	private Response doGetRequest(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();

		Response response = client.newCall(request).execute();
		return response;
	}

	private Response doPostRequest(String url, RequestBody formBody)
			throws IOException {
		Request request = new Request.Builder().url(url).post(formBody).build();

		Response response = client.newCall(request).execute();
		if (!response.isSuccessful()) {
			throw new IOException("Unexpected code " + response);
		}
		return response;
	}

	private String getConnectionData() throws IOException {
		Response response = doGetRequest(servconn.util.Constants.ARK_URL
				+ "/user/playasguest?gameid=51&platform=android&sdkvcode=2.2&androidos=15");

		String json = response.body().string();
		
		GuestLoginDto guestLogin = GSON.fromJson(json, GuestLoginDto.class);

		String[] loginStatus = guestLogin.getLoginstatus().split(":");
		Player p = new Player();
		p.setUin(loginStatus[1]);
		p.setDeviceToken(loginStatus[3]);
		loginData.setPlayer(p);
		return json;

	}

	private String getServerLoginInfo() throws IOException {

		RequestBody formBody = new FormEncodingBuilder().add("plat", "pwe")
				.add("uin", loginData.getPlayer().getUin())
				.add("nickName", loginData.getPlayer().getUin())
				.add("Devicetoken", loginData.getPlayer().getDeviceToken())
				.add("userType", "2").build();

		ServerLoginDto serverLogin = new ServerLoginDto();
		Response r = doPostRequest(
				"http://master.ek.ifreeteam.com/mpassport.php?do=plogin",
				formBody);
		String json = r.body().string();
		serverLogin = GSON.fromJson(json, ServerLoginDto.class);
		
		loginData.setServerLogin(serverLogin);

		return json;
	}

	private void doMpLogin() throws IOException {
		ServerLoginUserInfo userInfo = loginData.getServerLogin().getData().getUinfo();
		RequestBody formBody = new FormEncodingBuilder().add("plat", "pwe")
				.add("uin", loginData.getPlayer().getUin()).add("nickName", loginData.getPlayer().getUin())
				.add("Devicetoken", loginData.getPlayer().getDeviceId()).add("userType", "2")
				.add("MUid", userInfo.getMUid().toString())
				.add("ppsign", userInfo.getPpsign())
				.add("sign", userInfo.getSign())
				.add("nick", userInfo.getNick())
				.add("time", userInfo.getTime().toString())
				.add("Udid", "00-C0-7B-EF-00-F5").add("Origin", "IOS_PW")
				.build();
	
		Response r = doPostRequest(loginData.getServerUrl() + "/login.php?do=mpLogin", formBody);
		String json = r.body().string();
		//TODO log
	}

	private void login(String server) throws IOException {
		if (!loginData.isLoggedIn()) {
			String serverUrl = getServerUrl(server);
			loginData.setServer(server);
			loginData.setServerUrl(serverUrl);
			
			getConnectionData();
			getServerLoginInfo();
			doMpLogin();
			loginData.setLoggedIn(true);		
		}
	}

	public String getLeagueDataAsJson(String server) throws IOException {

		login(server);

		Response r = doGetRequest(loginData.getServerUrl()
				+ "/league.php?do=getLeagueInfo&phpl=EN");

		String json = r.body().string();
		return json;

	}
	
	public LeagueData getLeagueData(String server) throws IOException {
		String json = getLeagueDataAsJson(server);

		LeagueData leagueData = GSON.fromJson(json, LeagueData.class);	
		
		return leagueData;
	}
	
	public String getServerCardsAsJson(String server) throws IOException {
		login(server);

		Response r = doGetRequest(loginData.getServerUrl() + "/card.php?do=GetAllCard&phpl=EN");

		String json = r.body().string();
		return json;
	}
	
	
	public Map<String, Card> getServerCards(String server) throws IOException {

		String json = getServerCardsAsJson(server);

		CardData cardData = GSON.fromJson(json, CardData.class);
		List<Card> cardList = cardData.getData().getCards();
		cardMap = new HashMap<String, Card>();

		for (Card card : cardList) {
			cardMap.put(card.getCardId(), card);
		}

		return cardMap;

	}
	
	public String getServerSkillsAsJson(String server) throws IOException {
		
		login(server);

		Response r = doGetRequest(loginData.getServerUrl()
				+ "/card.php?do=GetAllSkill&phpl=EN");

		String json = r.body().string();

		return json;

	}
	
	public Map<String, Skill> getServerSkills(String server) throws IOException {

		String json = getServerSkillsAsJson(server);

		SkillData skillData = GSON.fromJson(json, SkillData.class);
		List<Skill> skillList = skillData.getData().getSkills();
		skillMap = new HashMap<String, Skill>();

		for (Skill skill : skillList) {
			skillMap.put(skill.getSkillId().toString(), skill);
		}

		return skillMap;

	}

	public String getServerRunesAsJson(String server) throws IOException {
		
		login(server);

		Response r = doGetRequest(loginData.getServerUrl() + "/rune.php?do=GetAllRune&phpl=EN");

		String json = r.body().string();

		return json;

	}
	
	  
	public Map<String, Rune> getServerRunes(String server) throws IOException {
		String json = getServerRunesAsJson(server);

		runeMap = new HashMap<String, Rune>();

		RuneData runeData = GSON.fromJson(json, RuneData.class);
		List<Rune> runeList = runeData.getData().getRunes();
		for (Rune rune : runeList) {
			runeMap.put(rune.getRuneId(), rune);
		}
		return runeMap;

	}
	
	public String getServerMapsAsJson(String server) throws IOException {
		login(server);

		Response r = doGetRequest(loginData.getServerUrl() + "/mapstage.php?do=GetMapStageALL&phpl=EN");

		String json = r.body().string();
	//	System.out.println(json);

		return json;
		
	}
	
	public MapStageData getServerMaps(String server) throws IOException {
		String json = getServerMapsAsJson(server);
		MapStageData mapStageData = GSON.fromJson(json, MapStageData.class);

		return mapStageData;

	}
	
	private String getServerUrl(String server){
		String serverUrl = Constants.SERVERLIST.get(server);
		if (serverUrl == null)
			throw new IllegalArgumentException("Unknown server error");
		return serverUrl;
	}
	
}
