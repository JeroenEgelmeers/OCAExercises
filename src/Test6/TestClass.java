package Test6;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestClass {


	public static void main(String[] args) {	
		System.err.println("Test");
		try {
			  doTest();
			}catch (MyException me) {
              System.out.println(me);
            }
		}

	static void doTest() throws MyException{
		int[] array = new int[10];
		array[0] = 1000;
		doAnotherTest();
		} 
	
	static void doAnotherTest() throws MyException{ 
		throw new MyException("Exception from doAnotherTest");
	} 
}

	class MyException extends Exception { 
		public MyException(String msg){
			super(msg);
        }
	}
