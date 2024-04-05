package Santosh;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // add two
        int sum, a = 7, b = 9;
        sum = a + b;
        System.out.println(sum);

        // count words (do later)

        // REVERSE A STRING
        String nonreversed = "Santosh", reversed = "";

        for (int i = 0; i < nonreversed.length(); i++) {
            reversed = nonreversed.charAt(i) + reversed;
        }
        System.out.println(reversed);

        int side =2;
        int side2=4;
        int area = side * side2;
        // even or odd
        System.out.println(area);

        // area
        int[] numarr = { 1, 2, 3, 4, 5 };

        for(int i: numarr) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i +" is odd");
            }
        }


        //prime composite









    }



}
