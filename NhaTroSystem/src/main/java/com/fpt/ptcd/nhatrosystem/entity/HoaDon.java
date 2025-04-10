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
    private String maPhieuThue;
    private int soDien;
    private int soNuoc;
    private int tienWifi;
    private int tienRac;
    private int chiPhiKhac;
    private int tongTien;
    private Date ngay;
    private boolean trangThai;
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maPhieuThue, int soDien, int soNuoc, int tienWifi, int tienRac, int chiPhiKhac, int tongTien, Date ngay, boolean trangThai) {
        this.maHoaDon = maHoaDon;
        this.maPhieuThue = maPhieuThue;
        this.soDien = soDien;
        this.soNuoc = soNuoc;
        this.tienWifi = tienWifi;
        this.tienRac = tienRac;
        this.chiPhiKhac = chiPhiKhac;
        this.tongTien = tongTien;
        this.ngay = ngay;
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaPhieuThue() {
        return maPhieuThue;
    }

    public void setMaPhieuThue(String maPhieuThue) {
        this.maPhieuThue = maPhieuThue;
    }

    public int getSoDien() {
        return soDien;
    }

    public void setSoDien(int soDien) {
        this.soDien = soDien;
    }

    public int getSoNuoc() {
        return soNuoc;
    }

    public void setSoNuoc(int soNuoc) {
        this.soNuoc = soNuoc;
    }

    public int getTienWifi() {
        return tienWifi;
    }

    public void setTienWifi(int tienWifi) {
        this.tienWifi = tienWifi;
    }

    public int getTienRac() {
        return tienRac;
    }

    public void setTienRac(int tienRac) {
        this.tienRac = tienRac;
    }

    public int getChiPhiKhac() {
        return chiPhiKhac;
    }

    public void setChiPhiKhac(int chiPhiKhac) {
        this.chiPhiKhac = chiPhiKhac;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}