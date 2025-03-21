/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.ThuePhong;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author accgs
 */
public class ThuePhongDAO extends QLNhaTroDAO<ThuePhong,String> {
    public void insert(ThuePhong model){
        String sql="INSERT INTO ThuePhong (MaPhieuThue, MaPhong, MaKhach, MaNV, TienCoc, NgayThue) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaPhieuThue(), 
                model.getMaPhong(), 
                model.getMaKhach(),
                model.getMaNV(),
                model.getTienCoc(),
                model.getNgayThue());
    }
    
    public void update(ThuePhong model){
        String sql="UPDATE ThuePhong SET MaPhong=?, MaKhach=?, MaNV=?, TienCoc=?, NgayThue=? WHERE MaPhieuThue=?";
        XJdbc.update(sql, 
                model.getMaPhong(), 
                model.getMaKhach(), 
                model.getMaNV(),
                model.getTienCoc(),
                model.getNgayThue(),
                model.getMaPhieuThue());
    }
    
    public void delete(String MaPhieuThue){
        String sql="DELETE FROM ThuePhong WHERE MaPhieuThue=?";
        XJdbc.update(sql, MaPhieuThue);
    }
    
    public List<ThuePhong> selectAll(){
        String sql="SELECT * FROM ThuePhong";
        return this.selectBySql(sql);
    }
    
    public ThuePhong selectById(String maphieuthue){
        String sql="SELECT * FROM ThuePhong WHERE MaPhieuThue=?";
        List<ThuePhong> list = this.selectBySql(sql, maphieuthue);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<ThuePhong> selectBySql(String sql, Object...args){
        List<ThuePhong> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ThuePhong entity = new ThuePhong();
                    entity.setMaPhieuThue(rs.getString("MaPhieuThue"));
                    entity.setMaPhong(rs.getString("MaPhong"));
                    entity.setMaKhach(rs.getString("MaKhach"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setTienCoc(rs.getInt("TienCoc"));
                    entity.setNgayThue(rs.getDate("NgayThue"));
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
