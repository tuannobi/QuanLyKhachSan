/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bus.LoaiPhongBUS;
import bus.PhongBUS;
import dto.LoaiPhongDTO;
import dto.PhongDTO;
import gui.miniPop.HienThiFormDienThongTinThuePhongJDialog;
import gui.miniPop.HienThiThongTinPhong;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class ManHinhQuanLyThuePhongJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongJPanel
     */
    public ManHinhQuanLyThuePhongJPanel() {
        initComponents();
       hienThiLoaiPhong();
    }

    private ArrayList<JPanelPhong> listPhongJPanels;
    private ArrayList<LoaiPhongDTO> listLoaiPhongDTOs;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtTimKiem = new javax.swing.JButton();
        jcDenNgay = new com.toedter.calendar.JDateChooser();
        jlbLoaiPhong = new javax.swing.JLabel();
        jcbbLoaiPhong = new javax.swing.JComboBox<>();
        jspHienThi = new javax.swing.JScrollPane();
        jpnHienThi = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jpnThanhTren.setBackground(new java.awt.Color(153, 153, 255));
        jpnThanhTren.setPreferredSize(new java.awt.Dimension(951, 65));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ngày đi");

        jbtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TimKiem.png"))); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        jlbLoaiPhong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbLoaiPhong.setText("Loại phòng");

        jcbbLoaiPhong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbLoaiPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbLoaiPhong)
                .addGap(29, 29, 29)
                .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jbtTimKiem)
                .addGap(36, 36, 36))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnThanhTrenLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtTimKiem)
                            .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbLoaiPhong)))
                    .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jspHienThi.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspHienThi.setPreferredSize(new java.awt.Dimension(790, 800));

        jpnHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnHienThi.setPreferredSize(new java.awt.Dimension(790, 800));

        javax.swing.GroupLayout jpnHienThiLayout = new javax.swing.GroupLayout(jpnHienThi);
        jpnHienThi.setLayout(jpnHienThiLayout);
        jpnHienThiLayout.setHorizontalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jpnHienThiLayout.setVerticalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jspHienThi.setViewportView(jpnHienThi);

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbLoaiPhongActionPerformed
       // jcbbLoaiPhong.getSelectedItem();
    }//GEN-LAST:event_jcbbLoaiPhongActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        if(kiemTraNgayThangHopLe()){
        yeuCauHienThiListPhongDuocThue();
        yeuCauHienThiFormDienThongTinThuePhong();
        }
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtTimKiem;
    private com.toedter.calendar.JDateChooser jcDenNgay;
    private javax.swing.JComboBox<LoaiPhongDTO> jcbbLoaiPhong;
    private javax.swing.JLabel jlbLoaiPhong;
    private static javax.swing.JPanel jpnHienThi;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JScrollPane jspHienThi;
    // End of variables declaration//GEN-END:variables

    private void yeuCauHienThiFormDienThongTinThuePhong(){
        Component[] coms=jpnHienThi.getComponents(); //lấy tất cả componet trên màn hình hiển thị
        for (Component com:coms){
            if (com instanceof JPanelPhong){
                JPanelPhong selectedJPanelPhong = (JPanelPhong) com;
                selectedJPanelPhong.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                            HienThiFormDienThongTinThuePhongJDialog formThuePhongJDialog=new HienThiFormDienThongTinThuePhongJDialog(selectedJPanelPhong,(LoaiPhongDTO)jcbbLoaiPhong.getSelectedItem(),jcDenNgay);
                        
                      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
        }
        
    }
    
    private void yeuCauHienThiListPhongDuocThue(){
        jpnHienThi.removeAll();      
        listPhongJPanels=PhongBUS.layDanhSachCacPhongCoTheThue(jcDenNgay.getDate(),((LoaiPhongDTO)jcbbLoaiPhong.getSelectedItem()).getMaLoaiPhong());
        if(listPhongJPanels.size()<=0){
            JOptionPane.showMessageDialog(null, "Không có phòng nào phù hợp");
            return;
        }
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong phong:listPhongJPanels){
            jpnHienThi.add(phong);
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
    }
    
    private void hienThiLoaiPhong(){
        listLoaiPhongDTOs=LoaiPhongBUS.layDuLieuLoaiPhong();
        for (LoaiPhongDTO loaiPhongDTO:listLoaiPhongDTOs){
            jcbbLoaiPhong.addItem(loaiPhongDTO);
        }
    }

    private boolean kiemTraNgayThangHopLe() {
        Date date=new Date();
        if (jcDenNgay.getDate()==null){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập ngày đi");
            return false;
        }
        else if(jcDenNgay.getDate().getTime()<=date.getTime()){
            JOptionPane.showMessageDialog(null, "Ngày đi phải lớn hơn ngày hiện tại");
            return false;
        }
        else{
        return true;
        }
    }
}
