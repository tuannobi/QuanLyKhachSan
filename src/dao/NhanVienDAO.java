/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class NhanVienDAO {
    public static ArrayList<NhanVien> getDuLieuNhanVien() throws SQLException
    {
        ArrayList<NhanVien> ds=null;
        Connection conn = OracleConnection.openConnection();
        ds=new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
         {
            String sql="SELECT * FROM NHANVIEN";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next())
            {
                NhanVien nv=new NhanVien();
                nv.setMaNhanVien(rs.getInt(1));
                nv.setHoTen(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setNgayVaoLam(rs.getDate(4));
                nv.setCMND(rs.getInt(5));
                nv.setSoDT(rs.getString(6));
                nv.setMaNguoiQL(rs.getInt(7));
                nv.setGioiTinh(rs.getString(8));
                nv.setEmail(rs.getString(9));
                ds.add(nv);
                
            }
        }
        st.close();
        rs.close();
        conn.close();
        return ds;
        
    }
}
