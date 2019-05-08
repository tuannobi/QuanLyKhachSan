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
import dto.PhieuDatPhong;
import dto.Phong;

/**
 *
 * @author Tuan
 */
public class PhongDAO extends OracleConnection {
    public ArrayList<Phong> getDuLieuPhong(){
        ArrayList<Phong> listPhong =new ArrayList<>();
        try {
            String sql="select * from Phong";
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            ResultSet rs =preparedStatement.executeQuery();
            while(rs.next())
            {
                Phong phong=new Phong();
                phong.setMaPhong(rs.getString(1));
                phong.setMaLoaiPhong(rs.getString(2));
                phong.setTrangThai(rs.getString(3));
                listPhong.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPhong;
    }
    
    public int xoaPhong(String maphong){
         String sql="delete from phong where maphong=?";
         try {
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, maphong);
            return preStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
         return -1;
    }
    
    public int DatPhong(KhachHangDTO kh, PhieuDatPhong pdp, HoaDon hd ){
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public ArrayList<Phong> getPhongTrong(){
        ArrayList<Phong> listPhongTrong =new ArrayList<>();
        try {
            String sql="select * from Phong where trangthai='K'";
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            ResultSet rs =preparedStatement.executeQuery();
            while(rs.next())
            {
                Phong phong=new Phong();
                phong.setMaPhong(rs.getString(1));
                phong.setMaLoaiPhong(rs.getString(2));
                phong.setTrangThai(rs.getString(3));
                listPhongTrong.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPhongTrong;
    }
    
}
