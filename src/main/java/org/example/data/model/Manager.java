package org.example.data.model;

import java.util.UUID;

public class Manager {

    public String getId() {
        return id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }

    final String id = UUID.randomUUID().toString();

    public Manager(String companyId, String name, String password, String email, boolean isActive) {
        this.companyId = companyId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.isActive = isActive;
    }

    String companyId;
    String name;
    String password;
    String email;
    boolean isActive;

}
