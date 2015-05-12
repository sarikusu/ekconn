
package servconn.dto.skill;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Data {

    @Expose
    private List<Skill> Skills = new ArrayList<Skill>();

    /**
     * 
     * @return
     *     The Skills
     */
    public List<Skill> getSkills() {
        return Skills;
    }

    /**
     * 
     * @param Skills
     *     The Skills
     */
    public void setSkills(List<Skill> Skills) {
        this.Skills = Skills;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
