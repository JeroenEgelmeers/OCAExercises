package ActualTest;

import java.io.IOException;

public class Examples {
	
	public static void main(String[] args) {
		// CASTS
		int a = '8'; // Char can be casted to an int (primitve).
		char q = 8;
		
		//// FOR LOOPS
		System.out.println("\nExample 1: Outer scope variable");
		int i;
		for (i = 0; i < 10; i++) { System.out.print(i + ", "); }
		
		System.out.println("\nfinal i: " + i);
		
		/*
		 * Information about this example;
		 *  1. First the i is set to 0 
		 *  2. The expression is getting checked. i < 10 (= true, then go to 3, else go to 6.).
		 *  3. Then the body will get called which outputs: i (in the first case: 0 ,).
		 *  4. On the end of the loop it'll increase the i value (because of i++). This will set i to 1.
		 *  5. Now it will redo step 2 until it'll return "false".
		 *  6. When the expression is false, remember that i = 10! As (like in the example above) the variable is set outside the for scope, it'll be accessable after the forloop.
		 *  	In this case i = 10 and can be printed like below which will return 10.
		 *  	If int i = 0 is defined in the forloop, it won't be accessable outside the for loop. If i is getting called in that case like below, it will return a compiler error.
		 * 
		 * Additional information: We added the ", " to not spam the console but just get all items on one line.
		 */
		
		System.out.println("\nExample 2: Inner scope variable");
		for (int b = 0; b < 10; b++) { System.out.print(b + ", "); }
		System.out.println("Printing b is not possible as it is defined in the for-scope.");
		//System.out.println(b); // Compiler error as the a is defined in the forloop.
		
		/*
		 * The second example (Example 2) is best practice and mostly used by programmers.
		 * Additional information: We added the ", " to not spam the console but just get all items on one line.
		 */
		
		System.out.println("\nExample 3: Inifite loop examples");
//		for(;;) {
//			System.out.println("inifite loop...");
//		}
		/*
		 * This example will return an infinite loop. This happens as the boolean expression (middle part of the for section) is always true when there is nothing defined.
		 * Secondly you don't count up something / defined a variable in the first section of the scope.
		 */
		
//		for(int b = 0; b < 10;) {
//			System.out.println("Infinite loop..");
//		}
		
		/*
		 * This will work but result in an infinite loop as the b (inner scope variable) is defined to 0, but nothing happends with it in the last section of the loop.
		 * Because of this b will never count up. B will be always 0 so the for expression (boolean) will always be true: b (0) will always be 0 so it's lower then 10 and true.
		 */
		
		System.out.println("\nExample 4: Multiple Terms to the for Statement");
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) { } // Compiler will only warn that z is never used.
		System.out.println(x);
		
		/*
		 * x is an outer variable, y and z are inner scope variable (so not available outside the forloop).
		 * z is never used, so an unused variable. This is possible but should be avoided.
		 * 
		 * This forloop still has eveything that should be implemented: for(;;) { }
		 * The first part (before the first ;), two variable are getting defined and initialized: y and z.
		 * The second part (after the first ;), two boolean expressions are valided: x < 5 and y < 10.
		 * The last part (after the last ;), x++ 
		 * 
		 * So in this case: First y and z are getting declared and initialized. Secondly the expressions will be validated.
		 * In the first scenario: x = 0 (declared outer scope) < 5 (is true), y = 0 (declared inner scope) < 10 (is true).
		 * The body will then run and will do nothing as there is nothing defined.
		 * Then the body will end  
		 */
		
		System.out.println("\nExample 5: Different primitives in for statement");
		// For this example we use the set x variable of example 4 (x).
		//for(long y = 0, x = 0; x < 5 && y < 10; x++, y++) { } // Does NOT compile.. 
		
		/*
		 * This example is exactly the same as the one of Example 4 except that now z is removed from the innerscope and x is defined in the innerscope.
		 * This will NOT compile as x is set in Example 4 as an int. In the scope of this for loop it is defined again as "long" which will fail to compile.
		 * You can use more variable in the innerscope of a for loop, how ever they must be of the same data type.
		 * 
		 */
		
		System.out.println("\n~ Enhanced for loops ~");
		System.out.println("Example 6: ");
		String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String n : names) { System.out.print(n + ", "); }
		
		/*
		 * In example 6 we'll see an enhanced forloop. This loop will go once through every entry of the (in this case: array).
		 * Keep in mind that you MUST use an array or (Array)List to use an enhanced forloop.
		 */
		
		System.out.println("\n\nExample 7: ");
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String v : values) { System.out.print(v + ", "); }
		
		/*
		 * In example 7 there is used an ArrayList. The output is exactly the same as the output from example 6.
		 * In this example you can also import "ArrayList" in the top section of the class. In that case you don't have to define java.util. before the List and ArrayList of this example.
		 * You can then just write: List<String> values = new ArrayList<String>();
		 * Warning: You HAVE to know this for the exam.
		 */
		
		
		System.out.println("\n\nTricky enhanced for loops");
		System.out.println("Example 8: ");
		int[] ints = new int[3];
		ints[1] = 1;
		ints[2] = 2;
		
		for(int int1 : ints) { System.out.print(int1 + ", "); }
		
		/*
		 * The examen tried to trick with this kind of structures. Notice that in this case ints[0] is not initialized! 
		 * Remember that a primative that is declared in this way, will always get set to it's default value. In this case 0.
		 * So when looping through the array "ints". It'll print: 0, 1, 2. 1 and 2 are set after declaring the array.
		 * 0 is not set anywhere but this output comes from the ints[0] that is given it's default value by the compiler.
		 */
		
		System.out.println("\n\nExample 9:");
		String[] names1 = new String[3];
		names1[1] = "Lisa";
		names1[2] = "Kevin";
		for(String n : names1) { System.out.print(n + ", "); }
		
		/*
		 * We've here another example with Strings that does the same as the above example (example 8). 
		 * String is set to "null" when not initialized. Because of this it prints: null, Lisa, Kevin.
		 * As names[0] is declared (by declaring the array), it'll get a default value and will get into the enhanced loop.
		 */
		
		System.out.println("\n\nExample 10:");
		String names2 = "Lisa";
		//for(String n : names2) { } // DOES NOT COMPILE
		
		/*
		 * As mentioned before: You must use an Array or ArrayList to make an enhanced forloop work.
		 * In this case it tries to loop over a String. In a String you can define only "one" String, so there is nothing to loop through.
		 * In this case the compiler will notice you that it cannot compile because of the invalid syntax.
		 */
		
		System.out.println("\nExample 11:");
		String[] names3 = new String[3];
		//for(int name : names3) { } // DOES NOT COMPILE
		
		/*
		 * You MUST use (just like the for loops) the same datatypes in the array as in the enhanced forloop.
		 * In this case the Array is of datatype: String.
		 * In the enhanced forloop we used datatype: int. This does not match so will not compile.
		 */
		
		System.out.println("\nExample 12:");
//		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
//		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
//			INNER_LOOP: for(int q1 = 0; q1 < mySimpleArray.length; i++) {
//				System.out.println(mySimpleArray[i]);
//			}
//		}
		
		
		// Had this on the exam with the question what the output would be.
		// Also available options: Does not compile / Exception on runtime.
		String s1 = "Hallo";
		String s2 = new String("Hallo");
		if(s1 == s2) {
			System.out.println("==");
		}else if(s1.equals(s2)) { 
			System.out.println(".equals()");
		}else {
			System.out.println("Something else..");
		}
		
		/*
		 * As s2 is created on runtime, == wouldn't return true.
		 * .equals() (in this case) will return true as it checks if the String is equals.
		 * Hallo == Hallo so .equals will return true.
		 */
	}
}