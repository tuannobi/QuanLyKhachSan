
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
       
            Class.forName("oracle.jdbc.driver.OracleDriver"); //khai báo driver tương ứng với library 
//            String strConnString="jdbc:oracle:thin:@localhost:1521/orcl";

           String strConnString="jdbc:oracle:thin:@localhost:1521/HHY";
            conn=DriverManager.getConnection(strConnString, "newDataKS","123456");
//            if (conn!=null){
//                System.out.println("Kết nối thành công");
//                conn.close();
//            }
            return conn;    
        } catch (Exception e) {
            System.err.println("Kết nối thất bại "+e);
        }
    return null;
    }
}
