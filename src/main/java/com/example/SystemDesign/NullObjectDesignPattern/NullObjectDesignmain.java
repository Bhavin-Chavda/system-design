package com.example.SystemDesign.NullObjectDesignPattern;

public class NullObjectDesignmain {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        printVehicleDetails(vehicle);

        // Get Null Object
        Vehicle vehicle1 = VehicleFactory.getVehicle("Bus"); // We do not have Bus Type in vehicle so it will return null
        printVehicleDetails(vehicle1);

    }

    private static void printVehicleDetails(Vehicle vehicle) {

        System.out.println("Seating Capacity : "+vehicle.getSeatCapacity());
        System.out.println("FuelTank Capacity : "+vehicle.getTankCapacity());
    }
}
