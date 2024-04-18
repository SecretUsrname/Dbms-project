package org.example.dbmsprojectgui.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Satellite {
    @Id
    private Integer SatelliteID;
    private String name;
    private Integer OperationalLife;
    private Date LaunchDate;
    private String manufacturer;
    private Integer RemainingOpLife;
    private Integer OrbitID;
    private Integer EventID;
    private Integer VehicleID;

    // Getters and setters
    public Integer getSatelliteID() {
        return SatelliteID;
    }

    public void setSatelliteID(Integer SatelliteID) {
        this.SatelliteID = SatelliteID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOperationalLife() {
        return OperationalLife;
    }

    public void setOperationalLife(Integer OperationalLife) {
        this.OperationalLife = OperationalLife;
    }

    public Date getLaunchDate() {
        return LaunchDate;
    }

    public void setLaunchDate(Date LaunchDate) {
        this.LaunchDate = LaunchDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getRemainingOpLife() {
        return RemainingOpLife;
    }

    public void setRemainingOpLife(Integer RemainingOpLife) {
        this.RemainingOpLife = RemainingOpLife;
    }

    public Integer getOrbitID() {
        return OrbitID;
    }

    public void setOrbitID(Integer OrbitID) {
        this.OrbitID = OrbitID;
    }

    public Integer getEventID() {
        return EventID;
    }

    public void setEventID(Integer EventID) {
        this.EventID = EventID;
    }

    public Integer getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(Integer VehicleID) {
        this.VehicleID = VehicleID;
    }
}