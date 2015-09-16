
/**
 * @class  Helper
 * @author Pulkit
 * @since  15th September 15
 * This class contains methods for firing queries to  database and wrapping up all the results in POJO. 
 */

package com.metacube.jdbc.helper;

import com.metacube.jdbc.Utility.ConnectionPool;
import com.metacube.jdbc.modal.Title;
import com.mysql.jdbc.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Helper {
	private List<Title> titleList = new ArrayList<Title>();						// To hold the objects of title POJO objects. 
	
	/**
	 * This function returns the list of all the tiles written by author 
	 * @param authorName
	 */
	
	public void titleByAuthor(String authorName) {
		Connection connectionObject = null;
		ResultSet resultSet = null;
		Title titleObject = null;
		String titleName;
		int titleId;
		ConnectionPool poolObject = new ConnectionPool();						// Creating connection pool object.
		connectionObject = (Connection) poolObject.getConnectionFromPool();
		String query = "SELECT title_id, title_nm FROM titles WHERE title_id IN (SELECT title_id FROM title_author WHERE author_id IN (SELECT author_id FROM authors WHERE author_nm = ? ))";
		
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool(); 		// Taking a connection object from connection pool.
			PreparedStatement statement  = connectionObject.prepareStatement(query);	// Creating a prepared statement.
			statement.setString(1, authorName);
			resultSet = statement.executeQuery();								// Executing the query and storing result set.
			poolObject.returnConnectionToPool(connectionObject);				// Returning back connection object back to connection pool.
			while(resultSet.next()) {
				titleId = resultSet.getInt("title_id");
				titleName = resultSet.getString("title_nm");
				titleObject  = new Title(titleId,titleName);
				titleList.add(titleObject);										// Adding title POJO object in arrayList.
			}
			connectionObject.close();
			if(titleList.size() == 0) {
				System.out.println("No titles found..");
			} 
			else {
				System.out.println(titleList);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This function issues the given book to the a default set member.
	 * @param{String} titleName
	 * @return{boolean}
	 */
	
	public boolean issueBookByTitle(String titleName) {
		int tempFlag;
		boolean flag = false;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();
		String insertQuery = "INSERT INTO book_issue(issue_dt,accession_no, member_id, due_Date) VALUES(now(),(select accession_no  from books where status = 0 and title_id = ( select title_id from titles where title_nm = ? ) limit 0,1), 45 ,'2015-11-06');";
		String updateQuery ="UPDATE books set status=1 where  title_id =( select title_id from titles where title_nm = ?) limit 1;";
		
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();	// Taking a connection object from connection pool.
			connectionObject.setAutoCommit(false);								
			PreparedStatement statement  = connectionObject.prepareStatement(insertQuery);
			statement.setString(1, titleName);
			tempFlag = statement.executeUpdate();								// Executing query.
			if(tempFlag == 1) {
				flag = true;
				statement = connectionObject.prepareStatement(updateQuery);
				statement.setString(1, titleName);
				statement.executeUpdate();
				poolObject.returnConnectionToPool(connectionObject);			// Returning back connection object back to connection pool.
				connectionObject.commit();										// Committing the changes manually.
			}
		}
		catch (SQLException e1) {
			try {
				connectionObject.rollback();									// Rolling back if error caught.
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			e1.printStackTrace();
		}
		return flag;
	}

	/**
	 * This function deletes all the books which are not issued since last one year.
	 * @return{int} no of deleted books
	 */
	
	public int deleteBooks() {
		int deletedBooks = 0;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();
		String query =  "DELETE FROM BOOKS WHERE DATEDIFF(purchase_dt,NOW()) > 365 AND accession_no NOT IN (SELECT DISTINCT(accession_no) FROM book_issue WHERE DATEDIFF(issue_dt, NOW()) < 365)";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();	// Taking a connection object from connection pool.
			connectionObject.setAutoCommit(false);								// Setting auto commit to false.
			Statement statement = connectionObject.createStatement();
			deletedBooks = statement.executeUpdate(query);						// Executing query.
			poolObject.returnConnectionToPool(connectionObject);				// Returning back connection object back to connection pool.
			connectionObject.commit();											// Committing the changes manually.
		} catch (SQLException e1) {
			try {
				connectionObject.rollback();									// Rolling back if error caught.
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			e1.printStackTrace();
		}
		return deletedBooks;
	}
}
