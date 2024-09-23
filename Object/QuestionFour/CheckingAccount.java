package Object.QuestionFour;

public class CheckingAccount extends Account {
       private int NoOfFreeTransactions;
       private int TransactionCount;
       private double transactionFee = 2.0;
       public CheckingAccount(int AccNo, String Name, String MobileNo, double balance,int NoOfFreeTransactions) {
            super(AccNo, Name, MobileNo, balance);
            this.NoOfFreeTransactions = NoOfFreeTransactions;
            this.TransactionCount = 0;
       }

       public void Deposit(double amount) {
        super.Deposit(amount);  // Call the parent class's Deposit method
            processTransaction();
        }

        public void Withdraw(double amount) {
            super.Withdraw(amount);  // Call the parent class's Withdraw method
            processTransaction();
        }
        
        private void processTransaction() {
            TransactionCount++;
            if (TransactionCount > NoOfFreeTransactions) {
                deductTransactionFee();
            }
        }

        private void deductTransactionFee() {
            double balance = getBalance();
            if (balance >= transactionFee) {
                System.out.println("Transaction limit exceeded. Deducting fee of $" + transactionFee);
                balance -= transactionFee;
                System.out.println("New Balance after fee: $" + balance);
            } else {
                System.out.println("Insufficient balance to deduct the transaction fee.");
            }
        }

       public int getTransactionCount() {
            return TransactionCount;
       }

       public int getNoOfFreeTransactions() {
            return NoOfFreeTransactions;
       }

}
