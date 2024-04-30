package Sanjay.JavaCodesChallenges;

public class Recursion {
    public static void main(String[] args) {
        int num = 8;
        long fact = factorial(num);
        System.out.println("Factorial: " + fact);
    }

    private static long factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
