/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;


import dao.LoaiPhongDAO;
import dto.LoaiPhongDTO;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class LoaiPhongBUS {
     public static ArrayList<LoaiPhongDTO> getLoaiPhong(){
       return LoaiPhongDAO.getLoaiPhong();
   }
}
