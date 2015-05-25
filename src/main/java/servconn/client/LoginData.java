package servconn.client;

import servconn.dto.login.Player;
import servconn.dto.login.ServerLoginDto;

public class LoginData {
	
	private boolean loggedIn;
	private Player player;
	private ServerLoginDto serverLogin;
	private String server;
	private String serverUrl;

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public ServerLoginDto getServerLogin() {
		return serverLogin;
	}

	public void setServerLogin(ServerLoginDto serverLogin) {
		this.serverLogin = serverLogin;
	}

	public LoginData() {
		loggedIn = false;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
