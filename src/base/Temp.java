package base;

import test.Parent;

public class Temp extends Parent {

	public void publicmethod1() {
		System.out.println("publicmethod in child class");
	}

	public void publicmethod1(int a) {
		System.out.println("publicmethod in child class");

	}

	public void tester1() {
		Parent testing = new Parent();
		Core core = new Core();

		publicmethod();
		protectedmethod();
		core.defaultmethod();
		System.out.println(protectedvar);
	}

	public static void main(String[] args) {

		Temp t = new Temp();
		t.tester1();

	}

//		int score = 55;
//
//		int[] arr = { 1, 3, 6 };
//
//		int[] brr = new int[10];
//		brr[0] = 2;
//		brr[2] = 5;
//		brr[3] = 4;
//
//		String crr[] = { "Hi", "Hello", "How" };
//		String [] arrEmployee = {“John”, “Ahsan”, “Salma”, “Smith”};
//
//		String drr[] = new String[0];
//
//		for (int i = 0; i < crr.length; i++)
//			System.out.println(crr[i]);
//
//		int[] myArr = { 2, 4, 2, 4, 5, 6, 3 };
//		System.out.println("Array size before copy: " + myArr.length);
//		int[] newArr = Arrays.copyOf(myArr, 10);
//		System.out.println("New array size after copying: " + newArr.length);
//		
//		for(int i=0;i<arrEmployee.length;i++) {
//			System.out.println(arrEmployee[i]);
//		}

//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//
//		System.out.println(sum);
//		
//		int sum = 0;
//		for (int a = 1; a <= 10; a++) {
//			sum = sum + a;
//			System.out.println(sum);
//		}

//		int a = 10;
//
//		while (a > 0) {
//			// if (a == 10 || a == 7 || a == 4 || a == 1)
//			System.out.println(a);
//			a = a - 3;
//		}

//		int a = 10;
//		while (a >= 1) {
//			System.out.println(a);
//			a -= 3;
//		}

	// Write a java program to print the sum of all even numbers from 1 to 10 using
	// while loop:

//	
//		*
//		**
//		***
//		****
//		*****

//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//
//			System.out.println("");
//
//		}

//		try {
//			temp1();
//		} catch (Exception e) {
//			System.out.println("inside main exception");
//		}
//
//		B b = new B();
//		C c = new C();
//		c.m1();
//		c.n1();

	static void temp1() {
		int a = 10;
		int b = 0;
		System.out.println(a / b);

	}
}

class B {

	B() {
		System.out.println("inside A");
	}

	void m1() throws ArithmeticException {
		System.out.println("inside m1");
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}

}

class C extends B {

	void n1() {
		System.out.println("inside n1");
	}

}
