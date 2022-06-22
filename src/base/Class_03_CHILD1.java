package base;

public class Class_03_CHILD1 extends Class_02_PARENT {

	public int a = 1000;

	protected void write() {
		System.out.println("I am writting");
	}

	public static void main(String[] args) {
		Class_03_CHILD1 c1 = new Class_03_CHILD1();
		c1.cook();
		c1.write();
	}

}
