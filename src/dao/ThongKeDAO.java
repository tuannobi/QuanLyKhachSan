/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.ThongKe;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author COMPUTER
 */
public class ThongKeDAO {
    public static ArrayList<ThongKe> getThongKeThang(Date bd,Date kt)
    {
        ArrayList<ThongKe> ds=new ArrayList<>();
        Connection conn;
        String sql="{CALL PROC_THONGKE_THANG(?,?,?)}";
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
    
    public static ArrayList<ThongKe> getThongKeNgay(Date bd,Date kt)
    {
        ArrayList<ThongKe> ds=new ArrayList<>();
        Connection conn;
        String sql="{CALL PROC_THONGKE_NGAY(?,?,?)}";
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
    
    public static ArrayList<ThongKe> getThongKeNam(Date bd,Date kt)
    {
        ArrayList<ThongKe> ds=new ArrayList<>();
        Connection conn;
        String sql="{CALL PROC_THONGKE_NAM(?,?,?)}";
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
}
