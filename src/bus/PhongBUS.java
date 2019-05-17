/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.PhongDAO;
import dto.LoaiPhongDTO;
import dto.PhongDTO;
import java.util.ArrayList;
import java.util.Date;
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
    
   public static ArrayList<Integer> getCacPhongCoTheDat(Date x, Date y, int maPhong){
       return PhongDAO.getCacPhongCoTheDat(x,y,maPhong);
   }

}
