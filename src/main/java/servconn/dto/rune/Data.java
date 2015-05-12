
package servconn.dto.rune;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Data {

    @Expose
    private List<Rune> Runes = new ArrayList<Rune>();

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
