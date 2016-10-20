package block3;

public class Hamster {

	private String color;
	private int weight;
	
	// Testing overloading constructors
	public Hamster(int weight, String color) {
		this.setWeight(weight);
		this.setColor(color);
	}
	
	// This one made to show the "this" version. Must be on top of constructor.
	public Hamster(int weight) {
		this(weight, "brown"); // MUST be the first call in the constructor. else error: Constructor call must be the first statement in a constructor
		System.out.println("in constructor");
	}

	
	// Getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
