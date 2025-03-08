package _1_engineeringDigestCoreJava._2_MultiThreading._5_Locks.ExplicitLockUseCaseScenario;

public class WhenToApplyLocksExplicitlyEg {
    private double balance = 500;

    private double amount;

    public synchronized void  withdraw(double amount) {
// jaise hee humne ese 'synchr'. declare kar diya ab use 't1' access karega jab tak pura block of code execute naa ho jaaye, irrespective of any condition
// jab 't1' pura use kar lega fir 't2' access karega.

        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amount);
        if (amount <= balance) {
            System.out.println(Thread.currentThread().getName() + " is proceeding with withdrawl.");
            try {
                Thread.sleep(1000); // yaha ye problem huui ki suppose agar ye 20 sec
                // le raha hai, then t2 ko to bht wait karna pad raha hai, therfore ab yaha khud se locks handle karenge
            }
            catch (Exception e) {

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed Withdrawl, Remainign Balance is : " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance.");
        }
    }
}
