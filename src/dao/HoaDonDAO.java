/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.HoaDon;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author COMPUTER
 */
public class HoaDonDAO {
    public static ArrayList<HoaDon> layDuLieuHoaDon()
    {
        ArrayList<HoaDon> ds=null;
        String sql="{CALL PRO_HIENTHIDSHOADON(?)}";
        Connection conn;
        try{
            ds=new ArrayList<>();
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet) cs.getObject(1);
            while(rs.next())
            {
                HoaDon hd =new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaPhong(rs.getInt(2));
                hd.setTenKhachHang(rs.getString(3));
                hd.setTienPhong(rs.getLong(4));
                hd.setTienDichVu(rs.getLong(5));
                hd.setNgayDen(rs.getDate(6));
                hd.setNgayDi(rs.getDate(7));
                hd.setTenNhanVien(rs.getString(8));
                hd.setTrangThai(rs.getString(9));
                hd.setTongTien(rs.getLong(10));
                hd.setTienGiam(rs.getLong(11));
                hd.setTienThanhToan(rs.getLong(12));
                ds.add(hd);
            }
            cs.close();
            rs.close();
            conn.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return ds;
    }
    public static ArrayList<HoaDon>timKiemHoaDon(String tk)
    {
        ArrayList<HoaDon> ds=null;
        Connection conn;
        String sql="{CALL PRO_HIENTHIDSHOADONTIMKIEM(?,?)}";
        try{
            ds=new ArrayList<>();
            conn=OracleConnection.openConnection();
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, tk);
            cs.registerOutParameter(2,OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs =(ResultSet) cs.getObject(2);
            while(rs.next())
            {
                    HoaDon  hd = new HoaDon();
                    hd.setMaHoaDon(rs.getInt(1));
                    hd.setMaPhong(rs.getInt(2));
                    hd.setTenKhachHang(rs.getString(3));
                    hd.setTienPhong(rs.getLong(4));
                    hd.setTienDichVu(rs.getLong(5));
                    hd.setNgayDen(rs.getDate(6));
                    hd.setNgayDi(rs.getDate(7));
                    hd.setTenNhanVien(rs.getString(8));
                    hd.setTrangThai(rs.getString(9));
                    hd.setTongTien(rs.getLong(10));                    
                    hd.setTienGiam(rs.getLong(11));
                    hd.setTienThanhToan(rs.getLong(12));
                    ds.add(hd);
            }
            cs.close();
            rs.close();
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static boolean thanhToanHoaDon(int maHD){
        Connection conn=OracleConnection.openConnection();
        try {
            String sqlString="{CALL PRO_THANHTOANHOADON(?)}";
            CallableStatement cs =conn.prepareCall(sqlString);
            cs.setInt(1, maHD);
            cs.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
