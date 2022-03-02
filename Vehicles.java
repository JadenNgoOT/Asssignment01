package Assignments.Assignment01;

//This class is the interface which "Car", "Motorbike", and "SemiTruck" implement
//In relation to the documentation provided this file represents the "Shape" interface


public abstract class Vehicles {
    private int numOfWheels;
    private int horsePower;
    private int numOfSeats;
    private String make;

    //Constructor class
    public Vehicles(int numOfWheels, int horsePower, int numOfSeats, String make){
        this.numOfWheels = numOfWheels;
        this.horsePower = horsePower;
        this.numOfSeats = numOfSeats;
        this.make = make;
    }

    //Parent methods
    public abstract void horn();

    public String toString(){
        return "\n" + "This " + this.make + " has " + this .numOfWheels + " wheels, " + this.horsePower + "HP, and " + this.numOfSeats + " seats ";
    }
}
