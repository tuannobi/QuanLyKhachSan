/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.KhachHangDTO;
import dto.LoaiPhongDTO;
import dto.NhanVienDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.PhongDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
import newClass.JPanelPhong;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class PhongDAO {
    public static ArrayList<PhongDTO> getDuLieuPhong(){
        ArrayList<PhongDTO> listPhong=null;
        try {
                listPhong=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String getCursorSql="{call ThongTinLuuTru(?)}";
                CallableStatement callableStatement=conn.prepareCall(getCursorSql);
                callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
                callableStatement.execute();
                ResultSet rs=(ResultSet) callableStatement.getObject(1);
                while(rs.next()){
                    PhongDTO phongDTO =new PhongDTO();
                    phongDTO.setMaPhong(rs.getInt(1));
                    phongDTO.setTenLoaiPhong(rs.getString(2));
                    phongDTO.setTrangThai(rs.getString(3));
                    phongDTO.setGiaPhong(rs.getLong(4));
                    phongDTO.setTenKhachHang(rs.getString(5));
                    phongDTO.setCmndKH(rs.getInt(6));
                    phongDTO.setNgayDen(rs.getDate(7));
                    phongDTO.setNgayDi(rs.getDate(8));
                    phongDTO.setHotenNV(rs.getString(9));
                    phongDTO.setCmndNV(rs.getInt(10));
                    listPhong.add(phongDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPhong;
    }
    
   
   
   public static ArrayList<Integer> getCacPhongDuocThue(Date y,int loaiPhong){
       ArrayList<Integer> listMaPhong=null;
       try {
           listMaPhong=new ArrayList<>();
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{call PHONGTRONG_THUEPHONGA(?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setDate(1, new java.sql.Date (y.getTime()));
       callableStatement.setInt(2, loaiPhong);
       callableStatement.registerOutParameter(3, OracleTypes.CURSOR);
       callableStatement.registerOutParameter(4, OracleTypes.CURSOR);
       callableStatement.execute();
       ResultSet rs1=(ResultSet) callableStatement.getObject(3);
       ResultSet rs2=(ResultSet) callableStatement.getObject(4);
       while (rs1.next()){
           int maLoaiPhong=rs1.getInt(1);
           listMaPhong.add(maLoaiPhong);
       }
       while(rs2.next()){
           int maLoaiPhong=rs2.getInt(1);
           listMaPhong.add(maLoaiPhong);
       }
       
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listMaPhong;
   }
   
   public static boolean luuThongTinThuePhong(PhongDTO phongDTO,LoaiPhongDTO loaiPhongDTO, KhachHangDTO khachHangDTO, NhanVienDTO nhanVienDTO){
       try {
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{call PRO_NHAPTHONGTINTHUEPHONG(?,?,?,?,?,?,?,?,?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setString(1, khachHangDTO.getHoTen());
       callableStatement.setDate(2, new java.sql.Date(khachHangDTO.getNgaySinh().getTime()));
       callableStatement.setInt(3, khachHangDTO.getCMND());
       callableStatement.setString(4, khachHangDTO.getGioiTinh());
       callableStatement.setString(5, khachHangDTO.getDiaChi());
       callableStatement.setString(6, khachHangDTO.getEmail());
       callableStatement.setString(7, khachHangDTO.getSDT());
       callableStatement.setInt(8, phongDTO.getMaPhong());
       callableStatement.setInt(9, nhanVienDTO.getMaNhanVien());
       callableStatement.setDate(10, new java.sql.Date(phongDTO.getNgayDen().getTime()));
       callableStatement.setDate(11, new java.sql.Date(phongDTO.getNgayDi().getTime()));
       callableStatement.setInt(12, loaiPhongDTO.getMaLoaiPhong());
       callableStatement.execute();
       return true;
       } catch (Exception e) {
           e.printStackTrace();
       }
       return false;
   }
   
   public static ArrayList<Integer> getCacPhongDuocDat(Date x,Date y,int loaiPhong){
       ArrayList<Integer> listMaPhong=null;
       try {
           listMaPhong=new ArrayList<>();
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{call PHONGTRONG_DATPHONGA(?,?,?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setDate(1, new java.sql.Date (x.getTime()));
       callableStatement.setDate(2, new java.sql.Date (y.getTime()));
       callableStatement.setInt(3, loaiPhong);
       callableStatement.registerOutParameter(4, OracleTypes.CURSOR);
       callableStatement.registerOutParameter(5, OracleTypes.CURSOR);
       callableStatement.registerOutParameter(6, OracleTypes.CURSOR);
       callableStatement.execute();
       ResultSet rs1=(ResultSet) callableStatement.getObject(4);
       ResultSet rs2=(ResultSet) callableStatement.getObject(5);
       ResultSet rs3=(ResultSet) callableStatement.getObject(6);
       while (rs1.next()){
           int maLoaiPhong=rs1.getInt(1);
           listMaPhong.add(maLoaiPhong);
       }
       while(rs2.next()){
           int maLoaiPhong=rs2.getInt(1);
           listMaPhong.add(maLoaiPhong);
       }
       while(rs3.next()){
           int maLoaiPhong=rs3.getInt(1);
           listMaPhong.add(maLoaiPhong);
       }
       
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listMaPhong;
   }
   
   public static boolean luuThongTinDatPhong(PhongDTO phongDTO, LoaiPhongDTO loaiPhongDTO, KhachHangDTO khachHangDTO, NhanVienDTO nhanVienDTO){
       try {
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{call DATTRUOC(?,?,?,?,?,?,?,?,?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setString(1, khachHangDTO.getHoTen());
       callableStatement.setDate(2, new java.sql.Date(khachHangDTO.getNgaySinh().getTime()));
       callableStatement.setInt(3, khachHangDTO.getCMND());
       callableStatement.setString(4, khachHangDTO.getGioiTinh());
       callableStatement.setString(5, khachHangDTO.getDiaChi());
       callableStatement.setString(6, khachHangDTO.getEmail());
       callableStatement.setString(7, khachHangDTO.getSDT());
       callableStatement.setInt(8, phongDTO.getMaPhong());
       callableStatement.setInt(9, nhanVienDTO.getMaNhanVien());
       callableStatement.setDate(10, new java.sql.Date(phongDTO.getNgayDen().getTime()));
       callableStatement.setDate(11, new java.sql.Date(phongDTO.getNgayDi().getTime()));
       callableStatement.setInt(12, loaiPhongDTO.getMaLoaiPhong());
       callableStatement.execute();
       return true;
       } catch (Exception e) {
           e.printStackTrace();
       }
       return false;
   }
   
}
