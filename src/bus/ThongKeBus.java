/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.ThongKeDAO;
import dto.ThongKe;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author COMPUTER
 */
public class ThongKeBus {
    public static ArrayList<ThongKe> getThongKeThang(Date bd,Date kt)
    {
        return ThongKeDAO.getThongKeThang(bd,kt);
    }
    
    public static ArrayList<ThongKe> getThongKeNgay(Date bd,Date kt)
    {
        return ThongKeDAO.getThongKeNgay(bd,kt);
    }
    
    public static ArrayList<ThongKe> getThongKeNam(Date bd,Date kt)
    {
        return ThongKeDAO.getThongKeNam(bd,kt);
    }
    
    public static long getTongDoanhThu(Date bd,Date kt)
    {
        return ThongKeDAO.getTongDoanhThu(bd,kt);
    }
}
