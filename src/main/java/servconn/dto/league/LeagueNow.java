
package servconn.dto.league;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LeagueNow {

    @Expose
    private Integer LeagueId;
    
    private transient Integer ConditionId;
    @Expose
    private Integer RoundNow;
    @Expose
    private List<List<servconn.dto.league.RoundResult>> RoundResult = new ArrayList<List<servconn.dto.league.RoundResult>>();
    @Expose
    private Integer Status;
    
    private transient Integer CreateTime;
  
    private transient servconn.dto.league.Condition Condition;
    @Expose
    private Integer RemainTime;

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
    public List<List<servconn.dto.league.RoundResult>> getRoundResult() {
        return RoundResult;
    }

    /**
     * 
     * @param RoundResult
     *     The RoundResult
     */
    public void setRoundResult(List<List<servconn.dto.league.RoundResult>> RoundResult) {
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
    public servconn.dto.league.Condition getCondition() {
        return Condition;
    }

    /**
     * 
     * @param Condition
     *     The Condition
     */
    public void setCondition(servconn.dto.league.Condition Condition) {
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
