package org.example.data.dao;

import org.example.data.model.Company;
import org.example.data.model.Vehicle;

import java.util.List;

public interface CompanyDao {

    void addCompany(Company company);

    List<Vehicle> getAllVehicles(String companyId);

}
