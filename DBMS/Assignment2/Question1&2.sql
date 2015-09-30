-- This command enables the use of lis database.

USE lis;

-- To select all the rows from the members table.

SELECT * FROM  members;

-- To select member id, name and category from the members table.

SELECT member_id,member_nm,category FROM members;

-- To select member id,name  and category before where category is "F".

SELECT member_id,member_nm,category FROM members 
WHERE category = "F";

-- To select distinct category from members.

SELECT DISTINCT category FROM members;

-- To display member name, category from members table.

SELECT member_nm,category FROM members
ORDER BY member_nm DESC;

-- To select title name, subject name, publisher name from titles, subjects and publishers tables.

SELECT t.title_nm, s.subject_nm, p.publisher_nm FROM titles AS t, subjects AS s, publishers AS p
WHERE t.subject_id  = s.subject_id AND t.publisher_id = p.publisher_id;

-- To display count of each category type from members table 

SELECT category, COUNT(member_id) FROM members
GROUP BY category;

-- To display member name from from members table where category is same as of Rohan.

SELECT member_nm  FROM members  
where category = ( SELECT category FROM members WHERE member_nm = "Rohan");

-- To display issue date, member id, accession no from tables return date, books, book_return.

SELECT f.issue_dt,f.member_Id,e.accession_No, IF( e.status = 0, f.return_Date, " ") AS return_date FROM books AS e,book_return AS f 
WHERE e.accession_No = f.accession_No;

-- To display issue date, member id, accession no from tables return date, books, book_return according order by issue date and member name.

-- This second question in assignment.

SELECT f.issue_dt,f.member_Id,e.accession_No, IF( e.status = 0, f.return_Date, " ") AS return_date FROM books AS e,book_return AS f, members AS m
WHERE e.accession_No = f.accession_No
ORDER BY f.issue_dt ASC, m.member_nm ASC;



