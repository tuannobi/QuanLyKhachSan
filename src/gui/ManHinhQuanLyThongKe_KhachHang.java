/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.LoaiKhachHangBUS;
import bus.ThongKeBus;
import dto.KhachHangDTO;
import dto.KhachHang_TongDoanhThu;
import dto.LoaiKhachHangDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author COMPUTER
 */

public class ManHinhQuanLyThongKe_KhachHang extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    ArrayList<LoaiKhachHangDTO> listLoaiKH;
    ArrayList<KhachHangDTO> listKhachHang;
    DefaultTableModel dtmKH;
    long tongDoanhThu;
    KhachHang_TongDoanhThu khachHang_TongDoanhThu;
    public ManHinhQuanLyThongKe_KhachHang() {
        initComponents();
        setVisible(true);
        yeuCauHienThiDanhSachLoaiKhachHang();
        jtfTongDoanhso.setEditable(false);
    }

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnButton = new javax.swing.JPanel();
        jdTuNgay = new com.toedter.calendar.JDateChooser();
        jdDenNgay = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbbLoaiKH = new javax.swing.JComboBox<>();
        jbtXemBaoCao = new javax.swing.JButton();
        jbtInBaoCao = new javax.swing.JButton();
        jpnBody = new javax.swing.JPanel();
        jpnBieuDo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbKH = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtfTongDoanhso = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jpnThanhTren.setPreferredSize(new java.awt.Dimension(1159, 86));
        jpnThanhTren.setLayout(new javax.swing.BoxLayout(jpnThanhTren, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("THỐNG KÊ BÁO CÁO KHÁCH HÀNG");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnTitle);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");

        jLabel4.setText("Loại");

        jcbbLoaiKH.setEditable(true);
        jcbbLoaiKH.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jbtXemBaoCao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtXemBaoCao.setText("Xem báo cáo");
        jbtXemBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXemBaoCaoActionPerformed(evt);
            }
        });

        jbtInBaoCao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtInBaoCao.setText("In báo cáo");
        jbtInBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInBaoCaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtXemBaoCao)
                    .addComponent(jbtInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnButtonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtXemBaoCao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtInBaoCao))
                    .addGroup(jpnButtonLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jdDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnButton);

        jpnBody.setBackground(new java.awt.Color(255, 255, 255));
        jpnBody.setPreferredSize(new java.awt.Dimension(800, 347));

        jpnBieuDo.setLayout(new java.awt.BorderLayout());

        jtbKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Loại khách hàng", "Ngày sinh", "Địa chỉ", "Doanh số"
            }
        ));
        jScrollPane1.setViewportView(jtbKH);

        jpnBieuDo.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tổng doanh số");

        jtfTongDoanhso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jtfTongDoanhso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfTongDoanhso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnBodyLayout = new javax.swing.GroupLayout(jpnBody);
        jpnBody.setLayout(jpnBodyLayout);
        jpnBodyLayout.setHorizontalGroup(
            jpnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnBodyLayout.setVerticalGroup(
            jpnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBodyLayout.createSequentialGroup()
                .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtXemBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXemBaoCaoActionPerformed
//        if (jdTuNgay.getDate()==null || jdDenNgay.getDate()==null){
//            JOptionPane.showMessageDialog(null, "Chọn khoảng thời gian phù hợp");
//        }
//        else
//        {
//            if (((LoaiKhachHangDTO) jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang()==0){
//            yeuCauXemBaoCaoTatCaKhachHang();
//            yeuCauTinhTongDoanhThu();
//            hienThiTongDoanhThu();
//        }
//        else if (((LoaiKhachHangDTO) jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang()==1){
//            yeuCauXemBaoCaoKhachHangVIP();
//            yeuCauTinhTongDoanhThu();
//            hienThiTongDoanhThu();
//            JOptionPane.showMessageDialog(null, tongDoanhThu);
//        }
//        else if (((LoaiKhachHangDTO) jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang()==2){
//            yeuCauXemBaoKhachHangThuong();
//            yeuCauTinhTongDoanhThu();
//            hienThiTongDoanhThu();
//        }
//        }
            if (jdTuNgay.getDate()==null || jdDenNgay.getDate()==null){
            JOptionPane.showMessageDialog(null, "Chọn khoảng thời gian phù hợp");
        }
            else{
                yeuCauXuLyThongKeBaoCaoKhachHang();
            }
    }//GEN-LAST:event_jbtXemBaoCaoActionPerformed

    private void jbtInBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInBaoCaoActionPerformed
        if (jdTuNgay.getDate()==null || jdDenNgay.getDate()==null){
            JOptionPane.showMessageDialog(null, "Chọn khoảng thời gian phù hợp");
        }
        else
        {
            if (((LoaiKhachHangDTO) jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang()==0){
            jtfTongDoanhso.setText("");
            yeuCauInBaoCao_TatCa();
        }
        else if (((LoaiKhachHangDTO) jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang()==1){
            jtfTongDoanhso.setText("");
            yeuCauInBaoCao_LoaiVIP();
        }
        else if (((LoaiKhachHangDTO) jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang()==2){
            jtfTongDoanhso.setText("");
            yeuCauInBaoCao_LoaiThuong();
        }
        }
    }//GEN-LAST:event_jbtInBaoCaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtInBaoCao;
    private javax.swing.JButton jbtXemBaoCao;
    private javax.swing.JComboBox<LoaiKhachHangDTO> jcbbLoaiKH;
    private com.toedter.calendar.JDateChooser jdDenNgay;
    private com.toedter.calendar.JDateChooser jdTuNgay;
    private javax.swing.JPanel jpnBieuDo;
    private javax.swing.JPanel jpnBody;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTable jtbKH;
    private javax.swing.JTextField jtfTongDoanhso;
    // End of variables declaration//GEN-END:variables

    private void yeuCauHienThiDanhSachLoaiKhachHang(){
        listLoaiKH=new ArrayList<>();
        listLoaiKH=LoaiKhachHangBUS.layDuLieuLoaiKhachHang();
        LoaiKhachHangDTO tatCa=new LoaiKhachHangDTO();
        tatCa.setMaLoaiKhachHang(0);
        tatCa.setTenLoaiKhachHang("Tất cả");
        jcbbLoaiKH.addItem(tatCa);
        for (LoaiKhachHangDTO khachHangDTO:listLoaiKH){
            jcbbLoaiKH.addItem(khachHangDTO);
        }
    }
    
    
    private void yeuCauInBaoCao_TatCa(){
        ThongKeBus.inThongKeBaoCaoKhachHang_TatCa(jdTuNgay.getDate(), jdDenNgay.getDate());
    }
//    
//    private void yeuCauXemBaoCaoTatCaKhachHang(){
//        listKhachHang=new ArrayList<>();
//        listKhachHang=ThongKeBus.layDanhSachKhachHang_ThongKeBaoCao_TatCaLoai(jdTuNgay.getDate(), jdDenNgay.getDate());
//        dtmKH=new DefaultTableModel();
//        dtmKH=(DefaultTableModel)jtbKH.getModel();
//        dtmKH.setRowCount(0); //xóa các dòng ở bảng
//        for (KhachHangDTO khachHangDTO:listKhachHang){
//            Vector<Object> vec=new Vector<Object>();
//            vec.add(khachHangDTO.getHoTen());
//            vec.add(khachHangDTO.getLoaiKH());
//            vec.add(khachHangDTO.getNgaySinh());
//            vec.add(khachHangDTO.getDiaChi());
//            
//            vec.add(khachHangDTO.getDoanhSo());
//            dtmKH.addRow(vec);
//    }
//        jtbKH.setModel(dtmKH);
//        
//    }
//
//    private void yeuCauXemBaoKhachHangThuong(){
//        listKhachHang=new ArrayList<>();
//        listKhachHang=ThongKeBus.layDanhSachKhachHang_ThongKeBaoCao_LoaiThuong(jdTuNgay.getDate(), jdDenNgay.getDate());
//        dtmKH=new DefaultTableModel();
//        dtmKH=(DefaultTableModel)jtbKH.getModel();
//        dtmKH.setRowCount(0); //xóa các dòng ở bảng
//        for (KhachHangDTO khachHangDTO:listKhachHang){
//            Vector<Object> vec=new Vector<Object>();
//            vec.add(khachHangDTO.getHoTen());
//            vec.add(khachHangDTO.getLoaiKH());
//            vec.add(khachHangDTO.getNgaySinh());
//            vec.add(khachHangDTO.getDiaChi());
//            
//            vec.add(khachHangDTO.getDoanhSo());
//            dtmKH.addRow(vec);
//    }
//        jtbKH.setModel(dtmKH);
//        
//    }
//    
//    private void yeuCauXemBaoCaoKhachHangVIP(){
//        listKhachHang=new ArrayList<>();
//        listKhachHang=ThongKeBus.layDanhSachKhachHang_ThongKeBaoCao_LoaiVIP(jdTuNgay.getDate(), jdDenNgay.getDate());
//        dtmKH=new DefaultTableModel();
//        dtmKH=(DefaultTableModel)jtbKH.getModel();
//        dtmKH.setRowCount(0); //xóa các dòng ở bảng
//        for (KhachHangDTO khachHangDTO:listKhachHang){
//            Vector<Object> vec=new Vector<Object>();
//            vec.add(khachHangDTO.getHoTen());
//            vec.add(khachHangDTO.getLoaiKH());
//            vec.add(khachHangDTO.getNgaySinh());
//            vec.add(khachHangDTO.getDiaChi());
//            
//            vec.add(khachHangDTO.getDoanhSo());
//            dtmKH.addRow(vec);
//    }
//        jtbKH.setModel(dtmKH);
//        
//    }

    private void yeuCauInBaoCao_LoaiThuong() {
        ThongKeBus.inThongKeBaoCaoKhachHang_Thuong(jdTuNgay.getDate(), jdDenNgay.getDate());
    }

    private void yeuCauInBaoCao_LoaiVIP() {
        ThongKeBus.inThongKeBaoCaoKhachHang_VIP(jdTuNgay.getDate(), jdDenNgay.getDate());
    }
    
//    private void yeuCauTinhTongDoanhThu(){
//        tongDoanhThu=ThongKeBus.tinhTongDoanhThuKhachHang(listKhachHang);
//    }
    
//    private void yeuCauTinhTongDoanhThu(){
//       tongDoanhThu=ThongKeBus.tinhTongDoanhThuKhachHangProcedure(jdTuNgay.getDate(), jdDenNgay.getDate(), ((LoaiKhachHangDTO)jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang());
//    }
    
//    private void hienThiTongDoanhThu(){
//        jtfTongDoanhso.setText(String.valueOf(tongDoanhThu));
//    }

    private void yeuCauXuLyThongKeBaoCaoKhachHang() {
       khachHang_TongDoanhThu=new KhachHang_TongDoanhThu();
       khachHang_TongDoanhThu=ThongKeBus.layThongTinThongKeBaoCaoKhachHang(jdTuNgay.getDate(), jdDenNgay.getDate(), ((LoaiKhachHangDTO)jcbbLoaiKH.getSelectedItem()).getMaLoaiKhachHang());
       listKhachHang=new ArrayList<>();
        //listKhachHang=ThongKeBus.layDanhSachKhachHang_ThongKeBaoCao_LoaiVIP(jdTuNgay.getDate(), jdDenNgay.getDate());
        listKhachHang=khachHang_TongDoanhThu.getListKH();
        dtmKH=new DefaultTableModel();
        dtmKH=(DefaultTableModel)jtbKH.getModel();
        dtmKH.setRowCount(0); //xóa các dòng ở bảng
        for (KhachHangDTO khachHangDTO:listKhachHang){
            Vector<Object> vec=new Vector<Object>();
            vec.add(khachHangDTO.getHoTen());
            vec.add(khachHangDTO.getLoaiKH());
            vec.add(khachHangDTO.getNgaySinh());
            vec.add(khachHangDTO.getDiaChi());            
            vec.add(khachHangDTO.getDoanhSo());
            dtmKH.addRow(vec);
    }
        jtbKH.setModel(dtmKH);
        tongDoanhThu=khachHang_TongDoanhThu.getTongDoanhThu();
        jtfTongDoanhso.setText(String.valueOf(tongDoanhThu));
    }
    
    
}
