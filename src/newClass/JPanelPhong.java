/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newClass;

import javax.swing.JPanel;

/**
 *
 * @author Tuan
 */
public class JPanelPhong extends JPanel {
    private String maPhong;
        private String maLoaiPhong;
        private String trangThai;
        
        public JPanelPhong(){
            super();
        }
        
        public String getMaPhong(){
            return maPhong;
        }
        
       public  void setMaPhong(String maPhong){
            this.maPhong=maPhong;
        }

        public String getMaLoaiPhong() {
            return maLoaiPhong;
        }

        public void setMaLoaiPhong(String maLoaiPhong) {
            this.maLoaiPhong = maLoaiPhong;
        }

        public String getTrangThai() {
            return trangThai;
        }

        public void setTrangThai(String trangThai) {
            this.trangThai = trangThai;
        }
}
