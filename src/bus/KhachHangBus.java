
package bus;

import dao.KhachHangDAO;
import dto.KhachHangDTO;
import java.util.ArrayList;

public class KhachHangBus {
    public static ArrayList<KhachHangDTO>getDuLieuKhachHang(){
        return KhachHangDAO.getDuLieuKhachHang();
    }
}
