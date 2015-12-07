
/**
 * @class  UserDbHelper
 * @author Pulkit
 * @since  26th October 15
 * This class defines the functions related to the user and database.
 */

package com.meta.vehicledekho.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.meta.vehicledekho.Exception.MetaVehicleSystemException;
import com.meta.vehicledekho.db.ConnectionPool;
import com.meta.vehicledekho.model.User;

public class UserDbHelper {

	/**
	 * This function matches the user credentials from the database decides whether 
	 * the user is authentic or not.
	 * @param{User} user
	 */
	
	public boolean login(Connection connectionObject, User user) throws MetaVehicleSystemException {
		boolean login = false;
		PreparedStatement statement = null;
		String query = "SELECT user_id FROM user WHERE username = ? AND password = ? AND role = ?";
		try {
			statement = connectionObject.prepareStatement(query); // Creating a prepared statement.
			String username = user.getUsername();
			String password = user.getPassword();
			String role = user.getRole().toString();
			statement.setString(1, username);
			statement.setString(2, password);
			statement.setString(3, role);
			ResultSet set =  statement.executeQuery();
			if(set.next()) {
				login = true;
			}
		}
		catch(SQLException e) {
			throw new MetaVehicleSystemException("Error occurred while login process" + "[" + e.getMessage() + "]");
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					throw new MetaVehicleSystemException("Error occurred while closing the statement" + "[" + e.getMessage() + "]");
				}
			}
		}
		return login;
	}
	
}