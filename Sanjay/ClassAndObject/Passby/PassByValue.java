package Sanjay.ClassAndObject.Passby;

public class PassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x, y);
        System.out.printf("%d, %d, sum %d", x, y, sum);
    }

    public static int add(int a, int b) {
        return a + b;

    }
}
