
package servconn.dto.card;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Data {

    @Expose
    private List<Card> Cards = new ArrayList<Card>();

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
