package org.example.data.repositories;

import org.example.data.dao.VehicleDao;
import org.example.data.model.Vehicle;
import org.example.data.model.VehiclePosition;

import java.util.List;
import java.util.function.Predicate;

public class VehicleRepository implements VehicleDao {

    List<Vehicle> vehicles = List.of();

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public List<Vehicle> getCompanyVehicles(String companyId) {
        return vehicles.stream().filter(vehicle -> vehicle.getComapanyId().equals(companyId)).toList();
    }

    @Override
    public VehiclePosition getCurrentLocation(String vehicleId) {
        return vehicles.stream().filter(vehicle -> vehicle.getId().equals(vehicleId)).findFirst().orElseThrow().getPosition();
    }

    @Override
    public void assignDriverToVehicle(String driverId, String vehicleId) {
        Vehicle foundVehicle = vehicles.stream().filter(vehicle -> vehicle.getId().equals(vehicleId)).findFirst().orElseThrow();
        int index = vehicles.indexOf(foundVehicle);
        foundVehicle.setDriverId(driverId);

        vehicles.set(index, foundVehicle);
    }
}
