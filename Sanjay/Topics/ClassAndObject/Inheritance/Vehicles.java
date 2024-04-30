package Sanjay.Topics.ClassAndObject.Inheritance;

public abstract class Vehicles implements Transport {
    // Car, motorbike, cycle, truck
    private int noOfWheels, noOfDoors, sideMirrors, maxSpeed;
    private String modelNumber, brand;

    Vehicles() {
        System.out.println("THis is vehicle");
    }

    public void moving() {
        System.out.println("Vehicle is moving");
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
