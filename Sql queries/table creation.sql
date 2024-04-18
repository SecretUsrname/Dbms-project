CREATE TABLE LaunchEvent (
    EventID INT PRIMARY KEY,
    SatelliteID INT,
    Payload DECIMAL(10,2),
    Time TIME,
    Date DATE,
    Outcome VARCHAR(50),
    SiteID INT,
    VehicleID INT
);

CREATE TABLE launch_site(
    SiteID INT PRIMARY KEY,
    SiteName VARCHAR(255),
    Location VARCHAR(255),
    LaunchFrequency INT,
    NO_Launches INT
);

CREATE TABLE Satellite (
    SatelliteID INT PRIMARY KEY,
    Name VARCHAR(255),
    OperationalLife INT,
    LaunchDate DATE,
    Manufacturer VARCHAR(255),
    RemainingOpLife INT,
    OrbitID INT,
    EventID INT,
    VehicleID INT
);

CREATE TABLE OrbitPath (
    OrbitID INT PRIMARY KEY,
    Inclination DECIMAL(5,2),
    Type VARCHAR(50),
    Period INT,
    Altitude INT
);

CREATE TABLE TrackStation (
    StationID INT PRIMARY KEY,
    Name VARCHAR(255),
    Location VARCHAR(255),
    OperationalHours VARCHAR(50),
    Capability VARCHAR(255)
);

CREATE TABLE SpaceDebris (
    DebrisID INT PRIMARY KEY,
    Type VARCHAR(50),
    Size DECIMAL(10,2),
    Origin VARCHAR(255),
    RiskLevel VARCHAR(50),
    StationID INT,
    OrbitID INT
);

CREATE TABLE MonitoredBy (
    Satellite_ID INT,
    Station_ID INT,
    PRIMARY KEY (Satellite_ID, Station_ID)
);

CREATE TABLE TrackedWith (
    Station_ID INT,
    Orbit_ID INT,
    PRIMARY KEY (Station_ID, Orbit_ID)
);

CREATE TABLE TrackedBy (
    StationID INT,
    DebrisID INT,
    PRIMARY KEY (StationID, DebrisID)
);

CREATE TABLE Launch_Site_Capacity (
    LS_SiteId INT,
    LS_Capacity INT,
    PRIMARY KEY (LS_SiteId)
);