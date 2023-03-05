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
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			ItemDTO item = new ItemDTO();
			item.setNumber(number);
			item.setDescription(rs.getString("itemDesc"));
			item.setPrice(rs.getInt("itemPrice"));
			item.setUnit(rs.getInt("itemUnit"));
			
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
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				ItemDTO item = new ItemDTO();
				item.setNumber(rs.getInt("itemNumber"));
				item.setDescription(name);
				item.setPrice(rs.getInt("itemPrice"));
				item.setUnit(rs.getInt("itemUnit"));
				
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
					ResultSet rs = statement.executeQuery();
					List<ItemDTO> items = new ArrayList<>();
					while(rs.next()) {
						ItemDTO item = new ItemDTO();
						item.setDescription(rs.getString("itemDesc"));
						item.setNumber(rs.getInt("itemNumber"));
						item.setPrice(rs.getInt("itemPrice"));
						item.setUnit(rs.getInt("itemUnit"));
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
			
			ResultSet rs = statement.executeQuery();
			
			
			
			if(rs.next()) {
				statement = connection.prepareStatement("update items set itemDesc =? , itemPrice = ? , itemUnit = ? where itemNumber =?;");
				statement.setString(1, item.getDescription());
				statement.setInt(2, item.getPrice());
				statement.setInt(3, item.getPrice());
				statement.setInt(4, item.getNumber());
				
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
	public int deleteById(int number) {
		// TODO Auto-generated method stub
	
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from items where itemNumber=?;");
			ps.setInt(1, number);
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

	@Override
	public int deletByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from items where itemDesc=?;");
			ps.setString(1, name);
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
