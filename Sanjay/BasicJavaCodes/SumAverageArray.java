package Sanjay.BasicJavaCodes;

public class SumAverageArray {
    public static void SumAndAverage(int[] arr) {
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        float avg = (float) sum / arr.length;
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of Array: " + avg);
    }
}
