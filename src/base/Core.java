package base;

class Core {

	public static void main(String[] args) {
		B1 objB1 = new B1();
		objB1.m1(); // calling the methods from class B1

		B3 objB3 = new B3();
		objB3.m3(); // calling the methods from class B3

		int sum = objB1.b + objB3.b; // Accessing the class variables from B1 & B3

		System.out.println(sum);

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
