/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.TaiKhoanDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class TaiKhoanDAO {
    public static ArrayList<TaiKhoanDTO> layDuLieuTaiKhoan(){
        ArrayList<TaiKhoanDTO> listTaiKhoan=null;
        try {
            listTaiKhoan=new ArrayList<>();
            Connection conn=OracleConnection.openConnection();
            String sql="{CALL PRO_DSTAIKHOAN(?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs= (ResultSet)cs.getObject(1);
            while(rs.next()){
                TaiKhoanDTO taiKhoan=new TaiKhoanDTO();
                taiKhoan.setMaTaiKhoan(rs.getInt(1));
                taiKhoan.setMaNhanVien(rs.getInt(2));
                taiKhoan.setMaLoaiTaiKhoan(rs.getInt(3));
                taiKhoan.setTenDangNhap(rs.getString(4));
                taiKhoan.setMatKhau(rs.getString(5));
                listTaiKhoan.add(taiKhoan);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return listTaiKhoan;
    }
    
    public static boolean taoTaiKhoanNhanVien(int CMND,int maLoai, String tenDN, String matKhau){
        Connection conn=OracleConnection.openConnection();
        try {
            String sql="{CALL PRO_TAOTAIKHOAN(?,?,?,?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setInt(1, CMND);
            cs.setInt(2, maLoai);
            cs.setString(3, tenDN);
            cs.setString(4, matKhau);
            cs.execute();
            return true;
        } catch (SQLException ex) {
            String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
        }
        return false;
    }
    
    public static boolean xoaTaiKhoan(int maNhanVien){
       Connection conn=OracleConnection.openConnection();
       try {
           String sql="{CALL PRO_XOATAIKHOAN(?)}";
           CallableStatement cs=conn.prepareCall(sql);
           cs.setInt(1, maNhanVien);
           cs.execute();
           return true;
       } catch (SQLException ex) {
           String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
       }
       return false;
   }
}
