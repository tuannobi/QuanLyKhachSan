/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.ThongKeBus;
import dto.ChiTietHoaDon_TongDoanhThu;
import dto.DichVu;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author COMPUTER
 */
public class ManHinhQuanLyThongKe_DichVu extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    ArrayList<DichVu> listDichVu;
    DefaultTableModel dtmDichVu;
    ChiTietHoaDon_TongDoanhThu chiTietHoaDon_TongDoanhThu;
    long tongDoanhThu;
    public ManHinhQuanLyThongKe_DichVu() {
        initComponents();
        setVisible(true);
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
        jbtXemBaoCao = new javax.swing.JButton();
        jbtInBaocao = new javax.swing.JButton();
        jpnBody = new javax.swing.JPanel();
        jpnBieuDo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDichVu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfTongDoanhso = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(790, 1000));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 1000));

        jpnThanhTren.setPreferredSize(new java.awt.Dimension(1159, 86));
        jpnThanhTren.setLayout(new javax.swing.BoxLayout(jpnThanhTren, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("THỐNG KÊ BÁO CÁO DỊCH VỤ");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnTitle);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");

        jbtXemBaoCao.setText("Xem báo cáo");
        jbtXemBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXemBaoCaoActionPerformed(evt);
            }
        });

        jbtInBaocao.setText("In báo cáo");
        jbtInBaocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInBaocaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jbtXemBaoCao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtInBaocao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtInBaocao)
                        .addComponent(jbtXemBaoCao))
                    .addComponent(jdDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(31, 31, 31))
        );

        jpnThanhTren.add(jpnButton);

        jpnBody.setBackground(new java.awt.Color(255, 255, 255));

        jpnBieuDo.setLayout(new java.awt.BorderLayout());

        jtbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thời gian", "Tên dịch vụ", "Doanh số"
            }
        ));
        jScrollPane1.setViewportView(jtbDichVu);

        jpnBieuDo.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.setPreferredSize(new java.awt.Dimension(321, 60));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Tổng doanh số");

        jtfTongDoanhso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(681, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jtfTongDoanhso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfTongDoanhso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnBodyLayout = new javax.swing.GroupLayout(jpnBody);
        jpnBody.setLayout(jpnBodyLayout);
        jpnBodyLayout.setHorizontalGroup(
            jpnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        jpnBodyLayout.setVerticalGroup(
            jpnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBodyLayout.createSequentialGroup()
                .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtXemBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXemBaoCaoActionPerformed
        if (jdTuNgay.getDate()==null || jdDenNgay.getDate()==null){
            JOptionPane.showMessageDialog(null, "Chọn khoảng thời gian phù hợp");
        }
        else{
        yeuCaulayThongTinThongKeBaoCaoDichVu();
        }
    }//GEN-LAST:event_jbtXemBaoCaoActionPerformed

    private void jbtInBaocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInBaocaoActionPerformed
        if (jdTuNgay.getDate()==null || jdDenNgay.getDate()==null){
            JOptionPane.showMessageDialog(null, "Chọn khoảng thời gian phù hợp");
        }
        else
        jtfTongDoanhso.setText("");
        yeuCauInThongKeDichVuTheoThoiGian();
    }//GEN-LAST:event_jbtInBaocaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtInBaocao;
    private javax.swing.JButton jbtXemBaoCao;
    private com.toedter.calendar.JDateChooser jdDenNgay;
    private com.toedter.calendar.JDateChooser jdTuNgay;
    private javax.swing.JPanel jpnBieuDo;
    private javax.swing.JPanel jpnBody;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTable jtbDichVu;
    private javax.swing.JTextField jtfTongDoanhso;
    // End of variables declaration//GEN-END:variables


//    private void yeuCauXemBaoCaoDichVu(){
//        listDichVu=new ArrayList<DichVu>();
//        listDichVu=ThongKeBus.layDanhSachDichVu_ThongKeBaoCao(jdTuNgay.getDate(), jdDenNgay.getDate());
//        dtmDichVu=new DefaultTableModel();
//        dtmDichVu=(DefaultTableModel)jtbDichVu.getModel();
//        dtmDichVu.setRowCount(0); //xóa các dòng ở bảng
//        for (DichVu dichvu:listDichVu){
//            Vector<Object> vec=new Vector<Object>();
//            vec.add(dichvu.getThoiGian());
//            vec.add(dichvu.getTenDichVu());
//            vec.add(dichvu.getDoanhThu());
//            dtmDichVu.addRow(vec);
//          
//    }
//        jtbDichVu.setModel(dtmDichVu);
//        
//    }

    private void yeuCauInThongKeDichVuTheoThoiGian() {
        ThongKeBus.inThongKeBaoCaoDichVu(jdTuNgay.getDate(), jdDenNgay.getDate());
    }

//    private void yeuCauTinhTongDoanhThu(){
//        tongDoanhThu=ThongKeBus.tinhTongDoanhThuDichVu(listDichVu);
//    }
//    
//    private void hienThiTongDoanhThu(){
//        jtfTongDoanhso.setText(String.valueOf(tongDoanhThu));
//    }

    private void yeuCaulayThongTinThongKeBaoCaoDichVu() {
       
        chiTietHoaDon_TongDoanhThu=new ChiTietHoaDon_TongDoanhThu();
       chiTietHoaDon_TongDoanhThu=ThongKeBus.layThongTinThongKeBaoCaoDichVu(jdTuNgay.getDate(), jdDenNgay.getDate());
       listDichVu=new ArrayList<>();
        //listKhachHang=ThongKeBus.layDanhSachKhachHang_ThongKeBaoCao_LoaiVIP(jdTuNgay.getDate(), jdDenNgay.getDate());
        listDichVu=chiTietHoaDon_TongDoanhThu.getListDV();
        dtmDichVu=new DefaultTableModel();
        dtmDichVu=(DefaultTableModel)jtbDichVu.getModel();
        dtmDichVu.setRowCount(0); //xóa các dòng ở bảng
        for (DichVu dichVu:listDichVu){
            Vector<Object> vec=new Vector<Object>();
            vec.add(dichVu.getThoiGian());
            vec.add(dichVu.getTenDichVu());
            vec.add(dichVu.getGiaTien());
            dtmDichVu.addRow(vec);
    }
        jtbDichVu.setModel(dtmDichVu);
        tongDoanhThu=chiTietHoaDon_TongDoanhThu.getTongDoanhThu();
        jtfTongDoanhso.setText(String.valueOf(tongDoanhThu));
    }
    
    
}
