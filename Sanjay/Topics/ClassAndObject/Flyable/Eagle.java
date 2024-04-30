package Sanjay.Topics.ClassAndObject.Flyable;

public class Eagle extends Bird {
    public Eagle() {
        super("Eagle");
    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
