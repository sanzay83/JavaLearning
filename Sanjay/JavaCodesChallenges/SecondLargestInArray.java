package Sanjay.JavaCodesChallenges;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 6, 4, 5, 4};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
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


// O(1) up t limited or specifed number
// o(n) upto no n
// O(n^2) nested loop upto n
// O(log n) until required output is generated or returned
