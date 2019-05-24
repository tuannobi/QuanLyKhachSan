/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import dto.PhieuDatPhongDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class PhieuDatPhongDAO {
    public static ArrayList<PhieuDatPhongDTO> getThongTinDatPhongCuThe1Phong(int maPhong){
        ArrayList <PhieuDatPhongDTO> listDatPhong=null;
        try {
            Connection conn=OracleConnection.openConnection();
            listDatPhong=new ArrayList<>();
            String sql="{CALL PRO_THONGTINDATPHONG(?,?)}";
            CallableStatement statement=conn.prepareCall(sql);
            statement.setInt(1, maPhong);
            statement.registerOutParameter(2, OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs=(ResultSet) statement.getObject(2);
            
            while(rs.next()){
                PhieuDatPhongDTO phieuDatPhongDTO=new PhieuDatPhongDTO();
                phieuDatPhongDTO.setMaPhieu(rs.getInt(1));
            phieuDatPhongDTO.setMaKH(rs.getInt(2));
            phieuDatPhongDTO.setTenKH(rs.getString(3));
            phieuDatPhongDTO.setMaNV(rs.getInt(4));
            phieuDatPhongDTO.setTenNV(rs.getString(5));
            phieuDatPhongDTO.setNgayDat(rs.getDate(6));
            phieuDatPhongDTO.setNgayDen(rs.getDate(7));
            phieuDatPhongDTO.setNgayDi(rs.getDate(8));
            listDatPhong.add(phieuDatPhongDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDatPhong;
    }
    
    public static ArrayList<PhieuDatPhongDTO> getTatCaThongTinDatPhong(){
        ArrayList<PhieuDatPhongDTO> phieuDatPhongDTOs=null;
        Connection conn=OracleConnection.openConnection();
        try {
            phieuDatPhongDTOs=new ArrayList<>();
            String sql="{CALL PRO_LOADPHIEUDATPHONG(?)}";
            CallableStatement callableStatement=conn.prepareCall(sql);
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet rs=(ResultSet)callableStatement.getObject(1);
            while (rs.next()){
                PhieuDatPhongDTO phieuDatPhong =new PhieuDatPhongDTO();
                phieuDatPhong.setMaPhieu(rs.getInt(1));
                phieuDatPhong.setMaKH(rs.getInt(2));
                phieuDatPhong.setTenKH(rs.getString(3));
                phieuDatPhong.setMaNV(rs.getInt(4));
                phieuDatPhong.setTenNV(rs.getString(5));
                phieuDatPhong.setNgayDat(rs.getDate(6));
                phieuDatPhong.setNgayDen(rs.getDate(7));
                phieuDatPhong.setNgayDi(rs.getDate(8));   
                phieuDatPhongDTOs.add(phieuDatPhong);
            }
        } catch (Exception e) {
            printStackTrace();
        }
        return phieuDatPhongDTOs;
    }
}
