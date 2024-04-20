package Sanjay.ClassAndObject.Inheritance;

public abstract class Vehicles implements Transport {
    // Car, motorbike, cycle, truck
    private int noOfWheels, noOfDoors, sideMirrors, maxSpeed;
    private String modelNumber, brand;

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
