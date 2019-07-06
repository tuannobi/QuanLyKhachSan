
package bus;

import dao.KhachHangDAO;
import dto.KhachHangDTO;
import static gui.ManHinhQuanLyKhachHangJPanel.dtmKH;
import static gui.ManHinhQuanLyKhachHangJPanel.selectedKhachHang;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class KhachHangBus {
    
    public static ArrayList<KhachHangDTO> layDuLieuKhachHang(){
        return KhachHangDAO.layDuLieuKhachHang();
    }
    
    
    public static boolean capNhatThongTinKhachHang(KhachHangDTO kh){
        int check=KhachHangDAO.capNhatThongTinKhachHang(kh);
        if (check>0){
            return true;
        }
        else
            return false;
    }
    
    public static ArrayList<KhachHangDTO> timKiemKhachHang(String tuKhoa){
        return KhachHangDAO.timKiemKhachHang(tuKhoa);
    }
    
    public static ArrayList<KhachHangDTO> timKiemKhachHangDaRoiDi(String tuKhoa){
        return KhachHangDAO.timKiemKhachHangDaRoiDi(tuKhoa);
    }
    
}