package engineeringDigestCoreJava.com.EdOops.Encapsulation;

public class bankAcc {
    private long accNumber;

    private double balance = 100;

    public void withdraw (double amount){
        if (amount <= 0 || amount > balance){
            System.out.println("Enter valid amount or Insufficient balance.");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawl Amount "+amount);
        }
    }
    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Enter valid amount.");
        }
        else {
            balance += amount;
            System.out.println("Deposited : "+amount);
        }
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

}
