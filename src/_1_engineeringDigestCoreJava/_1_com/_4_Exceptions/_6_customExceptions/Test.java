package _1_engineeringDigestCoreJava._1_com._4_Exceptions._6_customExceptions;

public class Test {
    public static void main(String[] args) throws Exception { // InsufficientFundsException bhi likh sakte hai
        bankAccount bank = new bankAccount(2000);
        try{
            bank.withdraw(3000);
        }
        catch (Exception e){ // InsufficientFundsException bhi likh sakte hai
            System.out.println(e);
        }
    }
}
