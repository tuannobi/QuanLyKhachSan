/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import static dao.OracleConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.DichVu;
import java.sql.Connection;

/**
 *
 * @author COMPUTER
 */
public class DichVuDAO {
        public static ArrayList<DichVu> getDuLieuDichVu(){
            ArrayList<DichVu> ds=null;
            try {
                ds=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String sql="select * from dichvu";
                PreparedStatement preStatement=conn.prepareStatement(sql);
                ResultSet resultSet=preStatement.executeQuery();           
                while(resultSet.next()){
                    DichVu dv=new DichVu(0,"",0);
                    dv.setMaDichVu(resultSet.getInt(1));
                    dv.setTenDichVu(resultSet.getString(2));
                    dv.setGiaTien(resultSet.getFloat(3));
                    ds.add(dv);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        return ds;
    }
        public static int capNhatDuLieu(DichVu dv){
        try {
            String sql="update dichvu set tendichvu=?,giatien=? where madichvu=?";
        PreparedStatement preStatement =conn.prepareStatement(sql);
        preStatement.setString(1, dv.getTenDichVu());
        preStatement.setFloat(2, dv.getGiaTien());
        preStatement.setInt(3, dv.getMaDichVu());
        return preStatement.executeUpdate(); //trả về số dòng cập nhật thành công
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //sai       
   }
    
    public static int xoaDuLieu(int madv){
        
        try {
            String sql="delete from DichVu where maDichVu=?";
            PreparedStatement preparedStatement=conn.prepareCall(sql);
            preparedStatement.setInt(1, madv);
            return preparedStatement.executeUpdate(); //trả về số dòng xóa thành công
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //Sai
    }
    
    public static int themMoiMotDichVu(DichVu dv){
        try {
            String sql ="insert into DichVu(tendichvu,giatien) values(?,?)";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, dv.getTenDichVu());
            preStatement.setFloat(2, dv.getGiaTien());
            return preStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
