package Sanjay;

public class AmstrongNumber {
    public static void main(String[] args){
        for(int i=0; i < 10000; i++){
            int num = i, count = 0, armstrong = 0;
            while(num>0){
                count++;
                num=num/10;
            }
            num = i;
            while(num >0){
                armstrong += Math.pow(num%10, count);
                num = num/10;
            }
            if(armstrong==i){
                System.out.println(i + " : Armstrong Number");
            }
        }
    }
}
