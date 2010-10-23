package RestOrdSystem.Administrator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
				food.add(rs.getInt(1));
				food.add(rs.getString(2));
				food.add(rs.getString(3));
				food.add(rs.getInt(4));
				food.add(rs.getInt(5));
				food.add(rs.getInt(6));
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

}
