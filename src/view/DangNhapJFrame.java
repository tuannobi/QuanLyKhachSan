/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import javax.swing.JOptionPane;
import model.TaiKhoan;
import service.DangNhapService;

/**
 *
 * @author Tuan
 */
public class DangNhapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapJFrame
     */
    public DangNhapJFrame() {
        initComponents();
        addEvents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jpnLogin = new javax.swing.JPanel();
        jpnPhanDangNhap = new javax.swing.JPanel();
        jpnTenDangNhap = new javax.swing.JPanel();
        jlbTenDangNhap = new javax.swing.JLabel();
        jtfTenDangNhap = new javax.swing.JTextField();
        jpnMatKhau = new javax.swing.JPanel();
        jlbMatKhau = new javax.swing.JLabel();
        jpMatKhau = new javax.swing.JPasswordField();
        jbtButton = new javax.swing.JPanel();
        jbtDangNhap = new javax.swing.JButton();
        jbtThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnTitle.setBackground(new java.awt.Color(255, 51, 51));

        jlbTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitle.setText("LOGIN NOW");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jlbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlbTitle)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jpnPhanDangNhap.setLayout(new java.awt.BorderLayout());

        jlbTenDangNhap.setText("Tên đăng nhập");

        javax.swing.GroupLayout jpnTenDangNhapLayout = new javax.swing.GroupLayout(jpnTenDangNhap);
        jpnTenDangNhap.setLayout(jpnTenDangNhapLayout);
        jpnTenDangNhapLayout.setHorizontalGroup(
            jpnTenDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTenDangNhapLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbTenDangNhap)
                .addGap(37, 37, 37)
                .addComponent(jtfTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jpnTenDangNhapLayout.setVerticalGroup(
            jpnTenDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTenDangNhapLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnTenDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTenDangNhap)
                    .addComponent(jtfTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpnPhanDangNhap.add(jpnTenDangNhap, java.awt.BorderLayout.PAGE_START);

        jlbMatKhau.setText("Mật khẩu");

        javax.swing.GroupLayout jpnMatKhauLayout = new javax.swing.GroupLayout(jpnMatKhau);
        jpnMatKhau.setLayout(jpnMatKhauLayout);
        jpnMatKhauLayout.setHorizontalGroup(
            jpnMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMatKhauLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlbMatKhau)
                .addGap(65, 65, 65)
                .addComponent(jpMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jpnMatKhauLayout.setVerticalGroup(
            jpnMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMatKhauLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jpnMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbMatKhau)
                    .addComponent(jpMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jpnPhanDangNhap.add(jpnMatKhau, java.awt.BorderLayout.CENTER);

        jbtDangNhap.setText("Đăng nhập");

        jbtThoat.setText("Thoát");
        jbtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jbtButtonLayout = new javax.swing.GroupLayout(jbtButton);
        jbtButton.setLayout(jbtButtonLayout);
        jbtButtonLayout.setHorizontalGroup(
            jbtButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbtButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtDangNhap)
                .addGap(35, 35, 35)
                .addComponent(jbtThoat)
                .addGap(28, 28, 28))
        );
        jbtButtonLayout.setVerticalGroup(
            jbtButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbtButtonLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jbtButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtDangNhap)
                    .addComponent(jbtThoat))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jpnLoginLayout = new javax.swing.GroupLayout(jpnLogin);
        jpnLogin.setLayout(jpnLoginLayout);
        jpnLoginLayout.setHorizontalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnPhanDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnLoginLayout.setVerticalGroup(
            jpnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnPhanDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMainLayout = new javax.swing.GroupLayout(jpnMain);
        jpnMain.setLayout(jpnMainLayout);
        jpnMainLayout.setHorizontalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMainLayout.setVerticalGroup(
            jpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMainLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void addEvents(){
        jbtThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jbtDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              DangNhapService   loginService=new DangNhapService();
              TaiKhoan  tk=loginService.kiemTraTaiKhoan(jtfTenDangNhap.getText(),new String(jpMatKhau.getPassword()));
                
                if (tk!=null)
                {
                   hiddenWindow();
                    MainJFrame mainJFrame=new MainJFrame();
                    mainJFrame.showWindow();                  
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Đăng nhập không thành công");
                }
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    public void showWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    void hiddenWindow(){
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jbtButton;
    private javax.swing.JButton jbtDangNhap;
    private javax.swing.JButton jbtThoat;
    private javax.swing.JLabel jlbMatKhau;
    private javax.swing.JLabel jlbTenDangNhap;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPasswordField jpMatKhau;
    private javax.swing.JPanel jpnLogin;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnMatKhau;
    private javax.swing.JPanel jpnPhanDangNhap;
    private javax.swing.JPanel jpnTenDangNhap;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JTextField jtfTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
