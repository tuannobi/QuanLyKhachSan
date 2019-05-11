
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Clock;

/**
 *
 * @author Tuan
 */
public class OracleConnection {
    public static Connection conn=null;
    
    public static Connection openConnection(){
    try {
       
            Class.forName("oracle.jdbc.driver.OracleDriver");  

//            String strConnString="jdbc:oracle:thin:@localhost:1521/orcl";
//            conn=DriverManager.getConnection(strConnString, "newDataKS","123456");
            String strConnString="jdbc:oracle:thin:@localhost:1521/HHY";
            conn=DriverManager.getConnection(strConnString, "newDataKS","123456");
//            if (conn!=null){
//                System.out.println("Ket noi thanh cong");
//                conn.close();
//            }
//            else{
//                System.out.println("Ket noi that bai");
//            }
            return conn;    
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }

       public static void main(String[] args) throws SQLException {
        
        Connection c=openConnection();
        System.out.println(c.toString());
        c.close();
        
    }

   
}
