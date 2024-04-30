package Sanjay.JavaCodesChallenges;

import java.util.Arrays;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }

    public static int[] removeDuplicate(int[] arr) {
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int each : arr) {
            if (!checkArray(each, newArr)) {
                newArr[count] = each;
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = newArr[i];
        }
        return result;
    }

    private static boolean checkArray(int each, int[] newArr) {
        for (int i : newArr) {
            if (each == i) {
                return true;
            }
        }
        return false;
    }
}
