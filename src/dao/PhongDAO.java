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
        ArrayList<PhongDTO> listPhong =new ArrayList<>();
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="select maphong,tenloaiphong,trangthai,giaphong \n" +
"from phong inner join loaiphong on phong.maloaiphong=loaiphong.maloaiphong\n" +
"order by maphong";
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            ResultSet rs =preparedStatement.executeQuery();
            while(rs.next())
            {
                PhongDTO phong=new PhongDTO();
                phong.setMaPhong(rs.getInt(1));
                phong.setTenLoaiPhong(rs.getString(2));
                phong.setTrangThai(rs.getString(3));
                phong.setGiaPhong(rs.getLong(4));
                listPhong.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPhong;
    }
    
   
   
   public static ArrayList<Integer> getCacPhongDuocThue(Date x, Date y,int loaiPhong){
       ArrayList<Integer> listMaPhong=null;
       try {
           listMaPhong=new ArrayList<>();
           Connection conn =OracleConnection.openConnection();
       String getCursorsql="{call PHONGTRONG_THUEPHONGA(?,?,?,?,?)}";
       CallableStatement callableStatement=conn.prepareCall(getCursorsql);
       callableStatement.setDate(1, new java.sql.Date (x.getTime())); //new java.sql.Date(x.getTime())
       callableStatement.setDate(2, new java.sql.Date (y.getTime()));
       callableStatement.setInt(3, loaiPhong);
       callableStatement.registerOutParameter(4, OracleTypes.CURSOR);
       callableStatement.registerOutParameter(5, OracleTypes.CURSOR);
       callableStatement.execute();
       ResultSet rs1=(ResultSet) callableStatement.getObject(4);
       ResultSet rs2=(ResultSet) callableStatement.getObject(5);
       while (rs1.next()){
           int maPhong ;
           maPhong=rs1.getInt(4);
           listMaPhong.add(maPhong);
       }
       while(rs2.next()){
           int maPhong;
           maPhong=rs2.getInt(5);
           listMaPhong.add(maPhong);
       }
       
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listMaPhong;
   }
   
   
}
