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
    public static ArrayList<ThongKe> getDuLieuTheoNgay(Date ngaybd,Date ngayKt)
    {
        ArrayList<ThongKe> ds=null;
        Connection conn;
        String sql="{CALL PROC_THONGKE_NGAY(?,?,?)}";
        try{
            ds=new ArrayList<>();
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date (ngaybd.getTime()));
            cs.setDate(2, new java.sql.Date (ngayKt.getTime()));
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs=(ResultSet) cs.getObject(3);
            while(rs.next())
            {
                ThongKe tk=new ThongKe();
                tk.setDoanhThu(rs.getLong(1));
                tk.setNgay(rs.getDate(2));
                ds.add(tk);
            }
            cs.close();
            rs.close();
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static long tongDoanhThu(Date ngaybd,Date ngayKt)
    {
        Connection conn;
        long tongDoanhThu=0;
        String sql="{CALL PROC_THONGKETONGDOANHTHU(?,?,?)}";
        try{
            conn=OracleConnection.openConnection();
            CallableStatement cs=conn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(ngaybd.getTime()));
            cs.setDate(2, new java.sql.Date (ngayKt.getTime()));
            cs.registerOutParameter(3, OracleTypes.NUMBER);
            cs.execute();
            tongDoanhThu=cs.getLong(3);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return tongDoanhThu;
    }
}
