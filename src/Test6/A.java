package Test6;

public class A {
	
	int i;
	public A(int x) { this.i = x; }
}

class B extends A { 
	int j;
	public B(int y) { this(y,y); } // Er is geen no-argument constructor in A waardoor je ALTIJD de super zelf aan moet roepen. In dit geval doe je dat door this(y,y) aan te roepen welke op de volgende regel weer de super aanroept.
	public B(int x, int y) { super(x); this.j = y; }
}