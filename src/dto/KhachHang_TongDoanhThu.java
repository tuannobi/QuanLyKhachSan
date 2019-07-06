/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;

/**
 *
 * @author Tuan
 */
public class KhachHang_TongDoanhThu {
    public ArrayList<KhachHangDTO> listKH;
    public long tongDoanhThu;

    public KhachHang_TongDoanhThu(){
        listKH=new ArrayList<>();
        tongDoanhThu=0;
    }
    
    public ArrayList<KhachHangDTO> getListKH() {
        return listKH;
    }

    public void setListKH(ArrayList<KhachHangDTO> listKH) {
        this.listKH = listKH;
    }

    public long getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(long tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }
    
    
}
