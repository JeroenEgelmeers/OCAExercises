package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", 		false, 	true));
		animals.add(new Animal("kangaroo", 	true, 	false));
		animals.add(new Animal("rabbit", 	true, 	false));
		animals.add(new Animal("turtle", 	false, 	true));
		
		// Lambda foreach
		animals.forEach(a -> System.out.println(													 // Lambda FOREACH through animals, print for each animal:
							a.toString().substring(0,1).toUpperCase() + a.toString().substring(1)  + // Set first letter to UPPERCASE
							" kan zwemmen: " + 														 // Additional text
							(a.canSwim() ? "Ja" : "Nee"))											 // Ternary IF to check if can swim. When true, return "Ja" else "Nee".
						);																			 // CLOSE Lambda foreach.		
		
		// Lambda method
		System.out.println("\ncan swim: " + print(animals, a -> a.canSwim()));
		System.out.println("can hop: " 	  + print(animals, a -> a.canHop())); 			// "Basic" Lambda
		System.out.println(print(animals, a -> { return a.canHop(); })); 				// { } must have a return!
	}
	
	private static String print(List<Animal> animals, CheckTrait checker) {
		StringBuilder output = new StringBuilder(); // Make sure to add "new StringBuilder()" else you'll get trouble initializing.
		
		animals.forEach(a -> { if (checker.test(a)) { output.append((a.toString() + ", ")); }});
		return (output.length() > 0) ? output.substring(0, output.length()-2).toString() : "";		
	}
}