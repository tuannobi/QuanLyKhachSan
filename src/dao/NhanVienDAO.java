/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import dto.NhanVienDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */

public class NhanVienDAO {
    public static ArrayList<NhanVienDTO> layDuLieuNhanVien() throws SQLException
    {
        ArrayList<NhanVienDTO> ds=new ArrayList<>();
        String sql="{CALL PRO_DSNHANVIEN(?)}";
        try{
        Connection conn = OracleConnection.openConnection();
        CallableStatement cs=conn.prepareCall(sql);
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.execute();
        ResultSet rs=(ResultSet) cs.getObject(1);
 
            while(rs.next())
            {
                NhanVienDTO nv=new NhanVienDTO("");
                nv.setMaNhanVien(rs.getInt(1));
                nv.setHoTen(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setNgayVaoLam(rs.getDate(4));
                nv.setCMND(rs.getInt(5));
                nv.setSoDT(rs.getString(6));
                nv.setMaNguoiQuanLy(rs.getInt(7));
                nv.setTenNguoiQL(rs.getString(8));
                nv.setGioiTinh(rs.getString(9));
                nv.setEmail(rs.getString(10));
                nv.setDiaChi(rs.getString(11));
                nv.setTrangThai(rs.getString(12));
                ds.add(nv);
                
            }
        
        cs.close();
        rs.close();
        conn.close();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return ds;
        
    }
    
    public static ArrayList<NhanVienDTO> timKiemNhanVien(String tk){
    
        ArrayList<NhanVienDTO> ds=null;
            try {
                ds=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String sql="{CALL PRO_DSTIMKIEMNHANVIEN(?,?)}";
                CallableStatement cs=conn.prepareCall(sql);
                
                cs.setString(1, tk);
                cs.registerOutParameter(2, OracleTypes.CURSOR);
                cs.execute();
                ResultSet rs=(ResultSet) cs.getObject(2);
                while(rs.next())
                {
                    NhanVienDTO nv=new NhanVienDTO("");
             
                    nv.setMaNhanVien(rs.getInt(1));
                    nv.setHoTen(rs.getString(2));
                    nv.setNgaySinh(rs.getDate(3));
                    nv.setNgayVaoLam(rs.getDate(4));
                    nv.setCMND(rs.getInt(5));
                    nv.setSoDT(rs.getString(6));
                    nv.setMaNguoiQuanLy(rs.getInt(7));
                    nv.setTenNguoiQL(rs.getString(8));
                    nv.setGioiTinh(rs.getString(9));
                    nv.setEmail(rs.getString(10));
                    nv.setDiaChi(rs.getString(11));
                    nv.setTrangThai(rs.getString(12));
                    ds.add(nv);
                }
                conn.close();
                cs.close();
                rs.close();
                
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return ds;
        
    }
    
    
    public static int themNhanVien(NhanVienDTO nv)
   {
       
       String sql="{CALL PRO_THEMNHANVIEN(?,?,?,?,?,?,?,?,?,?)}";
       try
       {
          Connection conn=OracleConnection.openConnection();
           CallableStatement cs=conn.prepareCall(sql);
            cs.setString(1, nv.getHoTen());
            cs.setDate(2, new java.sql.Date(nv.getNgaySinh().getTime()));
            cs.setDate(3, new java.sql.Date(nv.getNgayVaoLam().getTime()));
            cs.setInt(4, nv.getCMND());
            cs.setString(5, nv.getSoDT());
            cs.setString(6, nv.getGioiTinh());
            cs.setString(7, nv.getEmail());
            cs.setString(8, nv.getDiaChi());
            cs.setString(9, nv.getTrangThai());
            cs.setInt(10, nv.getMaNguoiQuanLy());
            cs.execute();
            cs.close();
            conn.close();
            return 1;         
       }
       catch(SQLException ex)
       {
           String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
       }
       return -1;
   }
    
        public static int capNhatThongTinNhanVien(NhanVienDTO nv){
        try {
           String sql="{CALL PRO_CAPNHATNHANVIEN(?,?,?,?,?,?,?,?,?,?,?)}";
            Connection conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setString(1, nv.getHoTen());
            cs.setDate(2, new java.sql.Date(nv.getNgaySinh().getTime()));
            cs.setDate(3, new java.sql.Date(nv.getNgayVaoLam().getTime()));
            cs.setInt(4, nv.getCMND());
            cs.setString(5, nv.getSoDT());
            cs.setInt(6, nv.getMaNguoiQuanLy());
            cs.setString(7, nv.getGioiTinh());
            cs.setString(8, nv.getEmail());
            cs.setString(9, nv.getDiaChi());
            cs.setString(10, nv.getTrangThai());
            cs.setInt(11, nv.getMaNhanVien());
            cs.execute();
            cs.close();
            conn.close();
            return 1;
            }
            catch(SQLException ex)
            {

                String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
            }         
        return -1; //sai       
   }
        
        
    public static int xoaDuLieu(int manv){
        
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="{CALL PRO_XOANHANVIEN(?)}";
            CallableStatement cs= conn.prepareCall(sql);
            cs.setInt(1, manv);
            cs.execute();
            cs.close();
            conn.close();
            return 1;
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //Sai
    }
        
   public static NhanVienDTO layThongTinNhanVien(int maNhanVien){
       Connection conn=OracleConnection.openConnection();
       NhanVienDTO nhanVienDTO=null;
       try {
       String sql="{CALL PRO_LAYTTNHANVIEN(?,?)}";
       nhanVienDTO=new NhanVienDTO();
       CallableStatement cs=conn.prepareCall(sql);
       cs.setInt(1, maNhanVien);
       cs.registerOutParameter(2, OracleTypes.CURSOR);
       cs.execute();
       ResultSet rs=(ResultSet) cs.getObject(2);
       while(rs.next()){
       nhanVienDTO.setMaNhanVien(rs.getInt(1));
       nhanVienDTO.setHoTen(rs.getString(2));
       nhanVienDTO.setNgaySinh(rs.getDate(3));
       nhanVienDTO.setNgayVaoLam(rs.getDate(4));
       nhanVienDTO.setCMND(rs.getInt(5));
       nhanVienDTO.setSoDT(rs.getString(6));
       nhanVienDTO.setMaNguoiQuanLy(rs.getInt(7));
       nhanVienDTO.setGioiTinh(rs.getString(8));
       nhanVienDTO.setEmail(rs.getString(9));
       nhanVienDTO.setDiaChi(rs.getString(10));
       }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return nhanVienDTO;
       }
   
   
}

