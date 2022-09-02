package com.parkinglot;

public class Vehicle {

    private String vehicleNumber;
    private String color;
    private ParkingSpot allocatedSpot;

    public Vehicle(String vehicleNum, String color){
        this.vehicleNumber = vehicleNum;
        this.color = color;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public ParkingSpot getAllocatedSpot() {
        return allocatedSpot;
    }

    public void setAllocatedSpot(ParkingSpot allocatedSpot) {
        this.allocatedSpot = allocatedSpot;
    }

    public boolean isInLot() {
        if(this.allocatedSpot == null)
            return false;
        return true;
    }
}
