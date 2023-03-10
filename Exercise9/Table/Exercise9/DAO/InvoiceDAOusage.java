package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.InvoiceDTO;
import Table.DatabaseConnection;

public class InvoiceDAOusage implements InvoiceDAO{

	@Override
	public InvoiceDTO findById(int id) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from invoice where 	invoiceNumber =?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setInvoiceId(id);
				invoice.setDate(result.getString("date"));
				invoice.setCustomerId(result.getInt("customerId"));
				
				return invoice;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	@Override
	public InvoiceDTO findByCustomer(int id) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice where 	customerId =?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setCustomerId(id);
				invoice.setDate(result.getString("date"));
				invoice.setInvoiceId(result.getInt("invoiceNumber"));
				
				return invoice;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	
	
	
	@Override
	public Collection<InvoiceDTO> findAll() {
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from invoice ;");
			ResultSet result = statement.executeQuery();
			List<InvoiceDTO> invoices = new ArrayList<>();
			while(result.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setInvoiceId(result.getInt("invoiceNumber"));
				invoice.setDate(result.getString("date"));
				invoice.setCustomerId(result.getInt("customerId"));
				invoices.add(invoice);
				
			}
			return invoices;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		
		return null;
	}

	
	
	@Override
	public int updateInvoice(InvoiceDTO invoice) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			
			//getting customer id
			int id= invoice.getInvoiceId();
			
			PreparedStatement statement =connection.prepareStatement("select * from invoice where invoiceNumber = ?;");
		
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			
			
			if(result.next()) {
				statement = connection.prepareStatement("update invoice set  date = ? , customerId = ? where invoiceNumber =? ");
				statement.setString(1, invoice.getDate());
				statement.setInt(2, invoice.getCustomerId());
				statement.setInt(3, invoice.getInvoiceId());
				
				 int finalResult = statement.executeUpdate();
				 DatabaseConnection.closeConnection(null);
				 return finalResult;
			}
			return 0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return 0;
	}

	@Override
	public int deleteInvoice(int id) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from invoice where invoiceNumber=?;");
			statement.setInt(1, id);
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
