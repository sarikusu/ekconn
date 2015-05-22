package servconn.sim;

public class FoHPrinterFactory {

	public static FoHPrinter getFoHPrinter(String sim) {
		if (sim == null) {
			return null;
		}
		if ("MITZI".equalsIgnoreCase(sim)) {
			return new MitziSimFoHPrinter();
		}
		return null;

	}

}
