package Sanjay.Topics.ClassAndObject.Inheritance;

public class TwoWheeler extends Vehicles {
    boolean stand;

    TwoWheeler() {
        setNoOfWheels(2);
    }

    public void setNoOfWheels(int brand) {
        super.setNoOfWheels(brand);
    }

    public boolean getStand() {
        return this.stand;
    }

    public void setStand(boolean stand) {
        this.stand = stand;
    }
}
