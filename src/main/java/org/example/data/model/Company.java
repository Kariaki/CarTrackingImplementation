package org.example.data.model;

import java.util.UUID;

public class Company {

   final String id = UUID.randomUUID().toString();

    public Company(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String name;
    String phone;


}
