package Sanjay.JavaCodesChallenges;

import java.util.Arrays;

public class SwapStringToGetGreatest {
    public static void main(String[] args) {
        String number = "5713902";
        String result = getGreatestNumber(number);
        System.out.println(result);
    }

    private static String getGreatestNumber(String number) {
        char[] numbers = number.toCharArray();
        int pointer = 0;
        char temp;
        while ((pointer + 1) != numbers.length) {
            if (numbers[pointer] % 2 == 0 && numbers[pointer + 1] % 2 == 0 || numbers[pointer] % 2 != 0 && numbers[pointer + 1] % 2 != 0) {
                if (numbers[pointer + 1] > numbers[pointer]) {
                    temp = numbers[pointer + 1];
                    numbers[pointer + 1] = numbers[pointer];
                    numbers[pointer] = temp;
                    if (pointer > 0) {
                        pointer--;
                    }
                } else {
                    pointer++;
                }
            } else {
                pointer++;
            }
            System.out.println(Arrays.toString(numbers));
        }
        for (char i : numbers) {
            System.out.print(i);
        }


        return "";
    }
}
