
package main;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import dao.OracleConnection;
import gui.ManHinhDangNhapJFrame;
import gui.ManHinhMainJFrame_GiamDoc;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class testMain {


    public static void main(String[] args) {

        try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            printStackTrace();
        }
        
            ManHinhDangNhapJFrame a =new ManHinhDangNhapJFrame();
            a.showWindow();
    }
    
}
