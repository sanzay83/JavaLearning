package Sanjay.ClassAndObject;

public class Car {
    int noOfWeels, noOfDoors, maxSpeed;
    String name, modelNumber, company;

    public Car(int noOfWeels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWeels = noOfWeels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    public static void main(String[] args) {
        Car newCar = new Car(4, 4, 120, "Accord", "2001", "Honda");
        System.out.println(newCar.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWeels=" + noOfWeels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
