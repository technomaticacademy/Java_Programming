package base;

public class ChildClass extends ParentClass {

	int d = 50;
	int e = 100;

	public void read() {
		System.out.println("I am reading");
	}

	public static void main(String[] args) {

		ChildClass child = new ChildClass();
		child.read();
		System.out.println(child.d);

		child.read();

		child.eat();
		child.sleep();
		System.out.println(child.a + " " + child.b);

	}

}
