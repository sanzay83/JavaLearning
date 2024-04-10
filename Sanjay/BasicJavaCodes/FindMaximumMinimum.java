package Sanjay.BasicJavaCodes;

public class FindMaximumMinimum {
    public static int[] MaxAndMinimum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int each: arr){
            if(each < min){
                min = each;
            }
            if(each > max){
                max = each;
            }
        }
        return new int[]{min, max};

    }
}
