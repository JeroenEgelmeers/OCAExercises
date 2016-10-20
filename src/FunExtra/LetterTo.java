package FunExtra;

public class LetterTo {
	final private char currentChar;
	private char toChar;
		
	public LetterTo(char currentChar, char toChar) {
		this.currentChar = currentChar;
		this.toChar = toChar;
	}

	public char getCurrentChar() {
		return currentChar;
	}

	public char getToChar() {
		return toChar;
	}	
		
}
