package test;

public interface Interface_01 {

	public void savingsAccount();

	public void creditCard();

	default void Loan() {
		System.out.println("Loan");
	}

}
