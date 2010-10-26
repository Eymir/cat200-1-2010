package RestOrdSystem.Administrator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

public class FoodBusiness {
	
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	public Vector returnallFood(){
		Vector all=new Vector();
		Vector food;
		
		String sql="select * from FOODTABLE";
		
		try {
			pst=new DBAccess().connOracle(sql);
			
			rs=pst.executeQuery();
			
			while(rs.next()){
				food=new Vector();
				food.add(rs.getString(1));
				food.add(rs.getString(2));			
				food.add(rs.getInt(3));
				food.add(rs.getInt(4));
				food.add(rs.getInt(5));
				food.add(rs.getString(6));
				food.add(rs.getString(7));
				all.add(food);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return all;
		
	}
	
	public boolean insertFood(FoddModel food){
		boolean flag=false;
		String sql="insert into FOODTABLE(FOOD_NAME,FOOD_TYPE,FOOD_PRICE,FOOD_QOH,FOOD_MIN,FOOD_PICT_URL,FOOD_DESCPT) values(?,?,?,?,?,?,?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1,food.getFoodName());
			pst.setString(2, food.getFoodType());
			pst.setInt(3,food.getFoodPrice());
			pst.setInt(4,food.getFoodQoh());
			pst.setInt(5,food.getFoodMin());
			pst.setString(6,food.getPicture());
			pst.setString(7,food.getDescription());
			
			if(pst.executeUpdate()>0){
				flag=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
		
	}
	
	public boolean updatePicture(FoddModel food){
		boolean flag=false;
		
		String sql="update FOODTABLE set FOOD_PICT_URL=? where lower(FOOD_NAME)=lower(?)";
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1,food.getPicture());
			pst.setString(2,food.getFoodName());
			if(pst.executeUpdate()>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}
	
	public boolean updateOtherInfo(FoddModel food){
		boolean flag=false;
		String sql="update FOODTABLE set FOOD_TYPE =? ,FOOD_PRICE =?,FOOD_QOH =?,FOOD_MIN =?,FOOD_DESCPT =?  where lower(FOOD_NAME)=lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1, food.getFoodType());
			pst.setInt(2,food.getFoodPrice());
			pst.setInt(3,food.getFoodQoh());
			pst.setInt(4,food.getFoodMin());
			pst.setString(5,food.getDescription());
			pst.setString(6,food.getFoodName());
			if(pst.executeUpdate()>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public boolean deleteFood(FoddModel model){
		boolean flag=false;
		String sql="delete from FOODTABLE where lower(FOOD_NAME)=lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1,model.getFoodName());
			if(pst.executeUpdate()>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public LinkedList<String> returnSpecialFoodList(){
		LinkedList<String> allName=new LinkedList<String>();
		
		String sql="select FOOD_NAME  from FOODTABLE";
		try {
			pst=new DBAccess().connOracle(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				allName.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allName;
	}
	
	public FoddModel returnPricePicture(FoddModel model){
		
		String sql="select FOOD_PRICE,FOOD_PICT_URL  from FOODTABLE  where lower(FOOD_NAME)=lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1, model.getFoodName());
			rs=pst.executeQuery();
			if(rs.next()){
				model.setFoodPrice(rs.getInt(1));
				model.setPicture(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
		
	}
	
	public boolean updateSpecialFood(FoddModel model){
		boolean flag=false;
		int number=0;
		
		String sql1="update FOODTABLE  set SPECIAL_FOOD=0";
		String sql2="update FOODTABLE  set SPECIAL_FOOD=1, FOOD_PRICE=? where lower(FOOD_NAME)=lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql1);
			number=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(number>0){
			try {
				pst=new DBAccess().connOracle(sql2);
				pst.setInt(1,model.getFoodPrice());
				pst.setString(2,model.getFoodName());
				
				if(pst.executeUpdate()>0){
					flag=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
		
	}

}
