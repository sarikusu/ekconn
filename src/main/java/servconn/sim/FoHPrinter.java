package servconn.sim;

import java.util.Map;

import servconn.dto.card.Card;
import servconn.dto.league.LeagueData;
import servconn.dto.rune.Rune;
import servconn.dto.skill.Skill;

public interface FoHPrinter {

	public String printDeck(LeagueData leagueData);

	public void setGameInfo(Map<String, Card> cardMap,
			Map<String, Skill> skillMap, Map<String, Rune> runeMap);
	
	public void setEvoNames(Object evoNames);

}
