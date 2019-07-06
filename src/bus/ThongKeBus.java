/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.OracleConnection;
import dao.ThongKeDAO;
import dto.ChiTietHoaDon_TongDoanhThu;
import dto.DichVu;
import dto.KhachHangDTO;
import dto.KhachHang_TongDoanhThu;
import dto.ThongKe;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author COMPUTER
 */
public class ThongKeBus {
    public static ArrayList<ThongKe> layThongKeThang(Date bd,Date kt)
    {
        return ThongKeDAO.layThongKeThang(bd,kt);
    }
    
    public static ArrayList<ThongKe> layThongKeNgay(Date bd,Date kt)
    {
        return ThongKeDAO.layThongKeNgay(bd,kt);
    }
    
    public static ArrayList<ThongKe> layThongKeNam(Date bd,Date kt)
    {
        return ThongKeDAO.layThongKeNam(bd,kt);
    }
    
    public static long layTongDoanhThu(Date bd,Date kt)
    {
        return ThongKeDAO.layTongDoanhThu(bd,kt);
    }
    
    public static void inThongKeTheoNgay(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeHoaDon_Ngay.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("ngayBD", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("ngayKT",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            
        }
    }
    
    public static void inThongKeTheoThang(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeHoaDon_Thang.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("ngayBD", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("ngayKT",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            
        }
    }
    
    public static void inThongKeTheoNam(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeHoaDon_Nam.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("TUNGAY", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("DENNGAY",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            
        }
    }
    
//    public static void inThongKeTatCaHoaDon(){
//        Connection conn=OracleConnection.openConnection();
//        try {
//            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeHoaDon.jrxml"));
//            JasperDesign jd=JRXmlLoader.load(inputStream);
//            JasperReport jr=JasperCompileManager.compileReport(jd);
//           HashMap parameters=new HashMap();
//            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
//            JasperViewer.viewReport(jasperPrint,false);
//        } catch (Exception e) {
//            
//        }
//    }
    
    
//    public static ArrayList<KhachHangDTO> layDanhSachKhachHang_ThongKeBaoCao_TatCaLoai(Date tuNgay, Date denNgay){
//        return ThongKeDAO.layDanhSachKhachHang_ThongKeBaoCao_TatCaLoai(tuNgay, denNgay);
//    }
    
    public static void inThongKeBaoCaoKhachHang_TatCa(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeKhachHang_TatCa.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("TUNGAY", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("DENNGAY",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public static ArrayList<KhachHangDTO> layDanhSachKhachHang_ThongKeBaoCao_LoaiThuong(Date tuNgay, Date denNgay){
//        return ThongKeDAO.layDanhSachKhachHang_ThongKeBaoCao_LoaiThuong(tuNgay, denNgay);
//    }
    
    public static void inThongKeBaoCaoKhachHang_Thuong(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeKhachHang_LoaiThuong.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("TUNGAY", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("DENNGAY",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public static ArrayList<KhachHangDTO> layDanhSachKhachHang_ThongKeBaoCao_LoaiVIP(Date tuNgay, Date denNgay){
//        return ThongKeDAO.layDanhSachKhachHang_ThongKeBaoCao_LoaiVIP(tuNgay, denNgay);
//    }
    
    public static void inThongKeBaoCaoKhachHang_VIP(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeKhachHang_LoaiVIP.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("TUNGAY", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("DENNGAY",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public static ArrayList<DichVu> layDanhSachDichVu_ThongKeBaoCao(Date tuNgay, Date denNgay){
//        return ThongKeDAO.layDanhSachDichVu_ThongKeBaoCao(tuNgay, denNgay);
//    }
    
    public static void inThongKeBaoCaoDichVu(Date tuNgay, Date denNgay){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formThongKeDoanhThuDichVu.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("TUNGAY", tuNgay);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            parameters.put("DENNGAY",denNgay);
                jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public static long tinhTongDoanhThuKhachHang(ArrayList<KhachHangDTO> listKH){
//        long tongDoanhSo=0;
//        for (KhachHangDTO khachHangDTO:listKH){
//            tongDoanhSo+=khachHangDTO.getDoanhSo();
//        }
//        return tongDoanhSo;
//    }
    
    public static long tinhTongDoanhThuDichVu(ArrayList<DichVu> listDichVu){
        long tongDoanhSo=0;
        for (DichVu dichVu:listDichVu){
            tongDoanhSo+=dichVu.getDoanhThu();
        }
        return tongDoanhSo;
    }
    
    public static long tinhTongDoanhThuHoaDon(Date ngayDen, Date NgayDi){
        long tongDoanhSo=0;
        tongDoanhSo=ThongKeDAO.tinhTongDoanhThuHoaDon(ngayDen, NgayDi);
        return tongDoanhSo;
    }
    
//    public static long tinhTongDoanhThuHoaDon(ArrayList<ThongKe> listDs){
//        long tongDoanhSo=0;
//        for (ThongKe thongKe:listDs){
//            tongDoanhSo+=thongKe.getTongTien();
//        }
//        return tongDoanhSo;
//    }
    
//    public static long tinhTongDoanhThuKhachHangProcedure(Date ngayDen,Date ngayDi,int maKH){
//        return ThongKeDAO.tinhTongDoanhThuKhachHangProcedure(ngayDen, ngayDi, maKH);
//    }

    public static KhachHang_TongDoanhThu layThongTinThongKeBaoCaoKhachHang(
    Date tuNgay, Date denNgay, int maLoai){
        return ThongKeDAO.layThongTinThongKeBaoCaoKhachHang(tuNgay, denNgay, maLoai);
    }
    
    public static ChiTietHoaDon_TongDoanhThu layThongTinThongKeBaoCaoDichVu(
    Date tuNgay, Date denNgay){
        return ThongKeDAO.layThongTinThongKeBaoCaoDichVu(tuNgay, denNgay);
    }
    
}
