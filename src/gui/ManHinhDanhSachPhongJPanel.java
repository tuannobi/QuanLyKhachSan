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
import gui.miniPop.FormChonThaoTacKhiClickVaoPhongJDialog;
import gui.miniPop.HienThiThongTinPhong;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class ManHinhDanhSachPhongJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongJPanel
     */
    
    private static ArrayList<JPanelPhong> listPhongJPanels;
    private ArrayList<LoaiPhongDTO> listLoaiPhongDTOs;
    ArrayList<PhongDTO> listPhongDTOs;
    LoaiPhongDTO selectedLoaiPhong;
    
    public ManHinhDanhSachPhongJPanel() {
        initComponents();
        hienThiDanhSachPhong();
        hienThiLoaiPhong();
        setVisible(true);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jlbLoaiPhong = new javax.swing.JLabel();
        jcbbLoaiPhong = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();
        jrbTatCaPhong = new javax.swing.JRadioButton();
        jrbPhongTrong = new javax.swing.JRadioButton();
        jrbPhongDaThue = new javax.swing.JRadioButton();
        jbtTimKiem = new javax.swing.JButton();
        jspHienThi = new javax.swing.JScrollPane();
        jpnHienThi = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jpnThanhTren.setBackground(new java.awt.Color(153, 153, 255));

        jlbLoaiPhong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbLoaiPhong.setText("Loại phòng");

        jcbbLoaiPhong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbbLoaiPhong.setToolTipText("");
        jcbbLoaiPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbbLoaiPhongMouseClicked(evt);
            }
        });
        jcbbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbLoaiPhongActionPerformed(evt);
            }
        });

        jtfTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buttonGroup1.add(jrbTatCaPhong);
        jrbTatCaPhong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jrbTatCaPhong.setText("Tất cả phòng");
        jrbTatCaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTatCaPhongActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbPhongTrong);
        jrbPhongTrong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jrbPhongTrong.setText("Phòng trống");
        jrbPhongTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPhongTrongActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbPhongDaThue);
        jrbPhongDaThue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jrbPhongDaThue.setText("Phòng đã thuê");
        jrbPhongDaThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPhongDaThueActionPerformed(evt);
            }
        });

        jbtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TimKiem.png"))); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThanhTrenLayout = new javax.swing.GroupLayout(jpnThanhTren);
        jpnThanhTren.setLayout(jpnThanhTrenLayout);
        jpnThanhTrenLayout.setHorizontalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jbtTimKiem)
                .addGap(38, 38, 38)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jlbLoaiPhong)
                .addGap(18, 18, 18)
                .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jrbTatCaPhong)
                .addGap(18, 18, 18)
                .addComponent(jrbPhongTrong)
                .addGap(18, 18, 18)
                .addComponent(jrbPhongDaThue)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLoaiPhong)
                    .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPhongTrong)
                    .addComponent(jrbPhongDaThue)
                    .addComponent(jbtTimKiem)
                    .addComponent(jrbTatCaPhong))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jspHienThi.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jspHienThi.setPreferredSize(new java.awt.Dimension(790, 800));

        jpnHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnHienThi.setPreferredSize(new java.awt.Dimension(700, 1000));

        javax.swing.GroupLayout jpnHienThiLayout = new javax.swing.GroupLayout(jpnHienThi);
        jpnHienThi.setLayout(jpnHienThiLayout);
        jpnHienThiLayout.setHorizontalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );
        jpnHienThiLayout.setVerticalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jspHienThi.setViewportView(jpnHienThi);

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTatCaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTatCaPhongActionPerformed
          hienThiDanhSachPhong();
    }//GEN-LAST:event_jrbTatCaPhongActionPerformed

    private void jrbPhongTrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPhongTrongActionPerformed
        yeuCauHienThiKetQuaLocPhongTrong();
    }//GEN-LAST:event_jrbPhongTrongActionPerformed

    private void jrbPhongDaThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPhongDaThueActionPerformed
        yeuCauHienThiKetQuaLocPhongDaThue();
    }//GEN-LAST:event_jrbPhongDaThueActionPerformed

    private void jcbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbLoaiPhongActionPerformed
       if (jcbbLoaiPhong.getSelectedItem()==null){
           return;
       }
       else{
           yeuCauHienThiKetQuaLocKhiChonLoaiPhong();
       }
    }//GEN-LAST:event_jcbbLoaiPhongActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        if (jtfTimKiem.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nhập từ khóa tìm kiếm");
        }
        else
            yeuCauHienThiKetQuaTimKiem();
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jcbbLoaiPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbbLoaiPhongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbbLoaiPhongMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JComboBox<LoaiPhongDTO> jcbbLoaiPhong;
    private javax.swing.JLabel jlbLoaiPhong;
    private static javax.swing.JPanel jpnHienThi;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JRadioButton jrbPhongDaThue;
    private javax.swing.JRadioButton jrbPhongTrong;
    private javax.swing.JRadioButton jrbTatCaPhong;
    private javax.swing.JScrollPane jspHienThi;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables

    
    private static void yeuCauHienThiFormChonThaoTacKhiClickVaoPhong(){
        Component[] coms=jpnHienThi.getComponents(); //lấy tất cả componet trên màn hình hiển thị
        for (Component com:coms){
            if (com instanceof JPanelPhong){ //lấy ra các loại kiểu dữ liệu JPanelPhong
                JPanelPhong selectedJPanelPhong = (JPanelPhong) com;
                selectedJPanelPhong.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //hiển thị popup thông tin phòng lên
                            FormChonThaoTacKhiClickVaoPhongJDialog clickVaoPhong =new FormChonThaoTacKhiClickVaoPhongJDialog(selectedJPanelPhong);
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
    
    public static void hienThiDanhSachPhong(){
        listPhongJPanels=PhongBUS.layThongTinTatCaPhong();
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
           for (JPanelPhong phong:listPhongJPanels){
               jpnHienThi.add(phong);
           }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        yeuCauHienThiFormChonThaoTacKhiClickVaoPhong();
    }
    
    private void yeuCauHienThiKetQuaLocPhongTrong(){
        listPhongJPanels=PhongBUS.layThongTinTatCaPhong();
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong jpnPhong:listPhongJPanels){
            if (jpnPhong.getTrangThai().equalsIgnoreCase("Trống")){            
                jpnHienThi.add(jpnPhong);
            }      
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        yeuCauHienThiFormChonThaoTacKhiClickVaoPhong();
    }
    
    private void yeuCauHienThiKetQuaLocPhongDaThue(){
        listPhongJPanels=PhongBUS.layThongTinTatCaPhong();
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong jpnPhong:listPhongJPanels){
            if (jpnPhong.getTrangThai().equalsIgnoreCase("Đang thuê")){            
                jpnHienThi.add(jpnPhong);
            }
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        yeuCauHienThiFormChonThaoTacKhiClickVaoPhong();
    }
    
    private void hienThiLoaiPhong(){
        listLoaiPhongDTOs=LoaiPhongBUS.layDuLieuLoaiPhong();
        LoaiPhongDTO tatCa=new LoaiPhongDTO();
        tatCa.setMaLoaiPhong(0);
        tatCa.setTenLoaiPhong("Tất cả");
        tatCa.setGiaPhong(0);
        jcbbLoaiPhong.addItem(tatCa);
        for (LoaiPhongDTO loaiPhongDTO:listLoaiPhongDTOs){
            jcbbLoaiPhong.addItem(loaiPhongDTO);
        }
    }

    private void yeuCauHienThiKetQuaLocKhiChonLoaiPhong() {
        selectedLoaiPhong=new LoaiPhongDTO();
        selectedLoaiPhong=(LoaiPhongDTO)jcbbLoaiPhong.getSelectedItem();  
       // JOptionPane.showMessageDialog(null, selectedLoaiPhong.getMaLoaiPhong());
      //  listPhongJPanels=PhongBUS.layThongTinTatCaPhong();
      //  JOptionPane.showMessageDialog(null, listPhongJPanels.size());
        if (selectedLoaiPhong.getMaLoaiPhong()==0){
            hienThiDanhSachPhong();
        }
        else{
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong jpnPhong:listPhongJPanels){
            if(selectedLoaiPhong.getMaLoaiPhong()==jpnPhong.getMaLoaiPhong())
                jpnHienThi.add(jpnPhong);
        }  
        jpnHienThi.repaint();
        jpnHienThi.validate();
        }
    }

    private void yeuCauHienThiKetQuaTimKiem() {
       listPhongJPanels=PhongBUS.layKetQuaTimKiemODanhSachPhong(jtfTimKiem.getText());
       if (listPhongJPanels.size()<=0){
           JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả nào");
       }
       else{
       jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong jpnPhong:listPhongJPanels){
            jpnHienThi.add(jpnPhong);
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        yeuCauHienThiFormChonThaoTacKhiClickVaoPhong();
       }
    }

        
}
