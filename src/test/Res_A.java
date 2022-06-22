package test;

public class Res_A implements Food_Comittee {

	public static void main(String[] args) {
		Res_A a = new Res_A();

		a.water_facility();
		a.provide_bills();
		a.seating_facility();

	}

	@Override
	public void water_facility() {
		System.out.println("Hot water");

	}

	@Override
	public void provide_bills() {
		System.out.println("Only soft copy");

	}

	@Override
	public void seating_facility() {
		System.out.println("10 seats");

	}

	@Override
	public void fire_exit() {
		System.out.println("1 fire exit");

	}

}
