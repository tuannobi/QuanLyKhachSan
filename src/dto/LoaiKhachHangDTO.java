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


public class LoaiKhachHangDTO {
        private int maLoaiKhachHang;
        private String tenLoaiKhachHang; 

    public LoaiKhachHangDTO(int maLoaiKhachHang, String tenLoaiKhachHang) {
        this.maLoaiKhachHang = maLoaiKhachHang;
        this.tenLoaiKhachHang = tenLoaiKhachHang;
    }

        
     public LoaiKhachHangDTO(){
         
     }
    public int getMaLoaiKhachHang() {
        return maLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(int maLoaiKhachHang) {
        this.maLoaiKhachHang = maLoaiKhachHang;
    }

    public String getTenLoaiKhachHang() {
        return tenLoaiKhachHang;
    }

    public void setTenLoaiKhachHang(String tenLoaiKhachHang) {
        this.tenLoaiKhachHang = tenLoaiKhachHang;
    }
        
    public String toString(){
        return tenLoaiKhachHang;
    }
    
}
