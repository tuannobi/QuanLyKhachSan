
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
//    public int capnhatThongTinKhachHang(KhachHangDTO kh){
//        try {
//            String sql="update khachhang set hoten=?,ngaysinh=?,cmnd=?,gioitinh=?,diachi=?,email=?,sdt=?,trangtrangthai=? where makhachhang=?";
//        PreparedStatement preStatement =conn.prepareStatement(sql);
//        preStatement.setString(1, kh.getHoTen());
//        
//        java.util.Date tempdate=new java.util.Date(); //khai báo new
//        tempdate=kh.getNgaySinh(); //gán ngày sinh cho biến tạm
//        java.sql.Date tempsql= new java.sql.Date(tempdate.getTime());// chuyển đổi java.date sang java.sql
//        preStatement.setDate(2, tempsql);
//        
//        preStatement.setInt(3, kh.getCMND());
//        preStatement.setString(4, kh.getGioiTinh());
//        preStatement.setString(5, kh.getDiaChi());
//        preStatement.setString(6, kh.getEmail());
//        preStatement.setString(7, kh.getSDT());
//        preStatement.setString(8, kh.getTrangThai());
//        return preStatement.executeUpdate(); //trả về số dòng cập nhật thành công
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return -1; //sai       
//   }
//    
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
    

//    public int themMoiMotKhachHang(KhachHangDTO kh){
//        KhachHangDTO reKH=new KhachHangDTO();
//        try {
//            String sql ="insert into khachhang(makh,ngaysinh,hoten, cmnd,gioitinh) values(?,?,?,?,?)";
//            PreparedStatement preStatement=conn.prepareStatement(sql);
//            preStatement.setInt(1, kh.getMaKH());
//            java.util.Date tempdate=new java.util.Date(); //khai báo new
// //khai báo new
//      tempdate=kh.getNgaySinh(); //gán ngày sinh cho biến tạm
//        java.sql.Date tempsql = new java.sql.Date(tempdate.getTime());
//            preStatement.setDate(2, tempsql);
//            preStatement.setString(3, kh.getHoTen());
//            preStatement.setInt(4, kh.getCMND());
//            preStatement.setString(0, kh.getGioiTinh());
//            return preStatement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return -1;
//    }
//    
//    public boolean isTonTaiKH(int cmnd){
//        try {
//            String sql="select * from khachhang where cmnd=?";
//            PreparedStatement preStatement=conn.prepareStatement(sql);
//            preStatement.setInt(1, cmnd);
//            ResultSet rs =preStatement.executeQuery();
//            if (rs.next())
//            {
//                return true; //có tồn tại
//            }
//            else 
//                return false;// không tồn tại
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
