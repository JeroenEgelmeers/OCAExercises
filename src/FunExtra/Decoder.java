package FunExtra;

import java.util.ArrayList;
import java.util.List;

public class Decoder {
	
	private List<Letter> letters = new ArrayList<Letter>();
	private List<LetterTo> letterTo = new ArrayList<LetterTo>();

	public void addLetterTo(LetterTo lt) {
		letterTo.add(lt);
	}
	
	public String decodeString(String s) {
		for (int i = 0; i < s.length(); i++) {
			letters.add(new Letter(s.charAt(i)));
		}
		
		for(Letter l : letters) {
			if (l.getFinalLetter() == '\0') {
				for(LetterTo to : letterTo) {
					if (l.getCurrentLetter() == to.getCurrentChar()) {
						l.setFinalLetter(to.getToChar());
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Letter l : letters) {
			sb.append(l.getFinalLetterString());
		}
		
		return sb.toString();
	}
}
