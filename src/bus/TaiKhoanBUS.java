/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.TaiKhoanDAO;
import dto.TaiKhoanDTO;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class TaiKhoanBUS {
     public static ArrayList<TaiKhoanDTO> layDuLieuTaiKhoan(){
         return TaiKhoanDAO.layDuLieuTaiKhoan();
     }
     
     public static boolean taoTaiKhoanNhanVien(int CMND,int maLoai, String tenDN, String matKhau){
         return TaiKhoanDAO.taoTaiKhoanNhanVien(CMND, maLoai,tenDN,matKhau);
     }
     
     public static boolean xoaTaiKhoan(int maNhanVien){
         return TaiKhoanDAO.xoaTaiKhoan(maNhanVien);
     }
}
