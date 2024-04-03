import java.util.Scanner;

public class ATM{
    public int machine(){
        int tamt = 50000;   //Total amount in account
        System.out.println("Choose the following: ");
        System.out.print("1.Withdraw ");
        System.out.print("2.Deposit ");
        System.out.println("3.Check amount ");
        @SuppressWarnings("resource")
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();
        switch(num){
            case 1: 
            {
                System.out.print("Amount withdraw: $");
                int amt = sc2.nextInt();
                int tamt1 = tamt - amt;
                System.out.print("Total amount is $" + tamt1);
                break;
            }
            case 2: 
            {
                System.out.print("Amount deposit: $");
                int amt2 = sc2.nextInt();
                int tamt1 = tamt + amt2;
                System.out.print("Total amount is $" + tamt1);
                break;
            }
            case 3: 
            {
                int tamt1 = tamt;
                System.out.print("Total Amount is $" + tamt1);
                break;
            }
            default:
            {
                System.out.println("Choose only given options!!");
            }
        }
        return num;
    }
    
    /* 
    public static void main (String[] args){
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        ATM obj = new ATM();
        if (pin == 1234){
            obj.machine();
        }
        else{
            System.out.println("Wrong pin.");
        }
    }
    */
}