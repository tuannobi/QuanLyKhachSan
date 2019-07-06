/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.ChiTietHoaDon_TongDoanhThu;
import dto.DichVu;
import dto.HoaDon;
import dto.KhachHangDTO;
import dto.KhachHang_TongDoanhThu;
import dto.ThongKe;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author COMPUTER
 */
public class ThongKeDAO {
    public static ArrayList<ThongKe> layThongKeThang(Date bd,Date kt)
    {
        ArrayList<ThongKe> ds=new ArrayList<>();
        Connection conn;
        String sql="{CALL PRO_THONGKE_THANG(?,?,?)}";
        try{
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(bd.getTime()));
            cs.setDate(2, new java.sql.Date(kt.getTime()));
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet) cs.getObject(3);
            while(rs.next())
            {
                ThongKe tk=new ThongKe();
                tk.setTongTien(rs.getLong(1));
                tk.setThang(rs.getInt(2));
                tk.setNam(rs.getInt(3));
                ds.add(tk);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static ArrayList<ThongKe> layThongKeNgay(Date bd,Date kt)
    {
        ArrayList<ThongKe> ds=new ArrayList<>();
        Connection conn;
        String sql="{CALL PRO_THONGKE_NGAY(?,?,?)}";
        try{
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(bd.getTime()));
            cs.setDate(2, new java.sql.Date(kt.getTime()));
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet) cs.getObject(3);
            while(rs.next())
            {
                ThongKe tk=new ThongKe();
                tk.setTongTien(rs.getLong(1));
                tk.setNgay(rs.getDate(2));
                ds.add(tk);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static ArrayList<ThongKe> layThongKeNam(Date bd,Date kt)
    {
        ArrayList<ThongKe> ds=new ArrayList<>();
        Connection conn;
        String sql="{CALL PRO_THONGKE_NAM(?,?,?)}";
        try{
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(bd.getTime()));
            cs.setDate(2, new java.sql.Date(kt.getTime()));
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet) cs.getObject(3);
            while(rs.next())
            {
                ThongKe tk=new ThongKe();
                tk.setTongTien(rs.getLong(1));
                tk.setNam(rs.getInt(2));
                ds.add(tk);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static long layTongDoanhThu(Date bd,Date kt)
    {
        long tongTien = 0;
        Connection conn;
        String sql="{CALL PROC_THONGKETONGDOANHTHU(?,?,?)}";
        try{
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(bd.getTime()));
            cs.setDate(2, new java.sql.Date(kt.getTime()));
            cs.registerOutParameter(3, OracleTypes.NUMBER);
            cs.execute();
            
            tongTien=cs.getLong(3);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return tongTien;
    }
    //new
//    public static ArrayList<KhachHangDTO> layDanhSachKhachHang_ThongKeBaoCao_TatCaLoai(Date tuNgay, Date denNgay){
//        ArrayList<KhachHangDTO> listKhachHangDTOs=null;
//        try {
//            listKhachHangDTOs=new ArrayList<>();
//            Connection conn=OracleConnection.openConnection();
//            String sqlString="{CALL PRO_THONGKE_KHACHHANG_TATCA(?,?,?)}";
//            CallableStatement cs=conn.prepareCall(sqlString);            
//            cs.setDate(1, new java.sql.Date(tuNgay.getTime()));
//            cs.setDate(2, new java.sql.Date(denNgay.getTime()));
//            cs.registerOutParameter(3, OracleTypes.CURSOR);
//            cs.execute();
//            ResultSet rs=(ResultSet) cs.getObject(3);
//            while(rs.next()){
//                KhachHangDTO khachHangDTO=new KhachHangDTO();
//                khachHangDTO.setHoTen(rs.getString(1));
//                khachHangDTO.setLoaiKH(rs.getString(2));
//                khachHangDTO.setNgaySinh(rs.getDate(3));
//                khachHangDTO.setDiaChi(rs.getString(4));
//                
//                khachHangDTO.setDoanhSo(rs.getLong(5));
//                listKhachHangDTOs.add(khachHangDTO);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listKhachHangDTOs;
//    }
    
//    public static ArrayList<KhachHangDTO> layDanhSachKhachHang_ThongKeBaoCao_LoaiThuong(Date tuNgay, Date denNgay){
//        ArrayList<KhachHangDTO> listKhachHangDTOs=null;
//        try {
//            listKhachHangDTOs=new ArrayList<>();
//            Connection conn=OracleConnection.openConnection();
//            String sqlString="{CALL PRO_THONGKE_KHACHHANG_THUONG(?,?,?)}";
//            CallableStatement cs=conn.prepareCall(sqlString);            
//            cs.setDate(1, new java.sql.Date(tuNgay.getTime()));
//            cs.setDate(2, new java.sql.Date(denNgay.getTime()));
//            cs.registerOutParameter(3, OracleTypes.CURSOR);
//            cs.execute();
//            ResultSet rs=(ResultSet) cs.getObject(3);
//            while(rs.next()){
//                KhachHangDTO khachHangDTO=new KhachHangDTO();
//                khachHangDTO.setHoTen(rs.getString(1));
//                khachHangDTO.setLoaiKH(rs.getString(2));
//                khachHangDTO.setNgaySinh(rs.getDate(3));
//                khachHangDTO.setDiaChi(rs.getString(4));
//                
//                khachHangDTO.setDoanhSo(rs.getLong(5));
//                listKhachHangDTOs.add(khachHangDTO);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listKhachHangDTOs;
//    }
    
//    public static ArrayList<KhachHangDTO> layDanhSachKhachHang_ThongKeBaoCao_LoaiVIP(Date tuNgay, Date denNgay){
//        ArrayList<KhachHangDTO> listKhachHangDTOs=null;
//        try {
//            listKhachHangDTOs=new ArrayList<>();
//            Connection conn=OracleConnection.openConnection();
//            String sqlString="{CALL PRO_THONGKE_KHACHHANG_VIP(?,?,?)}";
//            CallableStatement cs=conn.prepareCall(sqlString);            
//            cs.setDate(1, new java.sql.Date(tuNgay.getTime()));
//            cs.setDate(2, new java.sql.Date(denNgay.getTime()));
//            cs.registerOutParameter(3, OracleTypes.CURSOR);
//            cs.execute();
//            ResultSet rs=(ResultSet) cs.getObject(3);
//            while(rs.next()){
//                KhachHangDTO khachHangDTO=new KhachHangDTO();
//                khachHangDTO.setHoTen(rs.getString(1));
//                khachHangDTO.setLoaiKH(rs.getString(2));
//                khachHangDTO.setNgaySinh(rs.getDate(3));
//                khachHangDTO.setDiaChi(rs.getString(4));               
//                khachHangDTO.setDoanhSo(rs.getLong(5));
//                listKhachHangDTOs.add(khachHangDTO);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listKhachHangDTOs;
//    }
    
//    public static ArrayList<DichVu> layDanhSachDichVu_ThongKeBaoCao(Date tuNgay, Date denNgay){
//        ArrayList<DichVu> listDichVu=null;
//        try {
//            listDichVu=new ArrayList<>();
//            Connection conn=OracleConnection.openConnection();
//            String sqlString="{CALL PRO_THONGKE_DICHVU(?,?,?)}";
//            CallableStatement cs=conn.prepareCall(sqlString);            
//            cs.setDate(1, new java.sql.Date(tuNgay.getTime()));
//            cs.setDate(2, new java.sql.Date(denNgay.getTime()));
//            cs.registerOutParameter(3, OracleTypes.CURSOR);
//            cs.execute();
//            ResultSet rs=(ResultSet) cs.getObject(3);
//            while(rs.next()){
//                DichVu dv=new DichVu();
//                dv.setThoiGian(rs.getDate(1));
//                dv.setTenDichVu(rs.getString(2));
//                dv.setDoanhThu(rs.getLong(3));
//                listDichVu.add(dv);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listDichVu;
//    }
    

    public static KhachHang_TongDoanhThu layThongTinThongKeBaoCaoKhachHang(
    Date tuNgay, Date denNgay, int maLoai){
        KhachHang_TongDoanhThu khachHang_TongDoanhThu=null;
        ArrayList<KhachHangDTO> listKH=null;
        try {
            listKH=new ArrayList<>();
            khachHang_TongDoanhThu=new KhachHang_TongDoanhThu();
            Connection conn=OracleConnection.openConnection();
            String sql="CALL PRO_THONGKE_KHACHHANG(?,?,?,?,?)";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(tuNgay.getTime()));
            cs.setDate(2, new java.sql.Date(denNgay.getTime()));
            cs.setInt(3, maLoai);
            cs.registerOutParameter(4, OracleTypes.CURSOR);
            cs.registerOutParameter(5, Types.INTEGER);
            cs.execute();
            ResultSet rs=(ResultSet)cs.getObject(4);
            while(rs.next()){
                KhachHangDTO khachHangDTO=new KhachHangDTO();
                khachHangDTO.setHoTen(rs.getString(1));
                khachHangDTO.setLoaiKH(rs.getString(2));
                khachHangDTO.setNgaySinh(rs.getDate(3));
                khachHangDTO.setDiaChi(rs.getString(4));
                khachHangDTO.setDoanhSo(rs.getLong(5));
                listKH.add(khachHangDTO);              
            }
            khachHang_TongDoanhThu.setListKH(listKH);
            khachHang_TongDoanhThu.setTongDoanhThu(cs.getLong(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return khachHang_TongDoanhThu;
    }
    
    public static ChiTietHoaDon_TongDoanhThu layThongTinThongKeBaoCaoDichVu(
    Date tuNgay, Date denNgay){
        ChiTietHoaDon_TongDoanhThu dichVuTongDoanhThu=null;
        ArrayList<DichVu> listDV=null;
        try {
            listDV=new ArrayList<>();
            dichVuTongDoanhThu=new ChiTietHoaDon_TongDoanhThu();
            Connection conn=OracleConnection.openConnection();
            String sql="CALL PRO_THONGKE_DICHVU(?,?,?,?)";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(tuNgay.getTime()));
            cs.setDate(2, new java.sql.Date(denNgay.getTime()));
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.registerOutParameter(4, Types.INTEGER);
            cs.execute();
            ResultSet rs=(ResultSet)cs.getObject(3);
            while(rs.next()){
                DichVu dichVu=new DichVu();
                dichVu.setThoiGian(rs.getDate(1));
                dichVu.setTenDichVu(rs.getString(2));
                dichVu.setGiaTien(rs.getLong(3));
                listDV.add(dichVu);
            }
            dichVuTongDoanhThu.setListDV(listDV);
            dichVuTongDoanhThu.setTongDoanhThu(cs.getLong(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dichVuTongDoanhThu;
    }
    
    public static long tinhTongDoanhThuHoaDon(Date ngayDen, Date NgayDi){
        long tongDoanhThu=0;
        try {
            Connection conn=OracleConnection.openConnection();
            String sql="{CALL PRO_THONGKE_HOADON_DOANHTHU(?,?,?)}";
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(ngayDen.getTime()));
            cs.setDate(2, new java.sql.Date(NgayDi.getTime()));
            cs.registerOutParameter(3, Types.INTEGER);
            cs.execute();
            tongDoanhThu=cs.getLong(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongDoanhThu;
    }
    
}
