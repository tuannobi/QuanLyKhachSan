/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.DichVu;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author COMPUTER
 */
public class DichVuDAO {
        public static ArrayList<DichVu> getDuLieuDichVu(){
            ArrayList<DichVu> ds=null;
            String sql="{CALL PROC_XEMDICHVU(?)}";
            try {
                ds=new ArrayList<>();
                Connection conn = OracleConnection.openConnection();
                CallableStatement cs=conn.prepareCall(sql);
                cs.registerOutParameter(1, OracleTypes.CURSOR);
                cs.execute();
                ResultSet rs=(ResultSet) cs.getObject(1);        
                while(rs.next()){
                    DichVu dv=new DichVu();
                    dv.setMaDichVu(rs.getInt(1));
                    dv.setTenDichVu(rs.getString(2));
                    dv.setGiaTien(rs.getLong(3));
                    dv.setTrangThai(rs.getString(4));
                    ds.add(dv);
                }
                conn.close();
                cs.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        return ds;
    }
        public static int capNhatDuLieu(DichVu dv){
        try {
            String sql="{CALL PROC_SUADICHVU(?,?,?,?)}"; 
            Connection conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            try{
            cs.setString(1, dv.getTenDichVu());
            cs.setLong(2, dv.getGiaTien());
            cs.setString(3, dv.getTrangThai());
            cs.setInt(4, dv.getMaDichVu());
            
            cs.execute();
            cs.close();
            conn.close();
           // return preStatement.executeUpdate(); //trả về số dòng cập nhật thành công
            return 1;
            }
            catch(SQLException e)
            {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //sai       
   }
    
//    public static int xoaDuLieu(int madv){
//        
//        try {
//            Connection conn=OracleConnection.openConnection();
//            String sql="delete from DichVu where maDichVu=?";
//            PreparedStatement preparedStatement=conn.prepareStatement(sql);
//            preparedStatement.setInt(1, madv);
//            preparedStatement.executeUpdate(); //trả về số dòng xóa thành công
//            preparedStatement.close();
//            conn.close();
//            return 1;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return -1; //Sai
//    }
    
    public static int themMoiMotDichVu(DichVu dv){
        try {
            Connection conn=OracleConnection.openConnection();
            String sql ="{CALL PROC_THEMDICHVU(?,?)}";
            CallableStatement cs =conn.prepareCall(sql);
            try{
            cs.setString(1, dv.getTenDichVu());
            cs.setLong(2, dv.getGiaTien());
            cs.execute();
            cs.close();
            conn.close();
            return 1;
            }
            catch(SQLIntegrityConstraintViolationException a)
            {
                return 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
     public static ArrayList<DichVu> timKiemDichVu(String tk){
    
        ArrayList<DichVu> ds=null;
            try {
                ds=new ArrayList<>();
                Connection conn=OracleConnection.openConnection();
                String sql="{CALL PROC_XEMDICHVUTIMKIEM(?,?,?,?)}";
                CallableStatement cs=conn.prepareCall(sql);
                
                cs.setString(1,  tk);
                cs.setString(2, tk);
                cs.setString(3,  tk);
                cs.registerOutParameter(4, OracleTypes.CURSOR);
                cs.execute();
                ResultSet rs=(ResultSet) cs.getObject(4);
                while(rs.next())
                {
                    DichVu dv=new DichVu();
                    dv.setMaDichVu(rs.getInt(1));
                    dv.setTenDichVu(rs.getString(2));
                    dv.setGiaTien(rs.getLong(3));
                    dv.setTrangThai(rs.getString(4));
                    ds.add(dv);
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
