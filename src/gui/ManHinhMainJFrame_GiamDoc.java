/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

//import bean.DanhMucBean;
//import controller.ChuyenManHinhController;
import bus.DangXuatBUS;
import bus.LoaiTaiKhoanBUS;
import bus.NhanVienBus;
import dto.LoaiTaiKhoanDTO;
import dto.NhanVienDTO;
import dto.TaiKhoanDTO;
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
public class ManHinhMainJFrame_GiamDoc extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    NhanVienDTO nhanVienDTO;
    public ManHinhMainJFrame_GiamDoc() {
        initComponents();
        hienThiThongTinNhanVien();
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
        jpnStatus = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbHoTen = new javax.swing.JLabel();
        jpnMenu = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý khách sạn");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpnRoot.setBackground(new java.awt.Color(153, 153, 255));

        jpnStatus.setBackground(new java.awt.Color(255, 51, 51));
        jpnStatus.setPreferredSize(new java.awt.Dimension(429, 72));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUẢN LÝ KHÁCH SẠN");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_logout.png"))); // NOI18N
        jButton2.setText("Đăng xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account.png"))); // NOI18N

        jlbHoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlbHoTen.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jlbHoTen)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpnStatusLayout = new javax.swing.GroupLayout(jpnStatus);
        jpnStatus.setLayout(jpnStatusLayout);
        jpnStatusLayout.setHorizontalGroup(
            jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnStatusLayout.setVerticalGroup(
            jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatusLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnStatusLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnStatusLayout.createSequentialGroup()
                        .addGroup(jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
        );

        jpnMenu.setBackground(new java.awt.Color(0, 102, 51));
        jpnMenu.setPreferredSize(new java.awt.Dimension(291, 300));

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
                .addComponent(jlbQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThuePhong.setBackground(new java.awt.Color(0, 153, 51));
        jpnThuePhong.setPreferredSize(new java.awt.Dimension(289, 70));
        jpnThuePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnThuePhongMouseClicked(evt);
            }
        });

        jlbThuePhong.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbThuePhong.setForeground(new java.awt.Color(255, 255, 255));
        jlbThuePhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phong.png"))); // NOI18N
        jlbThuePhong.setText("Quản lý phòng");

        javax.swing.GroupLayout jpnThuePhongLayout = new javax.swing.GroupLayout(jpnThuePhong);
        jpnThuePhong.setLayout(jpnThuePhongLayout);
        jpnThuePhongLayout.setHorizontalGroup(
            jpnThuePhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThuePhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThuePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThuePhongLayout.setVerticalGroup(
            jpnThuePhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThuePhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDichVu.setBackground(new java.awt.Color(0, 153, 51));
        jpnDichVu.setPreferredSize(new java.awt.Dimension(289, 70));
        jpnDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnDichVuMouseClicked(evt);
            }
        });

        jlbDichVu.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbDichVu.setForeground(new java.awt.Color(255, 255, 255));
        jlbDichVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dichvu.png"))); // NOI18N
        jlbDichVu.setText("Quản lý dịch vụ");

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
                .addComponent(jlbDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnHoaDon.setBackground(new java.awt.Color(0, 153, 51));
        jpnHoaDon.setPreferredSize(new java.awt.Dimension(289, 70));
        jpnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnHoaDonMouseClicked(evt);
            }
        });

        jlbHoaDon.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_hoadon.png"))); // NOI18N
        jlbHoaDon.setText("Quản lý hóa đơn");

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
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongKeDoanhThu.setBackground(new java.awt.Color(0, 153, 51));
        jpnThongKeDoanhThu.setPreferredSize(new java.awt.Dimension(289, 70));
        jpnThongKeDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnThongKeDoanhThuMouseClicked(evt);
            }
        });

        jlbThongKeDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbThongKeDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKeDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbThongKeDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_thongke.png"))); // NOI18N
        jlbThongKeDoanhThu.setText("Thống kê báo cáo");

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
                .addComponent(jlbThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnView.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1157, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpnStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 1482, Short.MAX_VALUE)
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jpnRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnQuanLyKhachHangMouseClicked
        // TODO add your handling code here:
        ManHinhQuanLyKhachHangJPanel khJPanel =new ManHinhQuanLyKhachHangJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(khJPanel,BorderLayout.CENTER);     
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnQuanLyKhachHangMouseClicked

    private void jpnThuePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnThuePhongMouseClicked
        // TODO add your handling code here:
        ManHinhQuanLyPhongJPanel phongPanel=new ManHinhQuanLyPhongJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(phongPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnThuePhongMouseClicked

    private void jpnDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnDichVuMouseClicked
        // TODO add your handling code here:
        ManHinhQuanLyDichVuJPanel dvPanel=new ManHinhQuanLyDichVuJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(dvPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnDichVuMouseClicked

    private void jpnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnHoaDonMouseClicked
        // TODO add your handling code here:
        ManHinhQuanLyHoaDonJPanel hoaDonJPanel = new ManHinhQuanLyHoaDonJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(hoaDonJPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnHoaDonMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        yeuCauDangXuat();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jpnQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnQuanLyNhanVienMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            ManHinhQuanLyNhanVienJPanel nvPanel=new ManHinhQuanLyNhanVienJPanel();
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            jpnView.add(nvPanel,BorderLayout.CENTER);
            jpnView.repaint();
            jpnView.validate();
        } catch (SQLException ex) {
            Logger.getLogger(ManHinhMainJFrame_GiamDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jpnQuanLyNhanVienMouseClicked

    private void jpnThongKeDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnThongKeDoanhThuMouseClicked
        // TODO add your handling code here:
        
        ManHinhQuanLyThongKeDoanhSoJPanel thongKeJPanel = new ManHinhQuanLyThongKeDoanhSoJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(thongKeJPanel,BorderLayout.CENTER);
        jpnView.repaint();
        jpnView.validate();
    }//GEN-LAST:event_jpnThongKeDoanhThuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbDichVu;
    private javax.swing.JLabel jlbHoTen;
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
    private javax.swing.JPanel jpnStatus;
    private javax.swing.JPanel jpnThongKeDoanhThu;
    private javax.swing.JPanel jpnThuePhong;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables

    private void yeuCauDangXuat() {
        dispose();
        DangXuatBUS.xuLyDangXuat();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void hienThiThongTinNhanVien(){
        nhanVienDTO=new NhanVienDTO();
        String loaiTK="";
        nhanVienDTO=NhanVienBus.layThongTinNhanVien(ManHinhDangNhapJFrame.getTaiKhoan().getMaNhanVien());
        ArrayList<LoaiTaiKhoanDTO> listLoaiTK=LoaiTaiKhoanBUS.layDanhSachLoaiTaiKhoan();
        for (LoaiTaiKhoanDTO taiKhoan:listLoaiTK){
            if (ManHinhDangNhapJFrame.getTaiKhoan().getMaLoaiTaiKhoan()==taiKhoan.getMaLoaiTaiKhoan()){
                loaiTK=taiKhoan.getTenLoaiTaiKhoan();
            }
        }
        jlbHoTen.setText(nhanVienDTO.getHoTen()+" - "+loaiTK);
    }
}
