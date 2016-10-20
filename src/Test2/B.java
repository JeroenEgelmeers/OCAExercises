package Test2;

public class B extends A {
	public int j;
	
	public B(int x, int y) {
		super(x); this.j = y;
	}
	
	//B(int y) { super(y*2); j = y; } // I also answerd this one, and is correct.
	B(int z) { this(z,z); }
	// B(int y) { i = y; j = y*2; } // I said this answer but not working as the super is not defined!
	
}
