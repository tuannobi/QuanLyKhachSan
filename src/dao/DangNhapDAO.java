/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dto.TaiKhoan;

/**
 *
 * @author Tuan
 */
//mới chỉ kiểm tra tài khoản có thành công chưa phân quyền
public class DangNhapDAO extends OracleConnection {
    
        
    public TaiKhoan kiemTraTaiKhoan(String user, String pass){
        TaiKhoan tk=null;
       try {
           String sql="select * from taikhoan where tentaikhoan=? and matkhau=?";
            //String sql="select * from taikhoan where username=? and password=?";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, user);
            preStatement.setString(2, pass);
            ResultSet rs=preStatement.executeQuery();
            if (rs.next()){
                tk=new TaiKhoan();
                tk.setTenDangNhap(rs.getString(1));
                tk.setMatKhau(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }


}
