package Santosh;

public class LowestHIghest {
//Lowest com factor
    //highest common factor


    public static void main(String[] args) {
        int firstNum = 20, secondNum = 5, c = 0;
        int hcf = 1;

        int x = Math.max(firstNum, secondNum);
        for (int i = 2; i <= x / 2; i++) {

            if (firstNum % i == 0 && secondNum % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);


        // lcm


    }


}
