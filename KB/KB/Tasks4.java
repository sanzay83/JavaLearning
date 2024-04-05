package KB;

import java.util.ArrayList;

public class Tasks4 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        //Arraylist to add common divisor of both integers
        ArrayList<Integer> hcfdiv = new ArrayList<Integer>();
        
        //backing integers of num1 and num2
        int bnum1 = num1;
        int bnum2 = num2;

        int hcf = 1; //to multiply with common divisor

        //dividing from 2 till 9 and finding common divisor
        for (int i = 2; i <= 9; i++){
            while (num1 % i == 0 && num2 % i == 0 ){
                num1 /= i;
                num2 /= i;
                hcfdiv.add(i);
            }
        }
        //multiply elements in arraylist to find highest common divisor
        for(int num : hcfdiv){
            hcf *= num;
        }

        //finding lowest common factor
        int lcm = (bnum1 * bnum2) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: "+ lcm);
    }
}
