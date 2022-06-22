package base;

public class Class_03_CHILD2 extends Class_02_PARENT {

	public int a = 1000;

	protected void read() {
		System.out.println("I am reading");
	}

	public void cook() {
		System.out.println("Child 2 is cooking");
	}

	public static void main(String[] args) {
		Class_03_CHILD2 c2 = new Class_03_CHILD2();
		c2.cook();
		c2.read();

	}

}
