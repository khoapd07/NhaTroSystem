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
    
        public double tinhTienDien(double soKWh, double bac1, double bac2, double bac3, double bac4, double bac5, double bac6) {
        double tienDien = 0;
        if (soKWh <= 50 && soKWh >=0) {
            tienDien = soKWh * bac1;
        } else if (soKWh >50 && soKWh <= 100) {
            tienDien = (50 * bac1) + ((soKWh - 50) * bac2);
        } else if (soKWh >100 && soKWh <=200) {
            tienDien = (50 * bac1) + (50 * bac2) + ((soKWh - 100) * bac3);
        } else if (soKWh>200 && soKWh<=300){
            tienDien = (50 * bac1) + (50 * bac2) + (100 * bac3) + ((soKWh -200) * bac4);
        } else if (soKWh>300 && soKWh<= 400){
            tienDien = (50 * bac1) + (50 * bac2) + (100 * bac3) + (100 * bac4) + ((soKWh - 300) * bac5);
        } else{
            tienDien = (50 * bac1) + (50 * bac2) + (100 * bac3) + (100 * bac4) + (100 * bac5) + ((soKWh -400)* bac6);
        }
        return tienDien;
    }

    public double tinhTienNuoc(double soM3, double bac1, double bac2, double bac3, double bac4) {
        double tienNuoc = 0;
        if (soM3 < 0) {
            throw new IllegalArgumentException("Số m³ nước không thể âm!");
        }else if(soM3 <=10){
            tienNuoc = soM3 * bac1;
        }else if (soM3>10 && soM3 <=20){
            tienNuoc = (10* bac1) + ((soM3-10)*bac2);
        }else if (soM3>20 && soM3<=30){
            tienNuoc = (10* bac1) + (10 * bac2) + ((soM3 -20) * bac3);
        } else{
            tienNuoc = (10 * bac1) + (10 * bac2) +(10 * bac3) + ((soM3-30) *bac4);
        }
        return tienNuoc;
    }

    public double tinhTienWifi(double giaWifi) {
        if (giaWifi < 0) {
            throw new IllegalArgumentException("Tiền WiFi không thể âm!");
        }
        return giaWifi;
    }

    public double tinhTienRac(double giaRac) {
        if (giaRac < 0) {
            throw new IllegalArgumentException("Tiền rác không thể âm!");
        }
        return giaRac;
    }
}
