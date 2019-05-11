/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.KhachHangBus;
import dto.KhachHangDTO;
import gui.miniPop.SuaKhachHangJDialog;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuan
 */
public class QuanLyKhachHangJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyKhachHangJPanel
     */
     ArrayList <KhachHangDTO> listKH;
    DefaultTableModel dtmKH=new DefaultTableModel();
    KhachHangDTO selectedKhachHang;
    
    public QuanLyKhachHangJPanel() {
        initComponents();
        hienThiDanhSachKhachHang();
    }
    
   private void hienThiDanhSachKhachHang (){
        listKH=new ArrayList<KhachHangDTO>();
        listKH=KhachHangBus.getDuLieuKhachHang();
        dtmKH=(DefaultTableModel)tbKhachHang.getModel();
        
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
            dtmKH.addRow(vec);
    }
       // tbKhachHang.setModel(dtmKH);
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jtfTimKiem = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jpnButton = new javax.swing.JPanel();
        jbtCapNhat = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jpnTable = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpnThanhTren.setForeground(new java.awt.Color(204, 204, 255));
        jpnThanhTren.setLayout(new java.awt.GridLayout(1, 0));

        jpnTitle.setBackground(new java.awt.Color(153, 153, 255));
        jpnTitle.setLayout(new java.awt.BorderLayout());

        jlbTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("Danh sách khách hàng");
        jpnTitle.add(jlbTitle, java.awt.BorderLayout.CENTER);

        jpnThanhTren.add(jpnTitle);

        jpnTimKiem.setBackground(new java.awt.Color(153, 153, 255));

        jtfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimKiemActionPerformed(evt);
            }
        });

        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbtTimKiem)
                .addContainerGap())
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTimKiem))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnTimKiem);

        jpnButton.setBackground(new java.awt.Color(153, 153, 255));

        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });

        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jbtCapNhat)
                .addGap(46, 46, 46)
                .addComponent(jbtXoa)
                .addGap(40, 40, 40))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCapNhat)
                    .addComponent(jbtXoa))
                .addContainerGap())
        );

        jpnThanhTren.add(jpnButton);

        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Học và tên", "Ngày sinh", "CMND", "Giới tính", "Địa chỉ", "Email", "Số điện thoạil", "Trạng thái"
            }
        ));
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
            .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMain);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
      if (selectedKhachHang==null)
      {
          JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng để xóa");
      }
      else{
         int check= JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa khách hàng này không?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
          if (check==JOptionPane.YES_OPTION){
              KhachHangBus.xoaKhachHang(selectedKhachHang.getMaKH());
              refreshData();
          }
          else if (check==JOptionPane.NO_OPTION){
              
          }
      }
        
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jtfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimKiemActionPerformed
        
    }//GEN-LAST:event_jtfTimKiemActionPerformed

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        
        int selectedRow=tbKhachHang.getSelectedRow();
        if (selectedRow==-1)
            return;
        selectedKhachHang=listKH.get(selectedRow);

    }//GEN-LAST:event_tbKhachHangMouseClicked

    private void jbtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCapNhatActionPerformed
        if (selectedKhachHang==null)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng để cập nhật thông tin");
        }
        else{
            SuaKhachHangJDialog suaKhachHangJDialog=new SuaKhachHangJDialog(listKH, dtmKH,tbKhachHang, selectedKhachHang);
            suaKhachHangJDialog.showWindow();
        }
    }//GEN-LAST:event_jbtCapNhatActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        listKH=KhachHangBus.timKiemKhachHang(jtfTimKiem.getText());
        if (listKH==null){
            JOptionPane.showMessageDialog(null, "Không tìm kiếm thấy thông tin khách hàng này");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Các kết quả được tìm thấy");
            xuLyKetQuaTimKiem();
        }
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    public void refreshData(){
        dtmKH.setRowCount(0);
        hienThiDanhSachKhachHang();
    }
    
    public void xuLyKetQuaTimKiem(){
        dtmKH.setRowCount(0);
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
            dtmKH.addRow(vec);
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTextField jtfTimKiem;
    private javax.swing.JTable tbKhachHang;
    // End of variables declaration//GEN-END:variables
}
