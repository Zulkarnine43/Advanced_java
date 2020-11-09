package net.codejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A sample program that demonstrates how to execute SQL DELETE statement
 * using JDBC. 
 * @author www.codejava.net
 *
 */
public class JdbcDeleteDemo {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "secret";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "DELETE FROM Users WHERE username=?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bill");
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}