package block1;

// Abstract class as a Person should never be "only" an Employee.
public abstract class Employee extends Person {
	private int		positionExperience;
	private double	salary;
	private Person	manager;
	int i, j, k;
	
	public Employee(String name, int age, int idNumber, int workExperience) {
		super(name, age, idNumber, workExperience);
	}
	
	// Abstract functions; should be implemented in child-classes
	public abstract String getPositionRank();
	public abstract String getAdditionalInfo();
	
	// Getters and setters
	public String 	getDetailInfo() 					{ return super.getDetailInfo() + getAdditionalInfo(); }
	public double	getPositionExperience() 			{ return this.positionExperience; }
	public void 	setPositionExperience(int pExp) 	{ this.positionExperience = pExp; }
	public Person	getManager() 						{ return this.manager; }
	public void		setManager(Person p) 				{ this.manager = p; }
	public double 	getSalary() 						{ return salary; }
	public void 	setSalary(double salary) 			{ this.salary = salary; }
}