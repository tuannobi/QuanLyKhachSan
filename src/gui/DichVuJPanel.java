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
import gui.miniPop.ThemDichVuJDialog;

import dto.DichVu;
import gui.miniPop.SuaDichVuJDialog;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Tuan
 */
public class DichVuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DichVuJPanel
     */
    public static DefaultTableModel dtmDichVu=new DefaultTableModel();
    public static ArrayList<DichVu>listDV=null;
    public static DichVu selectedDV;
    
    public DichVuJPanel() {
        initComponents();
        hienThiDanhSachDichVu();
    }
public static void hienThiDanhSachDichVu()
{
    listDV=new ArrayList<>();
    listDV=DichVuBus.getDuLieuDichVu();
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

private void hienThiDanhSachDichVuTimKiem(String tk)
{
    listDV=new ArrayList<>();
    listDV=DichVuBus.timKiemDichVu(tk);
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
public static void refreshDichVu()
{
    dtmDichVu.setRowCount(0);
    hienThiDanhSachDichVu();
}

private void refreshDichVuTimKiem(String tk)
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
        jpn = new javax.swing.JPanel();
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

        setPreferredSize(new java.awt.Dimension(884, 359));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jpnThanhTren.setBackground(new java.awt.Color(204, 204, 255));

        jpnTitle.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ DỊCH VỤ");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnTimKiem.setBackground(new java.awt.Color(204, 204, 255));

        jbtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTimKiemMouseClicked(evt);
            }
        });

        jtfTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTimKiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jpn.setBackground(new java.awt.Color(204, 204, 255));

        jbtThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });

        jbtCapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnLayout = new javax.swing.GroupLayout(jpn);
        jpn.setLayout(jpnLayout);
        jpnLayout.setHorizontalGroup(
            jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtCapNhat)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jpnLayout.setVerticalGroup(
            jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jpn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá tiền", "Trạng thái"
            }
        ));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpnMain);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        // TODO add your handling code here:
        ThemDichVuJDialog ThemDichVu=new ThemDichVuJDialog(listDV, dtmDichVu, tbDichVu);
        ThemDichVu.setVisible(true);
        ThemDichVu.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtCapNhatMouseClicked
        // TODO add your handling code here:
        if (selectedDV==null)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên để cập nhật");
        }
        else{
            SuaDichVuJDialog suaDichVuJDialog=new SuaDichVuJDialog(listDV, dtmDichVu, tbDichVu, selectedDV);
            suaDichVuJDialog.showWindows();
        }
    }//GEN-LAST:event_jbtCapNhatMouseClicked

    private void tbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVuMouseClicked
        // TODO add your handling code here:
        int selectedRow=tbDichVu.getSelectedRow();
        if(selectedRow==-1)
            return;
        selectedDV=listDV.get(selectedRow);
    }//GEN-LAST:event_tbDichVuMouseClicked

    private void jbtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTimKiemMouseClicked
        // TODO add your handling code here:
        String tk=jtfTimKiem.getText();
        if(tk.length()==0)
        {
            refreshDichVu();
        }
        else
        {
            refreshDichVuTimKiem(tk);
        }
    }//GEN-LAST:event_jbtTimKiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JPanel jpn;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTextField jtfTimKiem;
    private static javax.swing.JTable tbDichVu;
    // End of variables declaration//GEN-END:variables
}
