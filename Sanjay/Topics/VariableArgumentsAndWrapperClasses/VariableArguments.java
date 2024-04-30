package Sanjay.Topics.VariableArgumentsAndWrapperClasses;

public class VariableArguments {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    private static int sum(int first, int second, int... numbers) {
        int sum = first + second;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
