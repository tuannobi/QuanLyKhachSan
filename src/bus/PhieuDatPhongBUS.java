/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.PhieuDatPhongDAO;
import dto.PhieuDatPhongDTO;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class PhieuDatPhongBUS {
    public static ArrayList<PhieuDatPhongDTO> getThongTinDatPhongCuThe1Phong(int maPhong){
        return PhieuDatPhongDAO.getThongTinDatPhongCuThe1Phong(maPhong);
    }
}
