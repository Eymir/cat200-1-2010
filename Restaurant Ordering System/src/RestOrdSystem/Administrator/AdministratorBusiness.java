package RestOrdSystem.Administrator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

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
	
	
	
	public Vector returnAlladmin(){
		
		Vector all=new Vector();
		Vector admin;
		String sql="select * from ADMINTABLE ";		
		try {
			pst=new DBAccess().connOracle(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				admin=new Vector();
				admin.add(rs.getString(1));
				admin.add(rs.getString(2));				
				all.add(admin);
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
	
	public boolean insterAdministrator(AdministratorModel ad){
		boolean flag=false;
		String sql="insert into ADMINTABLE values(?,?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1, ad.getUserID());
			pst.setString(2, ad.getPassword());
			
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
	
	
	public boolean updatePassword(AdministratorModel ad){
		boolean flag=false;
		String sql="update ADMINTABLE set USER_PASSWORD =? where lower(USER_ID) = lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1, ad.getPassword());
			pst.setString(2,ad.getUserID());
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
	
	public boolean deleteAdmin(AdministratorModel ad){
		boolean flag=false;
		String sql="delete from ADMINTABLE where lower(USER_ID) = lower(?)";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1,ad.getUserID());
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

}
