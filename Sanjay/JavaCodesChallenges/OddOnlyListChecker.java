package Sanjay.JavaCodesChallenges;

public class OddOnlyListChecker {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};
        int[] arr2 = {1, 3, 5, 7};
        System.out.println(OddOnlyChecker(arr));
        System.out.println(OddOnlyChecker(arr2));
    }

    private static boolean OddOnlyChecker(int[] arr) {
        for (int each : arr) {
            if (each % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
