/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.PhongDAO;
import dto.KhachHangDTO;
import dto.NhanVienDTO;
import dto.PhongDTO;
import gui.ManHinhDanhSachPhongJPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public class PhongBUS {
    

    public static ArrayList<JPanelPhong> layThongTinTatCaPhong(){
        ArrayList<JPanelPhong>listPhongJPanels=new ArrayList<>();
        ArrayList<PhongDTO>listPhongDTOs=PhongDAO.layThongTinTatCaPhong(); //lấy dữ liệu phòng từ lớp DAO
       int soPhong=listPhongDTOs.size();
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
            tempJPanel.setMaLoaiPhong(listPhongDTOs.get(i).getMaLoaiPhong());
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
            tempJPanel.setMaHoaDon(listPhongDTOs.get(i).getMaHoaDon());
            tempJPanel.setTrangThaiHoaDon(listPhongDTOs.get(i).getTrangThaiHoaDon());
            //setback ground
            if (tempJPanel.getTrangThai().equalsIgnoreCase("Đang thuê")){
                
                Date today=new Date();
                
               // System.out.println(tempJPanel.getNgayDi().getTime()-today.getTime());
                if((tempJPanel.getNgayDi().getTime()-today.getTime())<=86400029){
                tempMaPhongJPanel.setBackground(Color.red);
            }
                else{
                tempMaPhongJPanel.setBackground(Color.blue);
                tempMaPhong.setForeground(Color.white);
//                tempTenLoaiPhongJPanel.setBackground(Color.blue);
//                tempGiaTienJPanel.setBackground(Color.blue);
                }
            }
            if (tempJPanel.getTrangThai().equalsIgnoreCase("Trống")){
                tempMaPhongJPanel.setBackground(Color.white);
//                tempTenLoaiPhongJPanel.setBackground(Color.white);
//                tempGiaTien.setBackground(Color.white);
            }
            
            listPhongJPanels.add(tempJPanel); //them jpanel vao list
        }
        return listPhongJPanels;
    }
    
    public static ArrayList<JPanelPhong> layKetQuaTimKiemODanhSachPhong(String tuKhoa){
        ArrayList<JPanelPhong> listKetQua=new ArrayList<>();
        ArrayList<Integer> listPhongTimKiemDuoc=PhongDAO.layKetQuaTimKiemODanhSachPhong(tuKhoa);
        ArrayList<JPanelPhong> listTatCaPhong=layThongTinTatCaPhong();
        for (int phong:listPhongTimKiemDuoc){
            for (JPanelPhong panelPhong:listTatCaPhong){
                if (phong==panelPhong.getMaPhong())
                    listKetQua.add(panelPhong);
            }
        }
        return listKetQua;
    }
    

    public static ArrayList<JPanelPhong> layDanhSachCacPhongCoTheThue(Date ngayDi,int maLoaiPhong){
        ArrayList<JPanelPhong> listKetQua=new ArrayList<>();
        ArrayList<Integer> listPhongThue=PhongDAO.layMaPhongCuaCacPhongDuocThue(ngayDi, maLoaiPhong);
        ArrayList<JPanelPhong> listTatCaPhong=layThongTinTatCaPhong();
        for (int phong:listPhongThue){
            for (JPanelPhong panelPhong:listTatCaPhong){
                if (phong==panelPhong.getMaPhong())
                    listKetQua.add(panelPhong);
            }
        }
        return listKetQua;
        }
    
    public static ArrayList<JPanelPhong> layDanhSachCacPhongCoTheDat(Date ngayDen,Date ngayDi,int maLoaiPhong){
            ArrayList<JPanelPhong> listKetQua=new ArrayList<>();
        ArrayList<Integer> listPhongDat=PhongDAO.layMaPhongCuaCacPhongDuocDat(ngayDen, ngayDi,maLoaiPhong);
        ArrayList<JPanelPhong> listTatCaPhong=layThongTinTatCaPhong();
        for (int phong:listPhongDat){
            for (JPanelPhong panelPhong:listTatCaPhong){
                if (phong==panelPhong.getMaPhong())
                    listKetQua.add(panelPhong);
            }
        }
        return listKetQua;
        }
    
    public static boolean luuThongTinThuePhong(JPanelPhong phongDTO, KhachHangDTO khachHangDTO, int maNhanVien){
        PhongDTO phong =new PhongDTO();
        phong.setMaPhong(phongDTO.getMaPhong());
        phong.setNgayDi(phongDTO.getNgayDi());
        return PhongDAO.luuThongTinThuePhong(phong, khachHangDTO, maNhanVien);
    }
    
    public static boolean luuThongTinDatPhong(JPanelPhong phongDTO,KhachHangDTO khachHangDTO, int maNhanVien){
        PhongDTO phong =new PhongDTO();
        phong.setMaPhong(phongDTO.getMaPhong());
        phong.setNgayDen(phongDTO.getNgayDen());
        phong.setNgayDi(phongDTO.getNgayDi());
        return PhongDAO.luuThongTinDatPhong(phong, khachHangDTO, maNhanVien);
    }
}
