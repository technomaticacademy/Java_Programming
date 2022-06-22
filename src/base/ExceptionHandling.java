package base;

public class ExceptionHandling {

	public static void main(String[] args) {

		div(10, 2, "Hello");
		div(10, 0, "Hi");
		div(10, 5, null);
	}

	static void div(int a, int b, String d) {
		try {

			System.out.println("---------------------------------------");
			int c = a / b;
			System.out.println("Division output=" + c);

			int count = d.length();
			System.out.println("Length of the given string is: " + count);

		}

		catch (Exception e2) {
			System.out.println("There is arithmetic Exception. Give correct input." + e2.getMessage());
		}

//		catch (ArithmeticException e) {
//			System.out.println("There is arithmetic Exception. Give correct input." + e.getMessage());
//		}
//
//		catch (NullPointerException e1) {
//			System.out.println("There is null pointer Exception. Give correct input." + e1.getMessage());
//		}
//
		finally {
			System.out.println("inside Finally block");
		}

	}

}
