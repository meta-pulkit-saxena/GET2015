
-- Creating database ecommerce

CREATE  DATABASE electronicList;

-- Using ecommerce database.

USE electronicList;

-- Creating table categories

CREATE TABLE categories
(
    id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    name VARCHAR(30) NOT NULL,
    parentId INTEGER NULL,
    FOREIGN KEY (parentid)  REFERENCES categories (id)
);

-- Inserting the Top category

INSERT INTO categories (id,name) VALUES 
(1,'Mobiles & Tablets'),
('Computers'),
('Home Appliances');

-- Inserting the sub category

INSERT INTO categories (name,parentId) VALUES
('MOBILES',1),
('TABLETS',1),
('Smart Phones',4),
('Featured Phones',4);

-- Inserting the last Category

INSERT INTO categories (name,parentId) VALUES
('2G',5),
('3G',5),
('ACCESSORIES',1),
('CASE & COVERS',1);

-- Inserting the sub category

INSERT INTO categories (name,parentId) VALUES
('DESKTOP',2),
('LAPTOP',2),
('LAPTOP ACCESSORIES',2),
('PRINTERS',2);

-- Inserting the last Category

INSERT INTO categories (name,parentId) VALUES
('Keyboard',14),
('Mouse',14),
('Headphones',14),
('Inkjet',15),
('Laser',15),
('TVs',3),
('Air Conditoners',3),
('Washing Machines',3);

-- Inserting the last Category

INSERT INTO categories (name,parentId) VALUES
('LED',21),
('LCD',21),
('PLASMA',21);

-- Inserting the last Category

INSERT INTO categories (name,parentId) VALUES
('Full Automatic',23),
('Semi Automatic',23),
('Top Load',27),
('Front Load',27);

-- Query for to display all the categories along with its Parent category sorted by parent category.

SELECT node.name AS node_name , IFNULL(parent1.name,'Top Category') AS parent_name , parent2.name AS parent2_name , parent3.name AS parent3_name 
FROM categories AS node LEFT OUTER JOIN categories AS parent1 ON parent1.id = node.parentid  
LEFT OUTER JOIN categories AS parent2 ON parent2.id = parent1.parentid  
LEFT OUTER JOIN categories as parent3 ON parent3.id = parent2.parentid;
    
-- To select categories if it is top category

SELECT name FROM categories where parentId is null ;


