package p05BankAccount;

public class J03StudentAccount extends J01Account {

		private double overdraft;
		
		public J03StudentAccount() {}
		
		public J03StudentAccount(String a, double b, double i, double od) { 
			super(a, b, i);
			overdraft = od;
		}
		

		public double getOverdraft() {
			return overdraft;
		}

		public void setOverdraft(double overdraft) {
			this.overdraft = overdraft;
		}
		
		
		public String toString() {
			return new String("Owner: " + getOwner() + "\nBalance: " + getBalance() +
					"\nOverdfart: " + getOverdraft() + "\nInterest: " + getInterest() );
		}
		
		
		
}
