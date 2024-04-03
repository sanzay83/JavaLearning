package KB;

import java.util.Scanner;

public class Tasks1 {
    /*
     * @param args
     */
    public static void main (String[] args) { 
        ATM obj = new ATM();

        //Adding two number
        int a = 10;
        int b = 25;
        System.out.println("The sum of a and b is " + Integer.sum(a,b));
        //Count words
        String sen = "Fiancial situation does not improve.";
        String[] splt = sen.split(" ");
        System.out.println("The given sentence has words of " + splt.length); 

        //Reverse string
        String word = "Keeper";
        String reverse = "";
        for(int i = 0; i < word.length(); i++){
            reverse = word.charAt(i) + reverse;
        }
        System.out.println("Given word reverse is " + reverse);
        
        //Sum of array of elements
        int[] ar = {1,2,3,4};
        int sum = 0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        System.out.println("Sum of array of elements is " + sum);

        //Area of rectangle
        int l = 5;
        int w = 6;
        int area = l * w;
        System.out.println("Area of rectangle is " + area);

        //Even or odd number
        int num = 15;
        if(num % 2 == 0){
            System.out.println("Even number.");
        }else{
            System.out.println("Odd number.");
        }

        //ATM
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == 1234){
            obj.machine();
        }
        else{
            System.out.println("Wrong pin.");
        }
        sc.close();
    }
}
