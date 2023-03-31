package org.example.data.repositories;

import org.example.data.dao.CompanyDao;
import org.example.data.model.Company;
import org.example.data.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepository implements CompanyDao {
    List<Company> companies = List.of();
    @Override
    public void addCompany(Company company) {
        companies.add(company);
    }

    @Override
    public List<Vehicle> getAllVehicles(String companyId) {
        return null;
    }
}
