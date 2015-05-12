
package servconn.dto.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ServerLoginUserInfo {

    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @Expose
    private String uin;
    @Expose
    private String nick;
    @Expose
    private Integer MUid;
    @Expose
    private Integer time;
    @Expose
    private String sign;
    @Expose
    private String ppsign;

    /**
     * 
     * @return
     *     The accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 
     * @param accessToken
     *     The access_token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 
     * @return
     *     The uin
     */
    public String getUin() {
        return uin;
    }

    /**
     * 
     * @param uin
     *     The uin
     */
    public void setUin(String uin) {
        this.uin = uin;
    }

    /**
     * 
     * @return
     *     The nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * 
     * @param nick
     *     The nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 
     * @return
     *     The MUid
     */
    public Integer getMUid() {
        return MUid;
    }

    /**
     * 
     * @param MUid
     *     The MUid
     */
    public void setMUid(Integer MUid) {
        this.MUid = MUid;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * 
     * @param sign
     *     The sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 
     * @return
     *     The ppsign
     */
    public String getPpsign() {
        return ppsign;
    }

    /**
     * 
     * @param ppsign
     *     The ppsign
     */
    public void setPpsign(String ppsign) {
        this.ppsign = ppsign;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
