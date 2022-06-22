package test;

public class CountNoOfAlpha {

	public static void main(String[] args) {
		
		String input = "ADEF23RT5343ER";
		char ch;
		int ascii;
		int counter=0;
		
		for(int i=0; i<input.length();i++) {
			ch = input.charAt(i);
			ascii = (int) ch;
			System.out.println(ch +" - " + ascii);
			
			if(ascii>=65 && ascii<=90) {
				System.out.println("It is a alphabet");
				counter=counter+1;
			}
			
			
		}
		
		System.out.println(counter);

	}

}
