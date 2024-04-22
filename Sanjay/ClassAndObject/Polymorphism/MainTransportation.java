package Sanjay.ClassAndObject.Polymorphism;

public class MainTransportation {
    public static void main(String[] args) {
        Car car = new Car();
        // Vehicle vehicle = new Vehicle();
        Plane plane = new Plane();

        castTest(plane);
        castTest(car);
        // Vehicle newCar = new Car();
        // Car newVehicle = (Car) new Vehicle();
    }

    private static void castTest(Vehicle veh) {
        // Car carVehicle = (Car) veh;

        veh.start();
    }
}
