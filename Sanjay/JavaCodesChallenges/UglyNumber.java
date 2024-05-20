package Sanjay.JavaCodesChallenges;

public class UglyNumber {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isUgly(num));
    }

    private static boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
        return true;
    }
}
