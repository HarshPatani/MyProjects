package com.parkinglot;

import java.util.*;

public class ParkingLot {
    private int maxCapacity;
    private int totalVehicles;

    private ArrayList<ParkingSpot> spots;
    private PriorityQueue <ParkingSpot> spotsAvailable;

    public ParkingLot(int maxCapacity) {
        this.spots = new ArrayList<>();

        this.spotsAvailable = new PriorityQueue<ParkingSpot>(new Comparator<ParkingSpot>() {
            @Override
            public int compare(ParkingSpot o1, ParkingSpot o2) {
                return Integer.compare(o1.getSpotNumber(), o2.getSpotNumber());
            }
        });

        this.maxCapacity = maxCapacity;
        this.totalVehicles = 0;
        for (int i = 0; i < maxCapacity; i++) {
            ParkingSpot newSpot = new ParkingSpot(i + 1);
            this.spots.add(newSpot);
            this.spotsAvailable.add(newSpot);
        }
    }

    public boolean bookParking(Vehicle v) {

        if(totalVehicles == maxCapacity){
            System.out.println("Parking Full!!");
            return false;
        }

        ParkingSpot newSpot = spotsAvailable.poll();
        v.setAllocatedSpot(newSpot);
        newSpot.setOccupancy(true,v);

        this.totalVehicles++;
        System.out.println(v.getVehicleNumber() + " has been parked at Parking Spot: "+ newSpot.getSpotNumber());
        return true;
    }

    public void checkout(Vehicle v) {
        if (v.isInLot()) {
            ParkingSpot newSpot = v.getAllocatedSpot();
            spotsAvailable.add(newSpot);
            this.totalVehicles--;
            v.setAllocatedSpot(null);
            System.out.println("Vehicle " + v.getVehicleNumber() + " checked out");
        } else {
            System.out.println("Vehicle not present");
        }
    }
}
