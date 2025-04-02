/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.KhachHang;
import com.fpt.ptcd.nhatrosystem.entity.NhanVien;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author accgs
 */
public class KhachHangDAO extends QLNhaTroDAO<KhachHang,String> {
   
    public void insert(KhachHang model){
        String sql="INSERT INTO KhachHang (TenKhach, SDT, DiaChi, CCCD, Email) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getTenKhach(), 
                model.getSoDT(),
                model.getDiaChi(),
                model.getCanCCD(),
                model.getEmail());
    }
    
    public void update(KhachHang model){
        String sql = "UPDATE KhachHang SET TenKhach=?, SDT=?, DiaChi=?, CCCD=?, Email=? WHERE MaKhach=?";
        XJdbc.update(sql, 
            model.getTenKhach(), 
            model.getSoDT(), 
            model.getDiaChi(),
            model.getCanCCD(),
            model.getEmail(),  // Email phải đứng trước WHERE MaKhach=?
            model.getMaKhach()
        );
    }
    
    public void delete(String MaKhach){
        String sql="DELETE FROM KhachHang WHERE MaKhach=?";
        XJdbc.update(sql, MaKhach);
    }
    
    public List<KhachHang> selectAll(){
        String sql="SELECT * FROM KhachHang";
        return this.selectBySql(sql);
    }
    
    public KhachHang selectById(String makhach){
        String sql="SELECT * FROM KhachHang WHERE MaKhach=?";
        List<KhachHang> list = this.selectBySql(sql, makhach);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<KhachHang> selectBySql(String sql, Object...args){
        List<KhachHang> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    KhachHang entity = new KhachHang();
                    entity.setMaKhach(rs.getString("MaKhach"));
                    entity.setTenKhach(rs.getString("TenKhach"));
                    entity.setSoDT(rs.getInt("SDT"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setCanCCD(rs.getString("CCCD"));
                    entity.setEmail(rs.getString("Email"));
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
    
    public String getTenKhachByMaPhieuThue(String maPhieuThue) {
        String sql = "SELECT TenKhach FROM KhachHang WHERE MaKhach = " +
                     "(SELECT MaKhach FROM ThuePhong WHERE MaPhieuThue = ?)";
        try {
            ResultSet rs = XJdbc.query(sql, maPhieuThue);
            if (rs.next()) {
                return rs.getString("TenKhach");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Không xác định";
    }
    public String getEmailByMaPhieuThue(String maPhieuThue) {
    String sql = "SELECT k.Email FROM KhachHang k " +
                 "JOIN ThuePhong t ON k.MaKhach = t.MaKhach " +
                 "WHERE t.MaPhieuThue = ?";
    try (PreparedStatement stmt = XJdbc.getStmt(sql, maPhieuThue);
         ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
            return rs.getString("Email");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Trả về null nếu không tìm thấy
}
    
}
