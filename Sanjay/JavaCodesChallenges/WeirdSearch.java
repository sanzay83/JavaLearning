package Sanjay.JavaCodesChallenges;

public class WeirdSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};


        int target = 9;

        int max = arr.length - 1;
        int min = 0;
        int index = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int counter = 0;
        System.out.println("Current index: " + index + " Current min: " + min + " Current max: " + max);
        while (arr[index] != target) {
            if (arr[index] < target) {
                min = index;
            } else {
                max = index;
            }
            System.out.println("Current index: " + index + " Current min: " + min + " Current max: " + max);
            index = (int) Math.floor(Math.random() * (max - min + 1) + min);
            counter++;


        }
        System.out.println("Target found at index: " + index);
        System.out.println("Total number of loops: " + counter);
    }
}

/*
int[] arr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9};
int target = 7;
int index = (int) Math.round(Math.random() * arr.length);
int counter = 0;
        while (arr[index] != target) {
index = (int) Math.round(Math.random() * arr.length);
counter++;
        }
        System.out.println("Target found at index: " + index);
        System.out.println("Total number of loops: " + counter);
 */