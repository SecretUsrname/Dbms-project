package org.example.dbmsprojectgui.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
@Entity
public class Launchevent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "launch_vehicle_seq")
    private Integer EventID;
    private Integer SatelliteID;
    private Double payload;
    private Date date;
    private String outcome;
    private Integer SiteID;
    private Integer VehicleID;

    // Getters and setters
    public Integer getEventID() {
        return EventID;
    }

    public void setEventID(Integer EventID) {
        this.EventID = EventID;
    }

    public Integer getSatelliteID() {
        return SatelliteID;
    }

    public void setSatelliteID(Integer SatelliteID) {
        this.SatelliteID = SatelliteID;
    }

    public Double getPayload() {
        return payload;
    }

    public void setPayload(Double payload) {
        this.payload = payload;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getSiteID() {
        return SiteID;
    }

    public void setSiteID(Integer SiteID) {
        this.SiteID = SiteID;
    }

    public Integer getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(Integer VehicleID) {
        this.VehicleID = VehicleID;
    }
}