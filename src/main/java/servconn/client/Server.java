package servconn.client;

public enum Server {
	chaos("s1.ek"), harmony("s2.ek"), legacy("s3.ek"), destiny("s4.ek"), fury(
			"s5.ek"), serenity("s6.ek"), skorn("s1.ekru"), apollo("s1.ekbb");

	private final String strValue;

	private Server(String strValue) {
		this.strValue = strValue;
	}

	public String toString() {
		return this.strValue;
	}
}
