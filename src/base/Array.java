package base;

public class Array {

	public static void main(String[] args) {

		// String[] name = { "Mohammed", "Ali", "Farok", "Rafsan", "Nazmin" };

		String dept[] = new String[6];

		dept[0] = "QA";
		dept[1] = "Java dev";
		dept[2] = "C# dev";
		dept[3] = "DB";
		dept[4] = "Devops";
		dept[5] = "BA";

//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[4]);

//		for (int i = 0; i <= 5; i++) {
//			System.out.println(name[i]);
//		}

//		char a = 't';
//		char[] ar = { 'd', 'e', 'f', 'u', 't' };
//
//		for (int j = 2; j <= 4; j++) {
//			System.out.println(ar[j]);
//		}

//		boolean found = false;
//
//		for (int i = 0; i <= 4; i++) {
//
//			// System.out.println(name[i]);
//			if (name[i] == "Rafsan") {
//				System.out.println("Rafsan is present");
//				found = true;
//				break;
//			}
//		}
//
//		if (found == false) {
//			System.out.println("Rafsan is not present");
//		}

//		String[] name = { "Mohammed", "Ali", "Farok", "Rafsan", "Nazmin" };
//
//		for (int i = 0; i <= name.length; i++) {
//			// System.out.println(a);
//			if (name[i] == "Farok") {
//				System.out.println("Farok is present");
//			}
//		}

		double limit = 20;

		for (double a = (limit - 1); a >= 1; a--) {
			limit = limit * a;
		}
		System.out.println(limit);

	}
}
