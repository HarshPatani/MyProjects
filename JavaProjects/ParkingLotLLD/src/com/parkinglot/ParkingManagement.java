package com.parkinglot;

public class ParkingManagement {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(10);

        Vehicle v1 = new Vehicle("MH 02 AQ 2261", "silver");
        Vehicle v2 = new Vehicle("MH 02 AQ 2262", "blue");
        Vehicle v3 = new Vehicle("MH 02 AQ 2263", "red");
        Vehicle v4 = new Vehicle("MH 02 AQ 2264", "white");

        if (parkingLot.bookParking(v1)) {
            System.out.println("Booked by " + v1.getVehicleNumber() + " at spot " + v1.getAllocatedSpot().getSpotNumber());
        } else {
            System.out.println("Booking failed");
        }
        System.out.println();

        if (parkingLot.bookParking(v2)) {
            System.out.println("Booked by " + v2.getVehicleNumber() + " at spot " + v2.getAllocatedSpot().getSpotNumber());
        } else {
            System.out.println("Booking failed");
        }
        System.out.println();

        if (parkingLot.bookParking(v4)) {
            System.out.println("Booked by " + v4.getVehicleNumber() + " at spot " + v4.getAllocatedSpot().getSpotNumber());
        } else {
            System.out.println("Booking failed");
        }
        System.out.println();


        Vehicle v5 = new Vehicle("MH 02 AQ 2265", "violet");

        if (parkingLot.bookParking(v5)) {
            System.out.println("Booked by " + v5.getVehicleNumber() + " at spot " + v5.getAllocatedSpot().getSpotNumber());
        } else {
            System.out.println("Booking failed");
        }
        System.out.println();

        parkingLot.checkout(v4);
        System.out.println();

        Vehicle v6 = new Vehicle("MH 02 AQ 2266", "black");

        if (parkingLot.bookParking(v6)) {
            System.out.println("Booked by " + v6.getVehicleNumber() + " at spot " + v6.getAllocatedSpot().getSpotNumber());
        } else {
            System.out.println("Booking failed");
        }
    }
}
