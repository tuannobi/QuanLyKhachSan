/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.LoaiTaiKhoanDAO;
import dto.LoaiTaiKhoanDTO;
import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class LoaiTaiKhoanBUS {
    public static ArrayList<LoaiTaiKhoanDTO> layDanhSachLoaiTaiKhoan(){
        return LoaiTaiKhoanDAO.layDanhSachLoaiTaiKhoan();
    }
}
