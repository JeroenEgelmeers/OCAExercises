package FunExtra;

public class Main {

	public static void main(String[] args) {
		String string = "AAP EYIL UPDYQEYQZ CUYX XYFGDANH EAX VUR BYXQYWX DJX VAAQ YMXQA AAPDAFGX BYHXYDYP?";
		Decoder decoder = new Decoder();
		
		// Add letters
		decoder.addLetterTo(new LetterTo('P', 'N'));
		decoder.addLetterTo(new LetterTo('V', 'J'));
		decoder.addLetterTo(new LetterTo('Q', 'R'));
		decoder.addLetterTo(new LetterTo('Y', 'E'));
		decoder.addLetterTo(new LetterTo('W', 'F'));
		decoder.addLetterTo(new LetterTo('N', 'Y'));
		decoder.addLetterTo(new LetterTo('M', 'X'));
		decoder.addLetterTo(new LetterTo('F', 'C'));
		decoder.addLetterTo(new LetterTo('G', 'H'));
		decoder.addLetterTo(new LetterTo('E', 'W'));
		decoder.addLetterTo(new LetterTo('I', 'L'));
		decoder.addLetterTo(new LetterTo('Z', 'P'));
		decoder.addLetterTo(new LetterTo('C', 'M'));
		decoder.addLetterTo(new LetterTo('J', 'I'));
		decoder.addLetterTo(new LetterTo('L', 'K'));
		decoder.addLetterTo(new LetterTo('U', 'O'));
		decoder.addLetterTo(new LetterTo('X', 'T'));
		decoder.addLetterTo(new LetterTo('H', 'S'));
		decoder.addLetterTo(new LetterTo('R', 'U'));
		
		// Decode:
		System.out.println(decoder.decodeString(string));
	}
}
