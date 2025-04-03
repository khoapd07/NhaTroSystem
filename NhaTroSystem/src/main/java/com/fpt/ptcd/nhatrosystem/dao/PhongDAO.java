/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.LoaiPhong;
import com.fpt.ptcd.nhatrosystem.entity.Phong;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author accgs
 */
public class PhongDAO extends QLNhaTroDAO<Phong,String> {
    public void insert(Phong model){
//        String sql="INSERT INTO Phong (MaPhong, MaLoai, TenPhong, TrangThai, GhiChu) VALUES (?, ?, ?, ?, ?)";
        String sql="INSERT INTO Phong (MaLoai, TenPhong, TrangThai, GhiChu) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, 
//                model.getMaPhong(), 
                model.getMaLoai(), 
                model.getTenPhong(),
                model.isTrangThai(),
                model.getGhiChu());
    }
    
    public void update(Phong model){
        String sql="UPDATE Phong SET MaLoai=?, TenPhong=?, TrangThai=?, GhiChu=? WHERE MaPhong=?";
        XJdbc.update(sql, 
                model.getMaLoai(), 
                model.getTenPhong(), 
                model.isTrangThai(),
                model.getGhiChu(),
                model.getMaPhong());
    }
    
    public void delete(String MaLoai){
        String sql="DELETE FROM Phong WHERE MaPhong=?";
        XJdbc.update(sql, MaLoai);
    }
    
    public List<Phong> selectAll(){
        String sql="SELECT * FROM Phong";
        return this.selectBySql(sql);
    }
    
    public Phong selectById(String maphong){
        String sql="SELECT * FROM Phong WHERE MaPhong=?";
        List<Phong> list = this.selectBySql(sql, maphong);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<Phong> selectBySql(String sql, Object...args){
        List<Phong> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    Phong entity = new Phong();
                    entity.setMaPhong(rs.getString("MaPhong"));
                    entity.setMaLoai(rs.getString("MaLoai"));
                    entity.setTenPhong(rs.getString("TenPhong"));
                    entity.setTrangThai(rs.getBoolean("TrangThai"));
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
    
    public List<Phong> selectByKeyword(String keyword){
        String sql="SELECT * FROM Phong WHERE TenPhong LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
    
    public String getMaPhongByMaPhieuThue(String maPhieuThue) {
    String sql = "SELECT MaPhong FROM ThuePhong WHERE MaPhieuThue= ? ";
    try {
        ResultSet rs = XJdbc.query(sql, maPhieuThue);
        if (rs.next()) {
            return rs.getString("MaPhong");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return "Không xác định";
}
}
