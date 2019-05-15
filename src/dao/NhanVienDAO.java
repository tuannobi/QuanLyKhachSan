/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.NhanVien;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */

public class NhanVienDAO {
    public static ArrayList<NhanVien> getDuLieuNhanVien() throws SQLException
    {
        ArrayList<NhanVien> ds=new ArrayList<>();
        String sql="{CALL PROC_XEMNHANVIEN(?)}";
        try{
        Connection conn = OracleConnection.openConnection();
        CallableStatement cs=conn.prepareCall(sql);
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.execute();
        ResultSet rs=(ResultSet) cs.getObject(1);
 
            while(rs.next())
            {
                NhanVien nv=new NhanVien("");
                nv.setMaNhanVien(rs.getInt(1));
                nv.setHoTen(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setNgayVaoLam(rs.getDate(4));
                nv.setCMND(rs.getInt(5));
                nv.setSoDT(rs.getString(6));
                nv.setTenNguoiQL(rs.getString(7));
                nv.setGioiTinh(rs.getString(8));
                nv.setEmail(rs.getString(9));
                nv.setDiaChi(rs.getString(10));
                nv.setTrangThai(rs.getString(11));
                ds.add(nv);
                
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
    
    public static int xoaDuLieu(int manv){
        
        try {
            Connection conn=OracleConnection.openConnection();
            //String sql="delete from NHANVIEN where maNHANVIEN=?";
            String sql="{CALL PROC_XOANHANVIEN(?)}";
//            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            CallableStatement cs= conn.prepareCall(sql);
            cs.setInt(1, manv);
            cs.execute(); //trả về số dòng xóa thành công
            cs.close();
            conn.close();
            return 1;
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //Sai
    }
    
     public static int capNhatDuLieu(NhanVien nv){
        try {
            //String sql="update NhanVien set HOTEN=?,ngaysinh=?,ngayvaolam=?,cmnd=?,sodt=?,manguoiquanly=?,gioitinh=?,email=?,diachi=?,trangthai=? where manhanvien=?";     
            String sql="{CALL PROC_SUANHANVIEN(?,?,?,?,?,?,?,?,?,?,?)}";
            Connection conn=OracleConnection.openConnection();
            //PreparedStatement preStatement =conn.prepareStatement(sql);
            CallableStatement cs=conn.prepareCall(sql);
            try{
            cs.setString(1, nv.getHoTen());
            cs.setDate(2, new java.sql.Date(nv.getNgaySinh().getTime()));
            cs.setDate(3, new java.sql.Date(nv.getNgayVaoLam().getTime()));
            cs.setInt(4, nv.getCMND());
            cs.setString(5, nv.getSoDT());
            if(maNhanVien(nv.getTenNguoiQL())!=0)
            {cs.setInt(6, maNhanVien(nv.getTenNguoiQL()));}
            else
            {
                cs.setString(6, "");
            }
            cs.setString(7, nv.getGioiTinh());
            cs.setString(8, nv.getEmail());
            cs.setInt(11, nv.getMaNhanVien());
            cs.setString(9, nv.getDiaChi());
            cs.setString(10, nv.getTrangThai());
            
            
            cs.execute();
            cs.close();
            conn.close();
           // return preStatement.executeUpdate(); //trả về số dòng cập nhật thành công
            return 1;
            }
            catch(SQLException ex)
            {
                
            }
            catch(NullPointerException ex)
            {
                
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //sai       
   }
     
   public static int maNhanVien(String tennv)
   {
       Connection conn;
       String sql="Select * from nhanvien where hoten=?";
       try{
           conn=OracleConnection.openConnection();
           PreparedStatement st=conn.prepareStatement(sql);
           st.setString(1, tennv);
           ResultSet rs=st.executeQuery();
           int manv=0;
           while(rs.next())
           {
               manv=rs.getInt(1);
           }
           return manv;
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return 0;
   }
   
   public static void loadComboBoxTenNguoiQuanLy(JComboBox ten)
   {
       Connection conn;
       String sql="SELECT * FROM NHANVIEN";
       try{
           conn=OracleConnection.openConnection();
           PreparedStatement ps=conn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               ten.addItem(rs.getString(2));
           }
           ten.addItem("");
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
   }
   public static int themNhanVien(NhanVien nv)
   {
       
       String sql="{CALL PROC_THEMNHANVIEN(?,?,?,?,?,?,?,?,?,?)}";
       try
       {
          Connection conn=OracleConnection.openConnection();
           CallableStatement cs=conn.prepareCall(sql);
           try{
            cs.setString(1, nv.getHoTen());
            cs.setDate(2, new java.sql.Date(nv.getNgaySinh().getTime()));
            cs.setDate(3, new java.sql.Date(nv.getNgayVaoLam().getTime()));
            cs.setInt(4, nv.getCMND());
            cs.setString(5, nv.getSoDT());
            cs.setString(6, nv.getGioiTinh());
            cs.setString(7, nv.getEmail());
            cs.setString(8, nv.getDiaChi());
            cs.setString(9, nv.getTrangThai());
            if(maNhanVien(nv.getTenNguoiQL())!=0)
            {cs.setInt(10, maNhanVien(nv.getTenNguoiQL()));}
            else
            {
                cs.setString(10, "");
            }
            cs.execute();
            
            cs.close();
            conn.close();
            return 1;
           }
           catch(SQLIntegrityConstraintViolationException sqlicve)
           {
               
           }
           catch(NullPointerException ex)
           {
               
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return -1;
   }
   
   public static ArrayList<NhanVien> timKiemNhanVien(String tk){
    
        ArrayList<NhanVien> ds=null;
            try {
                ds=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String sql="SELECT * FROM NHANVIEN WHERE  CMND LIKE ? OR SODT LIKE ? OR DIACHI LIKE ? OR EMAIL LIKE ? OR TRANGTHAI LIKE ? OR GIOITINH LIKE ? OR HOTEN LIKE ?";
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,"%"+ tk+"%");
                ps.setString(2, "%"+ tk+"%");
                ps.setString(3, "%"+ tk+"%");
                ps.setString(4, "%"+ tk+"%");
                ps.setString(5, "%"+ tk+"%");
                ps.setString(6, "%"+ tk+"%");
                ps.setString(7, "%"+ tk+"%");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                    NhanVien nv=new NhanVien("");
                    nv.setMaNhanVien(rs.getInt(1));
                    nv.setHoTen(rs.getString(2));
                    nv.setNgaySinh(rs.getDate(3));
                    nv.setNgayVaoLam(rs.getDate(4));
                    nv.setCMND(rs.getInt(5));
                    nv.setSoDT(rs.getString(6));
                    nv.setTenNguoiQL(rs.getString(7));
                    nv.setGioiTinh(rs.getString(8));
                    nv.setEmail(rs.getString(9));
                    nv.setDiaChi(rs.getString(10));
                    nv.setTrangThai(rs.getString(11));
                    ds.add(nv);
                }
                conn.close();
                ps.close();
                rs.close();
                
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return ds;
        
    }
}

