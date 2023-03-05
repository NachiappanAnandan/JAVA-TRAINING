package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.InvoiceDTO;
import DTO.ItemDTO;
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
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setInvoiceId(id);
				invoice.setDate(rs.getString("date"));
				invoice.setCustomerId(rs.getInt("customerId"));
				
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
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setCustomerId(id);
				invoice.setDate(rs.getString("date"));
				invoice.setInvoiceId(rs.getInt("invoiceNumber"));
				
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
			ResultSet rs = statement.executeQuery();
			List<InvoiceDTO> invoices = new ArrayList<>();
			while(rs.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setInvoiceId(rs.getInt("invoiceNumber"));
				invoice.setDate(rs.getString("date"));
				invoice.setCustomerId(rs.getInt("customerId"));
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
			
			ResultSet rs = statement.executeQuery();
			
			
			
			if(rs.next()) {
				statement = connection.prepareStatement("update invoice set  date = ? , customerId = ? where invoiceNumber =? ");
				statement.setString(1, invoice.getDate());
				statement.setInt(2, invoice.getCustomerId());
				statement.setInt(3, invoice.getInvoiceId());
				
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
	public int deleteInvoice(int id) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from invoice where invoiceNumber=?;");
			ps.setInt(1, id);
			int n = ps.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			
			//If there's an exception, it will be rolled back to the previous state
			DatabaseConnection.closeConnection(e);
			return 0;
		}
	}
}
