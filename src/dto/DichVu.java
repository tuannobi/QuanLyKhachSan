/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author Tuan
 */
public class DichVu {
    private int maDichVu;
    private String tenDichVu;
    private long giaTien;
    private String trangThai;
    private long doanhThu;
    
    //extra
    private Date thoiGian;

    public String getTrangThai() {
        return trangThai;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public long getGiaTien() {
        return giaTien;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public void setGiaTien(long giaTien) {
        this.giaTien = giaTien;
    }  

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
    
    
    
}
