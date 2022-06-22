package base;

public class AverageOfNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 6, 2, 5, 3, 4, 344, 345, 345 };

		int count = a.length;

		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum = sum + a[i]; // 0+4 = 4, 4+6=10, 10+2 = 12, 12+5 = 17
		}

		int avg = sum / count;

		System.out.println("Average of nos=" + avg);

	}

}
