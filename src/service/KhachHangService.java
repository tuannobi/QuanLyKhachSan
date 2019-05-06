
package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.KhachHang;

/**
 *
 * @author Tuan
 */
public class KhachHangService extends OracleConnection {
    
    public ArrayList<KhachHang> getDuLieuKhachHang(){
        ArrayList<KhachHang> ds=new ArrayList<>();
        try {
            
            String sql="select * from khachhang";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            ResultSet resultSet=preStatement.executeQuery();           
            while(resultSet.next()){
                KhachHang kh=new KhachHang();
                kh.setMaKH(resultSet.getString(1));
                kh.setHoTen(resultSet.getString(2));
                kh.setNgaySinh(resultSet.getDate(3));
                kh.setCMND(resultSet.getInt(4));
                kh.setGioiTinh(resultSet.getString(5));
                ds.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
        
    }
    public int capNhatDuLieu(KhachHang kh){
        try {
            String sql="update khachhang set hoten=?,ngaysinh=?,cmnd=?,gioitinh=? where makhachhang=?";
        PreparedStatement preStatement =conn.prepareStatement(sql);
        preStatement.setString(1, kh.getHoTen());
        java.util.Date tempdate=new java.util.Date(); //khai báo new
      tempdate=kh.getNgaySinh(); //gán ngày sinh cho biến tạm
        java.sql.Date tempsql= new java.sql.Date(tempdate.getTime());// chuyển đổi java.date sang java.sql
        preStatement.setDate(2, tempsql);
        preStatement.setInt(3, kh.getCMND());
        preStatement.setString(4, kh.getGioiTinh());
        preStatement.setString(5, kh.getMaKH());
        return preStatement.executeUpdate(); //trả về số dòng cập nhật thành công
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //sai       
   }
    
    public int xoaDuLieu(String makh){
        
        try {
            String sql="delete from khachhang where makhachhang=?";
            PreparedStatement preparedStatement=conn.prepareCall(sql);
            preparedStatement.setString(1, makh);
            return preparedStatement.executeUpdate(); //trả về số dòng xóa thành công
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; //Sai
    }
    
    public int themMoiMotKhachHang(KhachHang kh){
        KhachHang reKH=new KhachHang();
        try {
            String sql ="insert into khachhang(makh,ngaysinh,hoten, cmnd,gioitinh) values(?,?,?,?,?)";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, kh.getMaKH());
            java.util.Date tempdate=new java.util.Date(); //khai báo new
 //khai báo new
      tempdate=kh.getNgaySinh(); //gán ngày sinh cho biến tạm
        java.sql.Date tempsql = new java.sql.Date(tempdate.getTime());
            preStatement.setDate(2, tempsql);
            preStatement.setString(3, kh.getHoTen());
            preStatement.setInt(4, kh.getCMND());
            preStatement.setString(0, kh.getGioiTinh());
            return preStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean isTonTaiKH(int cmnd){
        try {
            String sql="select * from khachhang where cmnd=?";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setInt(1, cmnd);
            ResultSet rs =preStatement.executeQuery();
            if (rs.next())
            {
                return true; //có tồn tại
            }
            else 
                return false;// không tồn tại
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
