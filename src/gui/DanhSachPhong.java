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
import javax.swing.border.Border;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class DanhSachPhong extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongJPanel
     */
    public DanhSachPhong() {
        initComponents();
        setVisible(true);
        hienThiListPhong();
        loadLoaiPhong();
    }

    private ArrayList<JPanelPhong> listPhongJPanels;
    private ArrayList<PhongDTO> listPhongDTOs;
   // private JPanelPhong selectedJPanelPhong;
    private ArrayList<LoaiPhongDTO> listLoaiPhongDTOs;
    //private ArrayList<JPanelPhong> listPhongHienThoiJPanels;

    
    private void loadData(){
        //listPhongHienThoiJPanels=new ArrayList<JPanelPhong>();
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
    
    private void hienThiListPhong(){
        loadData();
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        //jpnHienThi.setLayout(new GridLayout());
        int soPhong=listPhongJPanels.size();
        
        for (int i=0;i<soPhong;i++){
            jpnHienThi.add(listPhongJPanels.get(i));
            
         //   listPhongHienThoiJPanels.add(listPhongJPanels.get(i));
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        addEventEveryRoom();
    }
    
    private void hienThiPhongTrong(){
        loadData();
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong jpnPhong:listPhongJPanels){
            if (jpnPhong.getTrangThai().equalsIgnoreCase("K")){            
                jpnHienThi.add(jpnPhong);
                
            //    listPhongHienThoiJPanels.add(jpnPhong);
            }
           
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        addEventEveryRoom();
    }
    
    private void hienThiPhongDaThue(){
        loadData();
        jpnHienThi.removeAll();
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (JPanelPhong jpnPhong:listPhongJPanels){
            if (jpnPhong.getTrangThai().equalsIgnoreCase("C")){            
                jpnHienThi.add(jpnPhong);
                
             //   listPhongHienThoiJPanels.add(jpnPhong);
            }
        }
        jpnHienThi.repaint();
        jpnHienThi.validate();
        addEventEveryRoom();
    }
    
    private void addEventEveryRoom(){
        Component[] coms=jpnHienThi.getComponents(); //lấy tất cả componet trên màn hình hiển thị
        for (Component com:coms){
            if (com instanceof JPanelPhong){ //lấy ra các loại kiểu dữ liệu JPanelPhong
                JPanelPhong selectedJPanelPhong = (JPanelPhong) com;
                selectedJPanelPhong.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //hiển thị popup thông tin phòng lên
                            HienThiThongTinPhong phongTrongJpn =new HienThiThongTinPhong(selectedJPanelPhong);
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
    
    
    private void loadLoaiPhong(){
         listLoaiPhongDTOs =new ArrayList<>();
        listLoaiPhongDTOs=LoaiPhongBUS.getLoaiPhong();
        for (LoaiPhongDTO loaiPhongDTO:listLoaiPhongDTOs){
            jcbbLoaiPhong.addItem(loaiPhongDTO.getTenLoaiPhong());
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbLoaiPhong = new javax.swing.JLabel();
        jcbbLoaiPhong = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jrbTatCaPhong = new javax.swing.JRadioButton();
        jrbPhongTrong = new javax.swing.JRadioButton();
        jrbPhongDaThue = new javax.swing.JRadioButton();
        jbtTimKiem = new javax.swing.JButton();
        jspHienThi = new javax.swing.JScrollPane();
        jpnHienThi = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jpnThanhTren.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Nhập từ khóa");

        jlbLoaiPhong.setText("Loại phòng");

        jcbbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        jcbbLoaiPhong.setToolTipText("");
        jcbbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbLoaiPhongActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbTatCaPhong);
        jrbTatCaPhong.setText("Tất cả phòng");
        jrbTatCaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTatCaPhongActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbPhongTrong);
        jrbPhongTrong.setText("Phòng trống");
        jrbPhongTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPhongTrongActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbPhongDaThue);
        jrbPhongDaThue.setText("Phòng đã thuê");
        jrbPhongDaThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPhongDaThueActionPerformed(evt);
            }
        });

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
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbtTimKiem)
                .addGap(57, 57, 57)
                .addComponent(jlbLoaiPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jrbTatCaPhong)
                .addGap(18, 18, 18)
                .addComponent(jrbPhongTrong)
                .addGap(18, 18, 18)
                .addComponent(jrbPhongDaThue)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jpnThanhTrenLayout.setVerticalGroup(
            jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThanhTrenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlbLoaiPhong)
                    .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPhongTrong)
                    .addComponent(jrbPhongDaThue)
                    .addComponent(jbtTimKiem)
                    .addComponent(jrbTatCaPhong))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jspHienThi.setPreferredSize(new java.awt.Dimension(500, 200));

        jpnHienThi.setPreferredSize(new java.awt.Dimension(700, 650));

        javax.swing.GroupLayout jpnHienThiLayout = new javax.swing.GroupLayout(jpnHienThi);
        jpnHienThi.setLayout(jpnHienThiLayout);
        jpnHienThiLayout.setHorizontalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        jpnHienThiLayout.setVerticalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
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
                .addComponent(jspHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTatCaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTatCaPhongActionPerformed
          hienThiListPhong();
    }//GEN-LAST:event_jrbTatCaPhongActionPerformed

    private void jrbPhongTrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPhongTrongActionPerformed
        hienThiPhongTrong();
    }//GEN-LAST:event_jrbPhongTrongActionPerformed

    private void jrbPhongDaThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPhongDaThueActionPerformed
        hienThiPhongDaThue();
    }//GEN-LAST:event_jrbPhongDaThueActionPerformed

    private void jcbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbLoaiPhongActionPerformed
       jpnHienThi.removeAll();
        String tenLoaiPhong=(String)jcbbLoaiPhong.getSelectedItem();
       for (JPanelPhong phong:listPhongJPanels){
           if (phong.getTenLoaiPhong().equals(tenLoaiPhong)){
               jpnHienThi.add(phong);
           }
       }
       if (tenLoaiPhong.equals("Tất cả")){
               hienThiListPhong();
           }
       jpnHienThi.repaint();
       jpnHienThi.validate();
    }//GEN-LAST:event_jcbbLoaiPhongActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed

        
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JComboBox<String> jcbbLoaiPhong;
    private javax.swing.JLabel jlbLoaiPhong;
    private static javax.swing.JPanel jpnHienThi;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JRadioButton jrbPhongDaThue;
    private javax.swing.JRadioButton jrbPhongTrong;
    private javax.swing.JRadioButton jrbTatCaPhong;
    private javax.swing.JScrollPane jspHienThi;
    // End of variables declaration//GEN-END:variables

    
}
