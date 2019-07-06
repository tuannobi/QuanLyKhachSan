/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import bus.KhachHangBus;
import bus.LoaiKhachHangBUS;
import dto.KhachHangDTO;
import dto.LoaiKhachHangDTO;
import gui.ManHinhQuanLyKhachHangJPanel;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static newClass.check.removeAccent;

/**
 *
 * @author Tuan
 */

public class FormSuaThongTinKhachHangJDialog extends javax.swing.JDialog {
    
    KhachHangDTO kh; 
    KhachHangDTO newInfoKhachHangDTO; //lưu trữ dữ liệu mới của người dùng nhập vào
    ArrayList<LoaiKhachHangDTO> listLoaiKhachHangDTOs;   
    JTable tbKH;
    DefaultTableModel dtmKH;
    
    public FormSuaThongTinKhachHangJDialog(KhachHangDTO kh, JTable tbKH, DefaultTableModel dtmKH ) {            
        initComponents();
        this.kh=kh;
        this.tbKH=tbKH;
        this.dtmKH=dtmKH;
        hienThiLoaiKhachHang();
        xuLyChuyenDuLieuLenForm();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfMaKhachHang = new javax.swing.JTextField();
        jtfCMND = new javax.swing.JTextField();
        jtfHoVaTen = new javax.swing.JTextField();
        jtfSDT = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfDiaChi = new javax.swing.JTextField();
        jcNgaySinh = new com.toedter.calendar.JDateChooser();
        jcbbGioiTinh = new javax.swing.JComboBox();
        jcbbTrangThai = new javax.swing.JComboBox<>();
        jcbbLoaiKH = new javax.swing.JComboBox<>();
        jbtLuu = new javax.swing.JButton();
        jbtHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÔNG TIN KHÁCH HÀNG");

        jpnMain.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Mã khách hàng");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Họ và tên");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("CMND");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("Giới tính");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Địa chỉ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 0));
        jLabel8.setText("Số điện thoại");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 0));
        jLabel9.setText("Loại khách hàng");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 0));
        jLabel10.setText("Trạng thái");

        jtfMaKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfMaKhachHang.setEnabled(false);

        jtfCMND.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfHoVaTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jcNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcbbGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        jcbbTrangThai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã rời đi", "Đang thuê", "Đang đặt trước" }));
        jcbbTrangThai.setEnabled(false);

        jcbbLoaiKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbbLoaiKH.setEnabled(false);

        jbtLuu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        jbtLuu.setText("Lưu");
        jbtLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLuuActionPerformed(evt);
            }
        });

        jbtHuy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Huy.png"))); // NOI18N
        jbtHuy.setText("Hủy");
        jbtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfMaKhachHang)
                        .addComponent(jtfCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(jtfSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(jtfDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(jtfHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(jcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jcbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLuuActionPerformed
        boolean checkGUI=kiemTraTinhDayDu();
        
        if(checkGUI){            
            xuLylayDuLieuTuForm();
            boolean checkDB=yeuCauLuuThongTinMoiKhachHang();
            if (checkDB){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                ManHinhQuanLyKhachHangJPanel.lamMoiDuLieu();
                xuLyThoat();
            }
            else
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
        }
       
    }//GEN-LAST:event_jbtLuuActionPerformed

    private void jbtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyActionPerformed
        xuLyThoat();
    }//GEN-LAST:event_jbtHuyActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtHuy;
    private javax.swing.JButton jbtLuu;
    private com.toedter.calendar.JDateChooser jcNgaySinh;
    private javax.swing.JComboBox jcbbGioiTinh;
    private javax.swing.JComboBox<LoaiKhachHangDTO> jcbbLoaiKH;
    private javax.swing.JComboBox<String> jcbbTrangThai;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JTextField jtfCMND;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoVaTen;
    private javax.swing.JTextField jtfMaKhachHang;
    private javax.swing.JTextField jtfSDT;
    // End of variables declaration//GEN-END:variables
    
    
    private void hienThiLoaiKhachHang(){
        listLoaiKhachHangDTOs=new ArrayList<>();
        LoaiKhachHangBUS.layDuLieuLoaiKhachHang();
        
        for (LoaiKhachHangDTO loaiKH:listLoaiKhachHangDTOs){
            jcbbLoaiKH.addItem(loaiKH);
        }
    }
    
    private void xuLylayDuLieuTuForm() {
        newInfoKhachHangDTO=new KhachHangDTO();
        newInfoKhachHangDTO.setMaKH(Integer.valueOf(jtfMaKhachHang.getText()));
//        String a=removeAccent(jtfHoVaTen.getText());     
//        char[] x=a.toCharArray();  
//        for(int i=0;i<x.length;i++)
//        {
//            if((x[i]<(char)65&&x[i]!=(char)32)||x[i]>(char)122)
//            { 
//                JOptionPane.showMessageDialog(null, "Tên không hợp lệ");
//                return;
//            }
//            else if((x[i]>(char)90&&x[i]<(char)97))
//            { 
//                JOptionPane.showMessageDialog(null, "Tên không hợp lệ");
//                return;
//            }  
//        }
        
        newInfoKhachHangDTO.setHoTen(jtfHoVaTen.getText());
        
        try {
            newInfoKhachHangDTO.setCMND(Integer.parseInt(jtfCMND.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CMND không hợp lệ");
            return;
        }
        
        newInfoKhachHangDTO.setDiaChi(jtfDiaChi.getText());
        newInfoKhachHangDTO.setGioiTinh(jcbbGioiTinh.getSelectedItem().toString());
//        
//        char[] arr=jtfSDT.getText().toCharArray();
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]>(char)57 || arr[i]<(char)48)
//            {
//                JOptionPane.showMessageDialog(null,"Số điện thoại không hợp lệ");
//                return;
//            }
//        }
      
        newInfoKhachHangDTO.setNgaySinh(jcNgaySinh.getDate());
        newInfoKhachHangDTO.setSDT(jtfSDT.getText());
        newInfoKhachHangDTO.setTrangThai(jcbbTrangThai.getSelectedItem().toString());
        newInfoKhachHangDTO.setEmail(jtfEmail.getText());
    }
    
    private void xuLyChuyenDuLieuLenForm(){
        jtfMaKhachHang.setText(Integer.toString(kh.getMaKH())); //chuyển số về chuỗi
        jtfHoVaTen.setText(kh.getHoTen());
        jtfCMND.setText(Integer.toString(kh.getCMND()));
        jcbbGioiTinh.setSelectedItem(kh.getGioiTinh());
        jtfDiaChi.setText(kh.getDiaChi());
        jtfEmail.setText(kh.getEmail());
        jtfSDT.setText(kh.getSDT());
        jcNgaySinh.setDate(kh.getNgaySinh());
        jcbbLoaiKH.getModel().setSelectedItem(kh.getLoaiKH());
        jcbbTrangThai.setSelectedItem(kh.getTrangThai());
    }

    private boolean kiemTraTinhDayDu() {
        if (jtfHoVaTen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Họ và tên không được để trống!");
            return false;
        }
        else if (jcNgaySinh.getDate()==null){
            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống");
            return false;
        }
        else if (jtfCMND.getText().equals("")){
            JOptionPane.showMessageDialog(null, "CMND không được để trống");
            return false;
        }
        else if (jtfDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống");
            return false;
        }
        else if (jtfSDT.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Số điện thoại không được để trống");
            return false;
        }
        return true;
    }

    private boolean yeuCauLuuThongTinMoiKhachHang() {
        return KhachHangBus.capNhatThongTinKhachHang(newInfoKhachHangDTO);
    }
    private void xuLyThoat(){
        dispose();
    }
    
}
