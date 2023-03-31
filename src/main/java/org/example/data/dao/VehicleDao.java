package org.example.data.dao;

import org.example.data.model.Vehicle;
import org.example.data.model.VehiclePosition;

import java.util.List;

public interface VehicleDao {

    void addVehicle(Vehicle vehicle);

    List<Vehicle> getCompanyVehicles(String companyId);

    VehiclePosition getCurrentLocation(String vehicleId);

    void assignDriverToVehicle(String driverId,String vehicleId);

}
