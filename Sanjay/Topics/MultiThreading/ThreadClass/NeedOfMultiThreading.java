package Sanjay.Topics.MultiThreading.ThreadClass;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        t1.start();
        t2.start();
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
