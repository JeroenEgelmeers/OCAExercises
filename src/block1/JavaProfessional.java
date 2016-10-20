package block1;

public class JavaProfessional extends Employee {	
	public JavaProfessional(String name, int age, int idNumber, int workExperience) {
		super(name, age, idNumber, workExperience);
	}
	
	public String getAdditionalInfo() { return " " + getName() + " is a " + getPositionRank(); }
	
	@Override
	public String getPositionRank() {
		String exp = " with " + (int)this.getPositionExperience() + " years of experience";
		if (getPositionExperience()  >= 10)
			return "senior Java programmer" + exp;
		else if(getPositionExperience()  >= 5)
			return "medior Java programmer" + exp;
		else if(getPositionExperience() >= 1)
			return "junior Java programmer with" + exp;
		else
			return "young professional - Java with no experience";
	}
}