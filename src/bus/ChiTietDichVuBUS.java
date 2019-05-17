/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.ChiTietDichVuDAO;
import dto.ChiTietDichVuDTO;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class ChiTietDichVuBUS {
    public static ArrayList<ChiTietDichVuDTO> getChiTietDichVuCuaKhachHang(int maPhong){
       return  ChiTietDichVuDAO.getChiTietDichVuCuaKhachHang(maPhong);
    }
}
