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
    public static ArrayList<ThongKe> getDuLieuTheoNgay(Date ngaybd,Date ngaykt)
    {
        return ThongKeDAO.getDuLieuTheoNgay(ngaybd,ngaykt);
    }
    public static long TongDoanhThu(Date ngaybd,Date ngaykt)
    {
        return ThongKeDAO.tongDoanhThu(ngaybd, ngaykt);
    }
}
