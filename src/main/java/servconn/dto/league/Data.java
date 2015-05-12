
package servconn.dto.league;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Data {

    @Expose
    private servconn.dto.league.LeagueNow LeagueNow;

    /*
     * Following fields marked as TRANSIENT since we do not need them
     * for a standard deck print out
     */
    
    private transient servconn.dto.league.LeagueNext LeagueNext;
    
    private transient List<Object> BetLogs = new ArrayList<Object>();
    
    private transient List<Object> BetHistory = new ArrayList<Object>();
    
    private transient servconn.dto.league.LeagueRoundEndTime LeagueRoundEndTime;

    /**
     * 
     * @return
     *     The LeagueNow
     */
    public servconn.dto.league.LeagueNow getLeagueNow() {
        return LeagueNow;
    }

    /**
     * 
     * @param LeagueNow
     *     The LeagueNow
     */
    public void setLeagueNow(servconn.dto.league.LeagueNow LeagueNow) {
        this.LeagueNow = LeagueNow;
    }

    /**
     * 
     * @return
     *     The LeagueNext
     */
    public servconn.dto.league.LeagueNext getLeagueNext() {
        return LeagueNext;
    }

    /**
     * 
     * @param LeagueNext
     *     The LeagueNext
     */
    public void setLeagueNext(servconn.dto.league.LeagueNext LeagueNext) {
        this.LeagueNext = LeagueNext;
    }

    /**
     * 
     * @return
     *     The BetLogs
     */
    public List<Object> getBetLogs() {
        return BetLogs;
    }

    /**
     * 
     * @param BetLogs
     *     The BetLogs
     */
    public void setBetLogs(List<Object> BetLogs) {
        this.BetLogs = BetLogs;
    }

    /**
     * 
     * @return
     *     The BetHistory
     */
    public List<Object> getBetHistory() {
        return BetHistory;
    }

    /**
     * 
     * @param BetHistory
     *     The BetHistory
     */
    public void setBetHistory(List<Object> BetHistory) {
        this.BetHistory = BetHistory;
    }

    /**
     * 
     * @return
     *     The LeagueRoundEndTime
     */
    public servconn.dto.league.LeagueRoundEndTime getLeagueRoundEndTime() {
        return LeagueRoundEndTime;
    }

    /**
     * 
     * @param LeagueRoundEndTime
     *     The LeagueRoundEndTime
     */
    public void setLeagueRoundEndTime(servconn.dto.league.LeagueRoundEndTime LeagueRoundEndTime) {
        this.LeagueRoundEndTime = LeagueRoundEndTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
