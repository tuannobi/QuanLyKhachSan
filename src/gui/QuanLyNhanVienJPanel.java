/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.DichVuBus;
import bus.NhanVienBus;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import dto.DichVu;
import dto.NhanVienDTO;
import gui.miniPop.SuaNhanVienJDialog;
import gui.miniPop.ThemNhanVienJDialog;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tuan
 */
public class QuanLyNhanVienJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyNhanVienJPanel
     */
    public static DefaultTableModel dtmNhanVien=new DefaultTableModel();
    public static ArrayList<NhanVienDTO>listNV=null;
    public static NhanVienDTO selectedNV;
    
    public QuanLyNhanVienJPanel() throws SQLException {
        initComponents();
        hienThiDanhSachNhanVien();
    }
    
   public static void hienThiDanhSachNhanVien() throws SQLException
{
    listNV=new ArrayList<>();
    listNV=NhanVienBus.getDuLieuNhanVien();
    dtmNhanVien=(DefaultTableModel)tbNhanVien.getModel();
    
    
    for(NhanVienDTO nv:listNV)
    {
        Vector<Object> vt=new Vector<Object>();
        vt.add(nv.getMaNhanVien());
        vt.add(nv.getHoTen());
        vt.add(nv.getNgaySinh());
        vt.add(nv.getNgayVaoLam());
        vt.add(nv.getCMND());
        vt.add(nv.getSoDT());
        vt.add(nv.getTenNguoiQL());
        vt.add(nv.getGioiTinh());
        vt.add(nv.getEmail());
        vt.add(nv.getDiaChi());
        vt.add(nv.getTrangThai());

        dtmNhanVien.addRow(vt);
    }    
}
   
   public static void refreshNhanVien() throws SQLException
{
    dtmNhanVien.setRowCount(0);
    hienThiDanhSachNhanVien();
}
    
   private void hienThiDanhSachNhanVienTimKiem(String tk)
{
    listNV=new ArrayList<>();
    listNV=NhanVienBus.timKiemNhanVien(tk);
    dtmNhanVien=(DefaultTableModel)tbNhanVien.getModel();
    
    
    for(NhanVienDTO nv:listNV)
    {
        Vector<Object> vt=new Vector<Object>();
        vt.add(nv.getMaNhanVien());
        vt.add(nv.getHoTen());
        vt.add(nv.getNgaySinh());
        vt.add(nv.getNgayVaoLam());
        vt.add(nv.getCMND());
        vt.add(nv.getSoDT());
        vt.add(nv.getTenNguoiQL());
        vt.add(nv.getGioiTinh());
        vt.add(nv.getDiaChi());
        vt.add(nv.getEmail());
        vt.add(nv.getTrangThai());
             
        dtmNhanVien.addRow(vt);
        //tbDichVu.setModel(dtmDichVu);
    }    
}
   
   private void refreshNhanVienTimKiem(String tk)
{
    dtmNhanVien.setRowCount(0);
    hienThiDanhSachNhanVienTimKiem(tk);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jtfTimKiem = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jpnButton = new javax.swing.JPanel();
        jbtCapNhat = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jbtThem = new javax.swing.JButton();
        jpnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpnThanhTren.setForeground(new java.awt.Color(204, 204, 255));
        jpnThanhTren.setLayout(new java.awt.GridLayout(1, 0));

        jpnTitle.setBackground(new java.awt.Color(153, 153, 255));
        jpnTitle.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách nhân viên");
        jpnTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        jpnThanhTren.add(jpnTitle);

        jpnTimKiem.setBackground(new java.awt.Color(153, 153, 255));

        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTimKiemMouseClicked(evt);
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
        jbtCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatMouseClicked(evt);
            }
        });

        jbtXoa.setText("Xóa");
        jbtXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtXoaMouseClicked(evt);
            }
        });

        jbtThem.setText("Thêm");
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jbtThem)
                .addGap(35, 35, 35)
                .addComponent(jbtCapNhat)
                .addGap(31, 31, 31)
                .addComponent(jbtXoa)
                .addGap(25, 25, 25))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCapNhat)
                    .addComponent(jbtXoa)
                    .addComponent(jbtThem))
                .addContainerGap())
        );

        jpnThanhTren.add(jpnButton);

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ và tên", "Ngày sinh", "Ngày vào làm", "CMND", "Số điện thoại", "Người quản lý", "Giới tính", "Email", "Địa chỉ", "Trạng thái"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
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

    private void jbtXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtXoaMouseClicked
        // TODO add your handling code here:
        if(selectedNV==null)
        {
            JOptionPane.showMessageDialog(null,"Vui lòng chọn dịch vụ để xóa");
        }
        else
        {
            int check=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa nhân viên này không?","Cảnh báo",JOptionPane.YES_NO_OPTION);
            if(check==JOptionPane.YES_OPTION)
            {
                try {
                    int check2=NhanVienBus.xoaNhanVien(selectedNV.getMaNhanVien());
                    if(check2!=-1)
                    {
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu cần xóa");
                    }
                    refreshNhanVien();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
    }//GEN-LAST:event_jbtXoaMouseClicked

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        // TODO add your handling code here:
        int selectedRow=tbNhanVien.getSelectedRow();
        if(selectedRow==-1)
            return;
        selectedNV=listNV.get(selectedRow);
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void jbtCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtCapNhatMouseClicked
        // TODO add your handling code here:
        if (selectedNV==null)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên để cập nhật");
        }
        else{
            SuaNhanVienJDialog suaNhanVienJDialog=new SuaNhanVienJDialog(listNV, dtmNhanVien, tbNhanVien, selectedNV);
            suaNhanVienJDialog.showWindows();
        }
    }//GEN-LAST:event_jbtCapNhatMouseClicked

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        // TODO add your handling code here:
        ThemNhanVienJDialog ThemNhanVien=new ThemNhanVienJDialog(listNV, dtmNhanVien, tbNhanVien);
        ThemNhanVien.setVisible(true);
        ThemNhanVien.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTimKiemMouseClicked
        // TODO add your handling code here:
        String tk=jtfTimKiem.getText().trim();
        if(tk.length()==0)
        {
            try {
                refreshNhanVien();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVienJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            refreshNhanVienTimKiem(tk);
                
        }
        
    }//GEN-LAST:event_jbtTimKiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTextField jtfTimKiem;
    private static javax.swing.JTable tbNhanVien;
    // End of variables declaration//GEN-END:variables
}
