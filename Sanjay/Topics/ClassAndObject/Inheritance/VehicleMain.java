package Sanjay.Topics.ClassAndObject.Inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        //Vehicles veh = new Vehicles();
        TwoWheeler tw = new TwoWheeler();
        MotorBike mb = new MotorBike();
        mb.setNoOfWheels(2);
        mb.setStand(true);
        mb.getStand();
        //veh.toString();
    }
}
