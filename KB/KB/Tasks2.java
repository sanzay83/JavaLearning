package KB;

import java.lang.Math;

public class Tasks2 {  
    int backnum;
    int y = 1;
    
    public Tasks2(int num){
        backnum = num; //Set the value equal for backnum and num
    }

    //Method for factorial upto 9
    public int factorial(int y){
        for(int i = 1; i <= 9 ;i++){
            y = y * i;
        }
        return y;
    }

    public static void main (String[] args){
        //Check if the given number is Armstrong number
        for (int num = 0; num < 10; num++){
            int armstrong = 0;
            Tasks2 obj = new Tasks2(num);
            int count = 0;

            //While loop to check the size of intergers variable
            while(obj.backnum > 0){
                obj.backnum = obj.backnum / 10;
                count ++;
            }
            
            //Set the of num to backnum since backnum is 0
            obj.backnum = num;

            //Adding elements with power according to the size of integers variable
            while (obj.backnum > 0) {
                armstrong += Math.pow(obj.backnum % 10, count);
                obj.backnum = obj.backnum / 10;
            }

            //if condition to check if integer is armstrong or not
            if (armstrong == num){
                System.out.println("Armstrong number: " + num);
            } 
        }
        //Calling factorial method
        Tasks2 x = new Tasks2(2);
        System.out.println("Factorial of 9: " + x.factorial(9)); //Printing factorial of 9
    }
}
