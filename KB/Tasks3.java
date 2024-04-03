public class Tasks3 {
    public static void main(String[] args) {
        //Checking prime or composite number
        int checkPrime = 100;
        int count = 0; // Number of divisible

        for (int i = 1; i <= checkPrime / 2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                    //if count greater than 2 exit loop
                    if(count > 2){
                        break;
                    }
                }
            }
            if (count <= 2) {
                System.out.println(i +" "+ "is Prime");
            } else {
                System.out.println(i +" "+ "is Composite");
            }
            count = 0;
        }
    }
}