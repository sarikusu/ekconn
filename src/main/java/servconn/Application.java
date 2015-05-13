package servconn;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import servconn.client.EkClient;
import servconn.client.EkClientException;
import servconn.client.SkillConverter;
import servconn.dto.skill.Skill;


/**
 * Test class for loading decks and converting skill names
 *
 */
public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public enum Mode{
		PRINTDECKS, NOTIMPLEMENTEDSKILLS;
	}
	
	private static TreeMap<String, String> evoNames = new TreeMap<String, String>(
			String.CASE_INSENSITIVE_ORDER);
	
	public static void loadEvos() {
		evoNames.put("Advanced Strike", "as");
		evoNames.put("Arctic Guard", "ag");
		evoNames.put("Arctic Pollution", "ap");
		evoNames.put("Backstab", "stab");
		evoNames.put("Bite", "bite");
		evoNames.put("Blight", "bli");
		evoNames.put("Blitz", "blz");
		evoNames.put("Blizzard", "bzd");
		evoNames.put("Bloodsucker", "bs");
		evoNames.put("Bloodthirsty", "blt");
		evoNames.put("Chain Attack", "ca");
		evoNames.put("Chain Lightning", "cl");
		evoNames.put("Clean Sweep", "cs");
		evoNames.put("Combustion", "cmb");
		evoNames.put("Concentration", "con");
		evoNames.put("Confusion", "cf");
		evoNames.put("Counterattack", "cnt");
		evoNames.put("Craze", "cz");
		evoNames.put("Curse", "crs");
		evoNames.put("D: Annihilation", "d:a");
		evoNames.put("D: Blizzard", "d:blz");
		evoNames.put("D: Curse", "d:crs");
		evoNames.put("D: Destroy", "d:des");
		evoNames.put("D: Electric Shock", "d:es");
		evoNames.put("D: Fire God", "d:fgd");
		evoNames.put("D: Firestorm", "d:fs");
		evoNames.put("D: Group Weaken", "d:gw");
		evoNames.put("D: Healing", "d:h");
		evoNames.put("D: Plague", "d:plg");
		evoNames.put("D: Regeneration", "d:reg");
		evoNames.put("D: Toxic Clouds", "d:tc");
		evoNames.put("D: Prayer", "d:pyr");
		evoNames.put("D: Trap", "d:trp");
		evoNames.put("Damnation", "damn");
		evoNames.put("Destroy", "des");
		evoNames.put("Devil's Armor", "da");
		evoNames.put("Devil's Blade", "db");
		evoNames.put("Devil's Curse", "dc");
		evoNames.put("Dexterity", "dex");
		evoNames.put("Dodge", "dge");
		evoNames.put("Divine Protection", "dp");
		evoNames.put("Dual Snipe", "ds");
		evoNames.put("Electric Shock", "es");
		evoNames.put("Evasion", "eva");
		evoNames.put("Exile", "exi");
		evoNames.put("Feast of Blood", "fob");
		evoNames.put("Fire Wall", "fw");
		evoNames.put("Fireball", "fb");
		evoNames.put("Fire God", "fgd");
		evoNames.put("Firestorm", "fs");
		evoNames.put("Forest Fire", "ffi");
		evoNames.put("Forest Force", "ff");
		evoNames.put("Forest Guard", "fg");
		evoNames.put("Frost Shock", "frs");
		evoNames.put("Glacial Barrier", "gb");
		evoNames.put("Guard", "grd");
		evoNames.put("Group Weaken", "gw");
		evoNames.put("Healing", "h");
		evoNames.put("Healing Mist", "hm");
		evoNames.put("Hot Chase", "hc");
		evoNames.put("Iceball", "ib");
		evoNames.put("Ice Shield", "ice");
		evoNames.put("Immunity", "imm");
		evoNames.put("Impede", "imp");
		evoNames.put("Infiltrator", "infl");
		evoNames.put("Jungle Barrier", "jb");
		evoNames.put("Laceration", "lct");
		evoNames.put("Magic Shield", "ms");
		evoNames.put("Mana Corruption", "mc");
		evoNames.put("Mania", "man");
		evoNames.put("Marsh Barrier", "mb");
		evoNames.put("Mountain Force", "mf");
		evoNames.put("Mountain Glacier", "mgr");
		evoNames.put("Mountain Guard", "mg");
		evoNames.put("Nova Frost", "nv");
		evoNames.put("Obstinacy", "obs");
		evoNames.put("Origins Guard", "og");
		evoNames.put("Northern Force", "nf");
		evoNames.put("Parry", "pry");
		evoNames.put("Plague", "plg");
		evoNames.put("Prayer", "pyr");
		evoNames.put("Puncture", "punc");
		evoNames.put("Power Source", "ps");
		evoNames.put("QS: Blizzard", "q:blz");
		evoNames.put("QS: Curse", "q:crs");
		evoNames.put("QS: Destroy", "q:des");
		evoNames.put("QS: Electric Shock", "q:es");
		evoNames.put("QS: Exile", "q:exl");
		evoNames.put("QS: Fire God", "q:fgd");
		evoNames.put("QS: Firestorm", "q:fs");
		evoNames.put("QS: Group Weaken", "q:gw");
		evoNames.put("QS: Healing", "q:h");
		evoNames.put("QS: Plague", "q:plg");
		evoNames.put("QS: Regeneration", "q:reg");
		evoNames.put("QS: Toxic Clouds", "q:tc");
		evoNames.put("QS: Prayer", "q:pyr");
		evoNames.put("QS: Trap", "q:trp");
		evoNames.put("Reanimation", "rean");
		evoNames.put("Reflection", "ref");
		evoNames.put("Regeneration", "reg");
		evoNames.put("Reincarnation", "rein");
		evoNames.put("Rejuvenation", "rej");
		evoNames.put("Retaliation", "ret");
		evoNames.put("Resurrection", "rez");
		evoNames.put("Resistance", "res");
		evoNames.put("Sacrifice", "sac");
		evoNames.put("Sacred Flame", "sdf");
		evoNames.put("Seal", "seal");
		evoNames.put("Self-Destruct", "sd");
		evoNames.put("Shield of Earth", "soe");
		evoNames.put("Slayer", "slay");
		evoNames.put("Smog", "smog");
		evoNames.put("Snipe", "snp");
		evoNames.put("Swamp Force", "sf");
		evoNames.put("Swamp Guard", "sg");
		evoNames.put("Swamp Purity", "sp");
		evoNames.put("Thunderbolt", "tb");
		evoNames.put("Toxic Clouds", "tc");
		evoNames.put("Trap", "trp");
		evoNames.put("Vendetta", "vend");
		evoNames.put("Venom", "ven");
		evoNames.put("Volcano Barrier", "vb");
		evoNames.put("Warcry", "wc");
		evoNames.put("Warpath", "wp");
		evoNames.put("Weaken", "weak");
		evoNames.put("Wicked Leech", "wl");
		
	}
	
	public static void main(String[] args) throws IOException, EkClientException {		
		loadEvos();			
		EkClient.evoNames = evoNames;
		
		Application.Mode mode = Application.Mode.PRINTDECKS;
		
		switch (mode) {
		case PRINTDECKS:
			printDecksForServer("serenity");
			break;
		case NOTIMPLEMENTEDSKILLS:
			displayNotImplementedSkills("serenity");
			break;
		default:
			break;
		}
				
	}
	
	public static void printDecksForServer(String server) throws IOException, EkClientException {
		EkClient client = new EkClient();

		String decks = client.getFoHDeckForServer(server, evoNames);
		System.out.println(decks);

		PrintWriter writer = new PrintWriter("e:\\fohdecks.txt", "UTF-8");
		writer.println(decks);
		writer.close();
	}
	
	
	public static void displayNotImplementedSkills(String server) throws IOException, EkClientException {
		//only works for skills with level infos, 
		//may give false positives for unimplemented skills without level info, like Resistance
		EkClient client = new EkClient();
		List<String> skillList = new ArrayList<String>();
		
		Map<String, Skill> skills = client.getSkills(server);
		for (Skill skill : skills.values()) {
			String convertedSkill= SkillConverter.convertSkillNameForMitzi(skill.getName());
			if ("".equals(convertedSkill)) {
				skillList.add(skill.getName());				
			}			
		}
		Collections.sort(skillList, String.CASE_INSENSITIVE_ORDER);
		for (String skill : skillList) {
			System.out.println(skill);
		}
		
	}

	
	
}
