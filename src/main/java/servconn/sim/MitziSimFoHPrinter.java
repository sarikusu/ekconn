package servconn.sim;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import servconn.dto.card.Card;
import servconn.dto.league.BattleInfo;
import servconn.dto.league.Data;
import servconn.dto.league.LeagueData;
import servconn.dto.league.LeagueNow;
import servconn.dto.league.RoundResult;
import servconn.dto.league.User;
import servconn.dto.rune.Rune;
import servconn.dto.skill.Skill;
import servconn.util.Constants;

public class MitziSimFoHPrinter implements FoHPrinter {

	// Abilities from Mitzi's sim
	public static TreeMap<String, String> evoNames;

	private Map<String, Rune> runeMap;
	private Map<String, Card> cardMap;
	private Map<String, Skill> skillMap;

	public MitziSimFoHPrinter() {
		// TODO Auto-generated constructor stub
	}

	public String printDeck(LeagueData leagueData) {
		if ((leagueData == null) || (leagueData.getData() == null)
				|| (leagueData.getData().getLeagueNow() == null)) {
			throw new IllegalArgumentException("League Data format error");
		}
		if ((runeMap == null) || (cardMap == null) || (skillMap == null)) {
			throw new IllegalArgumentException(
					"GameInfo (cards, runes, skills) needed");
		}
		if (evoNames == null) {
			throw new IllegalArgumentException(
					"EvoNames needed for skill mapping");
		}

		Data data = leagueData.getData();
		LeagueNow leagueNow = data.getLeagueNow();

		StringBuilder deckBuilder = new StringBuilder();

		// Special header for mitzi sim
		deckBuilder.append("60").append(Constants.NL).append("60")
				.append(Constants.NL).append(Constants.NL);

		List<List<RoundResult>> roundResults = leagueNow.getRoundResult();
		for (List<RoundResult> roundResultList : roundResults) {
			int deckNo = 0;
			for (RoundResult roundResult : roundResultList) {
				deckNo++;

				BattleInfo battleInfo = roundResult.getBattleInfo();

				User user = battleInfo.getUser();

				deckBuilder.append(user.getNickName()).append(Constants.NL);
				deckBuilder.append(user.getLevel()).append(Constants.NL);

				List<servconn.dto.league.Card> cardList = battleInfo.getCards();
				for (servconn.dto.league.Card cardRef : cardList) {
					deckBuilder.append(getCardInfoAsString(cardRef)).append(
							Constants.NL);
				}
				List<servconn.dto.league.Rune> runeList = battleInfo.getRunes();
				for (servconn.dto.league.Rune runeRef : runeList) {
					deckBuilder.append(getRuneInfoAsString(runeRef)).append(
							Constants.NL);
				}
				if (deckNo != 8) {
					// no new line after the last deck
					deckBuilder.append(Constants.NL);
				}

			}
			// Only the first round is enough to get the decks
			break;
		}

		return deckBuilder.toString();
	}

	private String getRuneInfoAsString(servconn.dto.league.Rune runeRef) {
		StringBuilder sb = new StringBuilder();
		Rune rune = runeMap.get(runeRef.getRuneId());
		if (rune != null) {
			sb.append("Rune: ").append(rune.getRuneName()).append(";")
					.append(runeRef.getLevel());
			return sb.toString();
		} else {
			// FIXME unknown rune
			return "";
		}
	}

	private String getCardInfoAsString(servconn.dto.league.Card cardRef) {
		StringBuilder sb = new StringBuilder();

		Card card = cardMap.get(cardRef.getCardId());
		sb.append(card.getCardName());
		sb.append(";").append(cardRef.getLevel()).append(";")
				.append(getCardCost(cardRef.getEvolution()));

		if (!cardRef.getSkillNew().equals("0")) {
			/*
			 * cardRef.getSkillNew shows the evo skill if 0, than no evo on that
			 * card
			 */
			sb.append(";");
			sb.append(convertSkillName(skillMap.get(cardRef.getSkillNew())
					.getName()));
		}
		return sb.toString();

	}

	private Integer getCardCost(String evoLevel) {
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

		return evoCost;
	}

	public void setGameInfo(Map<String, Card> cardMap,
			Map<String, Skill> skillMap, Map<String, Rune> runeMap) {
		this.cardMap = cardMap;
		this.skillMap = skillMap;
		this.runeMap = runeMap;

	}

	@SuppressWarnings("unchecked")
	public void setEvoNames(Object evoNames) {
		MitziSimFoHPrinter.evoNames = (TreeMap<String, String>) evoNames;
	}

	public String convertSkillName(String sName) {
		if ((sName == null) || ("".equals(sName))) {
			return "";
		}
		String skillName = sName.trim();

		if ((MitziSimFoHPrinter.evoNames == null)
				|| (MitziSimFoHPrinter.evoNames.isEmpty())) {
			// evoNames not provided, return the skillName as is
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
			// replace order is important
			skillMitzi = "QS: "
					+ skillMitzi.replace("[Quick Strike]", "")
							.replace("Quick Strike:", "").trim();
		} else if (skillMitzi.contains("Desperation")) {
			// replace order is important
			skillMitzi = "D: "
					+ skillMitzi.replace("[Desperation]", "")
							.replace("Desperation:", "").trim();
		}

		if (MitziSimFoHPrinter.evoNames.containsKey(skillMitzi)) {
			return MitziSimFoHPrinter.evoNames.get(skillMitzi) + skillLevel;
		} else {
			// FIXME skill not found, not implemented
			return "";
		}

	}

	private String getSkillLevel(String skillName) {
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

	public boolean isNumeric(final CharSequence cs) {
		final int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (Character.isDigit(cs.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

}
