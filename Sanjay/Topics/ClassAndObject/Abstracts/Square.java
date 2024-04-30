package Sanjay.Topics.ClassAndObject.Abstracts;

public class Square extends Shape {

    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }
}
