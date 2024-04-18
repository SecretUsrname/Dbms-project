CALL CreateNewLaunchVehicle(100, 25, 'Falcon 9', 'SpaceX', 22800, 'Operational', 0.95);

select * from launchvehicle;

CALL ScheduleLaunch(3, 3, 250, '22:00:00', '2024-07-02', 'Planned', 3, 100);

select * from launchevent;