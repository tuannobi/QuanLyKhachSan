/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.LoaiPhongDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.PhongDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
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
   
//   public static ArrayList<Integer> getCacPhongCoTheDat(Date x, Date y,int loaiPhong){
//       ArrayList<Integer> listMaPhong=null;
//       try {
//           listMaPhong=new ArrayList<>();
//           Connection conn =OracleConnection.openConnection();
//       String getCursorsql="{call THUEPHONG(?,?,?,?,?)}";
//       String getCursorsql="{CALL PHONGTRONG_THUEPHONGA(?,?,?,?,?)}";
//       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
//       callableStatement.setDate(1, new java.sql.Date (x.getTime())); //new java.sql.Date(x.getTime())
//       callableStatement.setDate(2, new java.sql.Date (y.getTime()));
//       callableStatement.setInt(3, loaiPhong);
//       callableStatement.registerOutParameter(4, OracleTypes.CURSOR);
//       callableStatement.registerOutParameter(5, OracleTypes.CURSOR);
//       callableStatement.execute();
//       ResultSet rs1=(ResultSet) callableStatement.getObject(4);
//       ResultSet rs2=(ResultSet) callableStatement.getObject(5);
//       while (rs1.next()){
//           int maLoaiPhong=rs1.getInt(1);
//           listMaPhong.add(maLoaiPhong);
//       }
//       while(rs2.next()){
//           int maLoaiPhong=rs2.getInt(1);
//           listMaPhong.add(maLoaiPhong);
//       }
//       
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
//       return listMaPhong;
//   }
   
}
