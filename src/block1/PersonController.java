package block1;

import java.util.ArrayList;
import java.util.List;

public class PersonController {
	private List<Person> persons = new ArrayList<Person>();
	
	public void printPersonInfo() {
		// Return all person details (lambda)
		//persons.forEach(person -> System.out.println(personDetails(person)));
		persons.forEach(person -> System.out.println(person.getDetailInfo()));
		
		System.out.println("\nTEAM INFORMATION:");
		// Return overall age
		System.out.println("All team members together are " + sumPersonAges() + " years old.\n"
				+ "That's an average of " + dividePersonAges() + " years old.");
	}
	
	public void addPerson(Person p, int... positionExperience) {
		persons.add(p);
		if (positionExperience.length > 0 && positionExperience[0] > 0) {
			((Employee)p).setPositionExperience(positionExperience[0]);
		}
	}
	
	public Person getPerson(String name) {
		for(Person p : persons) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	public String personDetails(Person person) {
		StringBuilder output = new StringBuilder(); // Could also just add new info to a String variable. How ever, this is better as it doesn't create new items on the stack every time that should be removed by garbincollector.
		output.append(person.getName() + " is " + person.getAge() + " years old and has " + (int)person.getWorkExperience() + " years of work experience.");
		if (person instanceof Employee) {
			output.append(" " + person.getName() + " is a " + ((Employee) person).getPositionRank() + ".");
		}else {
			output.append("  " + person.getName() + " is currently looking for a job.");
		}
		return output.toString();
	}
	
	public int sumPersonAges() {
		return persons.stream().mapToInt(Person::getAge).sum();
	}
	
	public int dividePersonAges() {
		return sumPersonAges() / persons.size();
	}
	
}
