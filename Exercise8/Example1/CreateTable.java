package Example1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateTable {
	public static void main(String[] args) throws SQLException {
	
	Connection connection = DBConnection.getConnection();
	
	PreparedStatement ps = connection.prepareStatement("create table employee (empno integer,ename varchar(20),deptno integer)");
	
	int  rs =ps.executeUpdate();
	System.out.println(rs);
	}
	
}
