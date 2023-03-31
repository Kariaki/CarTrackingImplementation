package org.example.data.controller;

import org.example.data.dao.CompanyDao;
import org.example.data.dao.DriverDao;
import org.example.data.dao.ManagerDao;
import org.example.data.dao.VehicleDao;
import org.example.data.model.Driver;
import org.example.data.model.Manager;
import org.example.data.model.Vehicle;
import org.example.data.model.VehiclePosition;
import org.example.data.repositories.CompanyRepository;
import org.example.data.repositories.DriverRepository;
import org.example.data.repositories.ManagerRepository;
import org.example.data.repositories.VehicleRepository;

import java.util.List;

public class VehicleTrackingController {

    DriverDao driverDao = new DriverRepository();
    ManagerDao managerDao = new ManagerRepository();
    CompanyDao companyDao = new CompanyRepository();
    VehicleDao vehicleDao = new VehicleRepository();


    void createManager(Manager manager) {
        managerDao.addManager(manager);
    }

    VehiclePosition trackVehicle(String id){
       try{
           return vehicleDao.getCurrentLocation(id);
       }catch (Exception e){
           return null;
       }
    }

    void addVehicle(Vehicle vehicle){
        vehicleDao.addVehicle(vehicle);
    }

    void assignDriver(String vehicleId,String driverId){
        vehicleDao.assignDriverToVehicle(vehicleId, driverId);
    }
    List<Manager> getManagersByCompanyId(String companyId) {
        return managerDao.getManagerByCompanyId(companyId);
    }
    List<Driver> getDriverByCompanyId(String companyId) {
        return driverDao.getCompanyDrivers(companyId);
    }

    Driver getDriverById(String id){
        try{
           return driverDao.getDriverById(id);
        }catch (Exception e){
            return null;
        }
    }
}
