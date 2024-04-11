package Sanjay;

import java.util.Arrays;

public class AdditionDSA {
    public static void main(String[] args) {
        int[] a = {9, 8, 9, 9};
        int[] b = {9, 1, 2, 6};
        int lenArr = a.length > b.length ? a.length : b.length;
        int[] sum = new int[lenArr];
        int carry = 0;
        for(int i=lenArr-1; i > -1; i--){
            int temp = a[i] + b[i] + carry;
            if(temp > 9){
                temp = temp % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            
            sum[i] = temp;
            System.out.println(carry + "" + Arrays.toString(sum));
        }
        if(carry > 0) { System.out.print(carry);
        }
        for (int element : sum) {
            System.out.print(element);
        }

    }
}
