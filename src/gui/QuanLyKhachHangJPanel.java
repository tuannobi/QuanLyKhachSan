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
   public static ArrayList <KhachHangDTO> listKH;
    public static DefaultTableModel dtmKH;
    public static KhachHangDTO selectedKhachHang;
    
    public QuanLyKhachHangJPanel() {
        initComponents();
        //jtfTimKiem.setUI(new HintTextFieldUI("Nhập thông tin tìm kiếm"));
        
        hienThiDanhSachKhachHang();
    }
    
   public static void hienThiDanhSachKhachHang (){
       dtmKH=new DefaultTableModel();
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
            vec.add(khachHangDTO.getLoaiKH());
            dtmKH.addRow(vec);
    }
        tbKhachHang.setModel(dtmKH);
   }
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jbtTimKiem = new javax.swing.JButton();
        jtfTimKiem = new javax.swing.JTextField();
        jbtCapNhat = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jpnTable = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpnMain.setBackground(new java.awt.Color(153, 153, 255));

        jpnThanhTren.setBackground(new java.awt.Color(255, 255, 255));
        jpnThanhTren.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnThanhTren.setForeground(new java.awt.Color(255, 255, 255));

        jlbTitle.setBackground(new java.awt.Color(204, 255, 255));
        jlbTitle.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(153, 153, 255));
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("Danh sách khách hàng");

        jbtTimKiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        jtfTimKiem.setBackground(new java.awt.Color(234, 234, 242));
        jtfTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTimKiem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfTimKiemMouseMoved(evt);
            }
        });
        jtfTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfTimKiemFocusGained(evt);
            }
        });

        jbtCapNhat.setBackground(new java.awt.Color(255, 51, 51));
        jbtCapNhat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        jbtCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh-button.png"))); // NOI18N
        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });

        jbtXoa.setBackground(new java.awt.Color(51, 51, 255));
        jbtXoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtXoa.setForeground(new java.awt.Color(255, 255, 255));
        jbtXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jlbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(jbtTimKiem)
                .addGap(34, 34, 34)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jbtCapNhat)
                .addGap(30, 30, 30)
                .addComponent(jbtXoa)
                .addGap(322, 322, 322))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCapNhat)
                    .addComponent(jbtXoa)
                    .addComponent(jbtTimKiem))
                .addGap(4, 4, 4))
        );

        jpnTable.setBackground(new java.awt.Color(153, 153, 255));

        tbKhachHang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ và tên", "Ngày sinh", "CMND", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái", "Loại khách hàng"
            }
        ));
        tbKhachHang.setRowHeight(18);
        tbKhachHang.getTableHeader().setReorderingAllowed(false);
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jspTable.setViewportView(tbKhachHang);
        if (tbKhachHang.getColumnModel().getColumnCount() > 0) {
            tbKhachHang.getColumnModel().getColumn(0).setHeaderValue("Mã khách hàng");
            tbKhachHang.getColumnModel().getColumn(1).setHeaderValue("Họ và tên");
            tbKhachHang.getColumnModel().getColumn(2).setHeaderValue("Ngày sinh");
            tbKhachHang.getColumnModel().getColumn(3).setHeaderValue("CMND");
            tbKhachHang.getColumnModel().getColumn(4).setHeaderValue("Giới tính");
            tbKhachHang.getColumnModel().getColumn(5).setHeaderValue("Địa chỉ");
            tbKhachHang.getColumnModel().getColumn(6).setHeaderValue("Email");
            tbKhachHang.getColumnModel().getColumn(7).setHeaderValue("Số điện thoại");
            tbKhachHang.getColumnModel().getColumn(8).setHeaderValue("Trạng thái");
            tbKhachHang.getColumnModel().getColumn(9).setHeaderValue("Loại khách hàng");
        }

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMain);
    }// </editor-fold>//GEN-END:initComponents

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        selectedKhachHang=new KhachHangDTO();
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
            SuaKhachHangJDialog suaKhachHangJDialog=new SuaKhachHangJDialog(selectedKhachHang);
            suaKhachHangJDialog.showWindow();
        }
    }//GEN-LAST:event_jbtCapNhatActionPerformed

    private void jtfTimKiemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTimKiemMouseMoved

    }//GEN-LAST:event_jtfTimKiemMouseMoved

    private void jtfTimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTimKiemFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfTimKiemFocusGained

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        // TODO add your handling code here:
        listKH=KhachHangBus.timKiemKhachHang(jtfTimKiem.getText());
        if (listKH==null){
            JOptionPane.showMessageDialog(null, "Không tìm kiếm thấy thông tin khách hàng này");
        }
        else
        {
            xuLyKetQuaTimKiem();
        }
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        if (selectedKhachHang==null)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng để xóa");
        }
        else{
            int check= JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa khách hàng này không?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
            if (check==JOptionPane.YES_OPTION){
                KhachHangBus.xoaKhachHang(selectedKhachHang.getMaKH());
                hienThiDanhSachKhachHang();
                refreshData();
            }
            else if (check==JOptionPane.NO_OPTION){

            }
        }

    }//GEN-LAST:event_jbtXoaActionPerformed

    
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
            vec.add(khachHangDTO.getLoaiKH());
            dtmKH.addRow(vec);
    }
    }
    
    public static void refreshData(){
        dtmKH.setRowCount(0);
        hienThiDanhSachKhachHang();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTextField jtfTimKiem;
    private static javax.swing.JTable tbKhachHang;
    // End of variables declaration//GEN-END:variables
}
