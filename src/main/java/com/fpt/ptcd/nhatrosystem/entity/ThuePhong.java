/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

import java.util.Date;

/**
 *
 * @author accgs
 */
public class ThuePhong {
    private String maPhieuThue;
    private String maPhong;
    private String maKhach;
    private String maNV;
    private double tienCoc;
    private Date ngayThue;

    public ThuePhong() {
    }

    public ThuePhong(String maPhieuThue, String maPhong, String maKhach, String maNV, double tienCoc, Date ngayThue) {
        this.maPhieuThue = maPhieuThue;
        this.maPhong = maPhong;
        this.maKhach = maKhach;
        this.maNV = maNV;
        this.tienCoc = tienCoc;
        this.ngayThue = ngayThue;
    }

    public String getMaPhieuThue() {
        return maPhieuThue;
    }

    public void setMaPhieuThue(String maPhieuThue) {
        this.maPhieuThue = maPhieuThue;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }
    
    
}
