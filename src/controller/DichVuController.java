/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import miniPopup.SuaDichVuJDialog;
import miniPopup.ThemDichVuJDialog;
import model.DichVu;
import service.DichVuService;

/**
 *
 * @author user
 */
public class DichVuController {
    
    private JTextField jftTimKiem;
    private JButton jbtCapNhat;
    private JButton jbtXoa;
    private JButton jbtThem;
    DichVuService dvService;
    DefaultTableModel dtmDichVu;
    ArrayList<DichVu> listDV;
    DichVu dichvu=new DichVu(0,"",0);
    JTable tbDichVu;
    SuaDichVuJDialog suaDichVuJDialog;
    ThemDichVuJDialog themDichVuJDialog;

    public DichVuController(JTextField jftTimKiem, JButton jbtCapNhat, JButton jbtXoa, 
            JButton jbtThem, DichVuService dvService, DefaultTableModel dtmDichVu, 
            ArrayList<DichVu> listDV, DichVu dichvu, JTable tbDichVu,SuaDichVuJDialog suaDichVuJDialog,
            ThemDichVuJDialog themDichVuJDialog ) {
        this.jftTimKiem = jftTimKiem;
        this.jbtCapNhat = jbtCapNhat;
        this.jbtXoa = jbtXoa;
        this.jbtThem = jbtThem;
        this.dvService = dvService;
        this.dtmDichVu = dtmDichVu;
        this.listDV = listDV;
        this.dichvu = dichvu;
        this.tbDichVu = tbDichVu;
        this.suaDichVuJDialog=suaDichVuJDialog;
        this.themDichVuJDialog=themDichVuJDialog;
        
        addEvents();
        hienThiDuLieuDichVu();
    }
    public void addEvents(){
        tbDichVu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row=tbDichVu.getSelectedRow();
                if (row==-1)
                    return;
                dichvu=listDV.get(row); //lấy giá trị kh khi click chuột vào
                
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        jbtCapNhat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dichvu==null)
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng bạn muốn chỉnh sửa");
                else
                {
                    suaDichVuJDialog=new SuaDichVuJDialog();
                    suaDichVuJDialog.showWindows();
                    suaDichVuJDialog.setTextMaDV(dichvu.getMaDichVu()+"");
                    suaDichVuJDialog.setTextTenDichVu(dichvu.getTenDichVu());
                    suaDichVuJDialog.setTextGiaTien(dichvu.getGiaTien());
            }
            }
        });
        
        jbtXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dichvu==null)
                {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn dịch vụ muốn xóa!");
                }
                else
                {
                    int result=JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa dịch vụ này không?","Warning", JOptionPane.YES_NO_OPTION);
                    if (result==JOptionPane.YES_OPTION){
                        int count=dvService.xoaDuLieu(dichvu.getMaDichVu());
                        if (count!=-1){
                        JOptionPane.showMessageDialog(null, "Đã xóa thành công "+count+" dịch vụ");
                        refreshData();
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Không tìm thấy dịch vụ cần xóa");
                    }
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jbtThem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    themDichVuJDialog=new ThemDichVuJDialog();
                    themDichVuJDialog.showWindows();
//                    themDichVuJDialog.setTextTenDichVu(dichvu.getTenDichVu());
//                    themDichVuJDialog.setTextGiaTien(dichvu.getGiaTien());
            }
        });
        
    }
    
   
   
   private void refreshData(){
       dtmDichVu.setRowCount(0);
      // hienThiDuLieuDichVu();
       
   }
    
    
   public void hienThiDuLieuDichVu(){
       // Giúp cập nhật bảng sau mỗi thao tác
      
       dtmDichVu=(DefaultTableModel)tbDichVu.getModel();
       dvService=new DichVuService();
       listDV=new ArrayList<DichVu>();
       listDV=dvService.getDuLieuDichVu();
       for (DichVu dv : listDV){
           Vector<Object> vec=new Vector<Object>();
           vec.add(dv.getMaDichVu());
           vec.add(dv.getTenDichVu());
           vec.add(dv.getGiaTien());
           dtmDichVu.addRow(vec);
           tbDichVu.setModel(dtmDichVu);
       }
   }
    
    
}
