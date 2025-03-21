/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;
import java.util.Date;
/**
 *
 * @author DUNG
 */
public class HoaDon {
    private String maHoaDon;
    private String maThue;
    private Date ngayTao;
    private double tongTien;
    private String trangThai;

    public HoaDon(String maHoaDon, String maThue, Date ngayTao, double tongTien, String trangThai) {
        this.maHoaDon = maHoaDon;
        this.maThue = maThue;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaThue() {
        return maThue;
    }

    public void setMaThue(String maThue) {
        this.maThue = maThue;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}

