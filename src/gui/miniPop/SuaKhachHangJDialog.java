/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import bus.KhachHangBus;
import dto.KhachHangDTO;
import gui.QuanLyKhachHangJPanel;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuan
 */

public class SuaKhachHangJDialog extends javax.swing.JDialog {
    KhachHangDTO kh; 
    KhachHangDTO newInfoKhachHangDTO; //lưu trữ dữ liệu mới của người dùng nhập vào

    public SuaKhachHangJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
    
    public SuaKhachHangJDialog(KhachHangDTO kh ) {            
        initComponents();
        this.kh=kh;
        
        chuyenDuLieu();
    }
    

    public void showWindow(){
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnMaKhachHang = new javax.swing.JPanel();
        lbMaKhachHang = new javax.swing.JLabel();
        jtfMaKhachHang = new javax.swing.JTextField();
        jpnHoVaTen = new javax.swing.JPanel();
        lbHoVaTen = new javax.swing.JLabel();
        jtfHoVaTen = new javax.swing.JTextField();
        jpnNgaySinh = new javax.swing.JPanel();
        lbNgaySinh = new javax.swing.JLabel();
        jcNgaySinh = new com.toedter.calendar.JDateChooser();
        jpnCMND = new javax.swing.JPanel();
        lbCMND = new javax.swing.JLabel();
        jtfCMND = new javax.swing.JTextField();
        jpnGioiTinh = new javax.swing.JPanel();
        lbGioiTinh = new javax.swing.JLabel();
        jcbbGioiTinh = new javax.swing.JComboBox<String>();
        jpnDiaChi = new javax.swing.JPanel();
        jlbDiaChi = new javax.swing.JLabel();
        jtfDiaChi = new javax.swing.JTextField();
        jpnEmail = new javax.swing.JPanel();
        jlbEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jpnsdt = new javax.swing.JPanel();
        jlbsdt = new javax.swing.JLabel();
        jtfSDT = new javax.swing.JTextField();
        jpnTrangThai = new javax.swing.JPanel();
        jlbTrangThai = new javax.swing.JLabel();
        jtfTrangThai = new javax.swing.JTextField();
        jpnButton = new javax.swing.JPanel();
        jbtLuu = new javax.swing.JButton();
        jbtHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnMain.setLayout(new javax.swing.BoxLayout(jpnMain, javax.swing.BoxLayout.Y_AXIS));

        lbMaKhachHang.setText("Mã khách hàng");

        jtfMaKhachHang.setEnabled(false);
        jtfMaKhachHang.setPreferredSize(new java.awt.Dimension(60, 20));

        javax.swing.GroupLayout jpnMaKhachHangLayout = new javax.swing.GroupLayout(jpnMaKhachHang);
        jpnMaKhachHang.setLayout(jpnMaKhachHangLayout);
        jpnMaKhachHangLayout.setHorizontalGroup(
            jpnMaKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMaKhachHangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbMaKhachHang)
                .addGap(43, 43, 43)
                .addComponent(jtfMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jpnMaKhachHangLayout.setVerticalGroup(
            jpnMaKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMaKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMaKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKhachHang)
                    .addComponent(jtfMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnMain.add(jpnMaKhachHang);

        lbHoVaTen.setText("Họ và tên");

        javax.swing.GroupLayout jpnHoVaTenLayout = new javax.swing.GroupLayout(jpnHoVaTen);
        jpnHoVaTen.setLayout(jpnHoVaTenLayout);
        jpnHoVaTenLayout.setHorizontalGroup(
            jpnHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoVaTenLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbHoVaTen)
                .addGap(68, 68, 68)
                .addComponent(jtfHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jpnHoVaTenLayout.setVerticalGroup(
            jpnHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoVaTenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoVaTen)
                    .addComponent(jtfHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnMain.add(jpnHoVaTen);

        lbNgaySinh.setText("Ngày sinh");

        javax.swing.GroupLayout jpnNgaySinhLayout = new javax.swing.GroupLayout(jpnNgaySinh);
        jpnNgaySinh.setLayout(jpnNgaySinhLayout);
        jpnNgaySinhLayout.setHorizontalGroup(
            jpnNgaySinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNgaySinhLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbNgaySinh)
                .addGap(69, 69, 69)
                .addComponent(jcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jpnNgaySinhLayout.setVerticalGroup(
            jpnNgaySinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNgaySinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnNgaySinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgaySinh))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnMain.add(jpnNgaySinh);

        lbCMND.setText("CMND");

        javax.swing.GroupLayout jpnCMNDLayout = new javax.swing.GroupLayout(jpnCMND);
        jpnCMND.setLayout(jpnCMNDLayout);
        jpnCMNDLayout.setHorizontalGroup(
            jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCMNDLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbCMND)
                .addGap(87, 87, 87)
                .addComponent(jtfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnCMNDLayout.setVerticalGroup(
            jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCMNDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCMND)
                    .addComponent(jtfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnMain.add(jpnCMND);

        lbGioiTinh.setText("Giới tính");

        jcbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jpnGioiTinhLayout = new javax.swing.GroupLayout(jpnGioiTinh);
        jpnGioiTinh.setLayout(jpnGioiTinhLayout);
        jpnGioiTinhLayout.setHorizontalGroup(
            jpnGioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGioiTinhLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbGioiTinh)
                .addGap(79, 79, 79)
                .addComponent(jcbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jpnGioiTinhLayout.setVerticalGroup(
            jpnGioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGioiTinhLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnGioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh)
                    .addComponent(jcbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnMain.add(jpnGioiTinh);

        jlbDiaChi.setText("Địa chỉ");

        javax.swing.GroupLayout jpnDiaChiLayout = new javax.swing.GroupLayout(jpnDiaChi);
        jpnDiaChi.setLayout(jpnDiaChiLayout);
        jpnDiaChiLayout.setHorizontalGroup(
            jpnDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDiaChiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbDiaChi)
                .addGap(85, 85, 85)
                .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jpnDiaChiLayout.setVerticalGroup(
            jpnDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDiaChiLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpnDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDiaChi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnMain.add(jpnDiaChi);

        jlbEmail.setText("Email");

        javax.swing.GroupLayout jpnEmailLayout = new javax.swing.GroupLayout(jpnEmail);
        jpnEmail.setLayout(jpnEmailLayout);
        jpnEmailLayout.setHorizontalGroup(
            jpnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEmailLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbEmail)
                .addGap(92, 92, 92)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jpnEmailLayout.setVerticalGroup(
            jpnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEmailLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpnMain.add(jpnEmail);

        jlbsdt.setText("Số điện thoại");

        javax.swing.GroupLayout jpnsdtLayout = new javax.swing.GroupLayout(jpnsdt);
        jpnsdt.setLayout(jpnsdtLayout);
        jpnsdtLayout.setHorizontalGroup(
            jpnsdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnsdtLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbsdt)
                .addGap(53, 53, 53)
                .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jpnsdtLayout.setVerticalGroup(
            jpnsdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnsdtLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnsdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbsdt)
                    .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpnMain.add(jpnsdt);

        jlbTrangThai.setText("Trạng thái");

        jtfTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTrangThaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTrangThaiLayout = new javax.swing.GroupLayout(jpnTrangThai);
        jpnTrangThai.setLayout(jpnTrangThaiLayout);
        jpnTrangThaiLayout.setHorizontalGroup(
            jpnTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangThaiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbTrangThai)
                .addGap(64, 64, 64)
                .addComponent(jtfTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jpnTrangThaiLayout.setVerticalGroup(
            jpnTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangThaiLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTrangThai)
                    .addComponent(jtfTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpnMain.add(jpnTrangThai);

        jbtLuu.setText("Lưu");
        jbtLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLuuActionPerformed(evt);
            }
        });

        jbtHuy.setText("Hủy");
        jbtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtLuu)
                .addGap(28, 28, 28)
                .addComponent(jbtHuy)
                .addGap(24, 24, 24))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLuu)
                    .addComponent(jbtHuy))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyActionPerformed
       stopWindow();
    }//GEN-LAST:event_jbtHuyActionPerformed

    private void jbtLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLuuActionPerformed
        layDuLieuTuForm();
        if (newInfoKhachHangDTO!=null){
        KhachHangBus.capNhatThongTinKhachHang(newInfoKhachHangDTO);   
        refreshData();
        }
        else
            JOptionPane.showMessageDialog(null, "Lỗi");
    }//GEN-LAST:event_jbtLuuActionPerformed

    private void jtfTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTrangThaiActionPerformed

    private void stopWindow(){
        this.dispose();
    }
    
    
    private void chuyenDuLieu(){
        jtfMaKhachHang.setText(Integer.toString(kh.getMaKH())); //chuyển số về chuỗi
        jtfHoVaTen.setText(kh.getHoTen());
        jtfCMND.setText(Integer.toString(kh.getCMND()));
        jcbbGioiTinh.setSelectedItem(kh.getGioiTinh());
        jtfDiaChi.setText(kh.getDiaChi());
        jtfEmail.setText(kh.getEmail());
        jtfSDT.setText(kh.getSDT());
        jcNgaySinh.setDate(kh.getNgaySinh());
        jtfTrangThai.setText(kh.getTrangThai());
    }
    
    private void layDuLieuTuForm() {
        newInfoKhachHangDTO=new KhachHangDTO();
        newInfoKhachHangDTO.setMaKH(Integer.parseInt(jtfMaKhachHang.getText()));
        newInfoKhachHangDTO.setHoTen(jtfHoVaTen.getText());
        newInfoKhachHangDTO.setCMND(Integer.parseInt(jtfCMND.getText()));
        newInfoKhachHangDTO.setDiaChi(jtfDiaChi.getText());
        newInfoKhachHangDTO.setGioiTinh(jcbbGioiTinh.getSelectedItem().toString());
        newInfoKhachHangDTO.setNgaySinh(jcNgaySinh.getDate());
        newInfoKhachHangDTO.setSDT(jtfSDT.getText());
        newInfoKhachHangDTO.setTrangThai(jtfTrangThai.getText());
        newInfoKhachHangDTO.setEmail(jtfEmail.getText());
    }
    
    private void refreshData(){
        QuanLyKhachHangJPanel.refreshData();
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtHuy;
    private javax.swing.JButton jbtLuu;
    private com.toedter.calendar.JDateChooser jcNgaySinh;
    private javax.swing.JComboBox<String> jcbbGioiTinh;
    private javax.swing.JLabel jlbDiaChi;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbTrangThai;
    private javax.swing.JLabel jlbsdt;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnCMND;
    private javax.swing.JPanel jpnDiaChi;
    private javax.swing.JPanel jpnEmail;
    private javax.swing.JPanel jpnGioiTinh;
    private javax.swing.JPanel jpnHoVaTen;
    private javax.swing.JPanel jpnMaKhachHang;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnNgaySinh;
    private javax.swing.JPanel jpnTrangThai;
    private javax.swing.JPanel jpnsdt;
    private javax.swing.JTextField jtfCMND;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoVaTen;
    private javax.swing.JTextField jtfMaKhachHang;
    private javax.swing.JTextField jtfSDT;
    private javax.swing.JTextField jtfTrangThai;
    private javax.swing.JLabel lbCMND;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoVaTen;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel lbNgaySinh;
    // End of variables declaration//GEN-END:variables

    
}
