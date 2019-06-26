package p05BankAccount;

public class J01Account {

	public String owner;
	private double balance;
	private double interest;
	
	public J01Account() {}
	
	public J01Account(String a, double b, double i) {
		owner = a;
		balance = b;
		interest = i;
	}
	
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}

	//@Override
//	public String toString() {
	//	return "Account [owner=" + owner + ", balance=" + balance + ", interest=" + interest + "]";
	//}
	
	
	
	
}
