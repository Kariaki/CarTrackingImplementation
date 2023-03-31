package org.example.data.dao;

import org.example.data.model.Manager;

import java.util.List;

public interface ManagerDao {

    void addManager(Manager manager);
    List<Manager> getManagerByCompanyId(String companyId);

}
