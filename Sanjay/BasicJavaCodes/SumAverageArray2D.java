package Sanjay.BasicJavaCodes;

public class SumAverageArray2D {
    public static void SumAndAverage2D(int[][] twoDArray) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                sum += twoDArray[i][j];
                count++;
            }
        }
        System.out.println("The sum of 2D array is " + sum);
        System.out.println("The average of 2D array is " + (float) sum / count);
    }
}
