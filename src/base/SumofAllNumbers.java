package base;

public class SumofAllNumbers {

	public static void main(String[] args) {

		// Sum all numbers in between 1 to 100
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("i=" + i + "   sum=" + sum);
		}

		System.out.println("Final Sum value: " + sum);

	}

}
