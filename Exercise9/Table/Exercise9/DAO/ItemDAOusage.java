package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import DTO.ItemDTO;
import Table.DatabaseConnection;


public class ItemDAOusage implements ItemDAO{

	@Override
	public ItemDTO findById(int number) {
		// TODO Auto-generated method stub
		
		try {
		Connection connection  = DatabaseConnection.getConnection();
//		System.out.println(connection);
		PreparedStatement statement =connection.prepareStatement("select * from items where itemNumber =?");
		statement.setInt(1, number);
		ResultSet rseult = statement.executeQuery();
		while(rseult.next()) {
			ItemDTO item = new ItemDTO();
			item.setNumber(number);
			item.setDescription(rseult.getString("itemDesc"));
			item.setPrice(rseult.getInt("itemPrice"));
			item.setUnit(rseult.getInt("itemUnit"));
			
			return item;
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		DatabaseConnection.closeConnection(e);
	}
		
		return null;
	}

	
	
	@Override
	public ItemDTO findByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			PreparedStatement statement =connection.prepareStatement("select * from items where itemDesc =?");
			statement.setString(1, name);
			ResultSet rseult = statement.executeQuery();
			while(rseult.next()) {
				ItemDTO item = new ItemDTO();
				item.setNumber(rseult.getInt("itemNumber"));
				item.setDescription(name);
				item.setPrice(rseult.getInt("itemPrice"));
				item.setUnit(rseult.getInt("itemUnit"));
				
				return item;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	
	
	@Override
	public Collection<ItemDTO> findAll() {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				try {
					Connection connection  = DatabaseConnection.getConnection();
//					System.out.println(connection);
					PreparedStatement statement =connection.prepareStatement("select * from items ");
					ResultSet rseult = statement.executeQuery();
					List<ItemDTO> items = new ArrayList<>();
					while(rseult.next()) {
						ItemDTO item = new ItemDTO();
						item.setDescription(rseult.getString("itemDesc"));
						item.setNumber(rseult.getInt("itemNumber"));
						item.setPrice(rseult.getInt("itemPrice"));
						item.setUnit(rseult.getInt("itemUnit"));
						items.add(item);
					}
					return items;
					
					
				} catch (Exception e) {
					// TODO: handle exception
					DatabaseConnection.closeConnection(e);
				}
				
		
		
		return null;
	}

	@Override
	public int updateItem(ItemDTO item) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection  = DatabaseConnection.getConnection();
//			System.out.println(connection);
			
			//getting customer id
			int id= item.getNumber();
			
			PreparedStatement statement =connection.prepareStatement("select * from items where itemNumber = ?;");
		
			statement.setInt(1, id);
			
			ResultSet rseult = statement.executeQuery();
			
			
			
			if(rseult.next()) {
				statement = connection.prepareStatement("update items set itemDesc =? , itemPrice = ? , itemUnit = ? where itemNumber =?;");
				statement.setString(1, item.getDescription());
				statement.setInt(2, item.getPrice());
				statement.setInt(3, item.getPrice());
				statement.setInt(4, item.getNumber());
				
				 int result = statement.executeUpdate();
				 DatabaseConnection.closeConnection(null);
				 return result;
			}
			return 0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		
		return 0;
	}

	@Override
	public int deleteById(int number) {
		// TODO Auto-generated method stub
	
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from items where itemNumber=?;");
			statement.setInt(1, number);
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

	@Override
	public int deletByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from items where itemDesc=?;");
			statement.setString(1, name);
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
