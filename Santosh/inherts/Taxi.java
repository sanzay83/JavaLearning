package Santosh.inherts;

public class Taxi {

    public static void driver() {
        System.out.println("Driver");
    }

    public static void main(String[] args) {

        Drivers e = new Drivers();
        e.setFname("Sam");
        e.setGender(true);
        e.setLname("lname");
        e.setLocation("ktm");
        e.setPnum(123456);

        Drivers e2 = new Drivers();
        e2.setFname("Sam");
        e2.setGender(true);
        e2.setLname("lname");
        e2.setLocation("ktm");
        e2.setPnum(123456);


        Riders r = new Riders();
        r.setFname("Sam");
        r.setGender(true);
        r.setLname("lname");
        r.setLocation("ktm");
        r.setPnum(123456);

        System.out.println(e);
        System.out.println(r);

        if (e.equals(r)) {
            System.out.println("e = r true");
        }
        if (e.equals(e2)) {
            System.out.println("e = e2 true");
        }

    }

    public static void rider() {
        System.out.println("rider");
    }
}
