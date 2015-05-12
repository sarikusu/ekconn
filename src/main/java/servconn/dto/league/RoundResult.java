
package servconn.dto.league;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RoundResult {

    @Expose
    private String Uid;
    @Expose
    private String Opponent;
    @Expose
    private String BattleId;
    @Expose
    private servconn.dto.league.BattleInfo BattleInfo;

    /**
     * 
     * @return
     *     The Uid
     */
    public String getUid() {
        return Uid;
    }

    /**
     * 
     * @param Uid
     *     The Uid
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * 
     * @return
     *     The Opponent
     */
    public String getOpponent() {
        return Opponent;
    }

    /**
     * 
     * @param Opponent
     *     The Opponent
     */
    public void setOpponent(String Opponent) {
        this.Opponent = Opponent;
    }

    /**
     * 
     * @return
     *     The BattleId
     */
    public String getBattleId() {
        return BattleId;
    }

    /**
     * 
     * @param BattleId
     *     The BattleId
     */
    public void setBattleId(String BattleId) {
        this.BattleId = BattleId;
    }

    /**
     * 
     * @return
     *     The BattleInfo
     */
    public servconn.dto.league.BattleInfo getBattleInfo() {
        return BattleInfo;
    }

    /**
     * 
     * @param BattleInfo
     *     The BattleInfo
     */
    public void setBattleInfo(servconn.dto.league.BattleInfo BattleInfo) {
        this.BattleInfo = BattleInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
