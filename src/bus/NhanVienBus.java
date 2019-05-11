/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.NhanVienDAO;
import dto.NhanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author COMPUTER
 */
public class NhanVienBus {
    
    public static ArrayList<NhanVien>getDuLieuNhanVien() throws SQLException
    {
        return NhanVienDAO.getDuLieuNhanVien();
    }
    
    public static  int xoaNhanVien(int manv)
    {
        return NhanVienDAO.xoaDuLieu(manv);
    }
    
    public static int suaNhanVien(NhanVien nv)
    {
        return NhanVienDAO.capNhatDuLieu(nv);
    }
    
    public static void loadComboBoxTenNguoiQuanLy(JComboBox ten)
    {
        NhanVienDAO.loadComboBoxTenNguoiQuanLy(ten);
    }
    
    public static int themNhanVien(NhanVien nv)
    {
        return NhanVienDAO.themNhanVien(nv);
    }
}

