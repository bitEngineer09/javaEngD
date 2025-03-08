package _1_engineeringDigestCoreJava._1_com._4_Exceptions._6_customExceptions;

public class bankAccount {
    private double balance;
    private double amount;

    public bankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception{
        if (amount > balance){
            throw new InsufficientFundsException();
        }
    }

}
