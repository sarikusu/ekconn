
package servconn.dto.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ServerLoginGameServer {

    @SerializedName("GS_ID")
    @Expose
    private Integer GSID;
    @SerializedName("GS_STATUS")
    @Expose
    private Integer GSSTATUS;
    @SerializedName("GS_CHAT_IP")
    @Expose
    private String GSCHATIP;
    @SerializedName("GS_CHAT_PORT")
    @Expose
    private Integer GSCHATPORT;
    @SerializedName("GS_NAME")
    @Expose
    private String GSNAME;
    @SerializedName("GS_IP")
    @Expose
    private String GSIP;

    /**
     * 
     * @return
     *     The GSID
     */
    public Integer getGSID() {
        return GSID;
    }

    /**
     * 
     * @param GSID
     *     The GS_ID
     */
    public void setGSID(Integer GSID) {
        this.GSID = GSID;
    }

    /**
     * 
     * @return
     *     The GSSTATUS
     */
    public Integer getGSSTATUS() {
        return GSSTATUS;
    }

    /**
     * 
     * @param GSSTATUS
     *     The GS_STATUS
     */
    public void setGSSTATUS(Integer GSSTATUS) {
        this.GSSTATUS = GSSTATUS;
    }

    /**
     * 
     * @return
     *     The GSCHATIP
     */
    public String getGSCHATIP() {
        return GSCHATIP;
    }

    /**
     * 
     * @param GSCHATIP
     *     The GS_CHAT_IP
     */
    public void setGSCHATIP(String GSCHATIP) {
        this.GSCHATIP = GSCHATIP;
    }

    /**
     * 
     * @return
     *     The GSCHATPORT
     */
    public Integer getGSCHATPORT() {
        return GSCHATPORT;
    }

    /**
     * 
     * @param GSCHATPORT
     *     The GS_CHAT_PORT
     */
    public void setGSCHATPORT(Integer GSCHATPORT) {
        this.GSCHATPORT = GSCHATPORT;
    }

    /**
     * 
     * @return
     *     The GSNAME
     */
    public String getGSNAME() {
        return GSNAME;
    }

    /**
     * 
     * @param GSNAME
     *     The GS_NAME
     */
    public void setGSNAME(String GSNAME) {
        this.GSNAME = GSNAME;
    }

    /**
     * 
     * @return
     *     The GSIP
     */
    public String getGSIP() {
        return GSIP;
    }

    /**
     * 
     * @param GSIP
     *     The GS_IP
     */
    public void setGSIP(String GSIP) {
        this.GSIP = GSIP;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
