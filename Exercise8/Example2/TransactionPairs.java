package Example2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionPairs {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
public static void main(String args[]) {
	
	Connection connection = null;
	
	PreparedStatement updateSales;
	PreparedStatement updateTotal;
	
	
	String updateString = "update coffes set sales = ? where coffee like ?";
	
	String updateStatement = "update coffes set total = total + ? where coffee like ?";
	
	
	String query = "select coffee, sales, total from coffes";
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/coffee","root","root@123");
			
			updateSales = connection.prepareStatement(updateString);
			updateTotal = connection.prepareStatement(updateStatement);
			
			int [] salesForWeek = {175, 150, 60, 155, 90};
			
			String [] coffees = {"Colombian", "French_Roast","Espresso", "Colombian_Decaf","French_Roast_Decaf"};
			
			int len = coffees.length;
			
			connection.setAutoCommit(false);
			
			for (int i = 0; i < len; i++) {
				updateSales.setInt(1, salesForWeek[i]);
				updateSales.setString(2, coffees[i]);
				updateSales.executeUpdate();
				updateTotal.setInt(1, salesForWeek[i]);
				updateTotal.setString(2, coffees[i]);
				updateTotal.executeUpdate();
				connection.commit();   
				}
			connection.setAutoCommit(true);
			updateSales.close();
			updateTotal.close();

			
			//printing the values
			
			ResultSet rs = connection.prepareStatement(query).executeQuery();
			
			while(rs.next()) {
				String c = rs.getString("coffee");
				int s = rs.getInt("sales");
				int t = rs.getInt("total");
				System.out.println(c + "     " +  s + "    " + t);
			}
			connection.close();
			

			
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Sql Exception" + e);
			
			try {
				System.out.println("rolled bak");
				connection.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		
		

	
}


}
