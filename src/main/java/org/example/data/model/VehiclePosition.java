package org.example.data.model;

import java.util.UUID;

public class VehiclePosition {

    final String id = UUID.randomUUID().toString();
    String time;

    public VehiclePosition(String time, String longitude, String lat) {
        this.time = time;
        this.longitude = longitude;
        this.lat = lat;
    }

    String longitude;

    String lat;
    public void setTime(String time) {
        this.time = time;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }


}
