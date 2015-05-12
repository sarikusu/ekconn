
package servconn.dto.league;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Condition_ {

    @Expose
    private String Type;
    @Expose
    private List<Integer> Value = new ArrayList<Integer>();
    @Expose
    private String Desc;

    /**
     * 
     * @return
     *     The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The Value
     */
    public List<Integer> getValue() {
        return Value;
    }

    /**
     * 
     * @param Value
     *     The Value
     */
    public void setValue(List<Integer> Value) {
        this.Value = Value;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
