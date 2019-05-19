/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author COMPUTER
 */
public class ThongKe {
    private long DoanhThu;
    private Date Ngay;

    public long getDoanhThu() {
        return DoanhThu;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setDoanhThu(long DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }
    
    
}
