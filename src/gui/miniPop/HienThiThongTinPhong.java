/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import dto.PhongDTO;
import gui.ManHinhQuanLyThuePhongJPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class HienThiThongTinPhong extends javax.swing.JDialog {

    /**
     * Creates new form HienThiChiTietPhongJDialog
     */
    JPanelPhong selectedJPanelPhong;
    
    public HienThiThongTinPhong(JPanelPhong selectedJPanelPhong){
        initComponents();
        this.selectedJPanelPhong=selectedJPanelPhong;
        setVisible(true);
        setLocationRelativeTo(null);
        chuyenDuLieuLenForm();
    }

    private void chuyenDuLieuLenForm(){
        jlbMaSoPhong.setText(String.valueOf(selectedJPanelPhong.getMaPhong()));
        jpnContent.setLayout(new BoxLayout(jpnContent, BoxLayout.Y_AXIS));
        if (selectedJPanelPhong.getTrangThai().equalsIgnoreCase("Trống")){
           // HienThiFormThongTinPhong_PhongJPanel phongtrong=new HienThiFormThongTinPhong_PhongJPanel(selectedJPanelPhong);
            jpnContent.add(new ThongTinPhong_PhongJPanel(selectedJPanelPhong));
            this.pack(); //auto Resize
        }
        else if (selectedJPanelPhong.getTrangThai().equalsIgnoreCase("Đang thuê")){
            jpnContent.add(new ThongTinPhong_PhongJPanel(selectedJPanelPhong));
            jpnContent.add(new ThongTinNhanVien_PhongJPanel(selectedJPanelPhong));
            jpnContent.add(new ThongTinKhachHang_PhongJPanel(selectedJPanelPhong));
            jpnContent.add(new ThongTinDichVu_PhongJPanel(selectedJPanelPhong));
            this.pack(); //Auto resize
        }
        jpnContent.add(new ThongTinDatPhong_PhongJPanel(selectedJPanelPhong));
        this.pack();
        
        jpnContent.repaint();
        jpnContent.validate();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jlbPhong = new javax.swing.JLabel();
        jlbMaSoPhong = new javax.swing.JLabel();
        jpnContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chi tiết phòng");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        jpnThanhTren.setBackground(new java.awt.Color(204, 204, 255));

        jlbPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbPhong.setText("Phòng");

        jlbMaSoPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbPhong)
                .addGap(18, 18, 18)
                .addComponent(jlbMaSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPhong)
                    .addComponent(jlbMaSoPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnContentLayout = new javax.swing.GroupLayout(jpnContent);
        jpnContent.setLayout(jpnContentLayout);
        jpnContentLayout.setHorizontalGroup(
            jpnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnContentLayout.setVerticalGroup(
            jpnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbMaSoPhong;
    private javax.swing.JLabel jlbPhong;
    private javax.swing.JPanel jpnContent;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnThanhTren;
    // End of variables declaration//GEN-END:variables
}
