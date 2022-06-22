package base;

public class Const_Class {

	public static void main(String[] args) {

		Employee tanvir = new Employee("Tanvir", 453, "QA Analyst");

		Employee ali = new Employee("Ali", 564, "Dev Analyst");

		Employee salman = new Employee("Salman", 543, "BA");

		Employee sumana = new Employee("Sumana", 432, "Dev Analyst");

		// ali.MyInfo();

		Employee faruk = new Employee("Faruk", 345, "QA Lead");

		faruk.MyInfo();

		Employee Mohammed = new Employee("QA", 45, "AAA");
		Mohammed.MyInfo();

	}

}

class Employee {

	String name;
	int id;
	String role;

	Employee(String x, int y) {
		name = x;
		id = y;
	}

	Employee(String a, int b, String c) {
		name = a;
		id = b;
		role = c;
	}

	void MyInfo() {
		System.out.println("My name is " + name);
		System.out.println("My id is " + id);
		if (role != null)
			System.out.println("I am working as " + role);
	}

}
