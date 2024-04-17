package Sanjay.BasicJavaCodes;

public class StringFormat {

    public static void main(String[] args) {
        String name = "Sanjay";
        int num = 1200;
        System.out.printf("Hello %s and number is %d %n", name, num);
        System.out.printf("Hello %S and number is %010d %n", name, num);
        System.out.printf("Hello %S and number is %,d %n", name, num);
        System.out.printf("Hello %S and number is %-10d spaces", name, num);

        /*
        %s is for string
        %d is for number
        %f is for number
        %S capital s gives capital name
        %10s gives 10 spaces before string
        %-10s gives 10 spaces after
        %, comma to give comma in number
        %0 gives 0 in number in front
         */
    }
}
