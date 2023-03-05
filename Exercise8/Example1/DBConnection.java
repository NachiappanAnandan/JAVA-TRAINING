package Example1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/details","root","root@123");
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Connection connection  = getConnection();
		if(connection != null) {
			System.out.println("Connection made");
		}else {
			System.out.println("Connection failed");
		}
	}
}
