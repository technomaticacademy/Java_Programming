package test;

public class Static_Keyword {

	String employee_name;
	static String company;

	final int c = 10;

	final public void employee_name() {
		System.out.println("Employee name is: " + employee_name);
	}

	public void employee_company() {
		System.out.println("Employee Company is: " + company);
		Static_Keyword.add(4);
	}

	public static void add(int a) {
		System.out.println("add");

	}

	public static void main(String[] args) {

		Static_Keyword s1 = new Static_Keyword();
		s1.employee_name = "Mohammed";
		s1.company = "X_Y";
		s1.employee_name();
		s1.employee_company();

		Static_Keyword s2 = new Static_Keyword();
		s2.employee_name = "Tanvir";
		s2.employee_name();
		s2.employee_company();

		Static_Keyword s3 = new Static_Keyword();
		s3.employee_name = "Salman";
		s3.employee_name();
		s3.employee_company();

	}

}
