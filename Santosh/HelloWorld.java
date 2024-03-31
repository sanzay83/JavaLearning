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
        char ch;

        for (int i = 0; i < nonreversed.length(); i++) {
            ch = nonreversed.charAt(i);
            reversed = ch + reversed;
        }
        System.out.println(reversed);

    }

    // area
    int side;
    int side2;
    int area;area=side*side2;
    // even or odd

    int[] numarr = { 1, 2, 3, 4, 5 };

    for(
    int i:numberList)
    {
        if (i % 2 == 0) {
            System.out.println(i);
        } else {
            System.out.println("odd");
        }
    }

}
