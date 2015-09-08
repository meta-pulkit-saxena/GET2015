
-- Creating database.

CREATE DATABASE lis;

-- Using database lis.

USE lis;

-- Inserting rows in members table.

CREATE TABLE members(
	member_id INT,
	member_nm VARCHAR(20),
	addressline1 VARCHAR(20),
	addressline2 VARCHAR(20),
	category VARCHAR(10),
	PRIMARY KEY(member_id)
);

-- Inserting rows in subjects table.

CREATE TABLE subjects(
	subject_id INT,
	subject_nm VARCHAR(20),
	PRIMARY KEY(subject_id)
);

-- Inserting rows in publishers table.

CREATE TABLE publishers(
	publisher_id INT,
	publisher_nm VARCHAR(20),
	PRIMARY KEY(publisher_id)
);

-- Inserting rows in authors table.

CREATE TABLE authors(
	author_id INT,
	author_nm VARCHAR(20),
	PRIMARY KEY(author_id)
);

-- Inserting rows in titles table.

CREATE TABLE titles(
	title_id INT,
	title_nm VARCHAR(20),
	subject_id INT,
	publisher_id INT,
	FOREIGN KEY(publisher_id ) REFERENCEs publishers(publisher_id ) ON DELETE CASCADE,
	FOREIGN KEY(subject_id ) REFERENCEs subjects(subject_id ),
	PRIMARY KEY(title_id)
);

-- Inserting rows in books table.

CREATE TABLE books(
	accession_no INT,
	title_id INT,
	purchase_dt DATE,
	price DECIMAL(12,2),
	FOREIGN KEY(title_id ) REFERENCEs titles(title_id ) ON DELETE CASCADE,
	PRIMARY KEY(accession_no)
);

-- Inserting rows in book_issue table.

CREATE TABLE book_issue(
	issue_dt DATE,
	accession_no INT,
	member_id INT,
	due_date DATE,	
	PRIMARY KEY(issue_dt, accession_no,
	member_id),
	FOREIGN KEY(member_id) REFERENCES members(member_id ),
	FOREIGN KEY(accession_no) REFERENCES books(accession_no ) ON DELETE CASCADE
);



-- Inserting rows in title_author table.

CREATE TABLE title_author(
	title_id INT,
	author_id INT,
	FOREIGN KEY(title_id ) REFERENCEs titles(title_id ) ON DELETE CASCADE,
	FOREIGN KEY(author_id ) REFERENCEs authors(author_id ),
	PRIMARY KEY(title_id, author_id)
);

-- Inserting rows in book_return table.

CREATE TABLE book_return(
	return_date DATE,
	accession_no INT,
	member_id INT,
	issue_dt DATE,
	FOREIGN KEY(member_id) REFERENCEs members(member_id ),
	FOREIGN KEY(accession_no) REFERENCEs books(accession_no) ON DELETE CASCADE,
	PRIMARY KEY(return_date,accession_no,
	member_id)
);

SHOW TABLES;

-- Modifying issue_dt of book_issue table.

ALTER TABLE book_issue MODIFY COLUMN issue_dt TIMESTAMP NOT NULL DEFAULT NOW();

-- Trigger for due_date in table book_issue.

DELIMITER ;;
CREATE TRIGGER book_due_date AFTER INSERT ON book_issue FOR EACH ROW
BEGIN
     UPDATE book_issue SET due_date = DATE_ADD(NOW(), INTERVAL 15 DAY) where issue_dt = NOW();
END;;
DELIMITER ;

-- Droping Trigger.

DROP TRIGGER book_due_date;

-- Droping book_issue table.

DROP TABLE book_issue;

-- Droping book_return.

DROP TABLE book_return;

-- Droping members table.

DROP TABLE members;

-- Inserting rows in members table.

CREATE TABLE members(
	member_id INT,
	member_nm VARCHAR(20),
	addressline1 VARCHAR(20),
	addressline2 VARCHAR(20),
	category VARCHAR(10),
	PRIMARY KEY(member_id)
);

-- Inserting rows in book_issue table.

CREATE TABLE book_issue(
	issue_dt DATE,
	accession_no INT,
	member_id INT,
	due_date DATE,	
	PRIMARY KEY(issue_dt, accession_no,
	member_id),
	FOREIGN KEY(member_id) REFERENCES members(member_id ),
	FOREIGN KEY(accession_no) REFERENCES books(accession_no ) ON DELETE CASCADE
);

-- Inserting rows in book_return table.

CREATE TABLE book_return(
	return_date DATE,
	accession_no INT,
	member_id INT,
	issue_dt DATE,
	FOREIGN KEY(member_id) REFERENCEs members(member_id ),
	FOREIGN KEY(accession_no) REFERENCEs books(accession_no) ON DELETE CASCADE,
	PRIMARY KEY(return_date,accession_no,
	member_id)
);

-- Modifying issue_dt of book_issue table.

ALTER TABLE book_issue MODIFY COLUMN issue_dt TIMESTAMP NOT NULL DEFAULT NOW();

-- Trigger for due_date in table book_issue.

DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON book_issue FOR EACH ROW
BEGIN
    SET NEW.due_date = DATE_ADD(NOW(), INTERVAL 15 DAY);     
END;;
DELIMITER ;

-- Inserting rows in members table.

INSERT INTO members (member_id,member_nm,addressline1,addressline2,category) VALUES
(21,"Rohan","Durgapur","jaipur","F"),
(45,"Piyush","Patparganj","Delhi","S");

-- Inserting rows in subjects table.

INSERT INTO subjects (subject_id,subject_nm) VALUES 
(1,"Fiction"),
(2,"Social");

-- Inserting rows in publishers table.

INSERT INTO publishers (publisher_id,publisher_nm) VALUES
(89,"Penguin"),
(67,"Vidya"),
(1,"Oxford");

-- Inserting rows in authors table.

INSERT INTO authors (author_id,author_nm) VALUES
(5,"Somerset Maugham"),
(4,"Amish Tripathi");

-- Inserting rows in titles table.

INSERT INTO titles (title_id,title_nm,subject_id,publisher_id) VALUES 
(12,"Of Human Bondage",2,89),
(14,"Shiva",1,67),
(15,"Shiva",1,1);

-- Inserting rows in books table.

INSERT INTO books (accession_no,title_id,purchase_dt,price) VALUES
(55,12,"2015-05-14",749.0),
(77,14,"2015-06-11",870.54);

-- Inserting rows in book_issue table.

INSERT INTO book_issue (accession_no,member_id) VALUES
(77,21),
(55,45);

-- Inserting rows in title_author table.

INSERT INTO title_author(title_id,author_id) VALUES
(12,5),
(14,4);

-- Inserting rows in book_return table.

INSERT INTO book_return(return_date,accession_no,member_id,issue_dt) VALUES
("2015-08-07",55,21,"2015-08-04"),
("2015-09-09",77,45,"2015-09-01");

-- Updating addressline2.

UPDATE members 
SET addressline2 = "JAIPUR";

-- Updating addressline1.

UPDATE members
SET addressline1 =  "EPIP,Sitapura"
WHERE category = "F";

-- Deleting all rows from publishers table.

DELETE FROM publishers;

-- Inserting rows using substitution method in publishers table.

SET @publisher_id = 89;
SET @publisher_nm = "Penguin";

INSERT INTO publishers (publisher_id,publisher_nm) VALUES
(@publisher_id,@publisher_nm);

SET @publisher_id = 67;
SET @publisher_nm = "Vidya";

INSERT INTO publishers (publisher_id,publisher_nm) VALUES
(@publisher_id,@publisher_nm);

-- Inserting rows using substitution method in titles table.

SET @title_id = 12;
SET @title_nm = "Of Human Bondage";
SET @subject_id = 2;
SET @publisher_id = 89;

INSERT INTO titles (title_id,title_nm,subject_id,publisher_id) VALUES 
(@title_id,@title_nm,@subject_id,@publisher_id);

SET @title_id = 14;
SET @title_nm = "Shiva";
SET @subject_id = 1;
SET @publisher_id = 67;

INSERT INTO titles (title_id,title_nm,subject_id,publisher_id) VALUES 
(@title_id,@title_nm,@subject_id,@publisher_id);


-- Inserting rows using substitution method in books table.

SET @accession_no = 55;
SET @title_id = 12;
SET @purchase_dt = "2015-05-14";
SET @price = 749.0;

INSERT INTO books (accession_no,title_id,purchase_dt,price) VALUES
(@accession_no,@title_id,@purchase_dt,@price);

SET @accession_no = 77;
SET @title_id = 14;
SET @purchase_dt = "2015-06-11";
SET @price = 870.54;

INSERT INTO books (accession_no,title_id,purchase_dt,price) VALUES
(@accession_no,@title_id,@purchase_dt,@price);



-- Inserting rows using substitution method in book_issue table.

SET @accession_no = 77;
SET @member_id = 21;

INSERT INTO book_issue(accession_no,member_id) VALUES
(@accession_no,@member_id);

SET @accession_no = 55;
SET @member_id = 45;

INSERT INTO book_issue(accession_no,member_id) VALUES
(@accession_no,@member_id);

-- Inserting rows using substitution method in title_author table.

SET @title_id = 12;
SET @author_id = 5;

INSERT INTO title_author(title_id,author_id) VALUES
(@title_id,@author_id);

SET @title_id = 14;
SET @author_id = 4;

INSERT INTO title_author(title_id,author_id) VALUES
(@title_id,@author_id);


-- Inserting rows using substitution method in book_return table.

SET @return_date = "2015-08-07";
SET @accession_no = 55;
SET @member_id = 21;
SET @issue_dt = "2015-08-04" ;

INSERT INTO book_return(return_date,accession_no,member_id,issue_dt) VALUES
(@return_date,@accession_no,@member_id,@issue_dt);

SET @return_date = "2015-09-09";
SET @accession_no = 77;
SET @member_id = 45;
SET @issue_dt = "2015-09-01";

INSERT INTO book_return(return_date,accession_no,member_id,issue_dt) VALUES
(@return_date,@accession_no,@member_id,@issue_dt);




-- Deleting rows in titles where publisher_id = 1.

DELETE FROM titles 
WHERE publisher_id = 1;