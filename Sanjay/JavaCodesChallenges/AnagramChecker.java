package Sanjay.JavaCodesChallenges;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String firstString = "Racae".toLowerCase();
        String secondString = "Carae".toLowerCase();
        if (firstString == secondString) {
            System.out.println(true);
        }

        System.out.println(firstString.split(""));

        char[] firstArr = firstString.toCharArray();
        char[] secondArr = secondString.toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        if (firstString.length() == secondString.length()) {

            if (Arrays.equals(firstArr, secondArr)) {
                System.out.println(true);
            }

        } else {
            System.out.println(false);
        }
    }
}
