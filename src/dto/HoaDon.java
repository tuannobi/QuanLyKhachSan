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
public class HoaDon {
    int maHoaDon;
    int maPhong;
    String tenKhachHang;
    String tenNhanVien;
    long tienPhong;
    long tienDichVu;
    long tongTien;
    Date ngayDen;
    Date ngayDi;
    String  trangThai;
    
    long tienGiam;
    long tienThanhToan;

    public String getTrangThai() {
        return trangThai;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public long getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(long tienPhong) {
        this.tienPhong = tienPhong;
    }

    public long getTienDichVu() {
        return tienDichVu;
    }

    public void setTienDichVu(long tienDichVu) {
        this.tienDichVu = tienDichVu;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(Date ngayDen) {
        this.ngayDen = ngayDen;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public long getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(long tienGiam) {
        this.tienGiam = tienGiam;
    }

    public long getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(long tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }
    
    
}
