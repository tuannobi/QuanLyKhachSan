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
        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnNgay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcNgayBD = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jcNgayKT = new com.toedter.calendar.JDateChooser();
        jpnButton = new javax.swing.JPanel();
        jbtNgay = new javax.swing.JButton();
        jbtThang = new javax.swing.JButton();
        jbtNam = new javax.swing.JButton();
        jpnBieuDo = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("THỐNG KÊ DOANH THU");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ngày bắt đầu:");

        jcNgayBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày kết thúc:");

        javax.swing.GroupLayout jpnNgayLayout = new javax.swing.GroupLayout(jpnNgay);
        jpnNgay.setLayout(jpnNgayLayout);
        jpnNgayLayout.setHorizontalGroup(
            jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNgayLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNgayLayout.setVerticalGroup(
            jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNgayLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jbtNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtNgay.setText("Thống kê ngày");
        jbtNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtNgayMouseClicked(evt);
            }
        });

        jbtThang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtThang.setText("Thống kê tháng");
        jbtThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThangMouseClicked(evt);
            }
        });

        jbtNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtNam.setText("Thống kê năm");
        jbtNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtNamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtNam))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnBieuDoLayout = new javax.swing.GroupLayout(jpnBieuDo);
        jpnBieuDo.setLayout(jpnBieuDoLayout);
        jpnBieuDoLayout.setHorizontalGroup(
            jpnBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        jpnBieuDoLayout.setVerticalGroup(
            jpnBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtNgayMouseClicked
        // TODO add your handling code here:
        setDataToChar_Ngay(jpnBieuDo);
    }//GEN-LAST:event_jbtNgayMouseClicked

    private void jbtThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThangMouseClicked
        // TODO add your handling code here:
        setDataToChar_Thang(jpnBieuDo);
    }//GEN-LAST:event_jbtThangMouseClicked

    private void jbtNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtNamMouseClicked
        // TODO add your handling code here:
        setDataToChar_Nam(jpnBieuDo);
    }//GEN-LAST:event_jbtNamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtNam;
    private javax.swing.JButton jbtNgay;
    private javax.swing.JButton jbtThang;
    private com.toedter.calendar.JDateChooser jcNgayBD;
    private com.toedter.calendar.JDateChooser jcNgayKT;
    private javax.swing.JPanel jpnBieuDo;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnNgay;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTitle;
    // End of variables declaration//GEN-END:variables
}
