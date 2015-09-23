-- Creating vehicle database.

CREATE DATABASE IF NOT EXISTS vehicle_database;

-- Enabling the use of the vehicle_database.

USE vehicle_database;

-- Creating the vehicle table.

CREATE TABLE IF NOT EXISTS vehicle (
    id INT,
    created_by VARCHAR(20),
    created_time DATE(25),
    make VARCHAR(20),
    model VARCHAR(20),
    engine_In_CC INT,
    fuel_Capacity INT,
    mileage INT,
    price DOUBLE(10,2),
    road_Tax DOUBLE(10,2),
    PRIMARY KEY(id)
    );
    
-- Creating the car table.

CREATE TABLE IF NOT EXISTS car (
    id INT,
    ac ENUM ("true", "false") NOT NULL DEFAULT "false",
    power_steering ENUM ("true", "false") NOT NULL DEFAULT "false",
    accessoryKit ENUM ("true", "false" ) NOT NULL DEFAULT "false",
    PRIMARY KEY (id),
    FOREIGN KEY ( id ) REFERENCES vehicle(id) ON DELETE CASCADE
);

-- Creating the bike table.

CREATE TABLE IF NOT EXISTS bike (
    id INT,
    self_start ENUM ("true", "false") NOT NULL DEFAULT "false",
    helmet_price DOUBLE(6,2),
    PRIMARY KEY (id, helmet_price),
    FOREIGN KEY ( id ) REFERENCES vehicle(id) ON DELETE CASCADE
);
    