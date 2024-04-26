package Sanjay.ClassAndObject.Polymorphism.Overloading;

public class Overloading {
    public static void main(String[] args) {
        Overloading overload = new Overloading();
        System.out.println(overload.add(5, 6));
        System.out.println(overload.add(5, 6, 7));
        System.out.println(overload.add("4", "5"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }
}
