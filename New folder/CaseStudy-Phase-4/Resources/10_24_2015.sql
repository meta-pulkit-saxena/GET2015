
-- Creating vehicle database.

CREATE DATABASE IF NOT EXISTS vehicle;

-- Enabling the use of the vehicle database.

USE vehicle;

-- Creating the vehicle_table table.

CREATE TABLE IF NOT EXISTS vehicle_table (
    vehicle_id INT NOT NULL AUTO_INCREMENT,
    created_by VARCHAR(20) NOT NULL ,
    created_time DATE NOT NULL ,
    make VARCHAR(20) NOT NULL ,
    model VARCHAR(20) NOT NULL ,
    engine_In_CC INT NOT NULL ,
    fuel_Capacity INT NOT NULL ,
    mileage INT NOT NULL ,
    price DOUBLE(10,2) NOT NULL ,
    road_Tax DOUBLE(10,2) NOT NULL ,
    PRIMARY KEY(vehicle_id)
    )ENGINE=INNODB;
   
-- Creating the car table.

CREATE TABLE IF NOT EXISTS car (
    car_id INT NOT NULL AUTO_INCREMENT,
    vehicle_id INT NOT NULL ,
    ac ENUM ("true", "false") NOT NULL DEFAULT "false",
    power_steering ENUM ("true", "false") NOT NULL DEFAULT "false",
    accessoryKit ENUM ("true", "false" ) NOT NULL DEFAULT "false",
    PRIMARY KEY (car_id),
    FOREIGN KEY ( vehicle_id ) REFERENCES vehicle_table(vehicle_id) ON DELETE CASCADE
)ENGINE=INNODB;

-- Creating the user table.

CREATE TABLE IF NOT EXISTS  user (
    user_id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL UNIQUE ,
    password VARCHAR(25) NOT NULL ,
    role ENUM ("admin", "user") NOT NULL DEFAULT "user",
    PRIMARY KEY (user_id)
)ENGINE=INNODB;

INSERT INTO user(username,password,role) VALUES("Pulkit","Vehicledekho","admin");
