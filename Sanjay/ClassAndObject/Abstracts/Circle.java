package Sanjay.ClassAndObject.Abstracts;

public class Circle extends Shape {
    private double radiusInCms;

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    public void setRadiusInCms(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
