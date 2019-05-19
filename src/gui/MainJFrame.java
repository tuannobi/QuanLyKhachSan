/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

//import bean.DanhMucBean;
//import controller.ChuyenManHinhController;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tuan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        }   
        
    
    public void showWindow(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jpnQuanLyKhachhang = new javax.swing.JPanel();
        jlbQuanLyKhachhang = new javax.swing.JLabel();
        jpnThuePhong = new javax.swing.JPanel();
        jlbThuePhong = new javax.swing.JLabel();
        jpnDichVu = new javax.swing.JPanel();
        jlbDichVu = new javax.swing.JLabel();
        jpnInHoaDon = new javax.swing.JPanel();
        jlbInHoaDon = new javax.swing.JLabel();
        jpnThongKeDoanhSo = new javax.swing.JPanel();
        jlbThongKeDoanhSo = new javax.swing.JLabel();
        jpnQuanLyNhanVien1 = new javax.swing.JPanel();
        jlbQuanLyNhanVien1 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý khách sạn");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpnMenu.setBackground(new java.awt.Color(51, 51, 51));

        jpnTitle.setBackground(new java.awt.Color(216, 19, 19));

        jlbTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitle.setText("QUẢN LÝ KHÁCH SẠN");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLyKhachhang.setBackground(new java.awt.Color(76, 157, 80));
        jpnQuanLyKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnQuanLyKhachhangMouseClicked(evt);
            }
        });

        jlbQuanLyKhachhang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbQuanLyKhachhang.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_khachhang.png"))); // NOI18N
        jlbQuanLyKhachhang.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jpnQuanLyKhachhangLayout = new javax.swing.GroupLayout(jpnQuanLyKhachhang);
        jpnQuanLyKhachhang.setLayout(jpnQuanLyKhachhangLayout);
        jpnQuanLyKhachhangLayout.setHorizontalGroup(
            jpnQuanLyKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyKhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyKhachhangLayout.setVerticalGroup(
            jpnQuanLyKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyKhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThuePhong.setBackground(new java.awt.Color(76, 157, 80));
        jpnThuePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnThuePhongMouseClicked(evt);
            }
        });

        jlbThuePhong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbThuePhong.setForeground(new java.awt.Color(255, 255, 255));
        jlbThuePhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phong.png"))); // NOI18N
        jlbThuePhong.setText("Phòng");

        javax.swing.GroupLayout jpnThuePhongLayout = new javax.swing.GroupLayout(jpnThuePhong);
        jpnThuePhong.setLayout(jpnThuePhongLayout);
        jpnThuePhongLayout.setHorizontalGroup(
            jpnThuePhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThuePhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThuePhongLayout.setVerticalGroup(
            jpnThuePhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThuePhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDichVu.setBackground(new java.awt.Color(76, 157, 80));

        jlbDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbDichVu.setForeground(new java.awt.Color(255, 255, 255));
        jlbDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dichvu.png"))); // NOI18N
        jlbDichVu.setText("Dịch vụ");
        jlbDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbDichVuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnDichVuLayout = new javax.swing.GroupLayout(jpnDichVu);
        jpnDichVu.setLayout(jpnDichVuLayout);
        jpnDichVuLayout.setHorizontalGroup(
            jpnDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnDichVuLayout.setVerticalGroup(
            jpnDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnInHoaDon.setBackground(new java.awt.Color(76, 157, 80));

        jlbInHoaDon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbInHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_hoadon.png"))); // NOI18N
        jlbInHoaDon.setText("Hóa đơn");
        jlbInHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbInHoaDonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnInHoaDonLayout = new javax.swing.GroupLayout(jpnInHoaDon);
        jpnInHoaDon.setLayout(jpnInHoaDonLayout);
        jpnInHoaDonLayout.setHorizontalGroup(
            jpnInHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnInHoaDonLayout.setVerticalGroup(
            jpnInHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongKeDoanhSo.setBackground(new java.awt.Color(76, 157, 80));

        jlbThongKeDoanhSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbThongKeDoanhSo.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKeDoanhSo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_thongke.png"))); // NOI18N
        jlbThongKeDoanhSo.setText("Thống kê doanh số");
        jlbThongKeDoanhSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbThongKeDoanhSoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnThongKeDoanhSoLayout = new javax.swing.GroupLayout(jpnThongKeDoanhSo);
        jpnThongKeDoanhSo.setLayout(jpnThongKeDoanhSoLayout);
        jpnThongKeDoanhSoLayout.setHorizontalGroup(
            jpnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeDoanhSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKeDoanhSoLayout.setVerticalGroup(
            jpnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeDoanhSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLyNhanVien1.setBackground(new java.awt.Color(76, 157, 80));

        jlbQuanLyNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbQuanLyNhanVien1.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_nhavien.png"))); // NOI18N
        jlbQuanLyNhanVien1.setText("Quản lý nhân viên");
        jlbQuanLyNhanVien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQuanLyNhanVien1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnQuanLyNhanVien1Layout = new javax.swing.GroupLayout(jpnQuanLyNhanVien1);
        jpnQuanLyNhanVien1.setLayout(jpnQuanLyNhanVien1Layout);
        jpnQuanLyNhanVien1Layout.setHorizontalGroup(
            jpnQuanLyNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyNhanVien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyNhanVien1Layout.setVerticalGroup(
            jpnQuanLyNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyNhanVien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQuanLyKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQuanLyNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThuePhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKeDoanhSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnQuanLyKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnQuanLyKhachhangMouseClicked

        QuanLyKhachHangJPanel khJPanel =new QuanLyKhachHangJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(khJPanel,BorderLayout.CENTER);     
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnQuanLyKhachhangMouseClicked

    private void jlbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDichVuMouseClicked
        // TODO add your handling code here:
        DichVuJPanel dvPanel=new DichVuJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(dvPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jlbDichVuMouseClicked

    private void jlbQuanLyNhanVien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQuanLyNhanVien1MouseClicked
        
        try {
            // TODO add your handling code here:
            
            QuanLyNhanVienJPanel nvPanel=new QuanLyNhanVienJPanel();
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            jpnView.add(nvPanel);
            jpnView.repaint();
            jpnView.validate();
        } catch (SQLException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jlbQuanLyNhanVien1MouseClicked

    private void jpnThuePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnThuePhongMouseClicked
        QuanLyPhongJPanel phongPanel=new QuanLyPhongJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(phongPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnThuePhongMouseClicked

    private void jlbInHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInHoaDonMouseClicked
        // TODO add your handling code here:
        InHoaDonJPanel hoaDonJPanel = new InHoaDonJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(hoaDonJPanel);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jlbInHoaDonMouseClicked

    private void jlbThongKeDoanhSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbThongKeDoanhSoMouseClicked
        // TODO add your handling code here:
        ThongKeDoanhThuJPanel thongkeJPanel=new ThongKeDoanhThuJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(thongkeJPanel);
        jpnView.repaint();
        jpnView.validate();
        
    }//GEN-LAST:event_jlbThongKeDoanhSoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbDichVu;
    private javax.swing.JLabel jlbInHoaDon;
    private javax.swing.JLabel jlbQuanLyKhachhang;
    private javax.swing.JLabel jlbQuanLyNhanVien1;
    private javax.swing.JLabel jlbThongKeDoanhSo;
    private javax.swing.JLabel jlbThuePhong;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jpnDichVu;
    private javax.swing.JPanel jpnInHoaDon;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQuanLyKhachhang;
    private javax.swing.JPanel jpnQuanLyNhanVien1;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThongKeDoanhSo;
    private javax.swing.JPanel jpnThuePhong;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
