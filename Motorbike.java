package Assignments.Assignment01;

public class Motorbike extends Vehicles{
    public Motorbike(int numOfWheels, int horsePower, int numOfSeats, String make){
        super(numOfWheels, horsePower, numOfSeats, make);
    }
    @Override
    public void horn() {
        System.out.print("Beep Beep");
    }
}
