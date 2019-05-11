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
    DefaultTableModel dtmDichVu=new DefaultTableModel();
    ArrayList<DichVu>listDV=null;
    DichVu selectedDV;
    
    public DichVuJPanel() {
        initComponents();
        hienThiDanhSachDichVu();
    }
private void hienThiDanhSachDichVu()
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
        dtmDichVu.addRow(vt);
        //tbDichVu.setModel(dtmDichVu);
    }    
}
private void refreshDichVu()
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
        jpnThanhTren = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jtfTimKiem = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtCapNhat = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jbtThem = new javax.swing.JButton();
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

        jpnThanhTren.setBackground(new java.awt.Color(153, 153, 255));

        jpnTitle.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách dịch vụ");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTitleLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jpnTimKiem.setBackground(new java.awt.Color(153, 153, 255));

        jtfTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimKiemActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(jbtTimKiem)
                .addGap(18, 18, 18)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTimKiem))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jbtCapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatMouseClicked(evt);
            }
        });

        jbtXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtXoa.setText("Xóa");
        jbtXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtXoaMouseClicked(evt);
            }
        });

        jbtThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jbtCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá tiền"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimKiemActionPerformed

    private void jbtXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtXoaMouseClicked
        // TODO add your handling code here:
        if(selectedDV==null)
        {
            JOptionPane.showMessageDialog(null,"Vui lòng chọn dịch vụ để xóa");
        }
        else
        {
            int check=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dịch vụ này không?","Cảnh báo",JOptionPane.YES_NO_OPTION);
            if(check==JOptionPane.YES_OPTION)
            {
                int check2=DichVuBus.xoaDichVu(selectedDV.getMaDichVu());
                if(check2!=-1)
                {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu cần xóa");
                }
                refreshDichVu();
            }
        }
    }//GEN-LAST:event_jbtXoaMouseClicked

    private void tbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVuMouseClicked
        // TODO add your handling code here:
        int selectedRow=tbDichVu.getSelectedRow();
        if(selectedRow==-1)
            return;
        selectedDV=listDV.get(selectedRow);
    }//GEN-LAST:event_tbDichVuMouseClicked

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        // TODO add your handling code here:
        ThemDichVuJDialog themDichVuJDialog=new ThemDichVuJDialog(listDV, dtmDichVu, tbDichVu);
        themDichVuJDialog.setVisible(true);
        themDichVuJDialog.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtCapNhatMouseClicked
        // TODO add your handling code here:
        SuaDichVuJDialog suaDichVuJDialog=new SuaDichVuJDialog(listDV, dtmDichVu, tbDichVu, selectedDV);
        
        if(selectedDV==null)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dịch vụ để cập nhật");
        }
        else
        {
            suaDichVuJDialog.showWindows();
            suaDichVuJDialog.setTextMaDV(selectedDV.getMaDichVu()+"");
            suaDichVuJDialog.setTextTenDichVu(selectedDV.getTenDichVu());
            suaDichVuJDialog.setTextGiaTien(selectedDV.getGiaTien());
        }
    }//GEN-LAST:event_jbtCapNhatMouseClicked

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTextField jtfTimKiem;
    private javax.swing.JTable tbDichVu;
    // End of variables declaration//GEN-END:variables
}
