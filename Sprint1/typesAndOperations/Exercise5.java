package typesAndOperations;

public class Exercise5 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(findMax(a, b));

	}
	private static byte findMax(byte firstNumber, byte secondNumber) {
		return Integer.valueOf(Integer.max(firstNumber, secondNumber)).byteValue();
	}
}
