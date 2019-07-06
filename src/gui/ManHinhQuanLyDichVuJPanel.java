/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.DichVuBus;
import dao.DichVuDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import gui.miniPop.FormThemDichVuJDialog;

import dto.DichVu;
import gui.miniPop.FormSuaDichVuJDialog;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Tuan
 */
public class ManHinhQuanLyDichVuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DichVuJPanel
     */
    public static DefaultTableModel dtmDichVu=new DefaultTableModel();
    public static ArrayList<DichVu>listDV=null;
    public static DichVu selectedDV;
    
    public ManHinhQuanLyDichVuJPanel() {
        initComponents();
        hienThiDanhSachDichVu();
    }
public static void hienThiDanhSachDichVu()
{
    listDV=new ArrayList<>();
    listDV=DichVuBus.layDuLieuDichVu();
    dtmDichVu=(DefaultTableModel)tbDichVu.getModel();
    
    
    for(DichVu dv:listDV)
    {
        Vector<Object> vt=new Vector<Object>();
        vt.add(dv.getMaDichVu());
        vt.add(dv.getTenDichVu());
        vt.add(dv.getGiaTien());
        vt.add(dv.getTrangThai());
        vt.add(dv.getDoanhThu());
        dtmDichVu.addRow(vt);
        //tbDichVu.setModel(dtmDichVu);
    }    
}

private void hienThiDanhSachDichVuTimKiem(String tk)
{
    listDV=new ArrayList<>();
    listDV=DichVuBus.timKiemDichVu(tk);
    if (listDV.size()<=0){
        JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả");
        return;
    }
    dtmDichVu=(DefaultTableModel)tbDichVu.getModel();
    
    
    for(DichVu dv:listDV)
    {
        Vector<Object> vt=new Vector<Object>();
        vt.add(dv.getMaDichVu());
        vt.add(dv.getTenDichVu());
        vt.add(dv.getGiaTien());
        vt.add(dv.getTrangThai());
        dtmDichVu.addRow(vt);
        //tbDichVu.setModel(dtmDichVu);
    }    
}
public static void lamMoiDuLieu()
{
    dtmDichVu.setRowCount(0);
    hienThiDanhSachDichVu();
}

private void lamMoiDuLieuTimKiem(String tk)
{
    dtmDichVu.setRowCount(0);
    hienThiDanhSachDichVuTimKiem(tk);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jbtTimKiem = new javax.swing.JButton();
        jtfTimKiem = new javax.swing.JTextField();
        jpnButton = new javax.swing.JPanel();
        jbtThem = new javax.swing.JButton();
        jbtCapNhat = new javax.swing.JButton();
        jpnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDichVu = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(884, 359));
        setLayout(new java.awt.BorderLayout());

        jpnMain.setBackground(new java.awt.Color(153, 153, 255));

        jpnThanhTren.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnThanhTren.setPreferredSize(new java.awt.Dimension(1159, 86));
        jpnThanhTren.setLayout(new javax.swing.BoxLayout(jpnThanhTren, javax.swing.BoxLayout.LINE_AXIS));

        jpnTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnTitle.setPreferredSize(new java.awt.Dimension(296, 49));
        jpnTitle.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ DỊCH VỤ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        jpnThanhTren.add(jpnTitle);

        jbtTimKiem.setBackground(new java.awt.Color(0, 204, 204));
        jbtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TimKiem.png"))); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTimKiemMouseClicked(evt);
            }
        });
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        jtfTimKiem.setBackground(new java.awt.Color(234, 234, 242));
        jtfTimKiem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfTimKiem.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTimKiemLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTimKiem))
                .addGap(28, 28, 28))
        );

        jpnThanhTren.add(jpnTimKiem);

        jbtThem.setBackground(new java.awt.Color(0, 204, 102));
        jbtThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Them.png"))); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jbtCapNhat.setBackground(new java.awt.Color(51, 51, 255));
        jbtCapNhat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CapNhat.png"))); // NOI18N
        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatMouseClicked(evt);
            }
        });
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtThem)
                .addGap(18, 18, 18)
                .addComponent(jbtCapNhat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtThem)
                    .addComponent(jbtCapNhat))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnButton);

        jpnTable.setBackground(new java.awt.Color(153, 153, 255));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tbDichVu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá tiền", "Trạng thái", "Doanh số"
            }
        ));
        tbDichVu.setRowHeight(18);
        tbDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDichVu);

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
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

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        // TODO add your handling code here:
        yeuCauHienThiFormThemDichVu();
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtCapNhatMouseClicked
        // TODO add your handling code here:
        yeuCauHienThiFormCapNhatDichVu();
    }//GEN-LAST:event_jbtCapNhatMouseClicked

    private void tbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVuMouseClicked
        // TODO add your handling code here:
        luuThongTinDichVuKhiClick();
    }//GEN-LAST:event_tbDichVuMouseClicked

    private void jbtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTimKiemMouseClicked
        // TODO add your handling code here:
        yeuCauTimKiemDichVu();
    }//GEN-LAST:event_jbtTimKiemMouseClicked

    private void jbtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCapNhatActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTextField jtfTimKiem;
    private static javax.swing.JTable tbDichVu;
    // End of variables declaration//GEN-END:variables

    private void yeuCauTimKiemDichVu() {
        String tk=jtfTimKiem.getText();
        if(tk.length()==0)
        {
            lamMoiDuLieu();
        }
        else
        {
            lamMoiDuLieuTimKiem(tk);
        } }

    private void luuThongTinDichVuKhiClick() {
        int selectedRow=tbDichVu.getSelectedRow();
        if(selectedRow==-1)
            return;
        selectedDV=listDV.get(selectedRow);
    }

    private void yeuCauHienThiFormThemDichVu() {
        FormThemDichVuJDialog ThemDichVu=new FormThemDichVuJDialog(listDV, dtmDichVu, tbDichVu);
        ThemDichVu.setVisible(true);
        ThemDichVu.setLocationRelativeTo(null);
    }

    private void yeuCauHienThiFormCapNhatDichVu() {
        if (selectedDV==null)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên để cập nhật");
        }
        else{
            FormSuaDichVuJDialog suaDichVuJDialog=new FormSuaDichVuJDialog(listDV, dtmDichVu, tbDichVu, selectedDV);
            suaDichVuJDialog.showWindows();
        }
    }
}
