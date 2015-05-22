package servconn.util;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static final String ARK_URL = "http://mobile.arcgames.com/";
	public static final String EK_MASTER_URL = "http://master.ek.ifreeteam.com/";
	public static final String GamePlatform = "ANDROID_ARC";
	public static final String GameLang = "EN";
	public static final String GameVersion = "1.6.0";
	public static final String GameBuildDate = "2014-11-06+10%3a25";
	
	
	public static final Map<String, String> SERVERLIST;

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

}
