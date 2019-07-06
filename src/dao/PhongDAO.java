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
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import newClass.JPanelPhong;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class PhongDAO {
    public static ArrayList<PhongDTO> layThongTinTatCaPhong(){
        ArrayList<PhongDTO> listPhong=null;
        try {
                listPhong=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String getCursorSql="{CALL PRO_THONGTINCACPHONG(?)}";
                CallableStatement callableStatement=conn.prepareCall(getCursorSql);
                callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
                callableStatement.execute();
                ResultSet rs=(ResultSet) callableStatement.getObject(1);
                while(rs.next()){
                    PhongDTO phongDTO =new PhongDTO();
                    phongDTO.setMaPhong(rs.getInt(1));
                    phongDTO.setMaLoaiPhong(rs.getInt(2));
                    phongDTO.setTenLoaiPhong(rs.getString(3));
                    phongDTO.setTrangThai(rs.getString(4));
                    phongDTO.setGiaPhong(rs.getLong(5));
                    phongDTO.setTenKhachHang(rs.getString(6));
                    phongDTO.setCmndKH(rs.getInt(7));
                    phongDTO.setNgayDen(rs.getDate(8));
                    phongDTO.setNgayDi(rs.getDate(9));
                    phongDTO.setHotenNV(rs.getString(10));
                    phongDTO.setCmndNV(rs.getInt(11));
                    phongDTO.setMaHoaDon(rs.getInt(12));
                    phongDTO.setTrangThaiHoaDon(rs.getString(13));
                    listPhong.add(phongDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPhong;
    }
    
   public static ArrayList<Integer> layKetQuaTimKiemODanhSachPhong(String tuKhoa){
       Connection conn=OracleConnection.openConnection();
       ArrayList<Integer> listPhong=null;
       try {
           listPhong=new ArrayList<>();
           String sqlString="{CALL PRO_TIMKIEMTHONGTINLUUTRU(?,?)}";
           CallableStatement cs=conn.prepareCall(sqlString);
           cs.setString(1, tuKhoa);
           cs.registerOutParameter(2, OracleTypes.CURSOR);
           cs.execute();
           ResultSet rs=(ResultSet) cs.getObject(2);
           while(rs.next()){
               int phong=rs.getInt(1);
               listPhong.add(phong);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listPhong;
   }
   
   public static ArrayList<Integer> layMaPhongCuaCacPhongDuocThue(Date ngayDi,int maLoaiPhong){
       ArrayList<Integer> listMaPhong=null;
       try {
           listMaPhong=new ArrayList<>();
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{CALL PRO_HIENTHIDSPHONGCOTHETHUE(?,?,?)}";
       CallableStatement cs=conn.prepareCall(getCursorsql);
       cs.setDate(1,new java.sql.Date(ngayDi.getTime()));
       cs.setInt(2, maLoaiPhong);
       cs.registerOutParameter(3, OracleTypes.CURSOR);
       cs.execute();
       ResultSet rs=(ResultSet) cs.getObject(3);
       while(rs.next()){
           int tempMaPhong=rs.getInt(1);
           listMaPhong.add(tempMaPhong);
       }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listMaPhong;
   }
   
   public static boolean luuThongTinThuePhong(PhongDTO phongDTO, KhachHangDTO khachHangDTO, int maNhanVien){
       try {
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{CALL PRO_LUUTHONGTINTHUEPHONG(?,?,?,?,?,?,?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setString(1, khachHangDTO.getHoTen());
       callableStatement.setDate(2, new java.sql.Date(khachHangDTO.getNgaySinh().getTime()));
       callableStatement.setInt(3, khachHangDTO.getCMND());
       callableStatement.setString(4, khachHangDTO.getGioiTinh());
       callableStatement.setString(5, khachHangDTO.getDiaChi());
       callableStatement.setString(6, khachHangDTO.getEmail());
       callableStatement.setString(7, khachHangDTO.getSDT());
       callableStatement.setInt(8, phongDTO.getMaPhong());
       callableStatement.setInt(9, maNhanVien);
       callableStatement.setDate(10, new java.sql.Date(phongDTO.getNgayDi().getTime()));
       callableStatement.execute();
       return true;
       } catch (SQLException ex) {
            String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
       }
       catch(NullPointerException e){
           return false;
       }
       return false;
   }
   
   public static ArrayList<Integer> layMaPhongCuaCacPhongDuocDat(Date ngayDen,Date ngayDi,int maLoaiPhong){
       ArrayList<Integer> listMaPhong=null;
       try {
           listMaPhong=new ArrayList<>();
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{call PRO_HIENTHIDSPHONGCOTHEDAT(?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setDate(1, new java.sql.Date(ngayDen.getTime()));
       callableStatement.setDate(2, new java.sql.Date(ngayDi.getTime()));
       callableStatement.setInt(3, maLoaiPhong);
       callableStatement.registerOutParameter(4, OracleTypes.CURSOR);
       callableStatement.execute();
       ResultSet rs=(ResultSet) callableStatement.getObject(4);
       while(rs.next()){
           int tempMaPhong=rs.getInt(1);
           listMaPhong.add(tempMaPhong);
       }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listMaPhong;
   }
   
   public static boolean luuThongTinDatPhong(PhongDTO phongDTO,KhachHangDTO khachHangDTO, int maNhanVien){
       try {
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{CALL PRO_LUUTHONGTINDATPHONG(?,?,?,?,?,?,?,?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setString(1, khachHangDTO.getHoTen());
       callableStatement.setDate(2, new java.sql.Date(khachHangDTO.getNgaySinh().getTime()));
       callableStatement.setInt(3, khachHangDTO.getCMND());
       callableStatement.setString(4, khachHangDTO.getGioiTinh());
       callableStatement.setString(5, khachHangDTO.getDiaChi());
       callableStatement.setString(6, khachHangDTO.getEmail());
       callableStatement.setString(7, khachHangDTO.getSDT());
       callableStatement.setInt(8, phongDTO.getMaPhong());
       callableStatement.setInt(9, maNhanVien);
       callableStatement.setDate(10, new java.sql.Date(phongDTO.getNgayDen().getTime()));
       callableStatement.setDate(11, new java.sql.Date(phongDTO.getNgayDi().getTime()));
       callableStatement.execute();
       return true;
       } catch (SQLException ex) {
            String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
       }
       catch(NullPointerException e){
           return false;
       }
       return false;
   }
   
   
   
}
