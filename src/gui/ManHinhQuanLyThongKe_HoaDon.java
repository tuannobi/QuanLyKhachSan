/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.ThongKeBus;
import dao.OracleConnection;
import dto.ThongKe;
import static gui.ManHinhQuanLyHoaDonJPanel.selectedHD;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author COMPUTER
 */
public class ManHinhQuanLyThongKe_HoaDon extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    long tongDoanhThu;
    ArrayList<ThongKe> listDS;
    public ManHinhQuanLyThongKe_HoaDon() {
        initComponents();
    }

    private void hienThiBieuDoTheoThang(JPanel view)
    {
        listDS=new ArrayList<>();
        listDS=ThongKeBus.layThongKeThang(jcNgayBD.getDate(), jcNgayKT.getDate());
        if(listDS!=null)
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
            for(ThongKe tk : listDS)
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
    
    private void hienThiBieuDoTheoNgay(JPanel view)
    {
        listDS=new ArrayList<>();
        listDS=ThongKeBus.layThongKeNgay(jcNgayBD.getDate(), jcNgayKT.getDate());
        if(listDS!=null)
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
            for(ThongKe tk : listDS)
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
    
    private void hienThiBieuDoTheoNam(JPanel view)
    {
        listDS=new ArrayList<>();
        listDS=ThongKeBus.layThongKeNam(jcNgayBD.getDate(), jcNgayKT.getDate());
        if(listDS!=null)
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
            for(ThongKe tk : listDS)
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
    
    private boolean kiemTraThoiGianHopLe()
    {
        if(jcNgayBD.getDate()==null)
        {
            JOptionPane.showMessageDialog(null, "Khoảng thời gian không hợp lệ");
            return false;
        }
        if(jcNgayKT.getDate()==null)
        {
            JOptionPane.showMessageDialog(null, "Khoảng thời gian không hợp lệ");
            return false;
        }
        return true;
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
        jpnBody = new javax.swing.JPanel();
        jpnBieuDo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfTongDoanhso = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jpnThanhTren.setPreferredSize(new java.awt.Dimension(1159, 86));
        jpnThanhTren.setLayout(new javax.swing.BoxLayout(jpnThanhTren, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("DOANH THU HÓA ĐƠN");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnTitle);

        jpnNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ngày bắt đầu:");

        jcNgayBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ngày kết thúc:");

        javax.swing.GroupLayout jpnNgayLayout = new javax.swing.GroupLayout(jpnNgay);
        jpnNgay.setLayout(jpnNgayLayout);
        jpnNgayLayout.setHorizontalGroup(
            jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNgayLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jpnNgayLayout.setVerticalGroup(
            jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNgayLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jpnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnNgay);

        jbtNgay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtNgay.setText("Thống kê ngày");
        jbtNgay.setPreferredSize(new java.awt.Dimension(129, 25));
        jbtNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtNgayMouseClicked(evt);
            }
        });
        jbtNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNgayActionPerformed(evt);
            }
        });

        jbtThang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThang.setText("Thống kê tháng");
        jbtThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThangMouseClicked(evt);
            }
        });

        jbtNam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtNam.setText("Thống kê năm");
        jbtNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtNamMouseClicked(evt);
            }
        });
        jbtNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonLayout = new javax.swing.GroupLayout(jpnButton);
        jpnButton.setLayout(jpnButtonLayout);
        jpnButtonLayout.setHorizontalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jpnButtonLayout.setVerticalGroup(
            jpnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonLayout.createSequentialGroup()
                .addComponent(jbtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtThang)
                .addGap(0, 0, 0)
                .addComponent(jbtNam))
        );

        jpnThanhTren.add(jpnButton);

        jpnBody.setBackground(new java.awt.Color(255, 255, 255));

        jpnBieuDo.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jpnBodyLayout = new javax.swing.GroupLayout(jpnBody);
        jpnBody.setLayout(jpnBodyLayout);
        jpnBodyLayout.setHorizontalGroup(
            jpnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnBodyLayout.setVerticalGroup(
            jpnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Tổng doanh số");

        jtfTongDoanhso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jtfTongDoanhso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfTongDoanhso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtNgayMouseClicked
        // TODO add your handling code here:
        if(kiemTraThoiGianHopLe()){
            hienThiBieuDoTheoNgay(jpnBieuDo);
            yeuCauTinhTongDoanhThu();
            hienThiTongDoanhThu();
            int check=JOptionPane.showConfirmDialog(null, "In thống kê hóa đơn theo ngày?", "In thống kê hóa đơn", JOptionPane.YES_NO_OPTION);
        if(check==JOptionPane.YES_OPTION){
            yeuCauXuLyInThongKeTheoNgay();
        }
        }
        //jlbTongTien.setText(ThongKeBus.getTongDoanhThu(jcNgayBD.getDate(), jcNgayKT.getDate())+"  VND");
        
        
    }//GEN-LAST:event_jbtNgayMouseClicked

    private void jbtThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThangMouseClicked
        // TODO add your handling code here:
        if(kiemTraThoiGianHopLe()){
            hienThiBieuDoTheoThang(jpnBieuDo);
            yeuCauTinhTongDoanhThu();
            hienThiTongDoanhThu();
            int check=JOptionPane.showConfirmDialog(null, "In thống kê hóa đơn theo tháng?", "In thống kê hóa đơn", JOptionPane.YES_NO_OPTION);
        if(check==JOptionPane.YES_OPTION){
            yeuCauXuLyInThongKeTheoThang();
        }
        }
        //jlbTongTien.setText(ThongKeBus.getTongDoanhThu(jcNgayBD.getDate(), jcNgayKT.getDate())+"  VND");
    }//GEN-LAST:event_jbtThangMouseClicked

    private void jbtNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtNamMouseClicked
        // TODO add your handling code here:
        if(kiemTraThoiGianHopLe()){
            hienThiBieuDoTheoNam(jpnBieuDo);
            yeuCauTinhTongDoanhThu();
            hienThiTongDoanhThu();
            int check=JOptionPane.showConfirmDialog(null, "In thống kê hóa đơn theo năm?", "In thống kê hóa đơn", JOptionPane.YES_NO_OPTION);
        if(check==JOptionPane.YES_OPTION){
            yeuCauXuLyInThongKeTheoNam();
        }
        }
       // jlbTongTien.setText(ThongKeBus.getTongDoanhThu(jcNgayBD.getDate(), jcNgayKT.getDate())+"  VND");
    }//GEN-LAST:event_jbtNamMouseClicked

    private void jbtNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtNgayActionPerformed

    private void jbtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtNamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtNam;
    private javax.swing.JButton jbtNgay;
    private javax.swing.JButton jbtThang;
    private com.toedter.calendar.JDateChooser jcNgayBD;
    private com.toedter.calendar.JDateChooser jcNgayKT;
    private javax.swing.JPanel jpnBieuDo;
    private javax.swing.JPanel jpnBody;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnNgay;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTextField jtfTongDoanhso;
    // End of variables declaration//GEN-END:variables

    private void yeuCauXuLyInThongKeTheoNgay() {
        ThongKeBus.inThongKeTheoNgay(jcNgayBD.getDate(), jcNgayKT.getDate());
    }
    
    private void yeuCauXuLyInThongKeTheoThang() {
        ThongKeBus.inThongKeTheoThang(jcNgayBD.getDate(), jcNgayKT.getDate());
    }
    
    private void yeuCauXuLyInThongKeTheoNam() {
        ThongKeBus.inThongKeTheoNam(jcNgayBD.getDate(), jcNgayKT.getDate());
    }
    
    private void yeuCauTinhTongDoanhThu(){
        tongDoanhThu=ThongKeBus.tinhTongDoanhThuHoaDon(jcNgayBD.getDate(),jcNgayKT.getDate());
    }
    
    private void hienThiTongDoanhThu(){
        jtfTongDoanhso.setText(String.valueOf(tongDoanhThu));
    }
}
