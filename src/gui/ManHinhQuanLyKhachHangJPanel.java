/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.KhachHangBus;
import dto.KhachHangDTO;
import gui.miniPop.FormSuaThongTinKhachHangJDialog;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuan
 */
public class ManHinhQuanLyKhachHangJPanel extends javax.swing.JPanel {

   public static ArrayList <KhachHangDTO> listKH;
    public static DefaultTableModel dtmKH;
    public static KhachHangDTO selectedKhachHang;
    
    public ManHinhQuanLyKhachHangJPanel() {
        initComponents();
        hienThiDanhSachKhachHang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtfTimKiem = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtCapNhat = new javax.swing.JButton();
        jpnTable = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new java.awt.BorderLayout());

        jpnMain.setBackground(new java.awt.Color(153, 153, 255));

        jpnThanhTren.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnThanhTren.setForeground(new java.awt.Color(255, 255, 255));
        jpnThanhTren.setPreferredSize(new java.awt.Dimension(1198, 86));
        jpnThanhTren.setLayout(new javax.swing.BoxLayout(jpnThanhTren, javax.swing.BoxLayout.LINE_AXIS));

        jlbTitle.setBackground(new java.awt.Color(204, 255, 255));
        jlbTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(51, 51, 255));
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("DANH SÁCH KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThanhTren.add(jPanel1);

        jtfTimKiem.setBackground(new java.awt.Color(234, 234, 242));
        jtfTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfTimKiem.setMinimumSize(new java.awt.Dimension(6, 25));
        jtfTimKiem.setPreferredSize(new java.awt.Dimension(6, 25));

        jbtTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TimKiem.png"))); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jbtTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtTimKiem)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jPanel2);

        jbtCapNhat.setBackground(new java.awt.Color(51, 51, 255));
        jbtCapNhat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CapNhat.png"))); // NOI18N
        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jbtCapNhat)
                .addGap(85, 85, 85))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jbtCapNhat)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jPanel3);

        jpnTable.setBackground(new java.awt.Color(255, 102, 51));

        tbKhachHang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ và tên", "Ngày sinh", "CMND", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái", "Loại khách hàng", "Doanh số"
            }
        ));
        tbKhachHang.setRowHeight(18);
        tbKhachHang.getTableHeader().setReorderingAllowed(false);
        tbKhachHang.setUpdateSelectionOnSort(false);
        tbKhachHang.setVerifyInputWhenFocusTarget(false);
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jspTable.setViewportView(tbKhachHang);

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        luuThongTinKhachHangKhiClick();
    }//GEN-LAST:event_tbKhachHangMouseClicked

    private void jbtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCapNhatActionPerformed
        if (selectedKhachHang==null)
        JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng để cập nhật thông tin");
        else
        yeuCauHienThiFormCapNhatThongTinKhachHang();
    }//GEN-LAST:event_jbtCapNhatActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        if (jtfTimKiem.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Nhập thông tin muốn tìm kiếm!");
       }
        else
        yeuCauXuLyTimKiemKhachHang();
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTextField jtfTimKiem;
    private static javax.swing.JTable tbKhachHang;
    // End of variables declaration//GEN-END:variables
    
       
    private void hienThiDanhSachKhachHang(){
         dtmKH=new DefaultTableModel();
        listKH=new ArrayList<KhachHangDTO>();
        listKH=KhachHangBus.layDuLieuKhachHang();
        dtmKH=(DefaultTableModel)tbKhachHang.getModel();
        dtmKH.setRowCount(0); //xóa các dòng ở bảng
        for (KhachHangDTO khachHangDTO:listKH){
            Vector<Object> vec=new Vector<Object>();
            vec.add(khachHangDTO.getMaKH());
            vec.add(khachHangDTO.getHoTen());
            vec.add(khachHangDTO.getNgaySinh());
            vec.add(khachHangDTO.getCMND());
            vec.add(khachHangDTO.getGioiTinh());
            vec.add(khachHangDTO.getDiaChi());
            vec.add(khachHangDTO.getEmail());
            vec.add(khachHangDTO.getSDT());
            vec.add(khachHangDTO.getTrangThai());
            vec.add(khachHangDTO.getLoaiKH());
            vec.add(khachHangDTO.getDoanhSo());
            dtmKH.addRow(vec);
    }
        tbKhachHang.setModel(dtmKH);
    }

    private void yeuCauHienThiFormCapNhatThongTinKhachHang() {
       FormSuaThongTinKhachHangJDialog suaKhachHangJDialog=new FormSuaThongTinKhachHangJDialog(selectedKhachHang,tbKhachHang,dtmKH);
    }


    private void yeuCauXuLyTimKiemKhachHang() {
        dtmKH=new DefaultTableModel();
        listKH=new ArrayList<KhachHangDTO>();
        listKH=KhachHangBus.timKiemKhachHang(jtfTimKiem.getText());
        if (listKH.size()<=0)
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả nào");
        else{
        dtmKH=(DefaultTableModel)tbKhachHang.getModel();
        dtmKH.setRowCount(0); //xóa các dòng ở bảng
        for (KhachHangDTO khachHangDTO:listKH){
            Vector<Object> vec=new Vector<Object>();
            vec.add(khachHangDTO.getMaKH());
            vec.add(khachHangDTO.getHoTen());
            vec.add(khachHangDTO.getNgaySinh());
            vec.add(khachHangDTO.getCMND());
            vec.add(khachHangDTO.getGioiTinh());
            vec.add(khachHangDTO.getDiaChi());
            vec.add(khachHangDTO.getEmail());
            vec.add(khachHangDTO.getSDT());
            vec.add(khachHangDTO.getTrangThai());
            vec.add(khachHangDTO.getLoaiKH());
            vec.add(khachHangDTO.getDoanhSo());
            dtmKH.addRow(vec);
    }
        tbKhachHang.setModel(dtmKH);
       }
    }
    
    public static void lamMoiDuLieu(){
        dtmKH=new DefaultTableModel();
        listKH=new ArrayList<KhachHangDTO>();
        listKH=KhachHangBus.layDuLieuKhachHang();
        dtmKH=(DefaultTableModel)tbKhachHang.getModel();
        dtmKH.setRowCount(0); //xóa các dòng ở bảng
        for (KhachHangDTO khachHangDTO:listKH){
            Vector<Object> vec=new Vector<Object>();
            vec.add(khachHangDTO.getMaKH());
            vec.add(khachHangDTO.getHoTen());
            vec.add(khachHangDTO.getNgaySinh());
            vec.add(khachHangDTO.getCMND());
            vec.add(khachHangDTO.getGioiTinh());
            vec.add(khachHangDTO.getDiaChi());
            vec.add(khachHangDTO.getEmail());
            vec.add(khachHangDTO.getSDT());
            vec.add(khachHangDTO.getTrangThai());
            vec.add(khachHangDTO.getLoaiKH());
            dtmKH.addRow(vec);
    }
        tbKhachHang.setModel(dtmKH);
    } 

    private void luuThongTinKhachHangKhiClick() {
        selectedKhachHang=new KhachHangDTO(); 
        int selectedRow=tbKhachHang.getSelectedRow(); 
        if (selectedRow==-1) 
        return;
        selectedKhachHang=listKH.get(selectedRow);  }
    
}
