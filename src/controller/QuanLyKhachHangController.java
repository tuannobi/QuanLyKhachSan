/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import miniPopup.HienThiBangTraPhong;
import miniPopup.SuaKhachHangJDialog;
import model.KhachHang;
import service.KhachHangService;
import view.QuanLyKhachHangJPanel;
import view.QuanLyPhongJPanel;


public class QuanLyKhachHangController {

    SuaKhachHangJDialog suaKhachHangJDialog;
    KhachHangService khService;
    DefaultTableModel dtmKhachHang;
    ArrayList<KhachHang> listKH;
    KhachHang khachhang;
    JButton jbtCapNhat, jbtXoa, jbtTimKiem;
    JTextField jtfTimKiem;
    JTable tbKhachHang;
    
    public QuanLyKhachHangController(SuaKhachHangJDialog suaKhachHangJDialog,
    KhachHangService khService,
    DefaultTableModel dtmKhachHang,
    ArrayList<KhachHang> listKH,
    KhachHang khachhang,JButton jbtCapNhat, JButton jbtXoa, JButton jbtTimKiem, JTextField jtfTimKiem, JTable tbKhachHang) {
        this.suaKhachHangJDialog=suaKhachHangJDialog;
        this.dtmKhachHang=dtmKhachHang;
        this.khService=khService;
        this.listKH=listKH;
        this.jbtCapNhat=jbtCapNhat;
        this.jbtTimKiem=jbtTimKiem;
        this.jbtXoa=jbtXoa;
        this.jtfTimKiem=jtfTimKiem;
        this.khachhang=khachhang;
        this.tbKhachHang=tbKhachHang;
        
        addEvents();
        hienThiDuLieuKhachHang();
    }
   
    public void addEvents(){
        tbKhachHang.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row=tbKhachHang.getSelectedRow();
                if (row==-1)
                    return;
                khachhang=listKH.get(row); //lấy giá trị kh khi click chuột vào
                
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jbtCapNhat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (khachhang==null)
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng bạn muốn chỉnh sửa");
                else
                {
                    suaKhachHangJDialog=new SuaKhachHangJDialog();
                    suaKhachHangJDialog.showWindows();
                    suaKhachHangJDialog.setTextHoTen(khachhang.getHoTen());
                    suaKhachHangJDialog.setTextMaKH(khachhang.getMaKH());
                    /*
                    chuyển Date sang string
                    */
                    SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");                 
                    suaKhachHangJDialog.setTextNgaySinh(formater.format(khachhang.getNgaySinh()));
                    suaKhachHangJDialog.setTextCMND( String.valueOf(khachhang.getCMND()));
                    suaKhachHangJDialog.setTextGioiTinh(khachhang.getGioiTinh());
                    
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            }
        });
        
        jbtXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (khachhang==null)
                {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng muốn xóa!");
                }
                else
                {
                    int result=JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa khách hàng này không?","Warning", JOptionPane.YES_NO_OPTION);
                    if (result==JOptionPane.YES_OPTION){
                        int count=khService.xoaDuLieu(khachhang.getMaKH());
                        if (count!=-1){
                        JOptionPane.showMessageDialog(null, "Đã xóa thành công "+count+" khách hàng");
                        refreshData();
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Không tìm thấy khách hàng cần xóa");
                    }
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
   
   private void refreshData(){
       dtmKhachHang.setRowCount(0);
       hienThiDuLieuKhachHang();
       
   }
   
   public void hienThiDuLieuKhachHang(){
       // Giúp cập nhật bảng sau mỗi thao tác
      
       dtmKhachHang=(DefaultTableModel)tbKhachHang.getModel();
       khService=new KhachHangService();
       listKH=new ArrayList<KhachHang>();
       listKH=khService.getDuLieuKhachHang();
       for (KhachHang kh : listKH){
           Vector<Object> vec=new Vector<Object>();
           vec.add(kh.getMaKH());
           vec.add(kh.getHoTen());
           vec.add(kh.getNgaySinh());
           vec.add(kh.getCMND());
           vec.add(kh.getGioiTinh());
           dtmKhachHang.addRow(vec);
           tbKhachHang.setModel(dtmKhachHang);
       }
   }

}
