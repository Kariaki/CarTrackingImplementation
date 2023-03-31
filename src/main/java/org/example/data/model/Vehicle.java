package org.example.data.model;

import java.util.UUID;

public class Vehicle {

    public String getId() {
        return id;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public VehiclePosition getPosition() {
        return position;
    }

    public String getComapanyId() {
        return comapanyId;
    }

    public int getNumber() {
        return number;
    }

    public String getDriverId() {
        return driverId;
    }

    public boolean isActive() {
        return isActive;
    }

    final String id = UUID.randomUUID().toString();

    VehiclePosition position;
    String comapanyId;
    int number;
    String driverId;
    boolean isActive;
    public Vehicle(VehiclePosition position, String comapanyId, int number, String driverId, boolean isActive) {
        this.position = position;
        this.comapanyId = comapanyId;
        this.number = number;
        this.driverId = driverId;
        this.isActive = isActive;
    }



}
