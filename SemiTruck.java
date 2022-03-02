package Assignments.Assignment01;

public class SemiTruck extends Vehicles{
    public SemiTruck(int numOfWheels, int horsePower, int numOfSeats, String make){
        super(numOfWheels, horsePower, numOfSeats, make);
    }
    @Override
    public void horn() {
        System.out.print("Hoooooonk Hoooooonk");
    }
}
