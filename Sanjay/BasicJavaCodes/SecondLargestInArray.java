package Sanjay.BasicJavaCodes;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 5, 4};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = 0;
        for (int each : arr) {
            if (each > largest) {
                secondLargest = largest;
                largest = each;
            } else if (each > secondLargest && each < largest) {
                secondLargest = each;
            }
        }
        return secondLargest;
    }
}
