/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.LoaiPhongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class LoaiPhongDAO {
    public static ArrayList<LoaiPhongDTO> getLoaiPhong(){
       ArrayList<LoaiPhongDTO> listLoaiPhong =new ArrayList<>();
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="select * from loaiphong";
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            ResultSet rs =preparedStatement.executeQuery();
            while(rs.next())
            {
                LoaiPhongDTO phong=new LoaiPhongDTO();
                phong.setMaLoaiPhong(rs.getInt(1));
                phong.setTenLoaiPhong(rs.getString(2));
                phong.setGiaPhong(rs.getLong(3));
                
                listLoaiPhong.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLoaiPhong;
   }
}
