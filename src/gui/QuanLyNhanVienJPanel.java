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

        jpnMain.setBackground(new java.awt.Color(153, 153, 255));

        jpnThanhTren.setBackground(new java.awt.Color(255, 255, 255));
        jpnThanhTren.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnThanhTren.setForeground(new java.awt.Color(255, 255, 255));

        jpnTitle.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách nhân viên");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jpnTimKiem.setBackground(new java.awt.Color(255, 255, 255));

        jtfTimKiem.setBackground(new java.awt.Color(234, 234, 242));
        jtfTimKiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jbtTimKiem.setBackground(new java.awt.Color(0, 204, 204));
        jbtTimKiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jbtTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
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
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnButton.setBackground(new java.awt.Color(255, 255, 255));

        jbtCapNhat.setBackground(new java.awt.Color(51, 51, 255));
        jbtCapNhat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        jbtCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh-button.png"))); // NOI18N
        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatMouseClicked(evt);
            }
        });

        jbtXoa.setBackground(new java.awt.Color(255, 51, 51));
        jbtXoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtXoa.setForeground(new java.awt.Color(255, 255, 255));
        jbtXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jbtXoa.setText("Xóa");
        jbtXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtXoaMouseClicked(evt);
            }
        });

        jbtThem.setBackground(new java.awt.Color(0, 204, 102));
        jbtThem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtThem.setForeground(new java.awt.Color(255, 255, 255));
        jbtThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
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
                .addGap(6, 6, 6)
                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbNhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ và tên", "Ngày sinh", "Ngày vào làm", "CMND", "Số điện thoại", "Người quản lý", "Giới tính", "Email", "Địa chỉ", "Trạng thái"
            }
        ));
        tbNhanVien.setEditingColumn(1);
        tbNhanVien.setRowHeight(18);
        tbNhanVien.setUpdateSelectionOnSort(false);
        tbNhanVien.setVerifyInputWhenFocusTarget(false);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
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
