
package servconn.dto.league;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LeagueNext {

    @Expose
    private Integer LeagueId;
    @Expose
    private Integer ConditionId;
    @Expose
    private Integer RoundNow;
    @Expose
    private List<Object> RoundResult = new ArrayList<Object>();
    @Expose
    private Integer Status;
    @Expose
    private Integer CreateTime;
    @Expose
    private Condition_ Condition;
    @Expose
    private Integer RemainTime;
    @Expose
    private List<Object> BattleInfo = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The LeagueId
     */
    public Integer getLeagueId() {
        return LeagueId;
    }

    /**
     * 
     * @param LeagueId
     *     The LeagueId
     */
    public void setLeagueId(Integer LeagueId) {
        this.LeagueId = LeagueId;
    }

    /**
     * 
     * @return
     *     The ConditionId
     */
    public Integer getConditionId() {
        return ConditionId;
    }

    /**
     * 
     * @param ConditionId
     *     The ConditionId
     */
    public void setConditionId(Integer ConditionId) {
        this.ConditionId = ConditionId;
    }

    /**
     * 
     * @return
     *     The RoundNow
     */
    public Integer getRoundNow() {
        return RoundNow;
    }

    /**
     * 
     * @param RoundNow
     *     The RoundNow
     */
    public void setRoundNow(Integer RoundNow) {
        this.RoundNow = RoundNow;
    }

    /**
     * 
     * @return
     *     The RoundResult
     */
    public List<Object> getRoundResult() {
        return RoundResult;
    }

    /**
     * 
     * @param RoundResult
     *     The RoundResult
     */
    public void setRoundResult(List<Object> RoundResult) {
        this.RoundResult = RoundResult;
    }

    /**
     * 
     * @return
     *     The Status
     */
    public Integer getStatus() {
        return Status;
    }

    /**
     * 
     * @param Status
     *     The Status
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 
     * @return
     *     The CreateTime
     */
    public Integer getCreateTime() {
        return CreateTime;
    }

    /**
     * 
     * @param CreateTime
     *     The CreateTime
     */
    public void setCreateTime(Integer CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 
     * @return
     *     The Condition
     */
    public Condition_ getCondition() {
        return Condition;
    }

    /**
     * 
     * @param Condition
     *     The Condition
     */
    public void setCondition(Condition_ Condition) {
        this.Condition = Condition;
    }

    /**
     * 
     * @return
     *     The RemainTime
     */
    public Integer getRemainTime() {
        return RemainTime;
    }

    /**
     * 
     * @param RemainTime
     *     The RemainTime
     */
    public void setRemainTime(Integer RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * 
     * @return
     *     The BattleInfo
     */
    public List<Object> getBattleInfo() {
        return BattleInfo;
    }

    /**
     * 
     * @param BattleInfo
     *     The BattleInfo
     */
    public void setBattleInfo(List<Object> BattleInfo) {
        this.BattleInfo = BattleInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
