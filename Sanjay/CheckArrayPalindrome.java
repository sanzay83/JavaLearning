package Sanjay;

public class CheckArrayPalindrome {
    public static void CheckPalindrome(int[] arr) {
        int[] rev = ReverseArray.reverseArray(arr);
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != rev[i]){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("It is Palindrome Array");
        } else {
            System.out.println("It is not Palindrome Array");
        }
    }
}
