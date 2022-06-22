package test;

public class Parent {

	protected int protectedvar = 1;

	public static void main(String[] args) {

		System.out.println("Testing");

	}

	public void publicmethod() {
		System.out.println("publicmethod");
	}

	private void privatemethod() {
		System.out.println("privatemethod");
	}

	protected void protectedmethod() {
		System.out.println("protectedmethod");
	}

	void defaultmethod() {
		System.out.println("protectedmethod");
	}

}
