
/**
 * @class  SearchDbHelper
 * @author Pulkit
 * @since  26th October 15
 * This class defines all the functions related to car and database interaction.
 */

package com.meta.vehicledekho.db.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.meta.vehicledekho.Exception.MetaException;
import com.meta.vehicledekho.db.ConnectionPool;

public class SearchDbHelper {
	
	/**
	 * This function selects the distinct make from vehicle table.
	 * @throws MetaException 
	 * @return{String[]} 
	 */
	
	public List<String> retreiveDistinctMake() {
		List<String> distinctMake  = new ArrayList<String>();
		int count = 0;
		Connection connectionObject = null;
		ConnectionPool poolObject = new ConnectionPool();							// Creating connection pool object.
		String query = "SELECT DISTINCT make from vehicle_table";
		try {
			connectionObject = (Connection) poolObject.getConnectionFromPool();
			Statement statement = connectionObject.createStatement();
			ResultSet result = statement.executeQuery(query);
			while(result.next()) {
				distinctMake.add(result.getString("make"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return distinctMake;
	}
}
