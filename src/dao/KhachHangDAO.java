
package dao;

import dto.KhachHangDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class KhachHangDAO {
    
    public static ArrayList<KhachHangDTO> getDuLieuKhachHang(){
        ArrayList<KhachHangDTO> ds=null;
        Connection conn;
        try {
            ds=new ArrayList<>();
            conn=OracleConnection.openConnection();
            String sql="select * from khachhang";
            //PreparedStatement preStatement=conn.prepareStatement(sql);
            Statement st=conn.createStatement();
            //ResultSet resultSet=preStatement.executeQuery();   
            ResultSet resultSet=st.executeQuery(sql);   
            while(resultSet.next()){
                KhachHangDTO kh=new KhachHangDTO();
                kh.setMaKH(resultSet.getInt(1));
                kh.setHoTen(resultSet.getString(2));
                kh.setNgaySinh(resultSet.getDate(3));
                kh.setCMND(resultSet.getInt(4));
                kh.setGioiTinh(resultSet.getString(5));
                kh.setDiaChi(resultSet.getString(6));
                kh.setEmail(resultSet.getString(7));
                kh.setSDT(resultSet.getString(8));
                kh.setTrangThai(resultSet.getString(9));
                kh.setLoaiKH(resultSet.getString(10));
                ds.add(kh);
            }
            
        } catch (Exception e) {
            System.err.print(e);
        }
        return ds;
    }

    
    public static int xoaKhachHang(int makh){
        
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="delete from khachhang where makhachhang=?";         
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setInt(1, makh);
           return preparedStatement.executeUpdate(); //trả về số dòng xóa thành công
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //Sai
   }
    
    public static int capNhatThongTinKhachHang(KhachHangDTO kh){
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="update khachhang set hoten=?,ngaysinh=?,cmnd=?,gioitinh=?"
                    + ",diachi=?,email=?,sdt=?,trangthai=? where makhachhang=?";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, kh.getHoTen());
            preStatement.setDate(2, new java.sql.Date(kh.getNgaySinh().getTime()));
            preStatement.setInt(3, kh.getCMND());
            preStatement.setString(4, kh.getGioiTinh());
            preStatement.setString(5, kh.getDiaChi());
            preStatement.setString(6, kh.getEmail());
            preStatement.setString(7, kh.getSDT());
            preStatement.setString(8, kh.getTrangThai());
            preStatement.setInt(9, kh.getMaKH());
           return preStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //Khong thanh cong
    }


    public static ArrayList<KhachHangDTO> timKiemKhachHang(String tuKhoa){
        ArrayList<KhachHangDTO> listKH=null;
        try {
            listKH=new ArrayList<>();
            Connection conn=OracleConnection.openConnection();
            String sql ="{CALL PROC_XEMKHACHHANGTIMKIEM(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setString(1, tuKhoa);
            cs.setString(2, tuKhoa);
            cs.setString(3, tuKhoa);
            cs.setString(4, tuKhoa);
            cs.setString(5, tuKhoa);
            cs.setString(6, tuKhoa);
            cs.setString(7, tuKhoa);
            cs.setString(8, tuKhoa);
            cs.setString(9,tuKhoa);
            cs.registerOutParameter(10, OracleTypes.CURSOR);
            cs.execute();
            ResultSet resultSet= (ResultSet) cs.getObject(10);
            while(resultSet.next()){
                KhachHangDTO kh=new KhachHangDTO();
                kh.setMaKH(resultSet.getInt(1));
                kh.setHoTen(resultSet.getString(2));
                kh.setNgaySinh(resultSet.getDate(3));
                kh.setCMND(resultSet.getInt(4));
                kh.setGioiTinh(resultSet.getString(5));
                kh.setDiaChi(resultSet.getString(6));
                kh.setEmail(resultSet.getString(7));
                kh.setSDT(resultSet.getString(8));
                kh.setTrangThai(resultSet.getString(9));
                listKH.add(kh);            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKH;
    }
}
