/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

/**
 *
 * @author accgs
 */
public class Phong {
    private String maPhong;
    private String maLoai;
    private String tenPhong;
    private boolean trangThai;
    private String ghiChu;

    public Phong() {
    }

    public Phong(String maPhong, String maLoai, String tenPhong, boolean trangThai, String ghiChu) {
        this.maPhong = maPhong;
        this.maLoai = maLoai;
        this.tenPhong = tenPhong;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }
    
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
