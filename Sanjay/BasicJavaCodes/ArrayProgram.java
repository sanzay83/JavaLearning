package Sanjay.BasicJavaCodes;

import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 1, 2, 8, 5, 9, 1, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The given array arr is " + Arrays.toString(arr));
        System.out.println("The given array arr2 is " + Arrays.toString(arr2));
        SumAverageArray.SumAndAverage(arr);
        CheckNoOfOccurrence(arr, 1);
        int[] maxMin = FindMaximumMinimum.MaxAndMinimum(arr);
        System.out.println("The maximum no is " + maxMin[1] + " and The minimum no is " + maxMin[0]);
        CheckIfSorted(arr);
        System.out.println("Array after removing number 2: " + Arrays.toString(DeleteItemInArray.DeleteNumber(arr, 2)));
        System.out.println("The reverse of the array is " + Arrays.toString(ReverseArray.reverseArray(arr)));
        CheckArrayPalindrome.CheckPalindrome(arr);
        System.out.println("Sort and Merge Array" + Arrays.toString(MergeSortedArray.MergeArray(Sort.Sorted(arr), Sort.Sorted(arr2))));
        int[][] twoDArray = {{4, 3, 2}, {5, 7, 1}};
        SearchElement(twoDArray);
        SumAverageArray2D.SumAndAverage2D(twoDArray);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SumOf2DDiagonal(matrix);
    }

    private static void SumOf2DDiagonal(int[][] matrix) {
        int back = matrix.length - 1;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[back][back];
            back--;
        }
        if (matrix.length % 2 != 0) {
            int pos = matrix.length / 2;
            sum1 -= matrix[pos][pos];
        }
        System.out.println("Sum of the two diagonal elements is " + (sum1 + sum2));
    }


    private static void SearchElement(int[][] twoDArray) {
        int element = 8;
        boolean flag = true;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (element == twoDArray[i][j]) {
                    System.out.println(element + " found!");
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println(element + " not found!");
        }
    }

    private static void CheckIfSorted(int[] arr) {
        boolean flag = true;
        int last = arr[0];
        for (int each : arr) {
            if (last > each) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("It is sorted");
        else System.out.println("It is not sorted");
    }


    private static void CheckNoOfOccurrence(int[] arr, int i) {
        int count = 0;
        for (int each : arr) {
            if (each == i) {
                count += 1;
            }
        }
        System.out.println("Total occurrence number of " + i + " is " + count);
    }
}
