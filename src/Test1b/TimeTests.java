package Test1b;

import java.time.*;

public class TimeTests {

	public static void main(String[] args) {
				
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.of(2016, 9, 28));
		System.out.println(LocalDate.of(2016, Month.AUGUST, 10));
		
		System.out.println(LocalTime.of(6, 15));
		System.out.println(LocalTime.of(6, 15, 30));
		System.out.println(LocalTime.of(6, 15, 30, 200));
		
		System.out.println(LocalDateTime.of(2016, Month.APRIL, 20, 6, 15, 30));
		System.out.println(LocalDateTime.of(LocalDate.of(2016, Month.AUGUST, 10), LocalTime.of(6, 15)));
				
		// Gebleven op pagina 141
	}
	
}
