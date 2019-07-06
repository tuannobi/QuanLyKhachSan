/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.LoaiTaiKhoanDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class LoaiTaiKhoanDAO {
    public static ArrayList<LoaiTaiKhoanDTO> layDanhSachLoaiTaiKhoan(){
        Connection conn=OracleConnection.openConnection();
        ArrayList<LoaiTaiKhoanDTO> listLoaiTaiKhoanDTOs=null;
        try {
            listLoaiTaiKhoanDTOs=new ArrayList<>();
            String sqlString="{CALL PRO_DSLOAITAIKHOAN(?)}";
            CallableStatement cs=conn.prepareCall(sqlString);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs=(ResultSet) cs.getObject(1);
            while(rs.next()){
                LoaiTaiKhoanDTO taiKhoan =new LoaiTaiKhoanDTO();
                taiKhoan.setMaLoaiTaiKhoan(rs.getInt(1));
                taiKhoan.setTenLoaiTaiKhoan(rs.getString(2));
                taiKhoan.setMoTa(rs.getString(3));
                listLoaiTaiKhoanDTOs.add(taiKhoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLoaiTaiKhoanDTOs;
    }
}
