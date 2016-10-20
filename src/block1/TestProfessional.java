package block1;

public class TestProfessional extends Employee {
	
	public TestProfessional(String name, int age, int idNumber, int workExperience) {
		super(name, age, idNumber, workExperience);
	}
	
	public String getAdditionalInfo() { return " " + getName() + " is a " + getPositionRank(); }
	
	@Override
	public String getPositionRank() {
		String exp = " with " + (int)this.getPositionExperience() + " years of experience";
		
		if (getPositionExperience()  >= 8)
			return "senior tester" + exp;
		else if(getPositionExperience()  >= 3)
			return "medior tester" + exp;
		else if(getPositionExperience() >= 1)
			return "junior tester" + exp;
		else
			return "young professional - tester with no experience";
	}

}
