/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Tuan
 */
public class DichVu {
    private int maDichVu;
    private String tenDichVu;
    private float giaTien;
    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }  

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
