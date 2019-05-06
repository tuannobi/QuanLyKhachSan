/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import miniPopup.DanhSachDatPhong;
import miniPopup.HienThiBangDatHoacThuePhongJDialog;
import miniPopup.HienThiBangHuyDatPhong;
import miniPopup.HienThiBangTraPhong;
import miniPopup.NhapThongTinKhachHang;
import model.KhachHang;
import model.PhieuDatPhong;
import model.Phong;
import service.KhachHangService;
import service.PhongService;
import view.QuanLyPhongJPanel;
import view.QuanLyPhongJPanel.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class QuanLyPhongController {
    ButtonGroup buttonGroup1;
    JRadioButton jRadioButton1,jRadioButton2,jRadioButton3;
    JButton jbtDanhSachDatPhong;
    JTextField jtfTimKiem;
    
    ArrayList<QuanLyPhongJPanel.JPanelPhong> arrListJpanelPhong;
    PhongService phongSV;
    ArrayList<Phong> listPhong;
    JPanel jpnListCacPhong;
    
    public QuanLyPhongController(ButtonGroup buttonGroup1,JRadioButton jRadioButton1,
            JRadioButton jRadioButton2, JRadioButton jRadioButton3,JButton jbtDanhSachDatPhong,JTextField jtfTimKiem
    ,ArrayList<QuanLyPhongJPanel.JPanelPhong> arrListJpanelPhong,PhongService phongSV,ArrayList<Phong> listPhong
    , JPanel jpnListCacPhong){
        this.buttonGroup1=buttonGroup1;
        this.jRadioButton1=jRadioButton1;
        this.jRadioButton2=jRadioButton2;
        this.jRadioButton3=jRadioButton3;
        this.jbtDanhSachDatPhong=jbtDanhSachDatPhong;
        this.jtfTimKiem=jtfTimKiem;
        this.arrListJpanelPhong=arrListJpanelPhong;
        this.phongSV=phongSV;
        this.listPhong=listPhong;
        getDuLieuVaoList();
        addEvents();
    }
    
    public void getDuLieuVaoList(){
               arrListJpanelPhong=new ArrayList<QuanLyPhongJPanel.JPanelPhong>();
        phongSV=new PhongService();
        listPhong=phongSV.getDuLieuPhong(); 
        //lay so phong
      //  QuanLyPhongJPanel.JPanelPhong jpnPhong;
        QuanLyPhongJPanel temp =new QuanLyPhongJPanel();
        int soPhong=listPhong.size();
        for (int i=0;i<soPhong;i++)
        {
            String phong="Phong "+listPhong.get(i).getMaPhong();
         QuanLyPhongJPanel.JPanelPhong  jpnPhong= temp.new JPanelPhong();
            //Cai dat border
            Border borderPhong= BorderFactory.createLineBorder( Color.RED);
            jpnPhong.setBorder(borderPhong);
            jpnPhong.setPreferredSize(new Dimension(100,100));
            if (listPhong.get(i).getTrangThai().equalsIgnoreCase("K"))
            {
                jpnPhong.setBackground(Color.white);
            }
            else if(listPhong.get(i).getTrangThai().equalsIgnoreCase("C"))
            {
                jpnPhong.setBackground(Color.blue);
            }
            else if (listPhong.get(i).getTrangThai().equalsIgnoreCase("D"))
            {
                jpnPhong.setBackground(Color.yellow);
            }
           // jpnPhong.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
            JLabel lbPhong=new JLabel(phong);
            jpnPhong.add(lbPhong);
           // jpnListCacPhong.add(jpnPhong);
            jpnPhong.setMaPhong(listPhong.get(i).getMaPhong());
            jpnPhong.setMaLoaiPhong(listPhong.get(i).getMaLoaiPhong());
            jpnPhong.setTrangThai(listPhong.get(i).getTrangThai());
            arrListJpanelPhong.add(jpnPhong); //thêm 1 jpanel vào list  
    }
    }
    
    
    private void hienThiTatCaPhong(){
        
        jpnListCacPhong.removeAll();
        
        jpnListCacPhong.setLayout(new FlowLayout(FlowLayout.LEFT));
        getDuLieuVaoList(); //Phòng trường hợp lúc thêm phòng mới vào thì kích vào tất cả phòng nó không cập nhật
           for (QuanLyPhongJPanel.JPanelPhong jpnPhong:arrListJpanelPhong){
               jpnListCacPhong.add(jpnPhong);
           }
          
        jpnListCacPhong.revalidate(); //important
        jpnListCacPhong.repaint(); //important 
        addEventEveryRoom();
    }
    
    private void hienThiPhongTrong(){
        jpnListCacPhong.removeAll();
        getDuLieuVaoList();
        jpnListCacPhong.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (QuanLyPhongJPanel.JPanelPhong jpnPhong:arrListJpanelPhong){
            if (jpnPhong.getTrangThai().equalsIgnoreCase("K"))
                jpnListCacPhong.add(jpnPhong);
        }
        jpnListCacPhong.revalidate(); //important
        jpnListCacPhong.repaint(); //important
        addEventEveryRoom();
    }
    
    private void hienThiPhongDaThue(){
        jpnListCacPhong.removeAll();
        getDuLieuVaoList();
        jpnListCacPhong.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (QuanLyPhongJPanel.JPanelPhong jpnPhong:arrListJpanelPhong){
            if (jpnPhong.getTrangThai().equalsIgnoreCase("C"))
                jpnListCacPhong.add(jpnPhong,new FlowLayout(FlowLayout.LEFT));
        }
        
                jpnListCacPhong.revalidate(); //important
                jpnListCacPhong.repaint(); //important
                addEventEveryRoom();
    }
    
    
    private void addEvents(){       
        
                jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                hienThiTatCaPhong();
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
                
        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                hienThiPhongTrong();
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hienThiPhongDaThue();
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jbtDanhSachDatPhong.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DanhSachDatPhong dsdp=new DanhSachDatPhong();
                    
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
    }
    
    private void addEventEveryRoom(){
                Component[] coms = jpnListCacPhong.getComponents();
        for (Component com:coms){ //duyệt tất cả jpanel
            if (com instanceof QuanLyPhongJPanel.JPanelPhong){ //chỉ lấy ra các loại JpanelPhong
               QuanLyPhongJPanel.JPanelPhong 
                sePhong=(QuanLyPhongJPanel.JPanelPhong) com; //giả sự người dùng click vào 1 ô
                sePhong.addMouseListener(new MouseListener() { //tạo sự kiện cho ô này
                   @Override
                   public String toString() {
                       return super.toString(); //To change body of generated methods, choose Tools | Templates.
                   }
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(sePhong.getTrangThai().equalsIgnoreCase("K"))
                        {
                            HienThiBangDatHoacThuePhongJDialog dialog =new HienThiBangDatHoacThuePhongJDialog();
                            
                          dialog.setJlbMaSoPhong(sePhong.getMaPhong());
                          dialog.setJlbChenMaPhong(sePhong.getMaPhong());
                          dialog.setJlbChenMaLoaiPhong(sePhong.getMaLoaiPhong());
                          //khi người dùng click chuột vào button Đặt phòng thì 
                          dialog.getJbtDatPhong().addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    NhapThongTinKhachHang thongTinKHdialog = new NhapThongTinKhachHang();                          
                                    
                                    thongTinKHdialog.getJbtHuy().addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            thongTinKHdialog.dispose();
                                           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                        }
                                    });
                                    
                                    thongTinKHdialog.getJbtLuu().addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            //Lấy thông tin các trường người dùng nhập vào và lưu vào biến kh
                                            KhachHangService khSV=new KhachHangService(); 
                                            
                                   KhachHang kh=new KhachHang();
                                   kh.setMaKH(thongTinKHdialog.getJtfMaKhachHang());
                                   kh.setHoTen(thongTinKHdialog.getJtfHoTen());
                                   kh.setCMND(thongTinKHdialog.getJtfCMND());
                                   kh.setGioiTinh(thongTinKHdialog.getJcbbGioiTinh()); 
                                            try {
                                                kh.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(thongTinKHdialog.getJtfNgaySinh()));
                                            } catch (ParseException ex) {
                                                Logger.getLogger(QuanLyPhongJPanel.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                            
                                            //
                                            PhieuDatPhong pdp=new PhieuDatPhong();
                                            pdp.setMaKhachHang(thongTinKHdialog.getJtfMaKhachHang());
                                          //  pdp
                                            //
                                   //Kiểm tra có tồn tại khách hàng chưa
                                   boolean check=khSV.isTonTaiKH(kh.getCMND());
                                   if (check==true){
                                       JOptionPane.showConfirmDialog(null, "Khách hàng này đã tồn tại trong hệ thống. Bạn có muốn tiếp tục đặt phòng với thông tin cũ không?", "Warning", JOptionPane.YES_NO_OPTION);
                                   }
                                   else
                                   {
                                       int flag=khSV.themMoiMotKhachHang(kh);
                                       if (flag!=-1){
                                           JOptionPane.showMessageDialog(null, "Bạn đã đặt phòng thành công! ");
                                       }
                                       else
                                           JOptionPane.showMessageDialog(null, "Đặt phòng không thành công!");
                                   }
                                          
                                            
                                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                        }
                                    });
                                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                }
                          });
                        }
                      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        else if (sePhong.getTrangThai().equalsIgnoreCase("C")){
                            HienThiBangTraPhong bangTraPhong =new HienThiBangTraPhong();
                        }
                        else if (sePhong.getTrangThai().equalsIgnoreCase("D")){
                            HienThiBangHuyDatPhong bangHuyDatPhong=new HienThiBangHuyDatPhong();
                        }
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
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
        }
    }
    
}

