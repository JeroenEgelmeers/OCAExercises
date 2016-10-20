package Test2;

public class Main {	
	
	public int iVar = 4; // How to get this var in main method after it is shadowed by int iVar = 1;
	
	public static void main(String[] args) throws Exception {		
		Main m = new Main();
		m.looper();
		
		// Question 9
		System.out.println("Question: 09");
		System.out.println("Main method mag een exception throwen.");
				
		// Question 11
		System.out.println("Question: 11");
		String[] str = new String[10];
		str[0] = "closed";
		if (str[0].equals("c")) { 
			if (str[1].equals("someone")) {
				System.out.println("Hier komt hij nooit, dus str[1] kan gewoon gebruikt worden, ookal zou dit een NullPointer teruggeven!");
			}else if("a" == str[11]) {
				// Ook hier komt hij nooit aangezien de eerste if al naar de else gaat.
				// Daarom maakt het niet uit dat je een index number gebruikt buiten de array index.
				// Zou als die er wel in komt, ArrayIndexOutOfBoundsException geven.
			}else {
				System.out.println("Go away "+ str[1]);
			}
		}
		
		// Question 15
		System.out.println("Question: 15");
		PrivateTest p = new PrivateTest();
		System.out.println(p.i);
		
		// Question 55
		System.out.println("Question: 55");
//		A a = new A(5);
//		B b = new B(6);
//		System.out.println(b.i + " " + b.j);
		
		// Question 76
		System.out.println("Question: 76");
		C a76 = new C(); // 1
		C b76 = new D(); // 2
		//System.out.println(b76.i); // Can't, not visiable because of private. Should cast..	

	}

	public void looper() { 

		System.out.println(iVar);		
	}
	
	public float parseFloat(String s) { 
		// Question 71
		System.out.println("Question: 71");				
		float f = 0.0f;
		try {
			f = Float.valueOf(s).floatValue(); // 2
			//return f;  // 3
		}catch(NumberFormatException nfe) {
			f = Float.NaN; // 4
			return f; // 5
		}finally {
			//return f; // 6
		}
		return f; //7
		
		/*
		 * Remove line 3, 6: This will work as finally will complain that it's not worth calling there a return as in 3 or 5 it's already called.
		 * Remove line 5, 6: Same for this line.
		 * Remove line 7: It'll give a warning that it won't reach the "Finally" block. How ever, it compiles!
		 * Remove line 3, 7: Same for this one as it'll alaways return something (because of the catch block), but it won't reach the final (but that doesn't matter as it has already been returned a value which is neccessary).
		 * */
	}


}
