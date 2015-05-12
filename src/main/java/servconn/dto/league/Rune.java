
package servconn.dto.league;

import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Rune {

    @Expose
    private String UserRuneId;
    @Expose
    private String RuneId;
    @Expose
    private String Level;

    /**
     * 
     * @return
     *     The UserRuneId
     */
    public String getUserRuneId() {
        return UserRuneId;
    }

    /**
     * 
     * @param UserRuneId
     *     The UserRuneId
     */
    public void setUserRuneId(String UserRuneId) {
        this.UserRuneId = UserRuneId;
    }

    /**
     * 
     * @return
     *     The RuneId
     */
    public String getRuneId() {
        return RuneId;
    }

    /**
     * 
     * @param RuneId
     *     The RuneId
     */
    public void setRuneId(String RuneId) {
        this.RuneId = RuneId;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
