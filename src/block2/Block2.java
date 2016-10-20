package block2;

public class Block2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1";
		String s2 = s1.concat("2"); // Writes to s2 (new).
		s2 = s2.concat("3"); // Adds, but unpossible because immutable so does nothing.
		System.out.println(s2);
	}

}
