package Sanjay.Topics.MultiThreading.Synchronize;

public class SyncronizeTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        UpdateThread t1 = new UpdateThread(counter);
        UpdateThread t2 = new UpdateThread(counter);
        long startTime = System.currentTimeMillis();


        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Total number of counts: %d Total time taken: %d", counter.getCount(), endTime - startTime);
    }
}
