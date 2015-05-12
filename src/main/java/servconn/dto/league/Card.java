
package servconn.dto.league;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Card {

    @Expose
    private String UserCardId;
    @Expose
    private String CardId;
    @Expose
    private String Level;
    @Expose
    private String Evolution;
    @Expose
    private String SkillNew;
    @Expose
    private String WashTime;

    /**
     * 
     * @return
     *     The UserCardId
     */
    public String getUserCardId() {
        return UserCardId;
    }

    /**
     * 
     * @param UserCardId
     *     The UserCardId
     */
    public void setUserCardId(String UserCardId) {
        this.UserCardId = UserCardId;
    }

    /**
     * 
     * @return
     *     The CardId
     */
    public String getCardId() {
        return CardId;
    }

    /**
     * 
     * @param CardId
     *     The CardId
     */
    public void setCardId(String CardId) {
        this.CardId = CardId;
    }

    /**
     * 
     * @return
     *     The Level
     */
    public String getLevel() {
        return Level;
    }

    /**
     * 
     * @param Level
     *     The Level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * 
     * @return
     *     The Evolution
     */
    public String getEvolution() {
        return Evolution;
    }

    /**
     * 
     * @param Evolution
     *     The Evolution
     */
    public void setEvolution(String Evolution) {
        this.Evolution = Evolution;
    }

    /**
     * 
     * @return
     *     The SkillNew
     */
    public String getSkillNew() {
        return SkillNew;
    }

    /**
     * 
     * @param SkillNew
     *     The SkillNew
     */
    public void setSkillNew(String SkillNew) {
        this.SkillNew = SkillNew;
    }

    /**
     * 
     * @return
     *     The WashTime
     */
    public String getWashTime() {
        return WashTime;
    }

    /**
     * 
     * @param WashTime
     *     The WashTime
     */
    public void setWashTime(String WashTime) {
        this.WashTime = WashTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
