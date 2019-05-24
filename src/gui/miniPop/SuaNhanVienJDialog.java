/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import bus.NhanVienBus;
import dto.NhanVienDTO;
import gui.QuanLyNhanVienJPanel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuan
 */

public class SuaNhanVienJDialog extends javax.swing.JDialog {
   
    DefaultTableModel dtm;
    JTable jtable;
    NhanVienDTO nv; 
    NhanVienDTO newInfoNhanVien; //lưu trữ dữ liệu mới của người dùng nhập vào
    ArrayList<NhanVienDTO> listNV;
//    public SuaNhanVienJDialog(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
//        initComponents();
//    }
//    
//    public SuaNhanVienJDialog() {
//        initComponents();
//    }
    
//    public SuaNhanVienJDialog(ArrayList<NhanVienDTO> listNV, DefaultTableModel dtm,JTable jtable,NhanVienDTO nv ) {            
//    NhanVienDTO nv; 
//    NhanVienDTO newInfoNhanVien; //lưu trữ dữ liệu mới của người dùng nhập vào
//    ArrayList<NhanVienDTO> listNV;

    public SuaNhanVienJDialog(ArrayList<NhanVienDTO> listNV, DefaultTableModel dtm,JTable jtable,NhanVienDTO nv ) {            
        initComponents();
        jtfMaNhanVien.disable();
        this.dtm=dtm;
        this.jtable=jtable;
        this.nv=nv;
        this.listNV=listNV;
        chuyenDuLieu();
        
    }

    public void chuyenDuLieu(){
        jtfMaNhanVien.setText(Integer.toString(nv.getMaNhanVien())); //chuyển số về chuỗi
        jtfHoVaten.setText(nv.getHoTen());
        jcNgaySinh.setDate(nv.getNgaySinh());
        jcNgayVaoLam.setDate(nv.getNgayVaoLam());
        jtfCMND.setText(Integer.toString(nv.getCMND()));
        jcbbGioiTinh.setSelectedItem(nv.getGioiTinh());
        jtfDiaChi.setText(nv.getDiaChi());
        jtfEmail.setText(nv.getEmail());
        jtfSoDT.setText(nv.getSoDT());
        jcbbTrangThai.setSelectedItem(nv.getTrangThai());
        NhanVienBus.loadComboBoxTenNguoiQuanLy(jcbbNguoiQuanLy);
        jcbbNguoiQuanLy.setSelectedItem(nv.getTenNguoiQL());
        
    }
    
    private void layDuLieuTuForm() {
        newInfoNhanVien=new NhanVienDTO("");
        try{
        newInfoNhanVien.setCMND(Integer.parseInt(jtfCMND.getText()));
        }
        catch(NumberFormatException nfe)
        {
            return;
        }
        newInfoNhanVien.setMaNhanVien(Integer.parseInt(jtfMaNhanVien.getText()));
        newInfoNhanVien.setHoTen(jtfHoVaten.getText());
        
        newInfoNhanVien.setDiaChi(jtfDiaChi.getText());
        newInfoNhanVien.setGioiTinh(jcbbGioiTinh.getSelectedItem().toString());
        newInfoNhanVien.setNgaySinh(jcNgaySinh.getDate());
        newInfoNhanVien.setNgayVaoLam(jcNgayVaoLam.getDate());
        newInfoNhanVien.setSoDT(jtfSoDT.getText());
        newInfoNhanVien.setTrangThai(jcbbTrangThai.getSelectedItem().toString());
        newInfoNhanVien.setEmail(jtfEmail.getText());
       try{
           
//        if(jcbbNguoiQuanLy.getSelectedItem().toString().equals(""))
//            newInfoNhanVien.setTenNguoiQL(null);
//        else
//        {
//            newInfoNhanVien.setTenNguoiQL(jcbbNguoiQuanLy.getSelectedItem().toString());
//        }
        int a=jcbbNguoiQuanLy.getSelectedIndex()-1;
        if(a==-1)
        {
             newInfoNhanVien.setTenNguoiQL("");
        }
        //System.out.println(NhanVienBus.loadComboBoxTenNguoiQuanLy(jcbbNguoiQuanLy).get(a).getHoTen());
        else
        {  
            newInfoNhanVien.setTenNguoiQL(NhanVienBus.loadComboBoxTenNguoiQuanLy(jcbbNguoiQuanLy).get(a).getHoTen());
        }
       }
       catch(NullPointerException ne)
       {
       }
    }
    public void showWindows(){
       // this.setSize(400,500);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       this.setVisible(true);        
    }

     private void refreshData() throws SQLException{
//        dtm.setRowCount(0);
//        listNV=NhanVienBus.getDuLieuNhanVien();
//        for (NhanVienDTO nv:listNV){
//            Vector<Object> vec=new Vector<Object>();
//            vec.add(nv.getMaNhanVien());
//            vec.add(nv.getHoTen());
//            vec.add(nv.getNgaySinh());
//            vec.add(nv.getNgayVaoLam());
//            vec.add(nv.getCMND());
//            vec.add(nv.getSoDT());
//            vec.add(nv.getTenNguoiQL());
//            vec.add(nv.getGioiTinh());
//            vec.add(nv.getEmail());
//            vec.add(nv.getDiaChi());
//            vec.add(nv.getTrangThai());
//            dtm.addRow(vec);
//        }
         QuanLyNhanVienJPanel.refreshNhanVien();
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfMaNhanVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfHoVaten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jcNgayVaoLam = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jtfCMND = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfSoDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbbGioiTinh = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbbTrangThai = new javax.swing.JComboBox();
        jbtLuu = new javax.swing.JButton();
        jbtHuy = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jcbbNguoiQuanLy = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhân viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jtfMaNhanVien.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Họ và tên");

        jtfHoVaten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày vào làm");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CMND");

        jtfCMND.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jtfSoDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Giới tính");

        jcbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email");

        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Địa chỉ");

        jtfDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Trạng thái");

        jcbbTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Đang làm", "Đã nghỉ" }));

        jbtLuu.setText("Lưu");
        jbtLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtLuuMouseClicked(evt);
            }
        });

        jbtHuy.setText("Hủy");
        jbtHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtHuyMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Người quản lý");

        jcbbNguoiQuanLy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbbNguoiQuanLy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbbNguoiQuanLy.setToolTipText("");
        jcbbNguoiQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbNguoiQuanLyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfMaNhanVien)
                    .addComponent(jtfHoVaten)
                    .addComponent(jcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jcNgayVaoLam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCMND)
                    .addComponent(jcbbNguoiQuanLy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(146, 146, 146)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfSoDT)
                                .addComponent(jcbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfEmail)
                                .addComponent(jtfDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                            .addComponent(jcbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMaNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfHoVaten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcNgayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbNguoiQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jbtLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtLuuMouseClicked
        // TODO add your handling code here:
        layDuLieuTuForm();
        
        try
        {
            if(newInfoNhanVien!=null){
                if(NhanVienBus.suaNhanVien(newInfoNhanVien,jcbbNguoiQuanLy)==1)
                {
                    JOptionPane.showMessageDialog(null, "Cập nhật xong");
                 }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
                }
            }   
            refreshData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Lỗi",1);
        }
    }//GEN-LAST:event_jbtLuuMouseClicked

    private void jbtHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHuyMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jbtHuyMouseClicked

    private void jcbbNguoiQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbNguoiQuanLyActionPerformed
        // TODO add your handling code here:
        System.out.println(jcbbNguoiQuanLy.getSelectedIndex());
    }//GEN-LAST:event_jcbbNguoiQuanLyActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtHuy;
    private javax.swing.JButton jbtLuu;
    private com.toedter.calendar.JDateChooser jcNgaySinh;
    private com.toedter.calendar.JDateChooser jcNgayVaoLam;
    private javax.swing.JComboBox jcbbGioiTinh;
    private javax.swing.JComboBox jcbbNguoiQuanLy;
    private javax.swing.JComboBox jcbbTrangThai;
    private javax.swing.JTextField jtfCMND;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoVaten;
    private javax.swing.JTextField jtfMaNhanVien;
    private javax.swing.JTextField jtfSoDT;
    // End of variables declaration//GEN-END:variables
}
