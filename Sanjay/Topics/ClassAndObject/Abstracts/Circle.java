package Sanjay.Topics.ClassAndObject.Abstracts;

public class Circle extends Shape {
    private final double radiusInCms;

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
