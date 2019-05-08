/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dto.DichVu;
import dao.DichVuDAO;

/**
 *
 * @author COMPUTER
 */
public class ThemDichVuController {
    private JTextField jtfTenDichVu;
    private JTextField jtfGiaTien;
    private JButton jbtLuu;
    JDialog ThemDichVuJDialog;
    private JDialog ThemDV;
    
    DichVu dv=null;
    DichVuDAO dvService = null;

    public ThemDichVuController(JTextField jtfTenDichVu, JTextField jtfGiaTien, JButton jbtLuu) {
        this.jtfTenDichVu = jtfTenDichVu;
        this.jtfGiaTien = jtfGiaTien;
        this.jbtLuu = jbtLuu;
        
        Events();
    }
    
        public void Events()
    {
        
        jbtLuu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               DichVu dv=new DichVu(0,"",0);
                dv.setTenDichVu(jtfTenDichVu.getText());
                dv.setGiaTien(Float.parseFloat(jtfGiaTien.getText()));

                DichVuDAO dvService=new DichVuDAO();
                int flag=dvService.themMoiMotDichVu(dv);
                if (flag==-1)
                {
                    JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Cập nhật thành công" );
                    
                }
            }
        
            });
    
    }
}
