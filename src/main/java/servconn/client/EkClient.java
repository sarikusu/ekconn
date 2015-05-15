package servconn.client;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import servconn.dto.card.Card;
import servconn.dto.card.CardData;
import servconn.dto.league.BattleInfo;
import servconn.dto.league.Data;
import servconn.dto.league.LeagueData;
import servconn.dto.league.LeagueNow;
import servconn.dto.league.RoundResult;
import servconn.dto.league.User;
import servconn.dto.login.GuestLoginDto;
import servconn.dto.login.Player;
import servconn.dto.login.ServerLoginDto;
import servconn.dto.login.ServerLoginUserInfo;
import servconn.dto.rune.Rune;
import servconn.dto.rune.RuneData;
import servconn.dto.skill.Skill;
import servconn.dto.skill.SkillData;

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
	
	private static final String NEWLINE = System.getProperty("line.separator");
	
	private static final Map<String, String> SERVERLIST;
	private Map<String, Card> cardMap;
	private Map<String, Skill> skillMap;
	private Map<String, Rune> runeMap;
	
	private boolean isLogin;
	
	//Abilities from Mitzi's sim
	public static TreeMap<String, String> evoNames;
	
	static {
		SERVERLIST = new HashMap<String,String>();
		SERVERLIST.put("chaos", "http://s1.ek.ifreeteam.com");
		SERVERLIST.put("harmony", "http://s2.ek.ifreeteam.com");
		SERVERLIST.put("legacy", "http://s3.ek.ifreeteam.com");
		SERVERLIST.put("destiny", "http://s4.ek.ifreeteam.com");
		SERVERLIST.put("fury", "http://s5.ek.ifreeteam.com");
		SERVERLIST.put("serenity", "http://s6.ek.ifreeteam.com");
		SERVERLIST.put("skorn", "http://s1.ekru.ifreeteam.com");
		SERVERLIST.put("apollo", "http://s1.ekbb.ifreeteam.com");
	}
	

	public EkClient() {
		client = new OkHttpClient();
		cookieManager = new CookieManager();
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		client.setCookieHandler(cookieManager);
		isLogin = false;
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

	private Player getConnectionData() throws IOException {
		Response response = doGetRequest(servconn.util.Constants.ARK_URL
				+ "/user/playasguest"
				+ "?gameid=51&deviceid=f0aa8d37a68dc09d331cdc39b1e216cb&platform=android&sdkvcode=2.0&androidos=15");

		GuestLoginDto guestLogin = GSON.fromJson(response.body().string(),
				GuestLoginDto.class);

		String[] loginStatus = guestLogin.getLoginstatus().split(":");
		Player p = new Player();
		p.setUin(loginStatus[1]);
		p.setDeviceToken(loginStatus[3]);
		return p;

	}

	private ServerLoginDto getServerLoginInfo(Player p) throws IOException {

		RequestBody formBody = new FormEncodingBuilder().add("plat", "pwe")
				.add("uin", p.getUin()).add("nickName", p.getUin())
				.add("Devicetoken", p.getDeviceToken()).add("userType", "2")
				.build();

		ServerLoginDto serverLogin = new ServerLoginDto();
		Response r = doPostRequest(
				"http://master.ek.ifreeteam.com/mpassport.php?do=plogin",
				formBody);
		serverLogin = GSON.fromJson(r.body().string(), ServerLoginDto.class);
		//System.out.println("EkClient.getServerLoginInfo()" + serverLogin);

		return serverLogin;
	}

	private void doMpLogin(Player p, ServerLoginDto serverLogin, String serverUrl) throws IOException {
		ServerLoginUserInfo userInfo = serverLogin.getData().getUinfo();
		RequestBody formBody = new FormEncodingBuilder().add("plat", "pwe")
				.add("uin", p.getUin()).add("nickName", p.getUin())
				.add("Devicetoken", p.getDeviceId()).add("userType", "2")
				.add("MUid", userInfo.getMUid().toString())
				.add("ppsign", userInfo.getPpsign())
				.add("sign", userInfo.getSign())
				.add("nick", userInfo.getNick())
				.add("time", userInfo.getTime().toString())
				.add("Udid", "00-C0-7B-EF-00-F5").add("Origin", "IOS_PW")
				.build();
	
		Response r = doPostRequest(serverUrl + "/login.php?do=mpLogin", formBody);
		//TODO log
	}

	private void login(String serverUrl) throws IOException {		
		Player p = getConnectionData();
		ServerLoginDto serverLogin = getServerLoginInfo(p);
		doMpLogin(p, serverLogin, serverUrl);
		isLogin = true;
	}

	private LeagueData getLeagueData(String server) throws IOException, EkClientException {
		String serverUrl = getServerUrl(server);
		
		if (!isLogin) {
			login(serverUrl);
		}
		
		Response r = doGetRequest(serverUrl	+ "/league.php?do=getLeagueInfo&phpl=EN");
		
		String json = r.body().string();

		LeagueData leagueData = GSON.fromJson(json, LeagueData.class);
		
		return leagueData;
	}
	
	public Map<String, Card> getCards(String server) throws IOException, EkClientException {
		String serverUrl = getServerUrl(server);
		
		if (!isLogin) {
			login(serverUrl);
		}
		
		Response r = doGetRequest(serverUrl + "/card.php?do=GetAllCard&phpl=EN");

		String json = r.body().string();
		CardData cardData = GSON.fromJson(json, CardData.class);
		List<Card> cardList = cardData.getData().getCards();
		cardMap = new HashMap<String,Card>();
		
		for (Card card : cardList) {
			cardMap.put(card.getCardId(), card);
		}
		
		return cardMap;

	}
	
	public Map<String, Skill> getSkills(String server) throws IOException, EkClientException {
		String serverUrl = getServerUrl(server);
		
		if (!isLogin) {
			login(serverUrl);
		}
		
		Response r = doGetRequest(serverUrl + "/card.php?do=GetAllSkill&phpl=EN");

		String json = r.body().string();
		SkillData skillData = GSON.fromJson(json, SkillData.class);
		List<Skill> skillList = skillData.getData().getSkills();
		skillMap = new HashMap<String,Skill>();
		
		for (Skill skill : skillList) {
			skillMap.put(skill.getSkillId().toString(), skill);
		}

		return skillMap;
		

	}
	
	  
	public Map<String, Rune> getRunes(String server) throws IOException, EkClientException {
		String serverUrl = getServerUrl(server);
		
		if (!isLogin) {
			login(serverUrl);
		}
				
		runeMap = new HashMap<String, Rune>();
		
		Response r = doGetRequest(serverUrl + "/rune.php?do=GetAllRune&phpl=EN");

		String json = r.body().string();
		RuneData runeData = GSON.fromJson(json, RuneData.class);
		List<Rune> runeList = runeData.getData().getRunes();
		for (Rune rune : runeList) {
			runeMap.put(rune.getRuneId(), rune);			
		}
		return runeMap;
		
	}
	
	private String getServerUrl(String server) throws EkClientException {
		String serverUrl = SERVERLIST.get(server);
		if (serverUrl == null)
			throw new EkClientException("Unknown server error");
		return serverUrl;
	}

	public String getFoHDeckForServer(String server, TreeMap<String, String> evoNames) throws IOException, EkClientException {
		this.evoNames = evoNames;

		System.out.print("Getting Runes...");
		getRunes(server);
		System.out.println("DONE");
		System.out.print("Getting Skills...");
		getSkills(server);
		System.out.println("DONE");
		System.out.print("Getting Cards...");
		getCards(server);
		System.out.println("DONE");
		
		System.out.print("Getting League data for server: " + server);
		LeagueData leagueData = getLeagueData(server);
		System.out.println("DONE");

		String fohDeck = printDeck(leagueData);	
		
		return fohDeck;
	}
	
	

	private String printDeck(LeagueData leagueData) throws EkClientException {
		if ((leagueData == null) || (leagueData.getData() == null) || (leagueData.getData().getLeagueNow()==null)) {
			throw new EkClientException("League Data format error");
		}		
		
			
		Data data = leagueData.getData();
		LeagueNow leagueNow = data.getLeagueNow();

		StringBuilder deckBuilder=new StringBuilder();
		
		//Special header for mitzi sim
		deckBuilder.append("60").append(NEWLINE).append("60").append(NEWLINE).append(NEWLINE);
		
		List<List<RoundResult>> roundResults = leagueNow.getRoundResult();
		for (List<RoundResult> roundResultList : roundResults) {
			int deckNo =0;
			for (RoundResult roundResult : roundResultList) {
				deckNo++;

				BattleInfo battleInfo = roundResult.getBattleInfo();
				User user = battleInfo.getUser();
				
				deckBuilder.append(user.getNickName()).append(NEWLINE);
				deckBuilder.append(user.getLevel()).append(NEWLINE);

				List<servconn.dto.league.Card> cardList = battleInfo.getCards();
				for (servconn.dto.league.Card cardRef : cardList) {
					deckBuilder.append(getCardInfoAsString(cardRef)).append(NEWLINE);					
				}
				List<servconn.dto.league.Rune> runeList = battleInfo.getRunes();
				for (servconn.dto.league.Rune runeRef : runeList) {
					deckBuilder.append(getRuneInfoAsString(runeRef)).append(NEWLINE);									
				}
				if (deckNo!=8) {
				//no new line after the last deck
					deckBuilder.append(NEWLINE);
				}

			}
			//Only the first round is enough to get the decks
			break;
		}
		
		return deckBuilder.toString();
	}
	
	private String getRuneInfoAsString(servconn.dto.league.Rune runeRef) {
		StringBuilder sb = new StringBuilder();
		Rune rune = runeMap.get(runeRef.getRuneId());
		if (rune!=null) {
			sb.append("Rune: ").append(rune.getRuneName()).append(";").append(runeRef.getLevel());			
			return sb.toString();
		} else {
			//FIXME unknown rune
			return "";
		}
	}

	private String getCardInfoAsString (servconn.dto.league.Card cardRef) {
		StringBuilder sb = new StringBuilder();
		
		Card card = cardMap.get(cardRef.getCardId());
		sb.append(card.getCardName());
		if (!cardRef.getSkillNew().equals("0")) {
			/*
			 * cardRef.getSkillNew shows the evo skill
			 * if 0, than no evo on that card
			 */			
			sb.append(";");
			sb.append(SkillConverter.convertSkillNameForMitzi(skillMap.get(cardRef.getSkillNew()).getName()));
		}
		sb.append(";").append(cardRef.getLevel()).append(";").append(getCardCost(card,  cardRef.getEvolution()));
		return sb.toString();
				
	}
	
	private Integer getCardCost(Card card , String evoLevel) {
		Integer cost;
		Integer eLevel = Integer.parseInt(evoLevel);
		Integer evoCost = 0;
		
		switch (eLevel) {
		case 0:
			evoCost = 0;
			break;
		case 1:
		case 2:
			evoCost = 1;
			break;
		case 3:
		case 4:
			evoCost = 2;
			break;			
		default:
			evoCost = 3;
			break;
		}
				
		cost = Integer.parseInt(card.getCost()) + evoCost;
		
		return cost;
	}
	

}
