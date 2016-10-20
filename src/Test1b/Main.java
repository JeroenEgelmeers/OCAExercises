package Test1b;

import java.util.Stack;

// Question 41
class A { public void m1() { } }
class B1 extends A 	{ }
class C1 extends B1 { }
// # Question 41

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Question 5
		System.out.println("Question 5:");
		String mStr = "123";
		System.out.println(new Long(mStr));
		System.out.println(Long.parseLong(mStr));
		System.out.println(Long.valueOf(mStr));
		// Long should have arguments. If not, it's
		
		// Question 9:
		System.out.println("Question 9:");
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		processStack(s1,s2);
		System.out.println(s1 + " " + s2);
		
		// Question 13
		System.out.println("Question 13:");
		String hello = "hello", lo = "lo", hello1 = "hello";
		String helloStr = new String("hello");
		String helloStr1 = new String("hello");
		
		System.out.println("hello" 	== "hello");
		System.out.println(hello 	== hello1);
		System.out.println("hello" 	== "hel"+"lo");
		System.out.println("hello" 	== "hel"+lo); // Strings computed at runtime are newly created and therefor are distinct.
		System.out.println(hello 	== helloStr);
		System.out.println(helloStr == helloStr1);
		System.out.println(hello 	== ("hel"+lo).intern()); // The result of explicitly a computed string is the same string as any pre-existing literal string with the same contents.
		System.out.println("hel"+lo == "hel"+lo); // Both computed strings on runtime makes it return false.
		
		// Question 20
		System.out.println("Question 20:");
		String abc = "", def = abc.concat("abc"), ghi = def.concat("def");
		System.out.println(abc); // Will print nothing as .concat will return a new string.
		System.out.println(def); // Will print abc, as .concat will return a new string.
		System.out.println(ghi); // Will print abcdef, as .concat will return a new string.
		
		// Question 26
		System.out.println("Question 26:");
		try {
			//Sm1(); // Returns exception so it'll go to catch block. 
			System.out.println("A"); // It'll never get here because of the exception from m1()
		}finally {
			System.out.println("B"); // There is no catch block, so it'll go to the finally block.
		}
		System.out.println("C"); // The try did return an Exception, so this one will be skipped an instead it'll throw an Exception to the console	
	
		// Question 41
		System.out.println("Question 41:");
		C1 c1 = new C1();
		c1.m1(); // Works, C1 extends B1, B1 extends A which has the method m1();
		
	}
	
	// Method for question 9
	public static void processStack(Stack x1, Stack x2) {
		x1.push(new Integer("100")); // Voeg 100 toe aan de stack van x1 (s1).
		//x2.push(new Integer("200")); // Voeg 200 toe aan de stack van x2 (s2)
		x2 = x1; // Wordt niet doorgegeven aan main(), daarom wijzigd de inhoud van s2 niet in de main methode.
		//x2.push(new Integer("300")); // x2 = x1 (s1) waardoor x1 (s1) wordt aangevuld met 300.
	}
	
	// Methodfor question 26
	public static void m1() throws Exception { throw new Exception(); }

}
