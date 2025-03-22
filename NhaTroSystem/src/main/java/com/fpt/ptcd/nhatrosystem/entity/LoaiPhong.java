/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

/**
 *
 * @author accgs
 */
public class LoaiPhong {
    private String maLoai;
    private String tenLoai;
    private int dienTich;
    private double giaPhong;
    private String ghiChu;

    public LoaiPhong() {
    }

    public LoaiPhong(String maLoai, String tenLoai, int dienTich, double giaPhong, String ghiChu) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.dienTich = dienTich;
        this.giaPhong = giaPhong;
        this.ghiChu = ghiChu;
    }
    @Override
    public String toString() {
        return this.maLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    } 
}
