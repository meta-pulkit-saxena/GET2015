
-- Creating database zipcode.

CREATE DATABASE zipcode;

-- Using database zipcode

USE zipcode;

-- Creating state table

CREATE TABLE states(
	states_id INT AUTO_INCREMENT,
	states_name CHAR(20),
	PRIMARY KEY(states_id)
);

-- Creating city table

CREATE TABLE city(
	city_id INT PRIMARY KEY AUTO_INCREMENT,
	city_name CHAR(20),
	states_id INT,
	FOREIGN KEY(states_id) REFERENCES states(states_id) ON DELETE CASCADE
);

-- Creating ziptocity table

CREATE TABLE ziptocity(
	zipcode INT PRIMARY KEY,
	city_id INT,
	FOREIGN KEY(city_id) REFERENCES city(city_id) ON DELETE CASCADE
);

-- Inserting rows in states table.

INSERT INTO states(states_name) VALUES
	("Uttar Pradesh"),
	("Rajsthan");
	
-- Inserting rows in city table.
    
INSERT INTO city(city_name,states_id) VALUES 
("Allahabad",1),
("Bareilly",1);
	
-- Inserting rows in city table.
    
INSERT INTO city(city_name,states_id) VALUES 
("Jaipur",2),
("Ajmer",2);

-- Inserting rows in ziptocity table.

INSERT INTO ziptocity(zipcode,city_id) VALUES
(281003,1),
(281002,1),
(282001,2),
(535218,2);

-- Displays the city name,state name and corresponding given a zipcode.
	
SELECT c.city_name AS CITY, s.states_name "State Name" FROM city AS c 
JOIN states AS s ON c.states_id = s.states_id 
JOIN ziptocity AS z ON z.city_id = c.city_id 
WHERE z.zipcode = "281003" 
ORDER BY s.states_name, c.city_name;