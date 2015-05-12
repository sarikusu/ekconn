
package servconn.dto.league;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LeagueRoundEndTime {

    @SerializedName("1")
    @Expose
    private Integer _1;
    @SerializedName("2")
    @Expose
    private Integer _2;
    @SerializedName("3")
    @Expose
    private Integer _3;

    /**
     * 
     * @return
     *     The _1
     */
    public Integer get1() {
        return _1;
    }

    /**
     * 
     * @param _1
     *     The 1
     */
    public void set1(Integer _1) {
        this._1 = _1;
    }

    /**
     * 
     * @return
     *     The _2
     */
    public Integer get2() {
        return _2;
    }

    /**
     * 
     * @param _2
     *     The 2
     */
    public void set2(Integer _2) {
        this._2 = _2;
    }

    /**
     * 
     * @return
     *     The _3
     */
    public Integer get3() {
        return _3;
    }

    /**
     * 
     * @param _3
     *     The 3
     */
    public void set3(Integer _3) {
        this._3 = _3;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
