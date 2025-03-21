/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.KhachHang;
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
public class KhachHangDAO extends QLNhaTroDAO<KhachHang,String> {
   
                public void insert(KhachHang model){
                    System.out.println("cac");
        String sql="INSERT INTO KhachHang (MaKhach, TenKhach, SDT, DiaChi, CCCD) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaKhach(), 
                model.getTenKhach(), 
                model.getSoDT(),
                model.getDiaChi(),
                model.getCanCCD());
    }
    
    public void update(KhachHang model){
        String sql="UPDATE KhachHang SET TenKhach=?, SDT=?, DiaChi=?, CCCD=? WHERE MaKhach=?";
        XJdbc.update(sql, 
                model.getTenKhach(), 
                model.getSoDT(), 
                model.getDiaChi(),
                model.getCanCCD(),
                model.getMaKhach());
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
