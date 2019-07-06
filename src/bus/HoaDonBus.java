/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.HoaDonDAO;
import dao.OracleConnection;
import dto.HoaDon;
import static gui.ManHinhQuanLyHoaDonJPanel.selectedHD;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
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
public class HoaDonBus {
    public static ArrayList<HoaDon> layDuLieuHoaDon()
    {
        return HoaDonDAO.layDuLieuHoaDon();
    }
    public static ArrayList<HoaDon> timKiemHoaDon(String tk)
    {
        return HoaDonDAO.timKiemHoaDon(tk);
    }
    
    public static boolean thanhToanHoaDon(int maHD){
       return HoaDonDAO.thanhToanHoaDon(maHD);
    }
    
    public static void inHoaDon(int maHoaDon){
        Connection conn=OracleConnection.openConnection();
        try {
            InputStream inputStream=new FileInputStream(new File("src\\reportForm\\formHoaDon.jrxml"));
            JasperDesign jd=JRXmlLoader.load(inputStream);
//           String sqlString="select * from khachhang";
//           JRDesignQuery newQuery=new JRDesignQuery();
//            newQuery.setText(sqlString);
            JasperReport jr=JasperCompileManager.compileReport(jd);
           Map<String, Object> parameters = new HashMap<String, Object>();
           parameters.put("mahd", maHoaDon);
            //
            //HashMap parameters=new HashMap();
            JasperPrint jasperPrint=JasperFillManager.fillReport(jr, parameters,conn);
            JasperViewer.viewReport(jasperPrint,false);
           // OutputStream os=new FileOutputStream(new File("C:/jasperoutput/test.pdf"));
           // JasperExportManager.exportReportToPdfStream(jasperPrint, os);
        } catch (Exception e) {
            
        }
    }
}
