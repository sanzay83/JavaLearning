package Sanjay.JavaCodesChallenges.HacRan;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {
    public static int cookies(int k, List<Integer> A) {
        int result = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(A);

        while (q.peek() < k && q.size() > 1) {
            int a = q.remove();
            int b = q.remove();
            q.add(a + b * 2);
            result++;
        }

        return (q.peek() >= k) ? result : -1;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        int[] x = {1, 2, 3, 9, 10, 12};
        for (int each : x) {
            A.add(each);
        }
        int k = 7;
        System.out.println(cookies(k, A));
    }
}
