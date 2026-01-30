package day_12_abstractAssignment;

public abstract class A_03_Account {

	    protected int accNumber;
	    protected String accName;
	    protected double balance;//state dm

	    //default cons
	    public A_03_Account()
	    {
	    	
	    }
	    
	    //para cons
	    public A_03_Account(int accNumber, String accName, double balance) {
	        this.accNumber = accNumber;
	        this.accName = accName;
	        this.balance = balance;
	    }

	    // To be implemented in subclasses
	    public abstract void withdraw(double amount);

	    // To be implemented in subclasses
	    public abstract void calculateBalance();

	    //insatnce member method
	    public void display() {
	        System.out.println("Account Number: " + accNumber);
	        System.out.println("Account Name: " + accName);
	        System.out.println("Balance: " + balance);
	    }
}
