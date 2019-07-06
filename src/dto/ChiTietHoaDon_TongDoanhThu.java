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
public class ChiTietHoaDon_TongDoanhThu {
    ArrayList<DichVu> listDV;
    long tongDoanhThu;

    public ChiTietHoaDon_TongDoanhThu() {
        listDV=new ArrayList<>();
        tongDoanhThu=0;
    }

    public ArrayList<DichVu> getListDV() {
        return listDV;
    }

    public void setListDV(ArrayList<DichVu> listDV) {
        this.listDV = listDV;
    }

    public long getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(long tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    
    
    
}
