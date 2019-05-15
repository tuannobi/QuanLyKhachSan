/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.HoaDon;
import dto.KhachHangDTO;
import dto.PhongDTO;
import java.sql.Connection;

/**
 *
 * @author Tuan
 */
public class PhongDAO {
    public static ArrayList<PhongDTO> getDuLieuPhong(){
        ArrayList<PhongDTO> listPhong =new ArrayList<>();
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="select maphong,tenloaiphong,trangthai,giaphong from Phong,loaiphong where phong.maloaiphong=loaiphong.maloaiphong ";
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
    
    
//    public int xoaPhong(String maphong){
//         String sql="delete from phong where maphong=?";
//         try {
//             Connection conn=OracleConnection.openConnection();
//            PreparedStatement preStatement=conn.prepareStatement(sql);
//            preStatement.setString(1, maphong);
//            return preStatement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//         return -1;
//    }
//    
////    public int DatPhong(KhachHangDTO kh, PhieuDatPhong pdp, HoaDon hd ){
////        try {
////            
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        return -1;
////    }
//    
//    public ArrayList<PhongDTO> getPhongTrong(){
//        ArrayList<PhongDTO> listPhongTrong =new ArrayList<>();
//        try {
//            Connection conn =OracleConnection.openConnection();
//            String sql="select * from Phong where trangthai='K'";
//            PreparedStatement preparedStatement=conn.prepareStatement(sql);
//            ResultSet rs =preparedStatement.executeQuery();
//            while(rs.next())
//            {
//                PhongDTO phong=new PhongDTO();
//                phong.setMaPhong(rs.getInt(1));
//                phong.setMaLoaiPhong(rs.getInt(2));
//                phong.setTrangThai(rs.getString(3));
//                listPhongTrong.add(phong);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listPhongTrong;
//    }
//    
}
