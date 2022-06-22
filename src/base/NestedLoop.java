package base;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {
			System.out.println("inside i Loop: " + i);

			for (int j = 1; j <= 3; j++) {
				System.out.println("--inside j Loop:" + j);
			}

		}

	}

}
