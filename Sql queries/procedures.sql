DELIMITER //

CREATE PROCEDURE GetSatelliteBasicDetails(IN Sid INT)
BEGIN
    SELECT 
        SatelliteID, 
        Name, 
        OperationalLife, 
        LaunchDate, 
        Manufacturer, 
        RemainingOpLife,
        OrbitID, 
        EventID, 
        VehicleID
    FROM satellite
    WHERE SatelliteID = Sid;
END//

DELIMITER ;

DELIMITER //

CREATE PROCEDURE CreateNewLaunchVehicle(
    IN p_vehicle_id INT,
    IN p_launch_count INT,
    IN p_type VARCHAR(255),
    IN p_manufacturer VARCHAR(255),
    IN p_maxpayload DECIMAL(10,2),
    IN p_operationalstatus VARCHAR(50),
    IN p_utilizationrate DECIMAL(5,2))
BEGIN
    INSERT INTO launchvehicle (vehicle_id, launch_count, type, manufacturer, maxpayload, operationalstatus, utilizationrate) 
    VALUES (p_vehicle_id, p_launch_count, p_type, p_manufacturer, p_maxpayload, p_operationalstatus, p_utilizationrate);
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE ScheduleLaunch(
    IN p_eventid INT,
    IN p_satelliteid INT,
    IN p_payload DECIMAL(10,2),
    IN p_time TIME,
    IN p_date DATE,
    IN p_outcome VARCHAR(50),
    IN p_siteid INT,
    IN p_vehicleid INT)
BEGIN
    -- Check if the vehicle is available for the given date
    DECLARE vehicleAvailable INT DEFAULT 0;
    
    SELECT COUNT(*) INTO vehicleAvailable
    FROM launchevent
    WHERE vehicleid = p_vehicleid OR date = p_date;

    IF vehicleAvailable = 0 THEN
        -- If the vehicle is available, insert the new launch event
        INSERT INTO launchevent (eventid, satelliteid, payload, time, date, outcome, siteid, vehicleid) 
        VALUES (p_eventid, p_satelliteid, p_payload, p_time, p_date, p_outcome, p_siteid, p_vehicleid);
    ELSE
        -- Optionally, handle the case where the vehicle is not available (e.g., raise an error)
        SELECT 'Vehicle not available for the selected date.' AS ErrorMessage;
    END IF;
END //

DELIMITER ;



