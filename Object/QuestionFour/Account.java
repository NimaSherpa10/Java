package Object.QuestionFour;

public class Account {
    private int AccNo;
    private String Name;
    private String MobileNo;
    private double balance;
    
    //constructor
    public Account(int AccNo, String Name, String MobileNo, double balance) {
        this.AccNo = AccNo;
        this.Name = Name;
        this.MobileNo = MobileNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("------Deposit of " + amount + "is Successful---");
            System.out.println("-----Your new Balance is -----> $" + getBalance());
        }
        else{
            System.out.println("The minimum deposit Amount must be greater than $0");
        }
    }

    public int getAccNo(){
        return AccNo;
    }

    public void setAccountNo(int number) {
        if(number > 0) {
            this.AccNo = number;
        }
        else{
            throw new IllegalArgumentException("Account Number cannot be empty");
        }
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String number) {
        if(number.matches("\\d{10}")) {
            this.MobileNo = number;
        }
        else{
            throw new IllegalArgumentException("Phone number must be 10 digit");
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length() > 0) {
            this.Name = name;
        }
        else{
            throw new IllegalArgumentException("name cannot be empty");
        }

    }

    public void Withdraw(double amount) {
        if((balance - amount) > 0 && amount > 0) {
            balance =  getBalance() - amount;
            System.out.println("--------- Withdraw Successful ----------");
            System.out.println("Your new Balance is -----------> $" + getBalance());
        }
        else if (amount < 0) {
            System.out.println("The Withdraw amount must be greater than $0");
        }
        else if((balance - amount) < 0){
            System.out.println("--------- Insufficient Fund ------------ ");
            System.out.println("Your balance is ----> $" + getBalance());
        }
        else{
            System.out.println("---------Withdraw Fail --------");
            System.out.println("Please ask for personal Help");
        }
    }



}
