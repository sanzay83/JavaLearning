package Sanjay;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi: " + name);
        int age = input.nextInt();
        System.out.println(age);
        System.out.println();
        input.close();
    }
}
