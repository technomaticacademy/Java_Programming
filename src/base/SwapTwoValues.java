package base;

public class SwapTwoValues {

	public static void main(String[] args) {

		// 1. Swapping the numbers

//		String Ali = "Red ball";
//
//		String Oyon = "Green ball";
//
//		System.out.println("---Before Exchange:---");
//
//		System.out.println(Ali);
//		System.out.println(Oyon);
//
//		String Salman;
//
//		Salman = Ali;
//		Ali = Oyon;
//		Oyon = Salman;
//
//		System.out.println("---After Exchange:---");
//
//		System.out.println(Ali);
//		System.out.println(Oyon);

		int a = 5;
		int b = 10;

		System.out.println("Before Swap");
		System.out.println(a);
		System.out.println(b);

		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swap");
		System.out.println(a);
		System.out.println(b);

	}

}
