package Sanjay;

import java.util.ArrayList;

public class HCFLCM {
    public static int HCF(int firstNum, int secondNum) {
        int length = Math.max(firstNum, secondNum);
        //ArrayList<Integer> arr = new ArrayList<Integer>();
        int hcf = 1;
        for (int num = 2; num <= length / 2; num++) {
            if (firstNum % num == 0 && secondNum % num == 0) {
                hcf = num;
            }
        }
        return hcf;
    }

    public static int LCM(int firstNum, int secondNum) {
        int lcm = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int divisor = 2;
        while (firstNum > 1 || secondNum > 1) {
            if (firstNum % divisor == 0 || secondNum % divisor == 0) {
                System.out.println(divisor + "  " + firstNum + "   " + secondNum);
                if (firstNum % divisor == 0) {
                    firstNum = firstNum / divisor;
                }
                if (secondNum % divisor == 0) {
                    secondNum = secondNum / divisor;
                }
                arr.add(divisor);
            } else {
                divisor++;
            }
        }

        for (int element : arr) {
            lcm *= element;
        }
        return lcm;
    }

    public static void main(String[] args) {
        int firstNum = 8, secondNum = 18;
        System.out.println(HCF(firstNum, secondNum));
        System.out.println(LCM(firstNum, secondNum));
        System.out.println();
    }
}
