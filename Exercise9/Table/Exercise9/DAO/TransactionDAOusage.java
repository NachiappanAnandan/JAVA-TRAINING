package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.TransactionDTO;
import Table.DatabaseConnection;

public class TransactionDAOusage implements TransactionDAO {

	@Override
	public Collection<TransactionDTO> findByInvoice(int id) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from transactions where invoiceNumber=? ;");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			List<TransactionDTO> transactions = new ArrayList<>();
			while(result.next()) {
				TransactionDTO transaction = new TransactionDTO();
				transaction.setInvoiceNumber(result.getInt("invoiceNumber"));
				transaction.setItemNumber(result.getInt("itemNumber"));
				transaction.setItemQuantity(result.getInt("itemQuantity"));
				transactions.add(transaction);
				
			}
			return transactions;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		
		return null;
	}
	@Override
	public int updateTransaction(TransactionDTO transaction) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			
			//getting customer id
			int invoiceNumber= transaction.getInvoiceNumber();
			int itemNumber = transaction.getItemNumber();
			
			
			PreparedStatement statement =connection.prepareStatement("select * from transactions where invoiceNumber = ? and itemNumber = ?;");
		
			statement.setInt(1, invoiceNumber);
			statement.setInt(2, itemNumber);
//			System.out.println(statement);
			ResultSet result = statement.executeQuery();
			
			
			
			if(result.next()) {
				statement = connection.prepareStatement("update transactions set  itemQuantity = ?  where invoiceNumber =? and itemNumber = ?");
				statement.setInt(1, transaction.getItemQuantity());
				statement.setInt(2, transaction.getInvoiceNumber());
				statement.setInt(3, transaction.getItemNumber());
				
				 int n = statement.executeUpdate();
				 DatabaseConnection.closeConnection(null);
				 return n;
			}
			return 0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return 0;
	}

	
	
	
	@Override
	public int deleteTransaction(int invoiceId) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from transactions where invoiceNumber=?;");
			statement.setInt(1, invoiceId);
			int result = statement.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			
			//If there's an exception, it will be rolled back to the previous state
			DatabaseConnection.closeConnection(e);
			return 0;
		}

	}

}
