
package servconn.dto.skill;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Version {

    @Expose
    private String http;
    @Expose
    private String stop;
    @Expose
    private String appversion;
    @Expose
    private String appurl;

    /**
     * 
     * @return
     *     The http
     */
    public String getHttp() {
        return http;
    }

    /**
     * 
     * @param http
     *     The http
     */
    public void setHttp(String http) {
        this.http = http;
    }

    /**
     * 
     * @return
     *     The stop
     */
    public String getStop() {
        return stop;
    }

    /**
     * 
     * @param stop
     *     The stop
     */
    public void setStop(String stop) {
        this.stop = stop;
    }

    /**
     * 
     * @return
     *     The appversion
     */
    public String getAppversion() {
        return appversion;
    }

    /**
     * 
     * @param appversion
     *     The appversion
     */
    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    /**
     * 
     * @return
     *     The appurl
     */
    public String getAppurl() {
        return appurl;
    }

    /**
     * 
     * @param appurl
     *     The appurl
     */
    public void setAppurl(String appurl) {
        this.appurl = appurl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
