package base;

public class MethodOverloading extends Class_03_CHILD1 {

	public void run() {
		System.out.println("I am running");
	}

	private void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum is " + c);
	}

	protected void add(int x, int y, int z) {
		int k = x + y + z;
		System.out.println("Sum is " + k);
	}

	private void add(String a, String b) {
		String c = a + b;
		System.out.println("The concatenated value " + c);
	}

	public static void main(String[] args) {

		MethodOverloading cl1 = new MethodOverloading();
		cl1.add(10, 20);
		cl1.add(10, 20, 30);
		cl1.add("Mohammed", "Faruk");

	}

}
