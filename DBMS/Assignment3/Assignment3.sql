
-- Enabling use of lis database.

Use lis;

--  Updating due_date in book_issue table of lis database, for the sake of next query to return a result.

UPDATE book_issue 
SET due_date = "2015-11-12";

--  To display records which have due date greater than 60 days.
--  Question 1

Select m.member_nm,m.member_id,t.title_nm,bi.accession_no,bi.issue_dt,bi.due_date, DATEDIFF(due_Date,issue_dt ) AS DiffDate 
FROM members As m, titles AS t, books AS b, book_issue AS bi
WHERE (bi.member_id = m.member_id && bi.accession_no = b.accession_no && b.title_id = t.title_id && (DATEDIFF(bi.due_date,bi.issue_dt) > 60)) ORDER BY m.member_nm, t.title_nm;

-- To display member name with longest name along with its length.

SELECT member_nm, LENGTH(member_nm) FROM members WHERE LENGTH(member_nm) = ( SELECT  MAX(LENGTH(member_nm)) FROM members);

-- Displaying number of books issued.

SELECT COUNT(issue_dt) AS Books_issued FROM book_issue;

-- To display number of books purchased subject wise with subject id and subject name.
-- Question 2

SELECT s.subject_nm, s.subject_Id, COUNT(t.title_id) as "Number of books purchased" FROM subjects s, titles t 
where t.subject_id = s.subject_Id GROUP BY subject_id;

-- To display book details from book_issue where it can be returned after two months.

SELECT m.member_name,m.member_Id,t.title_Name,t.title_Id,b.accession_No,b.issue_Date,b.due_Date , DATEDIFF(due_Date,issue_Date ) AS DiffDate  from Members m,Book_Issue b,Title t, Books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) &&( DATEDIFF(b.due_Date,b.issue_Date )) > 60 ;

-- To display books details of books which have price greater than minimum cost.

SELECT accession_no,title_id, purchase_dt, price, status FROM books WHERE (price > (SELECT MIN(price) FROM Books));

-- To display taotal number of students, faculty and others in library system in a single row.
-- Question 3

SELECT COUNT(IF( category = "S", member_nm, NULL)) AS No_Of_Students, COUNT( IF(category = "F", member_nm,NULL)) AS No_Of_Faculty, 
COUNT(IF(category = "O", member_nm, NULL)) AS No_Of_Others FROM members;

-- To display details of title of books issued atleast two times.

SELECT t.title_nm AS TitleName, count(bi.accession_no) AS Number
FROM book_issue AS bi, titles AS t, books AS b 
WHERE (b.accession_no = bi.accession_no AND t.title_id = b.title_id ) GROUP BY t.title_nm HAVING count(bi.accession_no) >= 2;

-- To display details of book issued to members with category other than "F".

SELECT bi.accession_no, m.member_id, m.member_nm, bi.issue_dt, bi.due_date
FROM members AS m, book_issue AS bi 
WHERE (bi.member_id = m.member_id && m.category <> "F");

-- To display details of authors whose atleast one book has been purchased.

SELECT a.author_id, a.author_nm 
FROM authors AS a, title_author AS ta, titles AS t, books AS b
WHERE (a.author_id = ta.author_id && ta.title_id = t.title_id && t.title_id = b.title_id && ((SELECT COUNT(ta.title_id) FROM books) > 0));