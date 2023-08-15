package week5package;

public class AsteriskLogger implements Logger {

	
	public AsteriskLogger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***"+log+"***");
		

	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("****************\n");
		System.out.println("***Error:"+error+"***\n");
		System.out.println("****************");

	}

}
