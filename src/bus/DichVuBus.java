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
    public static ArrayList<DichVu>getDuLieuDichVu()
    {
        return DichVuDAO.getDuLieuDichVu();
    }
    
    public static  int xoaDichVu(int madv)
    {
        return DichVuDAO.xoaDuLieu(madv);
    }
    
    public static int themDichVu(DichVu dv)
    {
        return DichVuDAO.themMoiMotDichVu(dv);
    }
    
    public static void suaDichVu(DichVu dv)
    {
        int check= DichVuDAO.capNhatDuLieu(dv);
        if (check==-1){
            JOptionPane.showMessageDialog(null, "Sửa không thành công");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        }
    }
}
