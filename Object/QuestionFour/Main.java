package Object.QuestionFour;

public class Main {
    public static void main(String[] args) {
        // Creating a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(101, "Alice", "9876543210", 5000, 5.0);
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccNo());
        System.out.println("Account Holder: " + savingsAccount.getName());
        System.out.println("Mobile Number: " + savingsAccount.getMobileNo());
        savingsAccount.Deposit(1000);
        savingsAccount.Withdraw(500);
        savingsAccount.AddInterest();  // Add interest to the savings account balance

        System.out.println("\n------------------------------------\n");

        // Creating a CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount(102, "Bob", "9876543211", 3000, 3.0);
        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccNo());
        System.out.println("Account Holder: " + currentAccount.getName());
        System.out.println("Mobile Number: " + currentAccount.getMobileNo());
        currentAccount.Deposit(500);
        currentAccount.Withdraw(1000);
        currentAccount.AddInterest();  // Add interest to the current account balance

        System.out.println("\n------------------------------------\n");

        // Creating a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount(103, "Charlie", "9876543212", 1000, 2);
        System.out.println("Checking Account Details:");
        System.out.println("Account Number: " + checkingAccount.getAccNo());
        System.out.println("Account Holder: " + checkingAccount.getName());
        System.out.println("Mobile Number: " + checkingAccount.getMobileNo());
        checkingAccount.Deposit(200);
        checkingAccount.Withdraw(100);
        checkingAccount.Withdraw(50);  // This will exceed the free transactions limit and deduct fees

        System.out.println("Total Transactions: " + checkingAccount.getTransactionCount());
    }
}
