package typesAndOperations;

public class Exercise1 {
	static String check;

	public static void main(String[] args) {
		String[] names = {"Маша", "Саша", "Катя", "Артем"};
		sayHello(names);
		int sum = add(3,6);
	}
	
	public static void sayHello(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println("Привет, " + names[i]);
	}
}
	public static int add(int a, int b) {
		return a + b;
	}
}
