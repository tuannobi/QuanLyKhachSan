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
public class ThuePhongJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongJPanel
     */
    public ThuePhongJPanel() {
        initComponents();
        loadLoaiPhong();
        loadData();
    }

    private ArrayList<JPanelPhong> listPhongJPanels;
    private ArrayList<PhongDTO> listPhongDTOs;
    private ArrayList<Integer> listPhongDuocThue;
    

    
    private void loadData(){
        listPhongJPanels=new ArrayList<JPanelPhong>();
        listPhongDTOs=PhongBUS.getDuLieuPhong();
       // JOptionPane.showMessageDialog(null, listPhongDTOs.size());
       int soPhong=listPhongDTOs.size();
        //gán listPhongDTOs vào listPhongJPanels để hiển thị
        for (int i=0;i<soPhong;i++){
            JPanelPhong tempJPanel=new JPanelPhong();
            tempJPanel.setLayout(new BoxLayout(tempJPanel, BoxLayout.Y_AXIS));
            
            JPanel tempMaPhongJPanel=new JPanel();
            tempMaPhongJPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JPanel tempTenLoaiPhongJPanel=new JPanel();
            tempTenLoaiPhongJPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JPanel tempGiaTienJPanel=new JPanel();
            tempGiaTienJPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            
            JLabel tempMaPhong=new JLabel(Integer.toString(listPhongDTOs.get(i).getMaPhong()));
            JLabel tempTenLoaiPhong=new JLabel(listPhongDTOs.get(i).getTenLoaiPhong());
            JLabel tempGiaTien =new JLabel(String.valueOf(listPhongDTOs.get(i).getGiaPhong()));
            
            tempMaPhongJPanel.add(tempMaPhong);
            tempTenLoaiPhongJPanel.add(tempTenLoaiPhong);
            tempGiaTienJPanel.add(tempGiaTien);
            
            tempMaPhong.setFont(new Font("Arial",Font.BOLD,12));
            tempTenLoaiPhong.setFont(new Font("Arial",Font.BOLD,12));
            tempGiaTien.setFont(new Font("Arial",Font.BOLD,12));
            
            tempJPanel.setPreferredSize(new Dimension(100, 100));
            tempJPanel.add(tempMaPhongJPanel);
            tempJPanel.add(tempTenLoaiPhongJPanel);
            tempJPanel.add(tempGiaTienJPanel);
            
            //set border layout
            Border border=BorderFactory.createLineBorder(Color.red);
            tempJPanel.setBorder(border);
            //Thêm thuộc tính của từng phòng vào jpanelPhong
            tempJPanel.setMaPhong(listPhongDTOs.get(i).getMaPhong());
            tempJPanel.setTenLoaiPhong(listPhongDTOs.get(i).getTenLoaiPhong());
            tempJPanel.setTrangThai(listPhongDTOs.get(i).getTrangThai());
            tempJPanel.setGiaPhong(listPhongDTOs.get(i).getGiaPhong());
            
            //--Các thuộc tính bổ sung:
            tempJPanel.setTenKhachHang(listPhongDTOs.get(i).getTenKhachHang());
            tempJPanel.setCmndKH(listPhongDTOs.get(i).getCmndKH());
            tempJPanel.setNgayDen(listPhongDTOs.get(i).getNgayDen());
            tempJPanel.setNgayDi(listPhongDTOs.get(i).getNgayDi());
            tempJPanel.setHotenNV(listPhongDTOs.get(i).getHotenNV());
            tempJPanel.setCmndNV(listPhongDTOs.get(i).getCmndNV());
            //setback ground
            if (tempJPanel.getTrangThai().equalsIgnoreCase("C")){
                tempMaPhongJPanel.setBackground(Color.blue);
//                tempTenLoaiPhongJPanel.setBackground(Color.blue);
//                tempGiaTienJPanel.setBackground(Color.blue);
            }
            if (tempJPanel.getTrangThai().equalsIgnoreCase("K")){
                tempMaPhongJPanel.setBackground(Color.white);
//                tempTenLoaiPhongJPanel.setBackground(Color.white);
//                tempGiaTien.setBackground(Color.white);
            }
            listPhongJPanels.add(tempJPanel); //them jpanel vao list
        }
        
    }
    
    
    private void addEventEveryRoom(){
        Component[] coms=jpnHienThi.getComponents(); //lấy tất cả componet trên màn hình hiển thị
        for (Component com:coms){
            if (com instanceof JPanelPhong){
                JPanelPhong selectedJPanelPhong = (JPanelPhong) com;
                selectedJPanelPhong.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                            HienThiFormDienThongTinThuePhongJDialog formThuePhongJDialog=new HienThiFormDienThongTinThuePhongJDialog(selectedJPanelPhong,(LoaiPhongDTO)jcbbLoaiPhong.getSelectedItem());
                        
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
    
    public void xuLyHienThiListPhongDuocThue(){
        loadData();
        jpnHienThi.removeAll();
        listPhongDuocThue=new ArrayList<>();
        
        listPhongDuocThue=PhongBUS.getCacPhongDuocThue( jcDenNgay.getDate(),((LoaiPhongDTO)jcbbLoaiPhong.getSelectedItem()).getMaLoaiPhong());
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (int maPhong:listPhongDuocThue){
            for (JPanelPhong phong:listPhongJPanels){
                if (maPhong==phong.getMaPhong())
                {
                    jpnHienThi.add(phong);
                }
            }
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
    }
    

    
        private void loadLoaiPhong(){
            ArrayList<LoaiPhongDTO> listLoaiPhongDTOs= new ArrayList<>();
            listLoaiPhongDTOs=LoaiPhongBUS.getLoaiPhong();
            for(LoaiPhongDTO phong:listLoaiPhongDTOs){
                jcbbLoaiPhong.addItem(phong);
            }
        }
    
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

        jLabel2.setText("Ngày đi");

        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        jlbLoaiPhong.setText("Loại phòng");

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
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbLoaiPhong)
                .addGap(18, 18, 18)
                .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbtTimKiem)
                .addGap(129, 129, 129))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnThanhTrenLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jbtTimKiem)
                            .addComponent(jlbLoaiPhong)
                            .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jspHienThi.setPreferredSize(new java.awt.Dimension(790, 427));

        jpnHienThi.setPreferredSize(new java.awt.Dimension(790, 427));

        javax.swing.GroupLayout jpnHienThiLayout = new javax.swing.GroupLayout(jpnHienThi);
        jpnHienThi.setLayout(jpnHienThiLayout);
        jpnHienThiLayout.setHorizontalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        jpnHienThiLayout.setVerticalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jspHienThi.setViewportView(jpnHienThi);

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbLoaiPhongActionPerformed
       // jcbbLoaiPhong.getSelectedItem();
    }//GEN-LAST:event_jcbbLoaiPhongActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        xuLyHienThiListPhongDuocThue();
        addEventEveryRoom();
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
}
