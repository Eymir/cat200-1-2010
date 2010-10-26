package RestOrdSystem.Administrator;


import java.sql.*;

public class DBAccess {

    private static final String DRIVERNAME="oracle.jdbc.driver.OracleDriver";
 

    //private static final String CONNECTIONSTRING="jdbc:oracle:thin:@10.211.1.196:1521:orcl";
    private static final String CONNECTIONSTRING="jdbc:oracle:thin:@10.211.223.79:1521:orcl";
    private static final String USERNAME="hr";
    private static final String PASSWORD="tiger";
    private static Connection conn = null;
    private static PreparedStatement  pst=null;

     public static PreparedStatement  connOracle(String sql) throws SQLException, ClassNotFoundException{

              Class.forName(DRIVERNAME);
              conn = DriverManager.getConnection(CONNECTIONSTRING,USERNAME,PASSWORD);
	          pst=conn.prepareStatement(sql);
              return pst;

     }

   
}


