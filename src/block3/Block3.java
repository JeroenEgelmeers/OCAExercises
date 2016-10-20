package block3;

public class Block3 {

	public static void main(String[] args) {
		System.out.println(walk1(1,2,3,4,5));
	}
	
	/*
	 * Check how varargs work (blz: 172)
	 * */
	// must be static as used by main method.
	public static int walk1(int... nums) { return nums.length; }
	
	// Cannot be called using the main method.
	public void test() { }
	
	// Swap by refference
}
