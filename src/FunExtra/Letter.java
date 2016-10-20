package FunExtra;

public class Letter {
	private char currentLetter;
	private char finalLetter;
	
	public Letter(char currentLetter) {
		this.currentLetter = currentLetter;
	}
	
	public char getCurrentLetter() {
		return this.currentLetter;
	}
	
	public void setFinalLetter(char fLetter) {
		this.finalLetter = fLetter;
	}
	
	public char getFinalLetter() {
		return finalLetter;
	}
	
	public String getFinalLetterString() {
		if (finalLetter == '\0') {
			return "" + this.getCurrentLetter(); 	//return new StringBuilder().append("").append(this.getCurrentLetter()).toString();
		}else {
			return "" + this.getFinalLetter(); 		// return new StringBuilder().append("").append(this.getFinalLetter()).toString();			
		}
	}
}
