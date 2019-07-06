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
    
    public static ArrayList<NhanVienDTO>layDuLieuNhanVien() throws SQLException
    {
        return NhanVienDAO.layDuLieuNhanVien();
    }
    
        public static int themNhanVien(NhanVienDTO nv)
    {
        return NhanVienDAO.themNhanVien(nv);
    }
    
        public static int capNhatThongTinNhanVien(NhanVienDTO nv){
        return NhanVienDAO.capNhatThongTinNhanVien(nv);
    }
    
    public static  int xoaNhanVien(int manv)
    {
        return NhanVienDAO.xoaDuLieu(manv);
    }
    
    public static ArrayList<NhanVienDTO> timKiemNhanVien(String tk)
    {
        return NhanVienDAO.timKiemNhanVien(tk);
    }
    
    public static NhanVienDTO layThongTinNhanVien(int maNhanVien){
        return NhanVienDAO.layThongTinNhanVien(maNhanVien);
    }
    
}

