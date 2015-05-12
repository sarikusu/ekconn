
package servconn.dto.league;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BattleInfo {

    @Expose
    private servconn.dto.league.User User;
    @Expose
    private List<Card> Cards = new ArrayList<Card>();
    @Expose
    private List<Rune> Runes = new ArrayList<Rune>();

    /**
     * 
     * @return
     *     The User
     */
    public servconn.dto.league.User getUser() {
        return User;
    }

    /**
     * 
     * @param User
     *     The User
     */
    public void setUser(servconn.dto.league.User User) {
        this.User = User;
    }

    /**
     * 
     * @return
     *     The Cards
     */
    public List<Card> getCards() {
        return Cards;
    }

    /**
     * 
     * @param Cards
     *     The Cards
     */
    public void setCards(List<Card> Cards) {
        this.Cards = Cards;
    }

    /**
     * 
     * @return
     *     The Runes
     */
    public List<Rune> getRunes() {
        return Runes;
    }

    /**
     * 
     * @param Runes
     *     The Runes
     */
    public void setRunes(List<Rune> Runes) {
        this.Runes = Runes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
