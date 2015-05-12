package servconn.dto.login;

import java.util.UUID;


public class Player {

	private String uin;
	private String deviceToken;
	private String deviceId;
	
	
	public String getUin() {
		return uin;
	}


	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


	public void setUin(String uin) {
		this.uin = uin;
	}


	public String getDeviceToken() {
		return deviceToken;
	}


	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}


	public Player() {		
		if (deviceId==null) {
			deviceId = UUID.randomUUID().toString();
		}
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [uin=");
		builder.append(uin);
		builder.append(", deviceToken=");
		builder.append(deviceToken);
		builder.append(", deviceId=");
		builder.append(deviceId);
		builder.append("]");
		return builder.toString();
	}

}
