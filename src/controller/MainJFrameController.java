/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import view.DichVuJPanel;
import view.QuanLyKhachHangJPanel;
import view.QuanLyNhanVienJPanel;
import view.QuanLyPhongJPanel;

/**
 *
 * @author Tuan
 */
public class MainJFrameController {
    private JPanel jpnQuanLyKhachHang, jpnQuanLyPhong, jpnDichVu, jpnInHoaDon, jpnQuanLyNhanVien1,jpnThongKeDoanhSo,jpnView;
    
     public MainJFrameController(JPanel jpnQuanLyKhachhang, JPanel jpnQuanLyPhong, 
            JPanel jpnDichVu, JPanel jpnInHoaDon, JPanel jpnQuanLyNhanVien1,  JPanel jpnThongKeDoanhSo,JPanel jpnView){
         this.jpnQuanLyKhachHang=jpnQuanLyKhachhang;
         this.jpnQuanLyPhong=jpnQuanLyPhong;
         this.jpnDichVu=jpnDichVu;
         this.jpnInHoaDon=jpnInHoaDon;
         this.jpnQuanLyNhanVien1=jpnQuanLyNhanVien1;
         this.jpnThongKeDoanhSo=jpnThongKeDoanhSo;
         this.jpnView=jpnView;
         addEvents();
     }

    public void addEvents(){
        this.jpnQuanLyKhachHang.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                QuanLyKhachHangJPanel khachHangJPanel=new QuanLyKhachHangJPanel();
                jpnView.removeAll();
                jpnView.setLayout(new BorderLayout());
                jpnView.add(khachHangJPanel);
                jpnView.validate();
                jpnView.repaint();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        this.jpnQuanLyNhanVien1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuanLyNhanVienJPanel khJPanel =new QuanLyNhanVienJPanel();
                jpnView.removeAll();
                jpnView.setLayout(new BorderLayout());
                jpnView.add(khJPanel);
                jpnView.validate();
                jpnView.repaint();
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        );
        
        jpnQuanLyPhong.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuanLyPhongJPanel phongJPanel=new QuanLyPhongJPanel();
                jpnView.removeAll();
                jpnView.setLayout(new BorderLayout());
                jpnView.add(phongJPanel);
                jpnView.validate();
                jpnView.repaint();
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        this.jpnDichVu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DichVuJPanel dichvuPanel=new DichVuJPanel();
                jpnView.removeAll();
                jpnView.setLayout(new BorderLayout());
                jpnView.add(dichvuPanel);
                jpnView.validate();
                jpnView.repaint();
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
        
}
