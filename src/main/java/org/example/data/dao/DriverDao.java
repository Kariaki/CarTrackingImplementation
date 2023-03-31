package org.example.data.dao;

import org.example.data.model.Driver;

import java.util.List;

public interface DriverDao {

    void addDriver(Driver driver);

    List<Driver> getCompanyDrivers(String companyId);
    Driver getDriverById(String id);

}
