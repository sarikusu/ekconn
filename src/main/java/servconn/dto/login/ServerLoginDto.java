
package servconn.dto.login;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ServerLoginDto {

    @Expose
    private Integer status;
    @Expose
    private ServerLoginData data;

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }



    public ServerLoginData getData() {
		return data;
	}

	public void setData(ServerLoginData data) {
		this.data = data;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
