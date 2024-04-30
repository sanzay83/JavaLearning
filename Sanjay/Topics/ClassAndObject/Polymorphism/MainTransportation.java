package Sanjay.Topics.ClassAndObject.Polymorphism;

public class MainTransportation {
    public static void main(String[] args) {
        // Vehicle object cannot be created because vehicle is abstract
        // Vehicle vehicle = new Vehicle();

        // Creating a car object
        Car car = new Car();
        // Creating a plane object
        Plane plane = new Plane();

        // calling function with Vehicle object casting
        castTest(plane);
        castTest(car);

        // Creating car object using vehicle reference
        Vehicle newCar = new Car();
        // Car newVehicle = (Car) new Vehicle();
        newCar.start();
    }

    private static void castTest(Vehicle veh) {

        veh.start();
    }
}
