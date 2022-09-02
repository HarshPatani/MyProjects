package com.parkinglot;

public class ParkingSpot {

    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        System.out.println("Parking Spot: "+ this.spotNumber + " created.");
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setOccupancy(boolean value, Vehicle vehicle){
        this.isOccupied = value;
        this.vehicle = vehicle;
    }
}
