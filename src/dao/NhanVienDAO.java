/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
    public static ArrayList<NhanVienDTO> getDuLieuNhanVien() throws SQLException
    {
        ArrayList<NhanVienDTO> ds=new ArrayList<>();
        String sql="{CALL PROC_XEMNHANVIEN(?)}";
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
    

     public static int capNhatDuLieu(NhanVienDTO nv,JComboBox ten){


        try {
            //String sql="update NhanVienDTO set HOTEN=?,ngaysinh=?,ngayvaolam=?,cmnd=?,sodt=?,manguoiquanly=?,gioitinh=?,email=?,diachi=?,trangthai=? where manhanvien=?";     
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
//            if(maNhanVien(nv.getTenNguoiQL())!=0)
//            {cs.setInt(6, maNhanVien(nv.getTenNguoiQL()));}
//            else
//            {
//                cs.setString(6, "");
//            }
            int a=ten.getSelectedIndex()-1;
            if(a==-1)
                cs.setString(6, null);
            else
                cs.setInt(6,loadComboBoxTenNguoiQuanLy(ten).get(a).getMaNhanVien());
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
     
//   public static int maNhanVien(String tennv)
//   {
//       Connection conn;
//       String sql="{CALL PROC_MANHANVIEN(?,?)}";
//       try{
//           conn=OracleConnection.openConnection();
//           CallableStatement cs =conn.prepareCall(sql);
//           cs.setString(1, tennv);
//           cs.registerOutParameter(2, OracleTypes.CURSOR);
//           cs.execute();
//           ResultSet rs=(ResultSet) cs.getObject(2);
//           int manv=0;
//           while(rs.next())
//           {
//               manv=rs.getInt(1);
//           }
//           return manv;
//       }
//       catch(Exception e){
//           e.printStackTrace();
//       }
//       return 0;
//   }
   
   public static ArrayList<NhanVienDTO> loadComboBoxTenNguoiQuanLy(JComboBox ten)
   {
       Connection conn;
       ArrayList<NhanVienDTO> nv=new ArrayList<>();
       //ArrayList<Integer> maNhanVien=null;
       String sql="{CALL PROC_XEMNHANVIEN(?)}";
       try{
           conn=OracleConnection.openConnection();
           CallableStatement cs=conn.prepareCall(sql);
           cs.registerOutParameter(1, OracleTypes.CURSOR);
           cs.execute();
           ResultSet rs=(ResultSet) cs.getObject(1);
           while(rs.next())
           {
               NhanVienDTO x=new NhanVienDTO("");
               x.setMaNhanVien(rs.getInt(1));
               x.setHoTen(rs.getString(2));
               nv.add(x);
               //ten.addItem(rs.getString(2));
               //ten.addItem(x.getHoTen());
           }
           for(NhanVienDTO a : nv)
           {
               ten.addItem(a.getHoTen());
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return nv;
   }


   public static int themNhanVien(NhanVienDTO nv,JComboBox ten)


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
//            if(maNhanVien(nv.getTenNguoiQL())!=0)
//            {cs.setInt(10, maNhanVien(nv.getTenNguoiQL()));}
//            else
//            {
//                cs.setString(10, "");
//            }
            int a=ten.getSelectedIndex()-1;
            if(a==-1)
                cs.setString(10, null);
            else
                cs.setInt(10,loadComboBoxTenNguoiQuanLy(ten).get(a).getMaNhanVien());
            cs.execute();
            
            cs.close();
            conn.close();
            return 1;
           }
           catch(SQLIntegrityConstraintViolationException sqlicve)
           {
               return 2;
           }
           catch(NullPointerException ex)
           {
               return 2;
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return -1;
   }
   
   public static ArrayList<NhanVienDTO> timKiemNhanVien(String tk){
    
        ArrayList<NhanVienDTO> ds=null;
            try {
                ds=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String sql="{CALL PROC_XEMNHANVIENTIMKIEM(?,?,?,?,?,?,?,?)}";
                CallableStatement cs=conn.prepareCall(sql);
                
                cs.setString(1, tk);
                cs.setString(2, tk);
                cs.setString(3, tk);
                cs.setString(4, tk);
                cs.setString(5, tk);
                cs.setString(6, tk);
                cs.setString(7, tk);
                cs.registerOutParameter(8, OracleTypes.CURSOR);
                cs.execute();
                ResultSet rs=(ResultSet) cs.getObject(8);
                while(rs.next())
                {
                    NhanVienDTO nv=new NhanVienDTO("");
             
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
                cs.close();
                rs.close();
                
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return ds;
        
    }
}

