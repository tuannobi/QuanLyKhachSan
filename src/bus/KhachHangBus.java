
package bus;

import dao.KhachHangDAO;
import dto.KhachHangDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.TokenType;

public class KhachHangBus {
    public static ArrayList<KhachHangDTO>getDuLieuKhachHang(){
        return KhachHangDAO.getDuLieuKhachHang();
    }
    
    
    public static void xoaKhachHang(int maKH) {
    int check=KhachHangDAO.xoaKhachHang(maKH);
    if (check==-1)
        JOptionPane.showMessageDialog(null, "Xóa khách hàng không thành công");
        else 
                JOptionPane.showMessageDialog(null, "Xóa khách hàng thành công");
}
    
    public static void capNhatThongTinKhachHang(KhachHangDTO kh){
        int check=KhachHangDAO.capNhatThongTinKhachHang(kh);
        if (check==-1){
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin khách hàng không thành công");
        }
        else
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin khách hàng thành công");
    }
    
    public static ArrayList<KhachHangDTO> timKiemKhachHang(String tuKhoa){
        return KhachHangDAO.timKiemKhachHang(tuKhoa);
    }
}