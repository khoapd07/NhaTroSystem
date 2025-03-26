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

    }

    public void update(MucGia model) {
        String sql = "UPDATE MucGia SET TienDienBac1=?, TienDienBac2=?, TienDienBac3=?, TienDienBac4=?, TienDienBac5=?, TienDienBac6=?, "
                + "TienNuocBac1=?, TienNuocBac2=?, TienNuocBac3=?, TienNuocBac4=?, TienWifi=?, TienRac=?";
        XJdbc.update(sql,
                model.getTienDienBac1(), model.getTienDienBac2(), model.getTienDienBac3(), model.getTienDienBac4(),
                model.getTienDienBac5(), model.getTienDienBac6(), model.getTienNuocBac1(), model.getTienNuocBac2(),
                model.getTienNuocBac3(), model.getTienNuocBac4(), model.getTienWifi(), model.getTienRac()
        );
    }

    public List<MucGia> selectAll() {
        String sql = "SELECT * FROM MucGia";
        return this.selectBySql(sql);
    }

    protected List<MucGia> selectBySql(String sql, Object... args) {
        List<MucGia> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                MucGia entity = new MucGia(
                        rs.getDouble("TienDienBac1"), rs.getDouble("TienDienBac2"), rs.getDouble("TienDienBac3"),
                        rs.getDouble("TienDienBac4"), rs.getDouble("TienDienBac5"), rs.getDouble("TienDienBac6"),
                        rs.getDouble("TienNuocBac1"), rs.getDouble("TienNuocBac2"), rs.getDouble("TienNuocBac3"), rs.getDouble("TienNuocBac4"),
                        rs.getDouble("TienWifi"), rs.getDouble("TienRac")
                );
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public void delete(Integer id) {

    }

    public MucGia selectById(Integer id) {

        return null;

    }
}
