package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "test";
	private static final String PASSWORD = "test";
	
	public static Connection getCon() {
		Connection con = null;
		try {
			Class.forName(DRIVER_NAME);
			
			try {
				con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
			
			return con;
		
	}
	
	public static void main(String[] args) {
		Connection con = getCon();
		System.out.println(con);
	}
	
}
