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
import java.util.ArrayList;
import java.util.List;
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
        jpnQuanLyPhong = new javax.swing.JPanel();
        jlbQuanLyNhanVien = new javax.swing.JLabel();
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
                .addGap(28, 28, 28)
                .addComponent(jlbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTitle)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpnQuanLyKhachhang.setBackground(new java.awt.Color(76, 157, 80));
        jpnQuanLyKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnQuanLyKhachhangMouseClicked(evt);
            }
        });

        jlbQuanLyKhachhang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbQuanLyKhachhang.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyKhachhang.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jpnQuanLyKhachhangLayout = new javax.swing.GroupLayout(jpnQuanLyKhachhang);
        jpnQuanLyKhachhang.setLayout(jpnQuanLyKhachhangLayout);
        jpnQuanLyKhachhangLayout.setHorizontalGroup(
            jpnQuanLyKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyKhachhangLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jlbQuanLyKhachhang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQuanLyKhachhangLayout.setVerticalGroup(
            jpnQuanLyKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyKhachhangLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbQuanLyKhachhang)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpnQuanLyPhong.setBackground(new java.awt.Color(76, 157, 80));

        jlbQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyNhanVien.setText("Quản lý phòng");

        javax.swing.GroupLayout jpnQuanLyPhongLayout = new javax.swing.GroupLayout(jpnQuanLyPhong);
        jpnQuanLyPhong.setLayout(jpnQuanLyPhongLayout);
        jpnQuanLyPhongLayout.setHorizontalGroup(
            jpnQuanLyPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyPhongLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jlbQuanLyNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQuanLyPhongLayout.setVerticalGroup(
            jpnQuanLyPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyPhongLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbQuanLyNhanVien)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpnDichVu.setBackground(new java.awt.Color(76, 157, 80));

        jlbDichVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbDichVu.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(96, 96, 96)
                .addComponent(jlbDichVu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDichVuLayout.setVerticalGroup(
            jpnDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDichVuLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jlbDichVu)
                .addGap(27, 27, 27))
        );

        jpnInHoaDon.setBackground(new java.awt.Color(76, 157, 80));

        jlbInHoaDon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbInHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbInHoaDon.setText("In hóa đơn");

        javax.swing.GroupLayout jpnInHoaDonLayout = new javax.swing.GroupLayout(jpnInHoaDon);
        jpnInHoaDon.setLayout(jpnInHoaDonLayout);
        jpnInHoaDonLayout.setHorizontalGroup(
            jpnInHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInHoaDonLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jlbInHoaDon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnInHoaDonLayout.setVerticalGroup(
            jpnInHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnInHoaDonLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jlbInHoaDon)
                .addGap(28, 28, 28))
        );

        jpnThongKeDoanhSo.setBackground(new java.awt.Color(76, 157, 80));

        jlbThongKeDoanhSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbThongKeDoanhSo.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKeDoanhSo.setText("Thống kê doanh số");

        javax.swing.GroupLayout jpnThongKeDoanhSoLayout = new javax.swing.GroupLayout(jpnThongKeDoanhSo);
        jpnThongKeDoanhSo.setLayout(jpnThongKeDoanhSoLayout);
        jpnThongKeDoanhSoLayout.setHorizontalGroup(
            jpnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeDoanhSoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbThongKeDoanhSo)
                .addGap(45, 45, 45))
        );
        jpnThongKeDoanhSoLayout.setVerticalGroup(
            jpnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeDoanhSoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbThongKeDoanhSo)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpnQuanLyNhanVien1.setBackground(new java.awt.Color(76, 157, 80));

        jlbQuanLyNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbQuanLyNhanVien1.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyNhanVien1.setText("Quản lý nhân viên");

        javax.swing.GroupLayout jpnQuanLyNhanVien1Layout = new javax.swing.GroupLayout(jpnQuanLyNhanVien1);
        jpnQuanLyNhanVien1.setLayout(jpnQuanLyNhanVien1Layout);
        jpnQuanLyNhanVien1Layout.setHorizontalGroup(
            jpnQuanLyNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyNhanVien1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jlbQuanLyNhanVien1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQuanLyNhanVien1Layout.setVerticalGroup(
            jpnQuanLyNhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyNhanVien1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jlbQuanLyNhanVien1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnQuanLyKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnQuanLyNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKeDoanhSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        DichVuJPanel dvPannel=new DichVuJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(dvPannel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jlbDichVuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbDichVu;
    private javax.swing.JLabel jlbInHoaDon;
    private javax.swing.JLabel jlbQuanLyKhachhang;
    private javax.swing.JLabel jlbQuanLyNhanVien;
    private javax.swing.JLabel jlbQuanLyNhanVien1;
    private javax.swing.JLabel jlbThongKeDoanhSo;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jpnDichVu;
    private javax.swing.JPanel jpnInHoaDon;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQuanLyKhachhang;
    private javax.swing.JPanel jpnQuanLyNhanVien1;
    private javax.swing.JPanel jpnQuanLyPhong;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThongKeDoanhSo;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
