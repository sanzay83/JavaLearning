package Sanjay.JavaCodesChallenges;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(3422343));
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}
