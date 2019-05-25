/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.NhanVienDAO;
import dto.NhanVienDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author COMPUTER
 */
public class NhanVienBus {
    
    public static ArrayList<NhanVienDTO>getDuLieuNhanVien() throws SQLException
    {
        return NhanVienDAO.getDuLieuNhanVien();
    }
    
    public static  int xoaNhanVien(int manv)
    {
        return NhanVienDAO.xoaDuLieu(manv);
    }
    


    public static int suaNhanVien(NhanVienDTO nv,JComboBox ten)


    {
        return NhanVienDAO.capNhatDuLieu(nv,ten);
    }
    
    public static ArrayList<NhanVienDTO> loadComboBoxTenNguoiQuanLy(JComboBox ten)
    {
        return NhanVienDAO.loadComboBoxTenNguoiQuanLy(ten);
    }
    

    public static int themNhanVien(NhanVienDTO nv,JComboBox ten)

    {
        return NhanVienDAO.themNhanVien(nv,ten);
    }
    
    public static ArrayList<NhanVienDTO> timKiemNhanVien(String tk)
    {
        return NhanVienDAO.timKiemNhanVien(tk);
    }
}

