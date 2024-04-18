package org.example.dbmsprojectgui.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Launchvehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "launch_vehicle_seq")
    private Integer Vehicle_ID;
    private Integer launchCount;
    private String Type;
    private String Manufacturer;
    private Double Maxpayload;
    private String Operationalstatus;
    private Double utilizationrate;

    // Getters and setters
    public Integer getVehicle_ID() {
        return Vehicle_ID;
    }

    public Integer getlaunchCount() {
        return launchCount;
    }

    public void setlaunchCount(Integer launchCount) {
        this.launchCount = launchCount;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public Double getMaxpayload() {
        return Maxpayload;
    }

    public void setMaxpayload(Double Maxpayload) {
        this.Maxpayload = Maxpayload;
    }

    public String getOperationalstatus() {
        return Operationalstatus;
    }

    public void setOperationalstatus(String Operationalstatus) {
        this.Operationalstatus = Operationalstatus;
    }

    public Double getutilizationrate() {
        return utilizationrate;
    }

    public void getutilizationrate(Double utilizationrate) {
        this.utilizationrate = utilizationrate;
    }
}