
package servconn.dto.skill;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Skill {

    @Expose
    private Integer SkillId;
    @Expose
    private String Name;
    @Expose
    private Integer Type;
    @Expose
    private Integer LanchType;
    @Expose
    private Integer LanchCondition;
    @Expose
    private Integer LanchConditionValue;
    @Expose
    private Integer AffectType;
    @Expose
    private Integer AffectValue;
    @Expose
    private Integer AffectValue2;
    @Expose
    private Integer SkillCategory;
    @Expose
    private String Desc;
    @Expose
    private Integer EvoRank;

    /**
     * 
     * @return
     *     The SkillId
     */
    public Integer getSkillId() {
        return SkillId;
    }

    /**
     * 
     * @param SkillId
     *     The SkillId
     */
    public void setSkillId(Integer SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * 
     * @return
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 
     * @return
     *     The Type
     */
    public Integer getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The LanchType
     */
    public Integer getLanchType() {
        return LanchType;
    }

    /**
     * 
     * @param LanchType
     *     The LanchType
     */
    public void setLanchType(Integer LanchType) {
        this.LanchType = LanchType;
    }

    /**
     * 
     * @return
     *     The LanchCondition
     */
    public Integer getLanchCondition() {
        return LanchCondition;
    }

    /**
     * 
     * @param LanchCondition
     *     The LanchCondition
     */
    public void setLanchCondition(Integer LanchCondition) {
        this.LanchCondition = LanchCondition;
    }

    /**
     * 
     * @return
     *     The LanchConditionValue
     */
    public Integer getLanchConditionValue() {
        return LanchConditionValue;
    }

    /**
     * 
     * @param LanchConditionValue
     *     The LanchConditionValue
     */
    public void setLanchConditionValue(Integer LanchConditionValue) {
        this.LanchConditionValue = LanchConditionValue;
    }

    /**
     * 
     * @return
     *     The AffectType
     */
    public Integer getAffectType() {
        return AffectType;
    }

    /**
     * 
     * @param AffectType
     *     The AffectType
     */
    public void setAffectType(Integer AffectType) {
        this.AffectType = AffectType;
    }

    /**
     * 
     * @return
     *     The AffectValue
     */
    public Integer getAffectValue() {
        return AffectValue;
    }

    /**
     * 
     * @param AffectValue
     *     The AffectValue
     */
    public void setAffectValue(Integer AffectValue) {
        this.AffectValue = AffectValue;
    }

    /**
     * 
     * @return
     *     The AffectValue2
     */
    public Integer getAffectValue2() {
        return AffectValue2;
    }

    /**
     * 
     * @param AffectValue2
     *     The AffectValue2
     */
    public void setAffectValue2(Integer AffectValue2) {
        this.AffectValue2 = AffectValue2;
    }

    /**
     * 
     * @return
     *     The SkillCategory
     */
    public Integer getSkillCategory() {
        return SkillCategory;
    }

    /**
     * 
     * @param SkillCategory
     *     The SkillCategory
     */
    public void setSkillCategory(Integer SkillCategory) {
        this.SkillCategory = SkillCategory;
    }

    /**
     * 
     * @return
     *     The Desc
     */
    public String getDesc() {
        return Desc;
    }

    /**
     * 
     * @param Desc
     *     The Desc
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * 
     * @return
     *     The EvoRank
     */
    public Integer getEvoRank() {
        return EvoRank;
    }

    /**
     * 
     * @param EvoRank
     *     The EvoRank
     */
    public void setEvoRank(Integer EvoRank) {
        this.EvoRank = EvoRank;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
