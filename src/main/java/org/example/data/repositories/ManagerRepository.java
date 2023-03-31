package org.example.data.repositories;

import org.example.data.dao.ManagerDao;
import org.example.data.model.Manager;

import java.util.List;
import java.util.function.Predicate;

public class ManagerRepository implements ManagerDao {
    List<Manager> managers = List.of();

    @Override
    public void addManager(Manager manager) {
        managers.add(manager);
    }

    @Override
    public List<Manager> getManagerByCompanyId(String companyId) {
        return managers.stream().filter(manager -> manager.getCompanyId().equals(companyId)).toList();
    }
}
