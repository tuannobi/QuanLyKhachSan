
package service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tuan
 */
public class OracleConnection {
    protected Connection conn;
    public OracleConnection(){
    try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            String strConnString="jdbc:oracle:thin:@localhost:1521/HHY";
            conn=DriverManager.getConnection(strConnString, "QLKS","123456");
//            if (conn!=null){
//                System.out.println("Ket noi thanh cong");
//                conn.close();
//            }
//            else{
//                System.out.println("Ket noi that bai");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
