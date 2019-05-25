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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jpnQuanLyKhachHang = new javax.swing.JPanel();
        jlbQuanLyKhachHang = new javax.swing.JLabel();
        jpnQuanLyNhanVien = new javax.swing.JPanel();
        jlbQuanLyNhanVien = new javax.swing.JLabel();
        jpnThuePhong = new javax.swing.JPanel();
        jlbThuePhong = new javax.swing.JLabel();
        jpnDichVu = new javax.swing.JPanel();
        jlbDichVu = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        jlbHoaDon = new javax.swing.JLabel();
        jpnThongKeDoanhThu = new javax.swing.JPanel();
        jlbThongKeDoanhThu = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý khách sạn");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpnRoot.setBackground(new java.awt.Color(153, 153, 255));

        jpnMenu.setBackground(new java.awt.Color(0, 102, 51));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUẢN LÝ KHÁCH SẠN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLyKhachHang.setBackground(new java.awt.Color(0, 153, 51));
        jpnQuanLyKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnQuanLyKhachHangMouseClicked(evt);
            }
        });

        jlbQuanLyKhachHang.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbQuanLyKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbQuanLyKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_khachhang.png"))); // NOI18N
        jlbQuanLyKhachHang.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jpnQuanLyKhachHangLayout = new javax.swing.GroupLayout(jpnQuanLyKhachHang);
        jpnQuanLyKhachHang.setLayout(jpnQuanLyKhachHangLayout);
        jpnQuanLyKhachHangLayout.setHorizontalGroup(
            jpnQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyKhachHangLayout.setVerticalGroup(
            jpnQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLyNhanVien.setBackground(new java.awt.Color(0, 153, 51));
        jpnQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnQuanLyNhanVienMouseClicked(evt);
            }
        });

        jlbQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_nhavien.png"))); // NOI18N
        jlbQuanLyNhanVien.setText("Quản lý nhân viên");

        javax.swing.GroupLayout jpnQuanLyNhanVienLayout = new javax.swing.GroupLayout(jpnQuanLyNhanVien);
        jpnQuanLyNhanVien.setLayout(jpnQuanLyNhanVienLayout);
        jpnQuanLyNhanVienLayout.setHorizontalGroup(
            jpnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyNhanVienLayout.setVerticalGroup(
            jpnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThuePhong.setBackground(new java.awt.Color(0, 153, 51));
        jpnThuePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnThuePhongMouseClicked(evt);
            }
        });

        jlbThuePhong.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThuePhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDichVu.setBackground(new java.awt.Color(0, 153, 51));
        jpnDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnDichVuMouseClicked(evt);
            }
        });

        jlbDichVu.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbDichVu.setForeground(new java.awt.Color(255, 255, 255));
        jlbDichVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dichvu.png"))); // NOI18N
        jlbDichVu.setText("Dịch vụ");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnHoaDon.setBackground(new java.awt.Color(0, 153, 51));
        jpnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnHoaDonMouseClicked(evt);
            }
        });

        jlbHoaDon.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_hoadon.png"))); // NOI18N
        jlbHoaDon.setText("Hóa đơn");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongKeDoanhThu.setBackground(new java.awt.Color(0, 153, 51));
        jpnThongKeDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnThongKeDoanhThuMouseClicked(evt);
            }
        });

        jlbThongKeDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbThongKeDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKeDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbThongKeDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_thongke.png"))); // NOI18N
        jlbThongKeDoanhThu.setText("Thống kê doanh thu");

        javax.swing.GroupLayout jpnThongKeDoanhThuLayout = new javax.swing.GroupLayout(jpnThongKeDoanhThu);
        jpnThongKeDoanhThu.setLayout(jpnThongKeDoanhThuLayout);
        jpnThongKeDoanhThuLayout.setHorizontalGroup(
            jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKeDoanhThuLayout.setVerticalGroup(
            jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
<<<<<<< HEAD
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addGap(0, 1108, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
>>>>>>> 3759d9d23007bd4a613954ad86ea360404837f26
=======
            .addGap(0, 1103, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
>>>>>>> parent of 3759d9d... Chỉnh lại
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
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jpnRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnQuanLyKhachHangMouseClicked
        // TODO add your handling code here:
        QuanLyKhachHangJPanel khJPanel =new QuanLyKhachHangJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(khJPanel,BorderLayout.CENTER);     
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnQuanLyKhachHangMouseClicked

    private void jpnQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnQuanLyNhanVienMouseClicked
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jpnQuanLyNhanVienMouseClicked

    private void jpnThuePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnThuePhongMouseClicked
        // TODO add your handling code here:
        QuanLyPhongJPanel phongPanel=new QuanLyPhongJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(phongPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnThuePhongMouseClicked

    private void jpnDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnDichVuMouseClicked
        // TODO add your handling code here:
        DichVuJPanel dvPanel=new DichVuJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(dvPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnDichVuMouseClicked

    private void jpnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnHoaDonMouseClicked
        // TODO add your handling code here:
        InHoaDonJPanel hoaDonJPanel = new InHoaDonJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(hoaDonJPanel);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnHoaDonMouseClicked

    private void jpnThongKeDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnThongKeDoanhThuMouseClicked
        // TODO add your handling code here:
        ThongKeJPanel thongKeJPanel = new ThongKeJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(thongKeJPanel);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnThongKeDoanhThuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbDichVu;
    private javax.swing.JLabel jlbHoaDon;
    private javax.swing.JLabel jlbQuanLyKhachHang;
    private javax.swing.JLabel jlbQuanLyNhanVien;
    private javax.swing.JLabel jlbThongKeDoanhThu;
    private javax.swing.JLabel jlbThuePhong;
    private javax.swing.JPanel jpnDichVu;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQuanLyKhachHang;
    private javax.swing.JPanel jpnQuanLyNhanVien;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThongKeDoanhThu;
    private javax.swing.JPanel jpnThuePhong;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
