package Santosh.bankofamerica;

public class UserDetails {
    String fname, lname, address;
    int accountNumber, ssn;

    public UserDetails(String fname, String lname, int ssn) {
        this.ssn = ssn;
        this.fname = fname;
        this.lname = lname;
    }

    UserDetails(int acc) {
        this("santosh", "huma", 123456897);
        this.accountNumber = acc;

    }


    // up

    UserDetails() {
        this(123);
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

    public String getfname() {
        return fname;
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
