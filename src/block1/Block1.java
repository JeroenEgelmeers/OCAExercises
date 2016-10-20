package block1;

public class Block1 {

	public static int getRandomNumber(int low, int high) 		{ return (int)(Math.random() * (high - low) + low);  }

	public static void main(String[] args) {
		PersonController c = new PersonController();
		
		// Add persons
		String[] persons = { "Jeroen", "Martijn", "Pim", "Tim", "Jaap", "Youri", "Kim" };
		for(int i = 0; i < persons.length; i++) {
			int age = getRandomNumber(65, 18);
			int workExp = getRandomNumber(age - 18, 1);
			switch(getRandomNumber(0,3)) {
				case 0:
					c.addPerson(new JavaProfessional(persons[i], age, getRandomNumber(10000000,99999999), workExp), getRandomNumber(workExp, 1));
				break;
				case 1:
					c.addPerson(new TestProfessional(persons[i], age, getRandomNumber(10000000,99999999), workExp), getRandomNumber(workExp, 1));
				break;
				default:
					c.addPerson(new Person(persons[i], age, getRandomNumber(10000000,99999999), workExp));
				break;
			}
		}

		// Set managers
		Person p = c.getPerson("Jeroen");
		if (p != null && p instanceof Employee) { 
			((Employee) p).setManager(c.getPerson("Martijn"));			
		}
			
		// Run controller
		c.printPersonInfo();
	}
}
