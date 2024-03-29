package RestOrdSystem.Administrator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ReceiptBusiness {
	
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	
	public Vector returnallReceipt(){
		Vector all=new Vector();
		Vector receipt;
		
		String sql="select * from RECEIPTTABLE ";
		
		try {
			pst=new DBAccess().connOracle(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				receipt=new Vector();
				receipt.add(rs.getInt(1));
				
				receipt.add(rs.getDate(2));
				receipt.add(rs.getInt(3));
				receipt.add(rs.getDouble(4));
				all.add(receipt);
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
	
	public Vector searchThroughDate(ReceiptModel model){
		Vector all=new Vector();
		Vector receipt;
		String sql="select * from RECEIPTTABLE where TO_CHAR(RECEIPT_DATE,'YYYY-MM-DD') =?";
		
		try {
			pst=new DBAccess().connOracle(sql);
			pst.setString(1,model.getReceiptDate().toString());
			
			rs=pst.executeQuery();
			
			
			while(rs.next()){
				receipt=new Vector();
				receipt.add(rs.getInt(1));
				System.out.println("RS="+rs.getInt(1));
				receipt.add(rs.getDate(2));
				receipt.add(rs.getInt(3));
				receipt.add(rs.getDouble(4));
				all.add(receipt);
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
