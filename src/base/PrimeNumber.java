package base;

public class PrimeNumber {

	public static void main(String args[]) {

		int input = 101;
		int flag = 0;

		for (int i = 2; i < input / 2; i++) {
			if (input % i == 0) {
				System.out.println("This is not a prime number");
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("This is a prime number");
		}

	}

}
