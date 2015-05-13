package servconn.client;

/**
 * Skill converter for Mitzi's sim
 *
 */
public class SkillConverter {


	public static String convertSkillNameForMitzi(String sName) {
		if ((sName==null)||("".equals(sName))) {
			return "";
		}
		String skillName = sName.trim();
		
		if ( (EkClient.evoNames == null) || (EkClient.evoNames.isEmpty())){
			//evoNames not provided, return the skillName as is
			return skillName;
		}
		
		// Firt check if string ends with a number, ie skill level
		String skillLevel = getSkillLevel(skillName);
		String skillMitzi = "";
		if ("".equals(skillLevel)) {
			// Skill name does not contain level info
			skillMitzi = skillName;
		} else {
			skillMitzi = skillName.substring(0,
					skillName.lastIndexOf(skillLevel) - 1);
		}
		if (skillMitzi.contains("Quick Strike")) {
			//replace order is important
			skillMitzi = "QS: " + skillMitzi.replace("[Quick Strike]", "").replace("Quick Strike:", "").trim();
		} else if (skillMitzi.contains("Desperation")) {
			//replace order is important
			skillMitzi = "D: " + skillMitzi.replace("[Desperation]", "").replace("Desperation:", "").trim();
		}
			
		if (EkClient.evoNames.containsKey(skillMitzi)) {
			return EkClient.evoNames.get(skillMitzi) + skillLevel;
		}else {
			//FIXME skill not found, not implemented
			return "";
		}			

	}

	private static String getSkillLevel(String skillName) {
		// get the last token of the skillName and check if it is numeric
		// if no token exists or it is not numeric, no level info
		// otherwise return level
		String level = skillName.substring(skillName.lastIndexOf(" ") + 1,
				skillName.length());

		if (isNumeric(level)) {
			return level;
		} else {
			return "";
		}
	}

	public static boolean isNumeric(final CharSequence cs) {
		final int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (Character.isDigit(cs.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

}
