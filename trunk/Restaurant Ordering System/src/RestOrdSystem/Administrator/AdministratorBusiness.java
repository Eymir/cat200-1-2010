package RestOrdSystem.Administrator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministratorBusiness {
	
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	
	public boolean judgeLogIn(AdministratorModel admin){
		
		boolean flag=false;
		
		String sql="select * from ADMINTABLE  where lower(USER_ID) =lower(?) and lower(USER_PASSWORD) =lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1, admin.getUserID());
			pst.setString(2,admin.getPassword());
			
			rs=pst.executeQuery();
			
			if(rs.next()){
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

}
