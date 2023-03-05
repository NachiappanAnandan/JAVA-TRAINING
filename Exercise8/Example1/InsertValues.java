package Example1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertValues {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.getConnection();
		
//		PreparedStatement ps1 = connection.prepareStatement("insert into employee values (001,'sakre',2)");
//		PreparedStatement ps2 = connection.prepareStatement("insert into employee values  (001,'pradeep',22)");
//		PreparedStatement ps3 = connection.prepareStatement("insert into employee values (001,'vivek',24)");
//		
//		int  rs1 =ps1.executeUpdate();
//		int  rs2 =ps2.executeUpdate();
//		int  rs3=ps3.executeUpdate();
//		System.out.println(rs1);
//		System.out.println(rs3);
//		System.out.println(rs3);
		//display all
		Statement s =  connection.createStatement();
		ResultSet rs = s.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+""+rs.getInt(3));
		}
	
		
		
		
		}
}
