package base;

public class LoopingStmt {

	public static void main(String[] args) {

		for (int a = 10; a >= 0; a--) {
			System.out.println("Mohammed");
		}

		// 5,10,15,20,25,30.....50

		for (int i = 100; i >= 10; i--) {

			System.out.println(i * 5);

		}

		// To print all odd numbers from 1 to 10

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		int a = 543534;

		if (a % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");

		// To Print 1 to 10 using for

		for (int i = 1; i <= 10; i++)
			System.out.println(i);

		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	}
}
