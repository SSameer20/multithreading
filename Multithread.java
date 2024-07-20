import java.time.LocalTime;
import java.util.*;

class MultithreadingDemo implements Runnable {
    public void run() {
        try {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        int n = 10000000;
        LocalTime startTime = LocalTime.now();
        System.out.println("The Starting Time is " + startTime);
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }
        LocalTime endTime = LocalTime.now();
        System.out.println("The End Time is " + endTime);
    }
}
