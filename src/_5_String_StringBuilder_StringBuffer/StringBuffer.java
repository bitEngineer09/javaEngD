package _5_String_StringBuilder_StringBuffer;
// Sab kuch same hee hai, bass yee thread safe hote hai

public class StringBuffer {
    public static void main(String[] args) throws InterruptedException {

//-------------Using StringBuilder------------------------------------------------
//        StringBuilder sb = new StringBuilder();
//        Task t1 = new Task(sb);  // do threads hai jo ki ek hee StringBuilder ko share kar re hai
//        Task t2 = new Task(sb);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Final Length: " + sb.length());
//        // final length 2000 aani chaiye thi, jo ki nahi aayi, Due to no Thread Safety


//----------------Using String Buffer--------------------------------
//        StringBuffer sbc = new StringBuffer();
//        Task t1 = new Task(sbc);  // do threads hai jo ki ek hee StringBuffer ko share kar re hai
//        Task t2 = new Task(sbc);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Final length: " + sbc.length()); // o/p -> 2000

    }
}


//class Task extends Thread {
//    private StringBuffer sbc;
//
//    public Task(StringBuffer sb) {
//        this.sbc = sb;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            sbc.append("a"); // dono threads me 1000 baar 'a' append ho ra hai
//        }
//    }
//}


//class Task extends Thread {
//    private StringBuilder sb;
//    public Task(StringBuilder sb) {
//        this.sb = sb;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            sb.append("a"); // dono threads me 1000 baar 'a' append ho ra hai
//        }
//    }
//}