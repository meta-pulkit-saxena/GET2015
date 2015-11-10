
/**
 * @class  DatabaseQueries
 * @author Pulkit
 * @since  14th October 15
 * This class defines all the functions related to the queries to be fired to database.
 */

package com.metacampus.JspServlet.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.metacampus.JspServlet.helper.ConnectionPool;
import com.metacampus.JspServlet.modal.User;

public class DatabaseQueries {
	
	/**
	 * This function inserts the user into the user table.
	 * @param{User} user
	 */
	
	public boolean insertUserIntoDatabase(User user) {
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		int count;
		boolean status = false;
		String query = "INSERT INTO user_table (user_name,password,email) VALUES (?,?,?)";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			connectionObject.setAutoCommit(false); 
			PreparedStatement statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			count = statement.executeUpdate();
			if(count > 0 ) {
				status = true;
			}
			connectionObject.commit();
		}
		catch(SQLException e) {
			try {
				connectionObject.rollback();
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return status;
	}

	/**
	 * This function inserts the relevant data of bike type vehicle into the bike table.
	 * @param{User} user
	 */
	
	public boolean matchUserInDatabase(User user) {
		boolean returnVal =false;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		String query = "SELECT user_name,password FROM user_table";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			Statement statement = connectionObject.createStatement(); // Creating a statement.
			ResultSet result = statement.executeQuery(query);
			while(result.next()) {
				String userName = result.getString("user_name");
				String password = result.getString("password");
				String inputUserName = user.getUserName();
				String inputPassword = user.getPassword();
				if(userName.equals(inputUserName) && password.equals(inputPassword)) {
					returnVal = true;
					break;
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			poolObject.returnConnectionToPool(connectionObject);
		}
		return returnVal;
	}
	
}
