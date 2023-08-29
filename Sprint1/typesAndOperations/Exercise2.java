package typesAndOperations;


public class Exercise2 {

	public static void main(String[] args) {
		long correct = 99_999;
		float firstNumber = 234.5f;
		short secondNumber = (short) firstNumber;
		System.out.println(((Object)correct).getClass().getName());
		System.out.println(secondNumber);
	}

}
