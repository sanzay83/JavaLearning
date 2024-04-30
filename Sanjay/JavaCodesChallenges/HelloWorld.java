package Sanjay.JavaCodesChallenges;

import Sanjay.Topics.FileHandling.FileHandeling;

import java.io.IOException;
import java.util.Arrays;


public class HelloWorld {
    public static void main(String[] args) throws IOException {
        FileHandeling.saman("saman");
        //String
        String s = "dad";
        int num = 123454321;
        System.out.println(Palindrome.palindromCheck(s));
        System.out.println(Palindrome.palindromCheck(num));

        System.out.println("Hello World");

        // Add Two Numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);
        // Alternative to save memory
        System.out.println(num1 + num2);


        // count no of words in a sentence
        String sentence = "This is Java Learning and Practice";
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        int length = arr.length;
        System.out.println("Total number of words are: " + length);


        // Reverse the word or sentence

        String result = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            result += sentence.charAt(i);
        }

        System.out.println(result);

        // Sum of array element
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOfArr = 0;
        for (int i : intArr) {
            sumOfArr += i;
        }
        System.out.println("The sum of array is: " + sumOfArr);

        // Area of Rectangle
        int lengthOfRectangle = 3, breathOfRectangle = 5;
        int areaOfRectangle = lengthOfRectangle * breathOfRectangle;
        System.out.println("Area of rectangle is: " + areaOfRectangle);

        // Even or Odd number
        int[] numberList = {1, 5, 32, 55, 76, 23, 33, 54};
        for (int i : numberList) {
            if (i % 2 == 0) {
                System.out.println("Number: " + i + " is even");
            } else {
                System.out.println("Number: " + i + " is odd");
            }
        }

    }
}
