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
public class NhanVienDTO {
    private int maNhanVien;
    private String hoTen;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private int CMND;
    private String soDT;
    private String tenNguoiQL;
    private String gioiTinh;
    private String email;
    private String diaChi;
    private String trangThai;

    public NhanVienDTO() {
    }

    
    
    public String getTrangThai() {
        return trangThai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public int getCMND() {
        return CMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getTenNguoiQL() {
        return tenNguoiQL;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTenNguoiQL(String tenNguoiQL) {
        this.tenNguoiQL = tenNguoiQL;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVienDTO(String tenNguoiQL) {
        this.tenNguoiQL = tenNguoiQL;
    }
    
    public void toString(String hoten)
    {
        
    }
}
