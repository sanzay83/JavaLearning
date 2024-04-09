package Sanjay;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int rev[] = new int[length];
        int pos = length-1;
        for(int each: arr){
            rev[pos] = each;
            pos--;
        }
        return rev;
    }
}
