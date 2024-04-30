package Sanjay.JavaCodesChallenges;

public class Palindrome {

    public static boolean palindromCheck(String s) {
        String[] arr = s.split("");
        String rev = "";
        for (String i : arr) {
            rev = i + rev;
        }
        return rev.equals(s);
    }

    public static int counter(int initial) {
        int count = 0;
        while (initial > 10) {
            count += 1;
            initial = initial / 10;
        }
        return count;
    }

    public static String palindromCheck(int initial) {
        int s = initial;
        int n = counter(initial);
        System.out.println(n);
        int holder = 0;
        int r;
        while (s > 0) {
            r = s % 10;
            s = s / 10;
            holder = (int) (holder + (r * Math.pow(10, n)));
            n -= 1;
        }

        if (initial == holder) {
            return "True";
        } else {
            return "False";
        }

    }
}
