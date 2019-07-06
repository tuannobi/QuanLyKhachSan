/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.ChiTietDichVuDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class ChiTietDichVuDAO {
    public static ArrayList<ChiTietDichVuDTO> getChiTietDichVuCuaKhachHang(int maPhong){
        ArrayList<ChiTietDichVuDTO> listDichVu=null;
        try {
            listDichVu=new ArrayList<>();
            Connection conn=OracleConnection.openConnection();
            String sql="{CALL Pro_ThongTinDichVu(?,?)}";
            CallableStatement statement=conn.prepareCall(sql);
            statement.setInt(1, maPhong);
            statement.registerOutParameter(2, OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs= (ResultSet) statement.getObject(2);
            while(rs.next()){
                ChiTietDichVuDTO ctdv=new ChiTietDichVuDTO();
                ctdv.setTenDichVu(rs.getString(1));
                ctdv.setSoLuong(rs.getInt(2));
                ctdv.setThanhTien(rs.getLong(3));
                listDichVu.add(ctdv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDichVu;
    }
    
    public static boolean luuThongTinDatDichVu(ChiTietDichVuDTO hoaDonDichVuDTO){
        Connection conn =OracleConnection.openConnection();
        try {
            String sqlString="{CALL PRO_DATDICHVUCHOKHACHHANG(?,?,?)}";
            CallableStatement cs=conn.prepareCall(sqlString);
            cs.setInt(1, hoaDonDichVuDTO.getMaHoaDon());
            cs.setInt(2, hoaDonDichVuDTO.getMaDichVu());
            cs.setInt(3, hoaDonDichVuDTO.getSoLuong());
            cs.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
