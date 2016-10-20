package ActualTest;

class A { }
//class B { public B(int i) { } public B() { this(10); super(); } } // Question in OCA!!! this and super cannot be used in one constructor.

class C {
	public void 	testMethod() 				{ /* Does nothing.. */ 	}
	public String 	testMethod(int i) 			{ return ""; 			}
	public int 		testMethod(int i, int b) 	{ return i; 			}
}

public class Main {

	public static String doMsg(char x) 	{ return "Good luck!"; 	}
	public static String doMsg(int y) 	{ return "Good day!"; 	}
	
	public static void main(String[] args) {	
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? c : b : c; // You must have the same amount of ? then :
		System.out.println(d);
	
		char f = 8;
		int z = '8';
		System.out.println(doMsg(z));
		System.out.print(doMsg(f));
	}
}
