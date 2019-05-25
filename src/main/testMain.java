
package main;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import dao.OracleConnection;
import gui.MainJFrame;
import java.sql.Connection;
import javax.swing.UIManager;


public class testMain {


    public static void main(String[] args) {

        try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            printStackTrace();
        }
        
    MainJFrame a=new MainJFrame();
    a.showWindow();
    }
    
}
