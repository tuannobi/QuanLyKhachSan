/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import bus.LoaiPhongBUS;
import bus.PhongBUS;
import com.toedter.calendar.JDateChooser;
import dto.LoaiPhongDTO;
import dto.PhongDTO;
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
import javax.swing.JTextField;
import javax.swing.border.Border;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class HienThiFormChonLaiPhong_CapNhatPhieuDatPhongJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HienThiFormChonLaiPhong_CapNhatPhieuDatPhongJDialog
     */
    private ArrayList<JPanelPhong> listPhongJPanels;
    private ArrayList<PhongDTO> listPhongDTOs;
    private ArrayList<Integer> listPhongDuocDat;
    JTextField jtfMaPhong;
    JDateChooser jdcNgayDen;
    JDateChooser jdcNgayDi;
    public HienThiFormChonLaiPhong_CapNhatPhieuDatPhongJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    
    public HienThiFormChonLaiPhong_CapNhatPhieuDatPhongJDialog(JTextField jtfMaPhong,
    JDateChooser jdcNgayDen,
    JDateChooser jdcNgayDi){
        initComponents();
        loadLoaiPhong();
        loadData();
        this.jtfMaPhong=jtfMaPhong;
        this.jdcNgayDen=jdcNgayDen;
        this.jdcNgayDi=jdcNgayDi;
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
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
            //setback ground
            if (tempJPanel.getTrangThai().equalsIgnoreCase("C")){
                tempMaPhongJPanel.setBackground(Color.blue);
                tempMaPhong.setForeground(Color.white);
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
                        int check= JOptionPane.showConfirmDialog(null, "Xác nhận chọn phòng "+selectedJPanelPhong.getMaPhong()+" ?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
            if (check==JOptionPane.YES_OPTION){
                jtfMaPhong.setText(Integer.toString(selectedJPanelPhong.getMaPhong()));
                          jdcNgayDen.setDate(jcTuNgay.getDate());
                          jdcNgayDi.setDate(jcDenNgay.getDate());
                          dispose();
            }
            else if (check==JOptionPane.NO_OPTION){

            }
                          jtfMaPhong.setText(Integer.toString(selectedJPanelPhong.getMaPhong()));
                          jdcNgayDen.setDate(jcTuNgay.getDate());
                          jdcNgayDi.setDate(jcDenNgay.getDate());
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
    
public void xuLyHienThiListPhongDuocDat(){
        loadData();
        jpnHienThi.removeAll();
        listPhongDuocDat=new ArrayList<>();
        
        listPhongDuocDat=PhongBUS.getCacPhongDuocDat(jcTuNgay.getDate(),jcDenNgay.getDate(),((LoaiPhongDTO)jcbbLoaiPhong.getSelectedItem()).getMaLoaiPhong());
        jpnHienThi.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (int maPhong:listPhongDuocDat){
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
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnMain = new javax.swing.JPanel();
        jpnThanhTren = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtTimKiem = new javax.swing.JButton();
        jcDenNgay = new com.toedter.calendar.JDateChooser();
        jcTuNgay = new com.toedter.calendar.JDateChooser();
        jlbLoaiPhong = new javax.swing.JLabel();
        jcbbLoaiPhong = new javax.swing.JComboBox<>();
        jspHienThi = new javax.swing.JScrollPane();
        jpnHienThi = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnThanhTren.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Từ ngày");

        jLabel2.setText("Đến ngày");

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
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jlbLoaiPhong)
                .addGap(26, 26, 26)
                .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jbtTimKiem)
                .addGap(64, 64, 64))
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
                        .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnThanhTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jbtTimKiem)
                                .addComponent(jlbLoaiPhong)
                                .addComponent(jcbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnHienThiLayout = new javax.swing.GroupLayout(jpnHienThi);
        jpnHienThi.setLayout(jpnHienThiLayout);
        jpnHienThiLayout.setHorizontalGroup(
            jpnHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
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
                .addComponent(jspHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspHienThi)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        xuLyHienThiListPhongDuocDat();
        addEventEveryRoom();
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jcbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbLoaiPhongActionPerformed
        // jcbbLoaiPhong.getSelectedItem();
    }//GEN-LAST:event_jcbbLoaiPhongActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtTimKiem;
    private com.toedter.calendar.JDateChooser jcDenNgay;
    private com.toedter.calendar.JDateChooser jcTuNgay;
    private javax.swing.JComboBox<LoaiPhongDTO> jcbbLoaiPhong;
    private javax.swing.JLabel jlbLoaiPhong;
    private static javax.swing.JPanel jpnHienThi;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JScrollPane jspHienThi;
    // End of variables declaration//GEN-END:variables
}
