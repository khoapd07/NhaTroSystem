/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.HoaDon;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG
 */
public class HoaDonDAO extends QLNhaTroDAO<HoaDon, String> {
    int bienNull = 0;

    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (MaHoaDon, MaThue, NgayTao, TongTien, TrangThai) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql, model.getMaHoaDon(), model.getMaThue(), model.getNgayTao(), model.getTongTien(), model.getTrangThai());
    }

    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET MaThue=?, NgayTao=?, TongTien=?, TrangThai=? WHERE MaHoaDon=?";
        XJdbc.update(sql, model.getMaThue(), model.getNgayTao(), model.getTongTien(), model.getTrangThai(), model.getMaHoaDon());
    }

    
    public void delete(String id) {
        String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
        XJdbc.update(sql, id);
    }

    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return this.selectBySql(sql);
    }

    public HoaDon selectById(String id) {
        String sql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
        List<HoaDon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon(
                        rs.getString("MaHoaDon"),
                        rs.getString("MaThue"),
                        rs.getDate("NgayTao"),
                        rs.getDouble("TongTien"),
                        rs.getString("TrangThai")
                );
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
