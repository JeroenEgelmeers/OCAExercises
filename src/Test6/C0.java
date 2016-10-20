package Test6;

interface I1 							{ } // I1 can in C1, C3 and C4 but a cast is necessary.
interface I2 							{ } // T2 can in C2, C3, C4 but a cast is necessary.
class C1 implements I1 					{ } // C1 can in I1 without casting. C1 can in C4 but a cast is necessary.
class C2 implements I2 					{ } // C2 can in I2 without casting.
class C3 extends C1 implements I2 		{ } // C3 can in C1, I1 and I2 without casting. C3 can in C4 but a cast is necessary.

// Added
class C4 extends C3 implements I1, I2 	{ } // C4 can in C3, C1, I1 and I2 without casting.


public class C0 {
	public static void main(String[] args) {
		C1 c1 	= new C1();
		C2 c2 	= new C2();
		C3 c3 	= new C3();
		C4 c4	= new C4();
		
		I1 i1 	= 		c3;
		I2 i2 	= (I2) 	i1; 	// i1 heeft 03 welke I2 implementeerd. Let op: Wel cast nodig aangezien ze elkaar niet kennen.
		
		I1 i3 	= (I1) 	i2; 	// i2 heeft i1 welke o3 hefet en die implementeerd I1. Let op: wel cast nodig aangezien ze elkaar niet kennen (implementeren elkaar niet).
		c1		= 		c3;		// c1 is the SUPER of c3 (C3 extends C1), so no cast is needed.
		c3		= (C3) 	c1;		// MUST cast as c1 is super of c3
		I2 i2b	=  		c2; 	// No cast necessary as C2 implements I2. (You can still cast, but not necessary).
		c2		= (C2)  i2b;
		I2 i2c	= 		c2;
		c3		= 		c4;	  	// sub class in super; no cast necessary.
		c4		= (C4) 	c3; 	// Super in subclass is possible when casting it to the subclass.
	}
}