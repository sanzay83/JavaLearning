package Sanjay.BasicJavaCodes;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your character: ");
        String star = input.nextLine();
        //System.out.println("Hi: " + name);
        //int age = input.nextInt();
        //System.out.println(age);
        //System.out.println();
        //input.close();
        
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 6; j++) {
                for (int k = 0; k < j; k++) {
                    if (j == 3 && k == 1) {
                        System.out.print("0");
                    } else {
                        System.out.print(star);
                    }
                }
                System.out.println();
            }
        }
    }
}
