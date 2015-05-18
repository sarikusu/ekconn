
package servconn.dto.league;

import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RoundResult {

    @Expose
    private String Uid;
    @Expose
    private String Opponent;
    @Expose
    private String BattleId;
    @Expose
    private servconn.dto.league.BattleInfo BattleInfo;
    @Expose
    private Double BetOdds;
    @Expose
    private String BetTotal;

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
    
    /**
     * 
     * @return
     *     The BetOdds
     */
    public Double getBetOdds() {
        return BetOdds;
    }

    /**
     * 
     * @param BetOdds
     *     The BetOdds
     */
    public void setBetOdds(Double BetOdds) {
        this.BetOdds = BetOdds;
    }

    /**
     * 
     * @return
     *     The BetTotal
     */
    public String getBetTotal() {
        return BetTotal;
    }

    /**
     * 
     * @param BetTotal
     *     The BetTotal
     */
    public void setBetTotal(String BetTotal) {
        this.BetTotal = BetTotal;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
