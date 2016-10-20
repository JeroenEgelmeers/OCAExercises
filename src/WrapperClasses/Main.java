package WrapperClasses;

public class Main {
	public static void main(String[] args) {
		
		// long > int > short > byte
		// double > float
		// double > int
		
		/*
		 * From primitive to primitive:
		 * The following cast can be done automatically by Java:
		 * float 	> double 	> long 	> int 	> short > byte
		 * 
		 * If you try in any other direction it won't work as Java is worry to lose your data. You've to cast it by yourself in that case.
		 * For example: new Byte((byte)1); so 1 (int) cannot cast to byte (you're working from right to left, as only from left to right is possible).
		 * Now you must call a cast (byte)1 in new Byte() to make it work. Keep in mind that you might lose some data!
		 * */
		
		 boolean 	$boolean 	= new Boolean(true); // true, false or "String"
		 char 		$char 		= new Character('c'); // can only take a character.

		 byte		$byte1 		= 1;
		 byte 		$byte 		= new Byte((byte)1); // 1 is an int, when casting to byte you could lose data. So you have to cast it by yourself. You can aslo use "String".
		 short 		$short 		= new Short((short)1); // 1 is an int, when casting to short you could lose data. So you have to cast it by yourself. You can also use "String".
		 int 		$int 		= new Integer(1); // int OR "String".
		 long 		$long 		= new Long(1); // int to long works fine. Or use long / "String".
		 float 		$float 		= new Float(1); // int can go in long (check above), so this works fine. Also "String" is possible or just a float.
		 double 	$double		= new Double(1); // int can go in double (check above), so this works fine. Also "String" is possible or just a double.
		 // char can take: int, long, float or double.
		 
		 // double can take all primitives except boolean.
		 double 	d1 	= $float;
		 double		d2 	= $long;
		 double 	d3 	= $int;
		 double 	d4 	= $short;
		 double 	d5 	= $byte;
		 double		d6 	= $char;
		
		 // float can take: long, int, short, byte, char
		 float		f1 	= $long;
		 float		f2 	= $int;
		 float		f3  = $short;
		 float		f4  = $byte;
		 float		f5 	= $char;
		 
		 // long can take: int, short, byte, char
		 long		l1 	= $int;
		 long		l2 	= $short;
		 long		l3 	= $byte;
		 long		l4 	= $char;
		 
		 // int can take: short, byte, char
		 int		i1  = $short;
		 int		i3 	= $byte;
		 int		i2 	= $char;
		 
		 // short can take: byte
		 short		s1 	= $byte;
		 
		 byte		b1 = $byte;
		
		 
		 // byte can take nothing.
		 // char can take nothing.
		 // boolean can take nothing.
	}

}
