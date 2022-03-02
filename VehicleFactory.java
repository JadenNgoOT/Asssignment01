package Assignments.Assignment01;

//This class is the factory part of the factory pattern design pattern. This is a subclass which acts as a mediator for
//the main interface which would normally instantiate the objects

//In relation to the documentation provided this file represents the "ShapeFactory" class

public class VehicleFactory {
    //Determines which class to instantiate and returns the appropriate object
    public Vehicles getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car(4, 200, 4, "Ford");
        }
        else if(vehicleType.equalsIgnoreCase("Motorbike")){
            return new Motorbike(2, 80, 1, "Honda");
        }
        else if(vehicleType.equalsIgnoreCase("SemiTruck")){
            return new SemiTruck(6, 500, 2, "Volvo");
        }

        return null;
    }
}
