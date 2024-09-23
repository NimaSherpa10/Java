package Object.QuestionFour;

public class CurrentAccount extends Account {
    private double interestRate;

    public CurrentAccount(int AccNo, String Name, String MobileNo, double balance, double interestRate) {
        super(AccNo, Name, MobileNo, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void AddInterest() {
        double interest = (getInterestRate() / 100) * super.getBalance();
        double newBalance = super.getBalance() + interest;
        System.out.println(" ---------Interest Amount of  ---- $" + interest + " is Added" ); 
        System.out.println("Your new Balance is ----- $" + newBalance );
    }
}
