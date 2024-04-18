package Santosh.bankofamerica;

public class Bank {

    public static void main(String[] args) {

        String fname = "Santosh", lname = "Humagain";
        int ssn = 123456789;

        UserDetails ud = new UserDetails("Santosh", lname, ssn);
        UserDetails udd = new UserDetails(321);
        UserDetails udw = new UserDetails();
        System.out.println(udd.getfname());

        ud.setAddress("texas");
        ud.setAccountNumber(123456789);

        UserDetails.getAccountNumber();
        // System.out.println(ud.getAccountNumber());

        System.out.println(ud.getAddress());

        fname = "sanjay ";
        lname = "Duwal";
        ssn = 123456789;
        UserDetails uds = new UserDetails(fname, lname, ssn);
        uds.setAddress("Texas");
        uds.getAddress();


    }
}
