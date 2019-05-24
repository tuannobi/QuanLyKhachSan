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
    long TongTien;
    int Thang;
    Date Ngay;
    int Nam;

    public int getNam() {
        return Nam;
    }

    public Date getNgay() {
        return Ngay;
    }

    public long getTongTien() {
        return TongTien;
    }

    public int getThang() {
        return Thang;
    }

    public void setTongTien(long TongTien) {
        this.TongTien = TongTien;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }
    
    
}
