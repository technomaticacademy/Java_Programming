package base;

public class TypeCasting {

	public static void main(String[] args) {

		// String to Integer
		String num1 = "Participants 10";
		String count = num1.substring(13, 15);
		System.out.println(count);

		String[] count1 = num1.split(" ");
		String ans = count1[1];

		System.out.println(ans);

		String num2 = "20";
		int num22 = Integer.parseInt(num2);

		System.out.println(num22);

		// Integer to String
		int a = 10;
		String aa = String.valueOf(a);

		int b = 20;
		String bb = String.valueOf(b);

		System.out.println(aa + bb);

	}

}
