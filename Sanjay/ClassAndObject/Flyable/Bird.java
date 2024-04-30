package Sanjay.ClassAndObject.Flyable;

public abstract class Bird implements Flyable {
    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public abstract String speak();

    public String getBreed() {
        return breed;
    }
}