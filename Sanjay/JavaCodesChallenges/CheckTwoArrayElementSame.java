package Sanjay.JavaCodesChallenges;

import java.util.Arrays;

public class CheckTwoArrayElementSame {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3};
        System.out.println(TwoArraySameElements(arr1, arr2));
        System.out.println(TwoArraySameElements(arr1, arr3));
    }

    private static boolean TwoArraySameElements(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] arr1C = RemoveDuplicateInArray.removeDuplicate(arr1);

        Arrays.sort(arr2);
        int[] arr2C = RemoveDuplicateInArray.removeDuplicate(arr2);

        if (arr1C.length != arr2C.length) {
            return false;
        }
        for (int i = 0; i < arr1C.length; i++) {
            if (arr1C[i] != arr2C[i]) {
                return false;
            }
        }
        return true;
    }
}
