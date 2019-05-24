/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.ThongKeBus;
import dto.ThongKe;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author COMPUTER
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
        initComponents();
    }

    public void setDataToChar_Thang(JPanel view)
    {
        ArrayList<ThongKe> ds=ThongKeBus.getThongKeThang(jcNgayBD.getDate(), jcNgayKT.getDate());
        if(ds!=null)
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
            for(ThongKe tk : ds)
            {
                dataset.addValue(tk.getTongTien(),"Tháng", tk.getThang()+"-"+tk.getNam());
            }
            JFreeChart chart=ChartFactory.createBarChart("THỐNG KÊ DOANH THU THEO THÁNG", "Tháng", "Doanh Thu", dataset);
            ChartPanel chartPanel=new ChartPanel(chart);
            view.removeAll();
             view.setLayout(new BorderLayout());
             view.add(chartPanel);
             view.repaint();
             view.validate();
        }
    }
    
    public void setDataToChar_Ngay(JPanel view)
    {
        ArrayList<ThongKe> ds=ThongKeBus.getThongKeNgay(jcNgayBD.getDate(), jcNgayKT.getDate());
        if(ds!=null)
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
            for(ThongKe tk : ds)
            {
                dataset.addValue(tk.getTongTien(),"Ngày", tk.getNgay());
            }
            JFreeChart chart=ChartFactory.createBarChart("THỐNG KÊ DOANH THU THEO NGÀY", "Ngày", "Doanh Thu", dataset);
            ChartPanel chartPanel=new ChartPanel(chart);
            view.removeAll();
             view.setLayout(new BorderLayout());
             view.add(chartPanel);
             view.repaint();
             view.validate();
        }
    }
    
    public void setDataToChar_Nam(JPanel view)
    {
        ArrayList<ThongKe> ds=ThongKeBus.getThongKeNam(jcNgayBD.getDate(), jcNgayKT.getDate());
        if(ds!=null)
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
            for(ThongKe tk : ds)
            {
                dataset.addValue(tk.getTongTien(),"Năm", tk.getNam()+"");
            }
            JFreeChart chart=ChartFactory.createBarChart("THỐNG KÊ DOANH THU THEO NĂM", "Năm", "Doanh Thu", dataset);
            ChartPanel chartPanel=new ChartPanel(chart);
            view.removeAll();
             view.setLayout(new BorderLayout());
             view.add(chartPanel);
             view.repaint();
             view.validate();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcNgayBD = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jcNgayKT = new com.toedter.calendar.JDateChooser();
        jbtThang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpnBieuDo = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ngày bắt đầu");

        jcNgayBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ngày kết thúc");

        jcNgayKT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtThang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtThang.setText("Thống kê tháng");
        jbtThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThangMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thống kê ngày");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Thống kê năm");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtThang)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnBieuDoLayout = new javax.swing.GroupLayout(jpnBieuDo);
        jpnBieuDo.setLayout(jpnBieuDoLayout);
        jpnBieuDoLayout.setHorizontalGroup(
            jpnBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnBieuDoLayout.setVerticalGroup(
            jpnBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThangMouseClicked
        // TODO add your handling code here:
        setDataToChar_Thang(jpnBieuDo);
    }//GEN-LAST:event_jbtThangMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        setDataToChar_Ngay(jpnBieuDo);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        setDataToChar_Nam(jpnBieuDo);
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtThang;
    private com.toedter.calendar.JDateChooser jcNgayBD;
    private com.toedter.calendar.JDateChooser jcNgayKT;
    private javax.swing.JPanel jpnBieuDo;
    private javax.swing.JPanel jpnThanhTren;
    // End of variables declaration//GEN-END:variables
}
