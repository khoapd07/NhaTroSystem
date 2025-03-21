/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.MucGia;
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
public class MucGiaDAO extends QLNhaTroDAO<MucGia, Integer> {

    public void insert(MucGia model) {
        String sql = "INSERT INTO MucGia (TienDien, TienNuoc, TienWifi, TienRac) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, model.getTienDien(), model.getTienNuoc(), model.getTienWifi(), model.getTienRac());
    }

    public void update(MucGia model) {
        String sql = "UPDATE MucGia SET TienDien=?, TienNuoc=?, TienWifi=?, TienRac=? WHERE Id=?";
        XJdbc.update(sql, model.getTienDien(), model.getTienNuoc(), model.getTienWifi(), model.getTienRac(), model.getId());
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM MucGia WHERE Id=?";
        XJdbc.update(sql, id);
    }

    
    public List<MucGia> selectAll() {
        String sql = "SELECT * FROM MucGia";
        return this.selectBySql(sql);
    }

    public MucGia selectById(Integer id) {
        String sql = "SELECT * FROM MucGia WHERE Id=?";
        List<MucGia> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<MucGia> selectBySql(String sql, Object... args) {
        List<MucGia> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                MucGia entity = new MucGia(
                        rs.getInt("Id"),
                        rs.getDouble("TienDien"),
                        rs.getDouble("TienNuoc"),
                        rs.getDouble("TienWifi"),
                        rs.getDouble("TienRac")
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
