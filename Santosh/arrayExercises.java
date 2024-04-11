package Santosh;

import java.util.Arrays;

public class arrayExercises {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 1, 1, 1, 5, 9, 3, 7};
        int[] pal = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println(noOfOcc(arr, 1));
        System.out.println(maxmin(arr));
        reversed(arr);
        System.out.println(palindrome(pal));
        deleteElement(arr);
    }

    private static void deleteElement(int[] arr) {
        int elet = 1;
        // addd elements to an array
        for (int each : arr) {
            if (each == elet) {
                continue;
            }
            System.out.print(each);
        }
    }

    private static boolean palindrome(int[] arr) {
        int x = arr.length;
        int[] rev = new int[x];
        for (int each : arr) {
            if (arr[x - 1] != each) {
                return false;
            } else {
                x--;
            }

        }
        return true;
    }




    /*
     *

     * if current element == given element to delete, continue;
     *

     * */

    private static void reversed(int[] arr) {

        int x = arr.length;
        int[] rev = new int[x];
        for (int each : arr) {
            rev[x - 1] = each;
            x--;
        }

        System.out.println(Arrays.toString(rev));

    }

    private static String maxmin(int[] arr) {
        int[] mm = new int[2];
        int min_pointer = 0;
        int max_pointer = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[min_pointer] > arr[i]) {
                min_pointer = i;
            }
            if (arr[max_pointer] < arr[i]) {
                max_pointer = i;
            }
        }
        mm[0] = arr[min_pointer];
        mm[1] = arr[max_pointer];
        return Arrays.toString(mm);
    }

    public static int noOfOcc(int[] arr, int search) {
        int noofocc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                noofocc++;
            }
        }

        return noofocc;


    }


}
