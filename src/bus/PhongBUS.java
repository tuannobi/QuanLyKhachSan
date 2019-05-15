/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.PhongDAO;
import dto.PhongDTO;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class PhongBUS {
    public static ArrayList<PhongDTO> getDuLieuPhong(){
        return PhongDAO.getDuLieuPhong();
    }
}
