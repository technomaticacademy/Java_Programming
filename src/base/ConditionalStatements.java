package base;

public class ConditionalStatements {

	public static void main(String[] args) {

		int day = 10;

		if (day == 1) {
			System.out.println("Sunday");
		} else if (day == 2) {
			System.out.println("Monday");
			System.out.println("Monday is working day");
		} else if (day == 3)
			System.out.println("Tuesday");
		else if (day == 4)
			System.out.println("Wednesday");
		else if (day == 5)
			System.out.println("Thursday");
		else if (day == 6)
			System.out.println("Friday");
		else if (day == 7)
			System.out.println("Saturday");
		else
			System.out.println("Please enter values 1-7");

		// find the biggest value amongst three
		int a = 900;
		int b = 410;
		int c = 1310;

		if (a > b && a > c)
			System.out.println(" A is bigger than B and C ");
		else if (b > a && b > c)
			System.out.println(" B is bigger than A ansd C");
		else
			System.out.println("C is bigger than A and B");

		// find the biggest value amongst three
		int x = 110;
		int y = 230;
		int z = 30;

		if (z > y && z > x)
			System.out.println("Biggest value is z");

		else if (y > x && y > z)
			System.out.println(" Biggest value is y");

		else if (x > y && x > z)
			System.out.println("Biggest value is x");

	}

}
