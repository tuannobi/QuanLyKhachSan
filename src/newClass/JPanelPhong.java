/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newClass;

import java.util.Date;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author Tuan
 */
public class JPanelPhong extends JPanel {
    //thong tin phong
        private int maPhong;
        private String tenLoaiPhong;
        private String trangThai;
        private long giaPhong;
        
        //thong tin khach hang
        private String tenKhachHang;
        private int cmndKH;
        private Date ngayDen;
        private Date ngayDi;
        //thong tin nhanvien
        private String hotenNV;
        private int cmndNV;
        
        
        
    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public long getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(long giaPhong) {
        this.giaPhong = giaPhong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getCmndKH() {
        return cmndKH;
    }

    public void setCmndKH(int cmndKH) {
        this.cmndKH = cmndKH;
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

    public String getHotenNV() {
        return hotenNV;
    }

    public void setHotenNV(String hotenNV) {
        this.hotenNV = hotenNV;
    }

    public int getCmndNV() {
        return cmndNV;
    }

    public void setCmndNV(int cmndNV) {
        this.cmndNV = cmndNV;
    }

        
}
