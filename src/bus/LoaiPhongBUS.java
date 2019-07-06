/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;


import dao.LoaiPhongDAO;
import dto.LoaiPhongDTO;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class LoaiPhongBUS {
    
    public static ArrayList<LoaiPhongDTO> layDuLieuLoaiPhong(){
        return LoaiPhongDAO.layDuLieuLoaiPhong();
    }
    
}
