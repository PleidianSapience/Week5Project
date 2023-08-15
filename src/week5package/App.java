package week5package;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger al = new AsteriskLogger();
		SpacedLogger sp = new SpacedLogger();
		
		System.out.println("***ASTERISK LOGGER TEST***\n");
		al.log("Hello");
		al.error("Hello");
		System.out.println("\n");

		
		System.out.println("SPACED LOGGER TEST");
		sp.log("Howdy");
		sp.error("Howdy");
	}

}
