package Sanjay.BasicJavaCodes;

import java.util.Arrays;

public class DeleteItemInArray {
    public static int[] DeleteNumber(int[] arr, int i) {
        int length = 0;
        for(int each: arr){
            if(i != each){
                length += 1;
            }
        }
        int[] newArr = new int[length];
        length = 0;
        for(int each: arr){
            if(i != each){
                newArr[length] = each;
                length++;
            }
        }
        return newArr;
    }
}
