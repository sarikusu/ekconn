
package servconn.dto.login;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ServerLoginData {

    @SerializedName("new")
    @Expose
    private Boolean _new;
    @Expose
    private ServerLoginGameServer current;
    @Expose
    private java.util.List<ServerLoginList> list = new ArrayList<ServerLoginList>();
    @Expose
    private ServerLoginUserInfo uinfo;

    /**
     * 
     * @return
     *     The _new
     */
    public Boolean getNew() {
        return _new;
    }

    /**
     * 
     * @param _new
     *     The new
     */
    public void setNew(Boolean _new) {
        this._new = _new;
    }

    /**
     * 
     * @return
     *     The current
     */
    public ServerLoginGameServer getCurrent() {
        return current;
    }

    /**
     * 
     * @param current
     *     The current
     */
    public void setCurrent(ServerLoginGameServer current) {
        this.current = current;
    }

    /**
     * 
     * @return
     *     The list
     */
    public java.util.List<ServerLoginList> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<ServerLoginList> list) {
        this.list = list;
    }

    /**
     * 
     * @return
     *     The uinfo
     */
    public ServerLoginUserInfo getUinfo() {
        return uinfo;
    }

    /**
     * 
     * @param uinfo
     *     The uinfo
     */
    public void setUinfo(ServerLoginUserInfo uinfo) {
        this.uinfo = uinfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
