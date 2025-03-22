/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author accgs
 */
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getLuongNguoiDK(){
        String sql = "{CALL sp_KhachHang}";
        String[] cols = {"Nam", "SoLuongKhach", "DangKySomNhat", "DangKyMuonNhat"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(Integer Nam){
        String sql = "{CALL sp_DoanhThu (?)}";
        String[] cols = {"TenLoai", "SoKhachHang", "TongDoanhThu"};
        return this.getListOfArray(sql, cols, Nam);
    }
    
}
