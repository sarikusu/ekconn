package servconn.dto.login;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;

public class GuestLoginDto {

	@Expose
	private Boolean result;
	@Expose
	private String loginstatus;
	@Expose
	private String redirect;
	

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	/**
	 * 
	 * @return The result
	 */
	public Boolean getResult() {
		return result;
	}

	/**
	 * 
	 * @param result
	 *            The result
	 */
	public void setResult(Boolean result) {
		this.result = result;
	}

	/**
	 * 
	 * @return The loginstatus
	 */
	public String getLoginstatus() {
		return loginstatus;
	}

	/**
	 * 
	 * @param loginstatus
	 *            The loginstatus
	 */
	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}