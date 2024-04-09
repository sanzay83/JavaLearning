package Sanjay;

public class Sort {

    public static int[] Sorted(int[] arr) {
        int arrayLength = arr.length;
        int i, j, temp;
        for(i=0; i < arrayLength-1; i++) {
            for (j = i + 1; j < arrayLength; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
