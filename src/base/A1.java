package base;

public class A1 {

	static String s;

	public static void main(String[] args) {
		A2 obj1 = new A2();
		obj1.n1();
		System.out.println(obj1.name);

		A3 obj2 = new A3();
		obj2.k1();

		Salman s = new Salman();

		System.out.println(s.name);
		s.designation();
	}

}

class A2 {
	String name = "Mohammed";

	static void n1() {
		System.out.println("inside n1 method");
	}

	static void n2() {
		System.out.println("inside n2 method");
	}
}

class A3 {

	String s1;

	static void k1() {
		System.out.println("inside k1 method");
	}

	static void k2() {
		System.out.println("inside k2 method");
	}

}

class Salman {
	String name = "Salman";
	int score = 90;

	void designation() {
		System.out.println("Salman is working as QA");
	}
}
