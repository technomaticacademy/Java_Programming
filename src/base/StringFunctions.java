package base;

public class StringFunctions {

	public static void main(String[] args) {

//		Length
//		trim
//		equals
//		equalsIgnorecase
//		contains
//		concat
//		substring
//		replace
//		toUppercase/lowercase
//		startsWith/endswith
//		charAt
//		isEmpty
//		split

//		String organization = "Technomatic";
//
//		int len = organization.length();
//
//		System.out.println(len);
//
//		String name = "            Computers      ";
//
//		String a = name.trim();
//
//		System.out.println(a);
//
//		String name1 = "Mohammed";
//
//		String name2 = "MOHAMMED";
//
//		// String name3 = "Mohmmmmed";
//
//		if (name1.equals(name2)) {
//			System.out.println("Name 1 and Name 2 are equal");
//		} else {
//			System.out.println("Name 1 and Name 2 are not equal");
//		}
//
//		String n1 = "Mohammed Ali";
//
//		boolean b = n1.contains("Mo");
//
//		System.out.println(b);
//
//		String dept1 = "QA";
//
//		String dept2 = "Automation";
//
//		// String ans = dept1.concat(dept2);
//
//		String ans = dept1 + dept2;
//
//		System.out.println(ans);
//
//		String name3 = "Tanvir Hussain";
//
//		String newname = name3.substring(0, 8);
//
//		System.out.println(newname);
//
//		String newname2 = name3.replace("Hussain", "Ahamed");
//
//		System.out.println(newname2);
//
//		System.out.println(name3.toUpperCase());
//		System.out.println(name3.toLowerCase());
//
//		String name4 = "Oyon Mohammed";
//
//		boolean t = name4.startsWith("y");
//
//		boolean t2 = name4.endsWith("e");
//
//		System.out.println(t2);
//
//		String name5 = "Sumana";
//
//		System.out.println(name5.charAt(2));
//
//		String name6 = "";
//
//		boolean t5 = name6.isBlank();
//
//		System.out.println(t5);
//
//		String names = "Ali,Tanvir,Oyon,Naila,Sumana,Mohammed";
//
//		System.out.println(names);
//
//		String[] newnames = names.split(",");
//
//		for (int i = 0; i < newnames.length; i++) {
//			System.out.println(newnames[i]);
//		}
//
//		String name7 = "Mohammed"; // demmahoM
//
//		String[] newname7 = name7.split("");
//
//		for (int i = 0; i < newname7.length; i++) {
//			System.out.println(newname7[i]);
//		}
//		
//
//		String input = "Mohammed";
//		char[] a = input.toCharArray();
//
//		for (int i = a.length - 1; i >= 0; i--)
//			System.out.print(a[i]);

//		String name = "Mohammed";
//
//		String[] arrname = name.split("");
//		
//
//		for (int reverse = arrname.length - 1; reverse >= 0; reverse--)
//			System.out.print(arrname[reverse]);

		String name = "Mohammed";
		// String[] arrName = name.split("");
		// char[] arrName = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(name.charAt(i));
			} else {
				System.out.print(" ");
			}
		}

	}

}
