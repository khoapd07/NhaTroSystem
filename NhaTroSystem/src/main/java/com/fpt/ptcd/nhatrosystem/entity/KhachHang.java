/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

/**
 *
 * @author accgs
 */
public class KhachHang {
    private String maKhach;
    private String tenKhach;
    private int soDT;
    private String diaChi;
    private String canCCD;

    public KhachHang() {
    }

    public KhachHang(String maKhach, String tenKhach, int soDT, String diaChi, String canCCD) {
        this.maKhach = maKhach;
        this.tenKhach = tenKhach;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.canCCD = canCCD;
    }

    public String getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCanCCD() {
        return canCCD;
    }

    public void setCanCCD(String canCCD) {
        this.canCCD = canCCD;
    }  
}
