package Test6;


public class Main {

	static String url = "eenUrlStaatHier";

	static Main getDatabase() {
		System.out.println("Getting DB");
		return null;
	}
	

	public static String checkIt(String s) {
		if (s.length() == 0 || s == null) {
			return "EMPTY";
		}
		else return "NOT EMPTY";
	}
	
	public static void main(String[] args) throws Exception {
		//throw new Exception();
	}

}
