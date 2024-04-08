package KB;

import java.util.Arrays;

public class Tasks5 {
    public static void sumandavg(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int s : arr) {
            sum += s;
        }
        double average = sum / n;

        System.out.println("Sum of elements in array: " + sum);
        System.out.println("Average of elements in array: " + average);
    }

    public static void numofoccur(int[] arr) {
        int[] arrcopy = arr.clone();
        int value = 0;
        for (int i = 0; i < arrcopy.length; i++) {
            if (arrcopy[i] != value) {
                int count = 1;
                boolean duplicate = false;
                for (int j = i + 1; j < arrcopy.length; j++) {
                    if (arrcopy[i] == arrcopy[j]) {
                        arrcopy[j] = value;
                        duplicate = true;
                        count++;
                    }
                }
                if (duplicate) {
                    System.out.println(arrcopy[i] + " occurs " + count + " time.");
                }
            }
        }
    }

    public static void minandmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                }
                if (min > arr[j]) {
                    min = arr[j];
                }
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void checksort(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 3, 5, 5, 6, 9, 2, 2 };

        System.out.println("Array: " + Arrays.toString(arr));
        
        sumandavg(arr);
        numofoccur(arr);
        minandmax(arr);
        checksort(arr);
    }
}