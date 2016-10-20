package block1;

public class Person {
	private String 	name;
	private int 	age, idNumber;
	private double 	workExperience;
	
	public Person(String name, int age, int idNumber, double workExperience) {
		setName(name);
		setAge(age);
		setIdNumber(idNumber);
		setWorkExperience(workExperience);
	}
	
	// Getting overrided by subclasses
	public String	getDetailInfo() 				{ return "#" + getIdNumber() + " " + getName() + " is " + getAge() + " years old and has " + getWorkExperience() + " year(s) of work experience."; }
	
	// Getters and Setters
	public String 	getName() 						{ return name; }
	public void 	setName(String name) 			{ this.name = name; }
	public int 		getAge() 						{ return age; }
	public void 	setAge(int age) 				{ this.age = age; }
	public int 		getIdNumber() 					{ return idNumber; }
	public void 	setIdNumber(int idNumber) 		{ this.idNumber = idNumber;}
	public double	getWorkExperience() 			{ return this.workExperience; }
	private void	setWorkExperience(double wExp) 	{ this.workExperience = wExp; }
}