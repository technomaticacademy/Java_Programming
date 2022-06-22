package base;

public class Methods {

	public static void main(String[] args) {

		System.out.println("inside main method");
		/*
		 * m1(); m2(); int sum = m3(); System.out.println("inside main - Sum = " + sum);
		 */

		n1();
//		int sum;
//		sum = add(5, 10);
//		System.out.println("Sum = " + sum);
//
//		sum = add(50, 100);
//		System.out.println("Sum = " + sum);
//
//		boolean res = isEven(9);
//		System.out.println("IsEven = " + res);
//
//		sum = add(55, 5100);

	}

	static boolean isEven(int a) {
		boolean result = (a % 2 == 0);
		return result;
	}

	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	static void m5() {
		String name = "Mohammed";
		int age = 33;
		System.out.println(name);
		System.out.println(age);
	}

	static void m1() {
		System.out.println("inside m1");
		String value = m4();
		System.out.println(value);
	}

	static void m2() {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("inside m2 - Sum = " + c);
	}

	static int m3() {
		int a = 1;
		int b = 2;
		int c = a + b;
		return c;
	}

	static String m4() {
		String n1 = "Mohammed";
		String n2 = "QA";
		String n3 = n1 + " " + n2;

		return n3;
	}

	static void n3() {
		System.out.println("inside n3 method");

	}

	static void n2() {
		System.out.println("inside n2 method");
	}

	static void n1() {

		n2();
		n3();
		n4();
		n3();
		n3();
		n2();
	}

	static void n4() {
		System.out.println("inside n4 method");

	}

}
