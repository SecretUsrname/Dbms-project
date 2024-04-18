DELIMITER //

CREATE TRIGGER AfterLaunchEventInsert
AFTER INSERT ON launchevent
FOR EACH ROW
BEGIN
    UPDATE launchvehicle
    SET launch_count = launch_count + 1
    WHERE vehicle_id = NEW.vehicleid;
END; //

DELIMITER ;
DELIMITER //

CREATE TRIGGER BeforeLaunchEventInsert
BEFORE INSERT ON launchevent
FOR EACH ROW
BEGIN
    DECLARE vehicleMaxPayload DECIMAL(10,2);
    SELECT maxpayload INTO vehicleMaxPayload FROM launchvehicle WHERE vehicle_id = NEW.vehicleid;
    IF NEW.payload > vehicleMaxPayload THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Payload exceeds vehicle max payload capacity.';
    END IF;
END; //

DELIMITER ;

DELIMITER //

CREATE TRIGGER AfterVehicleStatusUpdate
AFTER INSERT ON launchevent
FOR EACH ROW
BEGIN
    -- Check if the vehicle's operational status is not 'Operational'
    DECLARE currentStatus VARCHAR(50);
    SELECT operationalstatus INTO currentStatus FROM launchvehicle WHERE vehicle_id = NEW.vehicleid;
    IF currentStatus <> 'Operational' THEN
        -- Update the vehicle's status to 'Operational'
        UPDATE launchvehicle SET operationalstatus = 'Operational' WHERE vehicle_id = NEW.vehicleid;
    END IF;
END; //

DELIMITER ;
