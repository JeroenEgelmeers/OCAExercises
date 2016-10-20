package Test4;

public class JavaProfessional extends Employee {

	//public JavaProfessional() { } // Error as there is not a non-argument constructor defined in Employee.
	public JavaProfessional(int age) { super(age); } // Works, there is an int argumented constructor defined in Employee.	

}
