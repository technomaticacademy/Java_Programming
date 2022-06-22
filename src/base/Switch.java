package base;

public class Switch {

	public static void main(String[] args) {

		int num1 = 25;
		int num2 = 2;

		String operation = "add"; // add/sub/multiply;

		switch (operation) {

		case "add":
			System.out.println(num1 + num2);

		}

		String name = "a";

		switch (name) {

		case "Rafsan":
			System.out.println("I am Rafsan");
			System.out.println("I am from NY");
			System.out.println("I am 25 yrs old");
			break;

		case "Tanvir":
			System.out.println("I am Tanvir");

			break;

		case "Faruk":
			System.out.println("I am Faruk");
			break;

		case "Ali":
			System.out.println("I am Ali");
			break;

		default:
			System.out.println("invalid name");
			System.out.println("Please enter correct value");
			break;

		}

	}

}
