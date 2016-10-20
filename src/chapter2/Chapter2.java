package chapter2;

public class Chapter2 {

	public static void main(String[] args) {
		// Book tasks
		System.out.println("Book tasks:");
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x = 3; \nint y = ++x * 5 / x-- + --x;");
		System.out.println("\nx is " + x);
		System.out.println("y is " + y);
		
		// Reden: 
		/* 
		 * 1: ++x * 5 wordt: 4 * 5. x is nu 4.
		 * 2: x-- + --x wordt: 
		 * 		Eerste x wordt eerst geschreven 4, en daarna pas naar 3 gezet.
		 * 		Daarna wordt de 2e x direct omlaag gezet (3-1 = 2)
		 * 	    De som wordt dus: 3 + 2
		 * 3: Dus: 4 * 5 / 4 + 2 = 
		 * 3.1:	   4 * 5 = 20.
		 * 3.2:    20 / 4 = 5.
		 * 3.3:    5 + 2 = 7.
		 * 4: x werd door de --x en x-- een 2 (x = 2).
		 * 5: De uitkomst van de volledige som bij y was 7 (y = 7).
		*/
		
		// blz 66
		boolean yBz66 = false;
		@SuppressWarnings("unused")
		boolean xBz66 = (yBz66 = true);
		System.out.println("\nOutput blz 66: " + yBz66);

	}

}
