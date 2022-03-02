package Assignments.Assignment01;

//This class is the main class which would normally handle object creation but now passes on that responsibility
//to a subclass which decides what class to instantiate

///In relation to the documentation provided this file represents the "FactoryPatternDemo" class

public class FactoryPattern {
    public static void main(String[] args){
        //instantiates the subclass which will handle the instantiation of the classes
        VehicleFactory vehicleFactory = new VehicleFactory();

        //Vehicle object creation
        Vehicles vehicle1 = vehicleFactory.getVehicle("Car");
        System.out.println(vehicle1 + "and makes this sound: ");
        vehicle1.horn();

        Vehicles vehicle2 = vehicleFactory.getVehicle("Motorbike");
        System.out.println(vehicle2 + "and makes this sound: ");
        vehicle2.horn();

        Vehicles vehicle3 = vehicleFactory.getVehicle("SemiTruck");
        System.out.println(vehicle3 + "and makes this sound: ");
        vehicle3.horn();
    }
}
