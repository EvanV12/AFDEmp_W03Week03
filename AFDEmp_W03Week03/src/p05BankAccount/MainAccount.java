package p05BankAccount;

public class MainAccount {

	public static void main(String[] args) {

		J03StudentAccount sa = new J03StudentAccount("Jimmy", 20.0, 0.02, 1000.0);
		J02LoanAccount la = new J02LoanAccount();
		la.setBalance(30000);
		la.setInstallment(200.0);
		la.setOwner("Jack");
		la.setInterest(12.5);
		
		
		System.out.println(sa);
		System.out.println();
		System.out.println(la);
		
		
		
	}

}
