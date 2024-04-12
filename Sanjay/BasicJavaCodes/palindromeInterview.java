package Sanjay.BasicJavaCodes;

public class palindrome {
    public static void main(String[] args) {
        String abc = "acba";
        String rev = "";
        for (int i = 0; i < abc.length(); i++) {
            rev = abc.charAt(i) + rev;
        }
        System.out.println(rev);
        if (abc.equals(rev)) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }
}
