
package servconn.dto.league;

import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {

    @Expose
    private Integer Uid;
    @Expose
    private String NickName;
    @Expose
    private String Sex;
    @Expose
    private String Avatar;
    @Expose
    private String HP;
    @Expose
    private String Level;

    /**
     * 
     * @return
     *     The Uid
     */
    public Integer getUid() {
        return Uid;
    }

    /**
     * 
     * @param Uid
     *     The Uid
     */
    public void setUid(Integer Uid) {
        this.Uid = Uid;
    }

    /**
     * 
     * @return
     *     The NickName
     */
    public String getNickName() {
        return NickName;
    }

    /**
     * 
     * @param NickName
     *     The NickName
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * 
     * @return
     *     The Sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     * 
     * @param Sex
     *     The Sex
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * 
     * @return
     *     The Avatar
     */
    public String getAvatar() {
        return Avatar;
    }

    /**
     * 
     * @param Avatar
     *     The Avatar
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * 
     * @return
     *     The HP
     */
    public String getHP() {
        return HP;
    }

    /**
     * 
     * @param HP
     *     The HP
     */
    public void setHP(String HP) {
        this.HP = HP;
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
