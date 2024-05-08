package Sanjay.Topics.MultiThreading.Join;

import Sanjay.Topics.MultiThreading.Runnable.PrintTask;

public class ThreadJoinTesting {
    public static void main(String[] args) throws InterruptedException {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        long startTime = System.currentTimeMillis();

        System.out.println("\n Thread 0 started");
        Thread t1 = new Thread(p1);
        t1.start();

        System.out.println("\n Thread 1 started");
        Thread t2 = new Thread(p2);
        t2.start();

        t1.join();

        System.out.println("\n Thread 2 started");
        Thread t3 = new Thread(p3);

        t3.start();

        t3.join(10);

        System.out.println("\n");
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println("\n");
    }
}
