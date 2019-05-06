/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import miniPopup.SuaKhachHangJDialog;
import model.KhachHang;
import service.KhachHangService;

/**
 *
 * @author Tuan
 */
public class QuanLyKhachHangJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyKhachHangJPanel
     */
    public QuanLyKhachHangJPanel() {
        initComponents();
        addEvents();
        hienThiDuLieuKhachHang();
        setVisible(true);
    }
    
    SuaKhachHangJDialog suaKhachHangJDialog;
    
    KhachHangService khService;
    DefaultTableModel dtmKhachHang;
    ArrayList<KhachHang> listKH;
    KhachHang khachhang;
   public void addEvents(){
        tbKhachHang.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row=tbKhachHang.getSelectedRow();
                if (row==-1)
                    return;
                khachhang=listKH.get(row); //lấy giá trị kh khi click chuột vào
                
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jbtCapNhat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (khachhang==null)
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng bạn muốn chỉnh sửa");
                else
                {
                    suaKhachHangJDialog=new SuaKhachHangJDialog();
                    suaKhachHangJDialog.showWindows();
                    suaKhachHangJDialog.setTextHoTen(khachhang.getHoTen());
                    suaKhachHangJDialog.setTextMaKH(khachhang.getMaKH());
                    /*
                    chuyển Date sang string
                    */
                    SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");                 
                    suaKhachHangJDialog.setTextNgaySinh(formater.format(khachhang.getNgaySinh()));
                    suaKhachHangJDialog.setTextCMND( String.valueOf(khachhang.getCMND()));
                    suaKhachHangJDialog.setTextGioiTinh(khachhang.getGioiTinh());
                    
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            }
        });
        
        jbtXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (khachhang==null)
                {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng muốn xóa!");
                }
                else
                {
                    int result=JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa khách hàng này không?","Warning", JOptionPane.YES_NO_OPTION);
                    if (result==JOptionPane.YES_OPTION){
                        int count=khService.xoaDuLieu(khachhang.getMaKH());
                        if (count!=-1){
                        JOptionPane.showMessageDialog(null, "Đã xóa thành công "+count+" khách hàng");
                        refreshData();
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Không tìm thấy khách hàng cần xóa");
                    }
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
   

   public void hienThiDuLieuKhachHang(){
       // Giúp cập nhật bảng sau mỗi thao tác
      
       dtmKhachHang=(DefaultTableModel)tbKhachHang.getModel();
       khService=new KhachHangService();
       listKH=new ArrayList<KhachHang>();
       listKH=khService.getDuLieuKhachHang();
       for (KhachHang kh : listKH){
           Vector<Object> vec=new Vector<Object>();
           vec.add(kh.getMaKH());
           vec.add(kh.getHoTen());
           vec.add(kh.getNgaySinh());
           vec.add(kh.getCMND());
           vec.add(kh.getGioiTinh());
           dtmKhachHang.addRow(vec);
           tbKhachHang.setModel(dtmKhachHang);
       }
   }
   
   private void refreshData(){
       dtmKhachHang.setRowCount(0);
       hienThiDuLieuKhachHang();
       
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();
        jpnThanhTren = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jpnButton = new javax.swing.JPanel();
        jbtCapNhat = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Học và tên", "Ngày sinh", "CMND", "Giới tính"
            }
        ));
        jScrollPane1.setViewportView(tbKhachHang);

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        jpnThanhTren.setForeground(new java.awt.Color(204, 204, 255));
        jpnThanhTren.setLayout(new java.awt.GridLayout(1, 0));

        jpnTitle.setBackground(new java.awt.Color(153, 153, 255));
        jpnTitle.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách khách hàng");
        jpnTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        jpnThanhTren.add(jpnTitle);

        jpnTimKiem.setBackground(new java.awt.Color(153, 153, 255));
        jpnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tìm kiếm");

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpnThanhTren.add(jpnTimKiem);

        jpnButton.setBackground(new java.awt.Color(153, 153, 255));

        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });
        jpnButton.add(jbtCapNhat);

        jbtXoa.setText("Xóa");
        jpnButton.add(jbtXoa);

        jpnThanhTren.add(jpnButton);
        jpnButton.getAccessibleContext().setAccessibleParent(jpnButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnThanhTren, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jpnThanhTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JPanel jpnButton;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnThanhTren;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTable tbKhachHang;
    // End of variables declaration//GEN-END:variables
}
