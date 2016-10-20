package Lambda;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim) {
		this.species 	= species;
		this.canHop 	= canHop;
		this.canSwim 	= canSwim;
	}
	
	public boolean canHop() 	{ 	return this.canHop;	 }
	public boolean canSwim() 	{ 	return this.canSwim; }
	public String toString()	{	return this.species; }
}