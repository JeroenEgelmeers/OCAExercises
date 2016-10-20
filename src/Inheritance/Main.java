package Inheritance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


interface I1 { }
interface I2 extends I1 { }

class A  { public void testA() { System.out.println("Test A"); } }
class B extends A { public void testB() { System.out.println("Test B"); } }
class C extends B { public void testC() { System.out.println("Test C"); } }
class D { public void testD() { System.out.println("Test D"); } }

class Main {

	public static void main(String[] args) {
		Main ct = new Main();
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D(); 
		
		A ab = new B();
		
		// a can only call testA();
		a.testA();
		
		// b can call testA() and testB();
		b.testA();
		b.testB();
		
		// c can call testA(), testB() and testC();
		c.testA();
		c.testB();
		c.testC();
		
		// ab can only call testA() as the reference is A.
		ab.testA();
		//ab.testB(); // DOES NOT COMPILE
		
		// doesn't change the accessibility for ab. It still can only call testA(); 
		//ab = (C)ab; // ClassCastException, B cannot in C.
		System.out.println(ab.getClass());
		//ab.testB(); // DOES NOT COMPILE!!
		
		// This will make it possibile to get testB();
		((B)ab).testB();
		
		// Does compile but gives ClassCastException as B cannot in C.
		//((C)ab).testC(); // ClassCastException
		
		// D has no connection with A, so this does not compile.
		//((D)ab).testD(); // DOES NOT COMPILE		
		
	}
}