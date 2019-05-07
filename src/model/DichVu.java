/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tuan
 */
public class DichVu {
    private int maDichVu;
    private String tenDichVu;
    private float giaTien;

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

    public DichVu(int maDichVu, String tenDichVu, float giaTien) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.giaTien = giaTien;
    }
    
    
}
