INSERT INTO launchvehicle (vehicle_id, launch_count, type, manufacturer, maxpayload, operationalstatus, utilizationrate) VALUES
(1, 10, 'Falcon 9', 'SpaceX', 22800, 'Operational', 0.9),
(2, 3, 'Ariane 5', 'Arianespace', 21000, 'Operational', 0.75),
(3, 15, 'Soyuz', 'Roscosmos', 8100, 'Operational', 0.85);

INSERT INTO launch_site (siteid, sitename, location, launchfrequency, no_launches) VALUES
(1, 'Cape Canaveral', 'USA', 15, 150),
(2, 'Kourou', 'French Guiana', 12, 120),
(3, 'Baikonur Cosmodrome', 'Kazakhstan', 20, 200);

INSERT INTO orbitpath (orbitid, inclination, type, period, altitude) VALUES
(1, 28.5, 'LEO', 90, 400),
(2, 0, 'GEO', 1440, 35786),
(3, 51.6, 'SSO', 92, 600);

INSERT INTO satellite (satelliteid, name, operationallife, launchdate, manufacturer, remainingoplife, orbitid, eventid, vehicleid) VALUES
(1, 'Hubble Space Telescope', 15, '1990-04-24', 'NASA', 5, 1, NULL, 1),
(2, 'James Webb Space Telescope', 10, '2021-12-25', 'NASA', 10, 2, NULL, 2),
(3, 'Landsat 8', 5, '2013-02-11', 'NASA', 2, 3, NULL, 3);

INSERT INTO trackstation (stationid, name, location, operationalhours, capability) VALUES
(1, 'Goldstone', 'USA', '24/7', 'Deep Space Communication'),
(2, 'Canberra', 'Australia', '24/7', 'Deep Space Communication'),
(3, 'Madrid', 'Spain', '24/7', 'Deep Space Communication');

INSERT INTO spacedebris (debrisid, type, size, origin, risklevel, stationid, orbitid) VALUES
(1, 'Defunct Satellite', 2.5, 'Sputnik', 'High', 1, 1),
(2, 'Rocket Body', 5.0, 'Falcon 9', 'Medium', 2, 2),
(3, 'Lost Tool', 0.5, 'ISS', 'Low', 3, 3);
