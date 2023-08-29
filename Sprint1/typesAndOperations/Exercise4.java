package typesAndOperations;

public class Exercise4 {
	public static void main(String[] args) {
		String firstNumberString = "123.45";
		String secondNumberString = "234.56";
		System.out.println(addNumbers(firstNumberString, secondNumberString));
		
	}
	
	private static Float addNumbers(String firstNumber, String secondNumber) {
		return Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber);
	}
}
