package week5package;

public class SpacedLogger implements Logger {

	public SpacedLogger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		System.out.println(space("Hello"));
	}
	@Override
	public void log(String arg) {
		// TODO Auto-generated method stub
		System.out.println(space(arg));

	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("Error: " + space(error));

	}
	
	public static String space (String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			sb.append(word.charAt(i));
			sb.append(" ");
		}
		return sb.toString();
	}

}
