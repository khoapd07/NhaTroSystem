/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.NhanVien;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author accgs
 */
public class NhanVienDAO extends QLNhaTroDAO<NhanVien,String> {
            public void insert(NhanVien model){
        String sql="INSERT INTO NhanVien (MatKhau, HoTen, VaiTro) VALUES (?, ?, ?)";
        XJdbc.update(sql, 
                model.getMatKhau(), 
                model.getHoTen(), 
                model.isVaiTro());
    }
    
    public void update(NhanVien model){
        String sql="UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
        XJdbc.update(sql, 
                model.getMatKhau(), 
                model.getHoTen(), 
                model.isVaiTro(),
                model.getMaNV());
    }
    
    public void delete(String MaNV){
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        XJdbc.update(sql, MaNV);
    }
    
    public List<NhanVien> selectAll(){
        String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }
    
    public NhanVien selectById(String manv){
        String sql="SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<NhanVien> selectBySql(String sql, Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
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

    public List<NhanVien> selectByKeyword(String keyword){
        String sql = "SELECT * FROM NhanVien WHERE MaNV LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    
    public String getTenNhanVienByMaPhieuThue(String maPhieuThue) {
        String sql = "SELECT HoTen FROM NhanVien WHERE MaNV = " +
                     "(SELECT MaNV FROM ThuePhong WHERE MaPhieuThue = ?)";
        try {
            ResultSet rs = XJdbc.query(sql, maPhieuThue);
            if (rs.next()) {
                return rs.getString("HoTen");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Không xác định";
    }
}
