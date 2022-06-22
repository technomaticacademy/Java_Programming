package base;

public class LogicalOperators {

	public static void main(String[] args) {

		// Code to explain Logical operation
		int K = 50;
		int L = 100;

		boolean result = (K == L);

		System.out.println(result); // => FALSE

		result = (K < L) || (K == L);

		System.out.println(result); // => TRUE

		result = !((K < L) || (K == L));

		System.out.println(result); // => FALSE

	}

}
