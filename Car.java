package Assignments.Assignment01;

public class Car extends Vehicles{
    public Car(int numOfWheels, int horsePower, int numOfSeats, String make){
        super(numOfWheels, horsePower, numOfSeats, make);
    }
    @Override
    public void horn() {
        System.out.print("Honk Honk");
    }
}
