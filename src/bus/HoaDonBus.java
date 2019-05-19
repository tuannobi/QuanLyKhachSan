/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.HoaDonDAO;
import dto.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author COMPUTER
 */
public class HoaDonBus {
    public static ArrayList<HoaDon> getDuLieuHoaDon()
    {
        return HoaDonDAO.getDuLieuHoaDon();
    }
    public static ArrayList<HoaDon> timKiemHoaDon(String tk)
    {
        return HoaDonDAO.timKiemHoaDon(tk);
    }
}
