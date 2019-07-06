/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import dto.LoaiKhachHangDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class LoaiKhachHangDAO {
    public static ArrayList<LoaiKhachHangDTO> layDuLieuLoaiKhachHang(){
        ArrayList<LoaiKhachHangDTO> loaiKhachHangDTO=null;
        try {
            loaiKhachHangDTO=new ArrayList<>();
            Connection conn=OracleConnection.openConnection();
            String sqlString="{CALL PRO_DSLOAIKHACHHANG(?)}";
            CallableStatement cs=conn.prepareCall(sqlString);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs=(ResultSet)cs.getObject(1);
            while(rs.next()){
               LoaiKhachHangDTO khachHangDTO=new LoaiKhachHangDTO();
               khachHangDTO.setMaLoaiKhachHang(rs.getInt(1));
               khachHangDTO.setTenLoaiKhachHang(rs.getString(2));
               loaiKhachHangDTO.add(khachHangDTO);
            }
        } catch (Exception e) {
            printStackTrace();
        }
        return loaiKhachHangDTO;
    }
}
