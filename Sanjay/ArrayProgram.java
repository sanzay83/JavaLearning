package Sanjay;

import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = {7,3,5,1,2,8,5,9,1,4};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        System.out.println("The given array arr is "+ Arrays.toString(arr));
        System.out.println("The given array arr2 is "+ Arrays.toString(arr2));
        SumAndAverage(arr);
        CheckNoOfOccurrence(arr, 1);
        MaxAndMinimum(arr);
        CheckIfSorted(arr);
        DeleteNumber(arr, 2);
        System.out.println("The reverse of the array is "+Arrays.toString(ReverseArray(arr)));
        CheckPalindrom(arr);
        MergeArray(arr, arr2);
        int[][] twoDArray = {{4,3,2},{5,7,1}};
        SearchElement(twoDArray);
        SumAndAverage2D(twoDArray);
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SumOf2DDiagonal(matrix);
    }

    private static void SumOf2DDiagonal(int[][] matrix) {
        int back = matrix.length-1;
        int sum1 = 0, sum2 = 0;
        for(int i =0; i<matrix.length;i++){
            sum1 += matrix[i][i];
            sum2 += matrix[back][back];
            back--;
        }
        if(matrix.length %2!=0){
            int pos = matrix.length/2;
            sum1 -= matrix[pos][pos];
        }
        System.out.println("Sum of the two diagonal elements is " + (sum1+sum2));
    }

    private static void SumAndAverage2D(int[][] twoDArray) {
        int sum = 0;
        int count= 0;
        for(int i =0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                sum += twoDArray[i][j];
                count++;
            }
        }
        System.out.println("The sum of 2D array is " + sum);
        System.out.println("The average of 2D array is " + (float)sum/count);
    }

    private static void SearchElement(int[][] twoDArray) {
        int element = 8;
        boolean flag = true;
        for(int i =0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                if(element == twoDArray[i][j]){
                    System.out.println(element + " found!");
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println(element+" not found!");
        }
    }

    private static void MergeArray(int[] arr, int[] arr2) {
        int[] mergedArray = new int[arr.length+arr2.length];
        int count = 0;
        for(int each: arr){
            mergedArray[count] = each;
            count++;
        }
        for(int each: arr2){
            mergedArray[count] = each;
            count++;
        }
        System.out.println("Merged Array is "+Arrays.toString(mergedArray));
    }


    private static void CheckPalindrom(int[] arr) {
        int[] rev = ReverseArray(arr);
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != rev[i]){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("It is Palindrome Array");
        } else {
            System.out.println("It is not Palindrome Array");
        }
    }

    private static int[] ReverseArray(int[] arr) {
        int length = arr.length;
        int rev[] = new int[length];
        int pos = length-1;
        for(int each: arr){
            rev[pos] = each;
            pos--;
        }

        return rev;

    }

    private static void DeleteNumber(int[] arr, int i) {
        int length = 0;
        for(int each: arr){
            if(i != each){
                length += 1;
            }
        }
        int[] newArr = new int[length];
        length = 0;
        for(int each: arr){
            if(i != each){
                newArr[length] = each;
                length++;
            }
        }
        System.out.println("After removing "+i+" new array is "+ Arrays.toString(newArr));
    }

    private static void CheckIfSorted(int[] arr) {
        boolean flag = true;
        int last = arr[0];
        for(int each: arr){
            if(last > each){
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("It is sorted");
        else System.out.println("It is not sorted");
    }

    private static void MaxAndMinimum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int each: arr){
            if(each < min){
                min = each;
            }
            if(each > max){
                max = each;
            }
        }
        System.out.println("The minimum number is "+min);
        System.out.println("The minimum number is "+max);

    }

    private static void CheckNoOfOccurrence(int[] arr, int i) {
        int count = 0;
        for(int each: arr){
            if(each == i){
                count+=1;
            }
        }
        System.out.println("Total occurrence number of "+ i +" is " + count);
    }

    private static void SumAndAverage(int[] arr) {
        int sum = 0;
        for(int each: arr){
            sum += each;
        }
        float avg = (float) sum /arr.length;
        System.out.println("Sum of array: "+sum);
        System.out.println("Average of Array: "+avg);
    }
}
