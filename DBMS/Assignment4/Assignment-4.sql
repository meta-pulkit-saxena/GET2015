
-- Enabling the use of lis database.

USE lis;

-- Adding a new element for the sake of next query to run 

INSERT INTO members (member_id,member_nm,addressline1,addressline2,category) VALUES
(55,"Keshav Sharma","Jaipur","Rajasthan","F");


-- QUESTION 1
-- To display members having same category as of "Keshav Sharma" member.

SELECT member_nm FROM members 
WHERE category = ( SELECT category FROM members WHERE member_nm = "KESHAV SHARMA");

-- To display the details of book which is still not returned.

SELECT bi.issue_dt, t.title_nm, m.member_nm, bi.due_date FROM book_issue AS bi, books AS b, members AS m, book_return AS br, titles AS t
WHERE m.member_id = br.member_id 
AND t.title_id = b.title_id AND br.issue_dt <> bi.issue_dt AND br.accession_no <> bi.accession_no AND bi.member_id <> br.member_id;

-- To display details of the books returned after due date.

SELECT bi.issue_dt, t.title_nm, m.member_nm, bi.due_date FROM book_issue AS bi, books AS b, members AS m, book_return AS br, titles AS t
WHERE m.member_id = br.member_id 
AND t.title_id = b.title_id AND br.issue_dt = bi.issue_dt AND br.accession_no = bi.accession_no AND bi.member_id = br.member_id AND DATEDIFF(br.return_date,bi.due_date) > 0 ;

-- To display details of costliest book.

SELECT accession_no, title_id, purchase_dt, price FROM books
WHERE price = (SELECT MAX(price) FROM books);

-- To display details of second costliest book.

SELECT accession_no, title_id, purchase_dt, price FROM books
WHERE price = (SELECT MAX(price) FROM books WHERE price < (SELECT MAX(price) FROM books));


-- QUESTION 2
-- To create a view for member name and correponding book_issue details.

CREATE VIEW issue_details AS  
SELECT m.member_nm, m.member_id, bi.accession_no, bi.issue_dt, bi.due_date FROM members AS m, book_issue AS bi
WHERE m.member_id = bi.member_id;


-- Example use of view issue_details.

SELECT * FROM issue_details;

-- To create view for full category description with member id and name.

CREATE VIEW full_category AS 
SELECT member_id, member_nm, CASE category 
WHEN "F" THEN "FACULTY"
WHEN "S" THEN "STUDENT"
ELSE "OTHERS"
END AS category
FROM members;

-- Example use of view full_category.

SELECT * FROM full_category;

-- To create view for full_information.

CREATE VIEW full_information AS
SELECT s.subject_nm, t.title_nm, m.member_nm, m.category, bi.issue_dt, bi.due_date, 
IF(bi.accession_no <> br.accession_no AND bi.member_id <> br.member_id,NULL, br.return_date)
FROM subjects AS s, members AS m, book_issue AS bi, book_return AS br, titles AS t, books As b
WHERE bi.accession_no = b.accession_no AND b.title_id=t.title_id AND t.subject_id = s.subject_id AND m.member_id = br.member_id;

-- Example use of view full information.

SELECT *  FROM full_information;