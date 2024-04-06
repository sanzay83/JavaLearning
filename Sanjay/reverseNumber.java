package Sanjay;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(3422343));
    }

    public static int reverse(int num) {
        int rev = 0;
        int last;
        while (num > 0) {
            last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        return rev;
    }
}
