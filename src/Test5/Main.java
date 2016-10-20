package Test5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {	
	
	static String local;
	
	public void print() {
		System.out.println("test 392i4928492");
	}
	
	public static void main(String[] args) {

		// Question 23
		System.out.println("Question: 23");
		System.out.println("String".replace('g', 'g')=="String"); // If nothing changes, the "replace" method does NOT create a new object. So they're both the same and it'll return true;
		System.out.println("String".replace('g', 'G')=="String"); // Now it changes, so it'll create a new object and that makes it return false.
		
		// Question 28
		System.out.println("Question: 28");
		local += "Test";
		System.out.println(local); // Local will get initialized in the top with "null". Adding "Test" to it, will return: "nullTest".
		
		// Question 37
		System.out.println("Question: 37");
		float f = 5.7f;
		double d = 3.8;
		System.out.println((int)f + " " + (int)d); // Casting float or double to int will only hold the number before the .
		
		System.out.println("Question: 40");
		int c = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j<2; j++) {
				for(int k = 0; k < 3; k++) {
					System.out.println(k);
					c++;
					if(k>j) {
						break;
					}
				}
			}
		}
		System.out.println(c);
		
		/*
		 * Bereken 1 iteratie aangezien je dat x2 kunt doen om het juiste antwoord te krijgen gezien de éérste for (i).
		 * 1 iteratie:
		 * I = 0
		 * J = 0
		 * K = 0 1 (breakt hier aangezien 1 > 0)
		 * C = 0 1 2
		 * 
		 * I = 0
		 * J = 0 1
		 * K = 0 1 2 (breakt hier aangezien 2 > 1)
		 * C = 0 1 2 3 4 5
		 * 
		 * De volgende stap is I verhogen, en dat is de 2e volledige iteratie waardoor die niet meer hoeft aangezien er verder niet wijzigd.
		 * Je kunt nu de uitkomst * 2 doen om aan het antwoord te komen:
		 * C = 5 * 2 (van i) = 10
		 * 
		 */
		
		// Question 51
		System.out.println("Question: 51");
		System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now()));

	}

}
