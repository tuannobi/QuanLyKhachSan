
package dao;

import dto.KhachHangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class KhachHangDAO {
    
    public static ArrayList<KhachHangDTO> getDuLieuKhachHang(){
      //  JOptionPane.showMessageDialog(null, "hello");
        ArrayList<KhachHangDTO> ds=null;
        Connection conn;
        try {
            ds=new ArrayList<>();
         conn=OracleConnection.openConnection();
            String sql="select * from khachhang";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            ResultSet resultSet=preStatement.executeQuery();           
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
                ds.add(kh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
        
    }

    public static int xoaKhachHang(int makh){
        
        try {
            String sql="delete from khachhang where makhachhang=?";
            Connection conn=OracleConnection.openConnection();
            PreparedStatement preparedStatement=conn.prepareCall(sql);
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
            String sql="update khachhang set hoten=?,ngaysinh=?,cmnd=?,gioitinh=?,diachi=?,email=?,sdt=?,trangthai=? where makhachhang=?";
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
            String sql ="select * from khachhang where makhachhang like ? or hoten like ? or cmnd like ? or gioitinh like ? or diachi like ? or email like ? or sdt like ? or trangthai like ?  ";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, "%"+tuKhoa+"%");
            preStatement.setString(2, "%"+tuKhoa+"%");
            preStatement.setString(3, "%"+tuKhoa+"%");
            preStatement.setString(4, "%"+tuKhoa+"%");
            preStatement.setString(5, "%"+tuKhoa+"%");
            preStatement.setString(6, "%"+tuKhoa+"%");
            preStatement.setString(7, "%"+tuKhoa+"%");
            preStatement.setString(8, "%"+tuKhoa+"%");
            ResultSet resultSet=preStatement.executeQuery();
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
