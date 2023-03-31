package org.example.data.model;

import java.util.UUID;

public class Driver {
    final String id = UUID.randomUUID().toString();
    String companyId;

    public String getId() {
        return id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return isActive;
    }

    String name;

    String phone;
    boolean isActive;
    public Driver(String companyId, String name, String phone, boolean isActive) {
        this.companyId = companyId;
        this.name = name;
        this.phone = phone;
        this.isActive = isActive;
    }


}
