/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.PhongDAO;
import dto.KhachHangDTO;
import dto.LoaiPhongDTO;
import dto.NhanVienDTO;
import dto.PhongDTO;
import java.util.ArrayList;
import java.util.Date;
import newClass.JPanelPhong;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author Tuan
 */
public class PhongBUS {
    public static ArrayList<PhongDTO> getDuLieuPhong(){
        return PhongDAO.getDuLieuPhong();
    }
    
  
   
   public static ArrayList<Integer> getCacPhongDuocThue(Date y, int maPhong){
       return PhongDAO.getCacPhongDuocThue( y, maPhong);
   }
   
   public static boolean luuThongTinThuePhong(PhongDTO phongDTO, KhachHangDTO khachHangDTO, NhanVienDTO nhanVienDTO){
       return PhongDAO.luuThongTinThuePhong(phongDTO,khachHangDTO, nhanVienDTO);
   }

   public static ArrayList<Integer> getCacPhongDuocDat(Date x, Date y, int loaiPhong){
       return PhongDAO.getCacPhongDuocDat(x, y, loaiPhong);
   }
   
   public static boolean luuThongTinDatPhong(PhongDTO phongDTO, KhachHangDTO khachHangDTO, NhanVienDTO nhanVienDTO){
       return PhongDAO.luuThongTinDatPhong(phongDTO,khachHangDTO, nhanVienDTO);
   }

}
