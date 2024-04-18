package org.example.dbmsprojectgui.model;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class SatelliteDetails {
    @Id
    @Column(name = "satellite_id")
    private int satelliteId;
    private String name;
    private int operationallife;
    @Column(name = "launchdate")
    private Date launchDate;
    private String manufacturer;
    @Column(name = "remainingoplife")
    private int remainingOpLife;
    @Column(name = "orbitid")
    private int orbitId;
    @Column(name = "orbit_type")
    private String orbitType;
    private int altitude;
    private double inclination;
    private double period;
    public int getSatelliteId() {
        return satelliteId;
    }

    public String getName() {
        return name;
    }

    public int getOperationallife() {
        return operationallife;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRemainingOpLife() {
        return remainingOpLife;
    }

    public int getOrbitId() {
        return orbitId;
    }

    public String getOrbitType() {
        return orbitType;
    }

    public int getAltitude() {
        return altitude;
    }

    public double getInclination() {
        return inclination;
    }

    public double getPeriod() {
        return period;
    }

    public void setSatelliteId(int satelliteId) {
        this.satelliteId = satelliteId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperationallife(int operationallife) {
        this.operationallife = operationallife;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setRemainingOpLife(int remainingOpLife) {
        this.remainingOpLife = remainingOpLife;
    }

    public void setOrbitId(int orbitId) {
        this.orbitId = orbitId;
    }

    public void setOrbitType(String orbitType) {
        this.orbitType = orbitType;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setInclination(double inclination) {
        this.inclination = inclination;
    }

    public void setPeriod(double period) {
        this.period = period;
    }


}
