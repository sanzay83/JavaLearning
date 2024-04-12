package Sanjay.BasicJavaCodes;

public class RecursionFibo {
    public static void main(String[] args) {
        int count = 9;
        for (int i = 1; i <= count; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);

    }
}
