/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.LoaiKhachHangDAO;
import dto.LoaiKhachHangDTO;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Tuan
 */
public class LoaiKhachHangBUS {
    public static ArrayList<LoaiKhachHangDTO> layDuLieuLoaiKhachHang(){
        return LoaiKhachHangDAO.layDuLieuLoaiKhachHang();
    }
}
