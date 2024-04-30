package Sanjay.Topics.ClassAndObject.Abstracts;

public class ShapeMain {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Circle circle = new Circle(5);
        Square square = new Square(10.3);
        circle.test();
        System.out.printf("Area of circle is %.2f %n", circle.calculateArea());
        System.out.printf("Area of square is %.2f %n", square.calculateArea());
    }
}
