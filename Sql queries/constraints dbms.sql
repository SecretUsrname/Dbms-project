ALTER TABLE launchevent
ADD CONSTRAINT fk_launchevent_satellite
FOREIGN KEY (satelliteid) REFERENCES satellite(satelliteid);

ALTER TABLE launchevent
ADD CONSTRAINT fk_launchevent_launch_site
FOREIGN KEY (siteid) REFERENCES launch_site(siteid);

ALTER TABLE launchevent
ADD CONSTRAINT fk_launchevent_launchvehicle
FOREIGN KEY (vehicleid) REFERENCES launchvehicle(vehicle_id);

ALTER TABLE satellite
ADD CONSTRAINT fk_satellite_orbitpath
FOREIGN KEY (orbitid) REFERENCES orbitpath(orbitid);

ALTER TABLE satellite
ADD CONSTRAINT fk_satellite_launchevent
FOREIGN KEY (eventid) REFERENCES launchevent(eventid);

ALTER TABLE satellite
ADD CONSTRAINT fk_satellite_launchvehicle
FOREIGN KEY (vehicleid) REFERENCES launchvehicle(vehicle_id);

ALTER TABLE spacedebris
ADD CONSTRAINT fk_spacedebris_trackstation
FOREIGN KEY (stationid) REFERENCES trackstation(stationid);

ALTER TABLE spacedebris
ADD CONSTRAINT fk_spacedebris_orbitpath
FOREIGN KEY (orbitid) REFERENCES orbitpath(orbitid);

ALTER TABLE monitoredby
ADD CONSTRAINT fk_monitoredby_satellite
FOREIGN KEY (satellite_id) REFERENCES satellite(satelliteid);

ALTER TABLE monitoredby
ADD CONSTRAINT fk_monitoredby_trackstation
FOREIGN KEY (station_id) REFERENCES trackstation(stationid);

ALTER TABLE trackedwith
ADD CONSTRAINT fk_trackedwith_trackstation
FOREIGN KEY (station_id) REFERENCES trackstation(stationid);

ALTER TABLE trackedwith
ADD CONSTRAINT fk_trackedwith_orbitpath
FOREIGN KEY (orbit_id) REFERENCES orbitpath(orbitid);

ALTER TABLE trackedby
ADD CONSTRAINT fk_trackedby_trackstation
FOREIGN KEY (stationid) REFERENCES trackstation(stationid);

ALTER TABLE trackedby
ADD CONSTRAINT fk_trackedby_spacedebris
FOREIGN KEY (debrisid) REFERENCES spacedebris(debrisid);
