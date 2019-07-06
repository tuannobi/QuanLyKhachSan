
package dao;

import dto.KhachHangDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tuan
 */
public class KhachHangDAO {
    
    public static ArrayList<KhachHangDTO> layDuLieuKhachHang(){
        ArrayList<KhachHangDTO> ds=null;
        Connection conn;
        try {
            ds=new ArrayList<>();
            conn=OracleConnection.openConnection();
            String sql="{CALL PRO_DSKHACHHANG(?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs=(ResultSet) cs.getObject(1);
            while(rs.next()){
                KhachHangDTO kh=new KhachHangDTO();
                kh.setMaKH(rs.getInt(1));
                kh.setHoTen(rs.getString(2));
                kh.setNgaySinh(rs.getDate(3));
                kh.setCMND(rs.getInt(4));
                kh.setGioiTinh(rs.getString(5));
                kh.setDiaChi(rs.getString(6));
                kh.setEmail(rs.getString(7));
                kh.setSDT(rs.getString(8));
                kh.setTrangThai(rs.getString(9));
                kh.setLoaiKH(rs.getString(10));
                kh.setDoanhSo(rs.getLong(11));
                ds.add(kh);
            }        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static int capNhatThongTinKhachHang(KhachHangDTO kh){
        Connection conn=OracleConnection.openConnection();
        try {
            
            String sql="{CALL PRO_CAPNHATKHACHHANG(?,?,?,?,?,?,?,?)}";
            CallableStatement cs=conn.prepareCall(sql);
            //gán tham số
            cs.setInt(1, kh.getMaKH());
            cs.setString(2, kh.getHoTen());
            cs.setDate(3,new java.sql.Date (kh.getNgaySinh().getTime()));
            cs.setInt(4, kh.getCMND());
            cs.setString(5, kh.getGioiTinh());
            cs.setString(6, kh.getDiaChi());
            cs.setString(7, kh.getEmail());
            cs.setString(8, kh.getSDT());
            return cs.executeUpdate();
        } catch (SQLException ex) {
            String  errorString=ex.getMessage();
                String[] outError=errorString.split("\n");
                    JOptionPane.showMessageDialog(null,outError[0]);
        }catch(NullPointerException npe)
        {
            
        }
        
        return -1; //Khong thanh cong
    }
    


    public static ArrayList<KhachHangDTO> timKiemKhachHang(String tuKhoa){
        ArrayList<KhachHangDTO> listKH=null;
        try {
            listKH=new ArrayList<>();
            Connection conn=OracleConnection.openConnection();
            String sql ="{CALL PRO_DSTIMKIEMKHACHHANG(?,?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setString(1, tuKhoa);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet resultSet= (ResultSet) cs.getObject(2);
            while(resultSet.next()){
                KhachHangDTO kh=new KhachHangDTO();
                kh.setMaKH(resultSet.getInt(1));
                kh.setHoTen(resultSet.getString(2));
                kh.setNgaySinh(resultSet.getDate(3));
                kh.setCMND(resultSet.getInt(4));
                kh.setGioiTinh(resultSet.getString(5));
                kh.setDiaChi(resultSet.getString(6));
                kh.setEmail(resultSet.getString(7));
                kh.setSDT(resultSet.getString(8));
                kh.setTrangThai(resultSet.getString(9));
                kh.setLoaiKH(resultSet.getString(10));
                kh.setDoanhSo(resultSet.getLong(11));
                listKH.add(kh);            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKH;
    }
    
    public static ArrayList<KhachHangDTO> timKiemKhachHangDaRoiDi(String tuKhoa){
        ArrayList<KhachHangDTO> listKH=null;
        try {
            listKH=new ArrayList<>();
            Connection conn=OracleConnection.openConnection();
            String sql ="{CALL PRO_DSTIMKIEMKH_DAROIDI(?,?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setString(1, tuKhoa);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet resultSet= (ResultSet) cs.getObject(2);
            while(resultSet.next()){
                KhachHangDTO kh=new KhachHangDTO();
                kh.setMaKH(resultSet.getInt(1));
                kh.setHoTen(resultSet.getString(2));
                kh.setNgaySinh(resultSet.getDate(3));
                kh.setCMND(resultSet.getInt(4));
                kh.setGioiTinh(resultSet.getString(5));
                kh.setDiaChi(resultSet.getString(6));
                kh.setEmail(resultSet.getString(7));
                kh.setSDT(resultSet.getString(8));
                kh.setTrangThai(resultSet.getString(9));
                kh.setLoaiKH(resultSet.getString(10));
                kh.setDoanhSo(resultSet.getLong(11));
                listKH.add(kh);            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKH;
    }
}
