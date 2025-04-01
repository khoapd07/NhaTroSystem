/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.LoaiPhong;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author accgs
 */
public class LoaiPhongDAO extends QLNhaTroDAO<LoaiPhong,String>{
    public void insert(LoaiPhong model){
        String sql="INSERT INTO LoaiPhong (TenLoai, DienTich, GiaPhong, GhiChu) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getTenLoai(), 
                model.getDienTich(),
                model.getGiaPhong(),
                model.getGhiChu());
    }
    
    public void update(LoaiPhong model){
        String sql="UPDATE LoaiPhong SET TenLoai=?, DienTich=?, GiaPhong=?, GhiChu=? WHERE MaLoai=?";
        XJdbc.update(sql, 
                model.getTenLoai(), 
                model.getDienTich(), 
                model.getGiaPhong(),
                model.getGhiChu(),
                model.getMaLoai());
    }
    
    public void delete(String MaLoai){
        String sql="DELETE FROM LoaiPhong WHERE MaLoai=?";
        XJdbc.update(sql, MaLoai);
    }
    
    public List<LoaiPhong> selectAll(){
        String sql="SELECT * FROM LoaiPhong";
        return this.selectBySql(sql);
    }
    
    public LoaiPhong selectById(String maloai){
        String sql="SELECT * FROM LoaiPhong WHERE MaLoai=?";
        List<LoaiPhong> list = this.selectBySql(sql, maloai);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<LoaiPhong> selectBySql(String sql, Object...args){
        List<LoaiPhong> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LoaiPhong entity = new LoaiPhong();
                    entity.setMaLoai(rs.getString("MaLoai"));
                    entity.setTenLoai(rs.getString("TenLoai"));
                    entity.setDienTich(rs.getInt("DienTich"));
                    entity.setGiaPhong(rs.getDouble("GiaPhong"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
