package day_12_abstractAssignment;

public class A_03_CurrentAccount extends A_03_Account {

	 	private double overdraftAmt;

	    //default cons
	 	public A_03_CurrentAccount()
	 	{
	 		super();
	 	}
	 	
	 	//para
	    public A_03_CurrentAccount(int accNumber, String accName, double balance, double overdraftAmt) {
	        super(accNumber, accName, balance);
	        this.overdraftAmt = overdraftAmt;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance + overdraftAmt >= amount) {
	            balance -= amount;//balance = balance - amount;
	            System.out.println("Withdrawal of " + amount + " from Current Account successful.");
	        } else {
 				System.out.println("Insufficient funds (including overdraft). Withdrawal denied.");	        }
	    }

	    @Override
	    public void calculateBalance() {
	        System.out.println("Balance including overdraft limit: ₹" + (balance + overdraftAmt));
	    }

		@Override
		public void display() {
			super.display();
			System.out.println("Overdraft Limit: ₹" + overdraftAmt);
		}
}
