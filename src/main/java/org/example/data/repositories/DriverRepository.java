package org.example.data.repositories;

import org.example.data.dao.DriverDao;
import org.example.data.model.Driver;

import java.util.List;
import java.util.function.Predicate;

public class DriverRepository  implements DriverDao {
    List<Driver> drivers = List.of();
    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public List<Driver> getCompanyDrivers(String companyId) {
        return drivers.stream().filter(driver -> driver.getCompanyId().equalsIgnoreCase(companyId)).toList();
    }

    @Override
    public Driver getDriverById(String id) {
        return drivers.stream().filter(driver -> driver.getId().equals(id)).findFirst().orElseThrow();
    }
}
