package Sanjay.BasicJavaCodes;

public class PrimeComposite {
    public static void main(String[] args) {
        for(int x = 1; x < 10000000; x++) {
            int runner;
            if(x > 7){
                runner = 7;
            } else {
                runner = x/2;
            }
            boolean flag = true;
            for (int i = 2; i <= runner; i++) {
                if (x % i == 0) {
                    flag = false;
                    System.out.println(x + " is a Composite Number");
                    break;
                }
            }
            if (flag) {
                System.out.println(x + " is a Prime Number");
            }
        }
    }
}
