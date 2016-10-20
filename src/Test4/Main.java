package Test4;

public class Main {
	
	int i = 0;

	 public static void main(String[] args) {	 
		 
		 // Question 77
		 int i 			= 1;
		 String s 		= "hallo";
	     int[] iArr 	= {1};
	     
	     incr(i);		// int
	     incr(iArr); 	// Array
	     incr(s); 		// String
	     
	     // Print all current variable in scope.
	     System.out.println( "i = " + i + ".  iArr[0] = " + iArr [ 0 ] + ". s = " + s + ".");
	     
	     // Question 44:
	     System.out.println("Question 44: " + "12345".substring(0, 2)); // 0 (first) is included, 2 (second) is excluded.
	     
	     // Question 70
	     System.out.println("Question 70: " + returnValue());
	     
	     // Test 2:
	     //while(false) { } // mag niet.
	     
	 }
	 
	 public static String returnValue() { 
		 try {
			 //System.out.println("Sout: 1");
			 return  "1";
	     }catch(Exception e) {
			 //System.out.println("Sout: 2");
	    	 return "2";
	     }finally {
			 //System.out.println("Sout: 3");
	    	 return "3"; // The finally block's return will always return it's value. Try/Catch won't return it's return value.
	     }
	 }
	 
	 public static void incr(int   	n) { n++ ; 			} // Doesn't change the given variable.
	 public static void incr(int[] 	n) { n[0]++; 		} // Changes the given variable!!
	 public static void incr(String s) { s += " test"; 	} // Doesn't change the given variable.
}