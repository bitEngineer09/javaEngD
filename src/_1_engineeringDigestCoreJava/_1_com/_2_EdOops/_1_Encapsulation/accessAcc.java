package _1_engineeringDigestCoreJava._1_com._2_EdOops._1_Encapsulation;

public class accessAcc {
    public static void main(String[] args) {
        bankAcc access = new bankAcc();
        access.deposit(32);
        access.withdraw(25);
        access.setAccNumber(234234452);
        System.out.println(access.getAccNumber());
        System.out.println(access.getBalance());
    }
}
