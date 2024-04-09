package Santosh.bankofamerica;

public class UserDetails {
    String fname, lname, address;
    int accountNumber, ssn;

    UserDetails(String fname, String lname, int ssn) {
        this.ssn = ssn;
        this.fname = fname;
        this.lname = lname;
        //special type of method
        //named as class name

    }

    public static void getAccountNumber() {
        System.out.println("test");
        System.out.println();
        //return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //identification
    //fname lname
    //address
    //other uid
    //account number
    //ssn


    // santosh
    // sanjay


}
