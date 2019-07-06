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
public class ChiTietDichVuDTO {
    int maDichVu;
    int maHoaDon;
    String tenDichVu;
    int soLuong;
    long thanhTien;
  
    public ChiTietDichVuDTO(){
        
    }
    
    public ChiTietDichVuDTO(int mDv, int mHD, int soLuong){
        this.maDichVu=mDv;
        this.maHoaDon=mHD;
        this.soLuong=soLuong;
        
    }
    
    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
        
}
