/*package day_12_abstractAssignment;

import java.util.Scanner;

public class A_03_AccountTypesDemo {

	 public static void main(String[] args) {
	      
		 	Scanner scanner = new Scanner(System.in);

	        // Prompt user to choose account type
	        System.out.println("Choose an account type:");
	        System.out.println("1. Savings Account");
	        System.out.println("2. Current Account");
	        System.out.println("3. Recurring Account");
	        int choice = scanner.nextInt();

	        // Create account based on user choice
	        A_03_Account account = null;
	        switch (choice) {
	            case 1:
	                account = new A_03_SavingAccount(101, "Savings Account", 10000);
	                break;
	            case 2:
	                account = new A_03_CurrentAccount(102, "Current Account", 50000, 50000);
	                break;
	            case 3:
	                account = new A_03_RecurringAccount(103, "Recurring Account", 20000, 2000, 12);
	                break;
	            default:
	                System.out.println("Invalid choice. Exiting program.");
	                return;
	        }

	        // Prompt user to perform actions on the selected account
	        System.out.println("Choose an action:");
	        System.out.println("1. Withdraw");
	        System.out.println("2. Calculate Balance");
	        int action = scanner.nextInt();

	        // Perform action based on user choice
	        switch (action) {
	            case 1:
	                System.out.println("Enter withdrawal amount:");
	                double withdrawAmount = scanner.nextDouble();
	                account.withdraw(withdrawAmount);
	                break;
	            case 2:
	                account.calculateBalance();
	                break;
	            default:
	                System.out.println("Invalid action. Exiting program.");
	                break;
	        }

	        // Display account details
	        System.out.println("Updated Account Details:");
	        account.display();

	        scanner.close();
	    }
}
*/

/*
package day_12_abstractAssignment;

import java.util.Scanner;

public class A_03_AccountTypesDemo {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose account type
        System.out.println("Choose an account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Recurring Account");
        int choice = scanner.nextInt();

        // Variables to store account details Common details
        int accountId;
        String accountType;
        double initialBalance;
        double overdraftLimit = 0;//non-static dm
        double installmentAmount = 0;
        int numInstallments = 0;

        // Get account details based on user choice
        switch (choice) {
            case 1:
                System.out.println("Enter account ID:");
                accountId = scanner.nextInt();
                System.out.println("Enter initial balance:");
                initialBalance = scanner.nextDouble();
                accountType = "Savings Account";
                break;
            case 2:
                System.out.println("Enter account ID:");
                accountId = scanner.nextInt();
                System.out.println("Enter initial balance:");
                initialBalance = scanner.nextDouble();
                System.out.println("Enter overdraft limit:");
                overdraftLimit = scanner.nextDouble();
                accountType = "Current Account";
                break;
            case 3:
                System.out.println("Enter account ID:");
                accountId = scanner.nextInt();
                System.out.println("Enter initial balance:");
                initialBalance = scanner.nextDouble();
                System.out.println("Enter installment amount:");
                installmentAmount = scanner.nextDouble();
                System.out.println("Enter number of installments:");
                numInstallments = scanner.nextInt();
                accountType = "Recurring Account";
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
        }

        // Create account based on user input
        A_03_Account account;
        switch (choice) {
            case 1:
                account = new A_03_SavingAccount(accountId, accountType, initialBalance);
                break;
            case 2:
                account = new A_03_CurrentAccount(accountId, accountType, initialBalance, overdraftLimit);
                break;
            case 3:
                account = new A_03_RecurringAccount(accountId, accountType, initialBalance, installmentAmount, numInstallments);
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
        }

        // Prompt user to perform actions on the selected account
        System.out.println("Choose an action:");
        System.out.println("1. Withdraw");
        System.out.println("2. Calculate Balance");
        int action = scanner.nextInt();

        // Perform action based on user choice
        switch (action) {
            case 1:
                System.out.println("Enter withdrawal amount:");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 2:
                account.calculateBalance();
                break;
            default:
                System.out.println("Invalid action. Exiting program.");
                break;
        }

        // Display account details
        System.out.println("Updated Account Details:");
        account.display();
        scanner.close();
    }
}
*/

package day_12_abstractAssignment;

import java.util.Scanner;

public class A_03_AccountTypesDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        A_03_Account[] accounts = new A_03_Account[5];

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\n--- Enter details for Account " + (i + 1) + " ---");
            System.out.println("Choose account type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Recurring Account");
            int choice = scanner.nextInt();

            // Common details
            System.out.print("Enter Account ID: ");
            int accountId = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
            System.out.print("Enter Account Holder Name: ");
            String accountHolderName = scanner.nextLine();
            System.out.print("Enter Initial Balance: ");
            double initialBalance = scanner.nextDouble();

            A_03_Account account = null;

            switch (choice) {
                case 1:
                    account = new A_03_SavingAccount(accountId, accountHolderName, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    account = new A_03_CurrentAccount(accountId, accountHolderName, initialBalance, overdraftLimit);
                    break;
                case 3:
                    System.out.print("Enter Installment Amount: ");
                    double installmentAmount = scanner.nextDouble();
                    System.out.print("Enter Number of Installments: ");
                    int numInstallments = scanner.nextInt();
                    account = new A_03_RecurringAccount(accountId, accountHolderName, initialBalance, installmentAmount, numInstallments);
                    break;
                default:
                    System.out.println("Invalid account type selected. Skipping this account.");
                    i--; // reattempt this index
                    continue;
            }

            // Perform withdrawal
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            // Store object in array
            accounts[i] = account;
        }

        // Display all accounts
        System.out.println("\n--- Displaying All Account Details ---");
        for (A_03_Account acc : accounts) {
            acc.display();
            System.out.println("--------------------------");
        }

        scanner.close();
    }
}
