package base;

public class SwapThreeValues {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;

		System.out.println("before swap");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int temp;
		temp = a; // -> temp = 5
		a = c; // -> a = 15
		c = b; // -> c = 10
		b = temp; // -> b = 5
		System.out.println("After Swap");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
