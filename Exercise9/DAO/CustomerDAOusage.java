package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.CustomerDTO;
import Table.DatabaseConnection;


public class CustomerDAOusage implements CustomerDAO{

	@Override
	public CustomerDTO findById(int id) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from customers where customerId =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setId(id);
				customer.setName(rs.getNString("customerName"));
				customer.setAddress(rs.getString("customerAddress"));
				return customer;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO findByName(String name) {
		// TODO Auto-generated method stub
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from customers where customerName =?");
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(name);
				customer.setId(rs.getInt("customerId"));
				customer.setAddress(rs.getString("customerAddress"));
				return customer;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		
		
		return null;
	}

	@Override
	public Collection<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from customers ");
			ResultSet rs = statement.executeQuery();
			List<CustomerDTO> customers = new ArrayList<>();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(rs.getString("customerName"));
				customer.setId(rs.getInt("customerId"));
				customer.setAddress(rs.getString("customerAddress"));
				 customers.add(customer);
			}
			return customers;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		
		
		
		return null;
	}

	@Override
	public int updateCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			
			//getting customer id
			int id= customer.getId();
			PreparedStatement statement =connection.prepareStatement("select * from customers where customerId = ?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			if(rs.next()) {
				statement = connection.prepareStatement("update customers set customerName =? , customerAddress = ? where customerId =?;");
				statement.setString(1, customer.getName());
				statement.setString(2, customer.getAddress());
				statement.setInt(3, customer.getId());
				
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
	public int DeleteById(int id) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customers where customerId=?");
			statement.setInt(1, id);
			int n = statement.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			
			//If there's an exception, it will be rolled back to the previous state
			DatabaseConnection.closeConnection(e);
			return 0;
		}
	}

	@Override
	public int DeleteByName(String Name) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customers where customerName=?");
			statement.setString(1, Name);
			int n = statement.executeUpdate();
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


