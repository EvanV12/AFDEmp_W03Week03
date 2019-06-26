package p05BankAccount;

public class J02LoanAccount extends J01Account {

	private double installment;
	
	public J02LoanAccount() {}
	
	public J02LoanAccount( String owner, double balance, double interest, double inst) {
		super(owner, balance, interest);
		installment = inst;
	}

	
	public double getInstallment() {
		return installment;
	}

	public void setInstallment(double installment) {
		this.installment = installment;
	}
	
	
	
	public String toString() {
		return new String("Owner: " + getOwner() + "\nBalance: " + getBalance() +
				"\nOverdfart: " + getInstallment() + "\nInterest: " + getInterest() );
	}
	
}
