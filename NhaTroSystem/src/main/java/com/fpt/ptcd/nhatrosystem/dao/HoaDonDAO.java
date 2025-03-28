/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.dao;

import com.fpt.ptcd.nhatrosystem.entity.HoaDon;
import com.fpt.ptcd.nhatrosystem.entity.MucGia;
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
        String sql = "INSERT INTO HoaDon (MaHoaDon, MaPhieuThue, SoDien, SoNuoc, TienWifi, TienRac, ChiPhiKhac, TongTien, Ngay) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, model.getMaHoaDon(), model.getMaPhieuThue(), model.getSoDien(), model.getSoNuoc(), model.getTienWifi(), model.getTienRac(), model.getChiPhiKhac(), model.getTongTien(), model.getNgay());
    }

    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET MaPhieuThue=?, SoDien=?, SoNuoc=?, TienWifi=?, TienRac=?, ChiPhiKhac=?, TongTien=?, Ngay=? WHERE MaHoaDon=?";
        XJdbc.update(sql, model.getMaPhieuThue(), model.getSoDien(), model.getSoNuoc(), model.getTienWifi(), model.getTienRac(), model.getChiPhiKhac(), model.getTongTien(), model.getNgay(), model.getMaHoaDon());
    }

    
    public void delete(String id) {
        String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
        XJdbc.update(sql, id);
    }

    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return this.selectBySql(sql);
    }

    public HoaDon selectById(String mahd) {
        String sql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
        List<HoaDon> list = this.selectBySql(sql, mahd);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon(
                        rs.getString("MaHoaDon"),
                        rs.getString("MaPhieuThue"),
                        rs.getInt("SoDien"),
                        rs.getInt("SoNuoc"),
                        rs.getInt("TienWifi"),
                        rs.getInt("TienRac"),
                        rs.getInt("ChiPhiKhac"),
                        rs.getInt("TongTien"),
                        rs.getDate("Ngay")
                );
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    MucGiaDAO mgdao = new MucGiaDAO();
    
    public double tinhTongTien(int soDien, int soNuoc) {
        // Lấy danh sách mức giá (giả sử có 1 mức giá duy nhất)
        List<MucGia> mucGiaList = mgdao.selectAll();
        if (mucGiaList.isEmpty()) {
            throw new RuntimeException("Không tìm thấy bảng giá điện nước!");
        }
        MucGia mucGia = mucGiaList.get(0);

        // Tính tiền điện
        double tienDien = mgdao.tinhTienDien(soDien, mucGia.getTienDienBac1(), mucGia.getTienDienBac2(), mucGia.getTienDienBac3(),
                 mucGia.getTienDienBac4(), mucGia.getTienDienBac5(), mucGia.getTienDienBac6());
        // Tính tiền nước
        double tienNuoc = mgdao.tinhTienNuoc(soNuoc, mucGia.getTienNuocBac1(),mucGia.getTienNuocBac2(),
                mucGia.getTienNuocBac3(),mucGia.getTienNuocBac4());
        // Tiền WiFi và Rác cố định
        double tienWifi = mgdao.tinhTienWifi(mucGia.getTienWifi());
        double tienRac = mgdao.tinhTienRac(mucGia.getTienRac());

        return tienDien + tienNuoc + tienWifi + tienRac;
    }
}
