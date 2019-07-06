/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.DichVuDAO;
import dto.DichVu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPUTER
 */
public class DichVuBus {
    public static ArrayList<DichVu>layDuLieuDichVu()
    {
        return DichVuDAO.layDuLieuDichVu();
    }
    
    
    public static int themDichVu(DichVu dv)
    {
        return DichVuDAO.themMoiMotDichVu(dv);
    }
    
    public static int suaDichVu(DichVu dv)
    {
        return DichVuDAO.capNhatDuLieu(dv);
        
    }
    public static ArrayList<DichVu> timKiemDichVu(String tk)
    {
        return DichVuDAO.timKiemDichVu(tk);
    }
    
    public static ArrayList<DichVu> layDanhSachDichVuCoTheDatDuoc(){
        return DichVuDAO.layDanhSachDichVuCoTheDatDuoc();
    }
}
