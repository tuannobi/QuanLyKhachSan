/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.minipopupController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.DichVu;
import service.DichVuService;

/**
 *
 * @author COMPUTER
 */
public class SuaDichVuController {
    private JTextField jtfMaDichVu;
    private JTextField jtfTenDichVu;
    private JTextField jtfGiaTien;
    private JButton jbtLuu;
    JDialog suaDichVuJDialog;
    private JDialog SuaDV;
    
    DichVu dv=null;
    DichVuService dvService = null;

    public SuaDichVuController(JTextField jtfMaDichVu, JTextField jtfTenDichVu, JTextField jtfGiaTien,JButton jbtLuu) {
        this.jtfMaDichVu = jtfMaDichVu;
        this.jtfTenDichVu = jtfTenDichVu;
        this.jtfGiaTien = jtfGiaTien;
        this.jbtLuu=jbtLuu;
        
        Events();
    }
    
    public void Events()
    {
        
        jbtLuu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               DichVu dv=new DichVu();
                dv.setMaDichVu(Integer.parseInt(jtfMaDichVu.getText()));
                dv.setTenDichVu(jtfTenDichVu.getText());
                dv.setGiaTien(Float.parseFloat(jtfGiaTien.getText()));

                DichVuService dvService=new DichVuService();
                int flag=dvService.capNhatDuLieu(dv);
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
    
