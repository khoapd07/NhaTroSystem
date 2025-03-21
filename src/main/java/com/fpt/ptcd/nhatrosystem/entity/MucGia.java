/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

/**
 *
 * @author DUNG
 */
public class MucGia {
    private int id;
    private double tienDien;
    private double tienNuoc;
    private double tienWifi;
    private double tienRac;

    public MucGia(int id, double tienDien, double tienNuoc, double tienWifi, double tienRac) {
        this.id = id;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;
        this.tienWifi = tienWifi;
        this.tienRac = tienRac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTienDien() {
        return tienDien;
    }

    public void setTienDien(double tienDien) {
        this.tienDien = tienDien;
    }

    public double getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(double tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public double getTienWifi() {
        return tienWifi;
    }

    public void setTienWifi(double tienWifi) {
        this.tienWifi = tienWifi;
    }

    public double getTienRac() {
        return tienRac;
    }

    public void setTienRac(double tienRac) {
        this.tienRac = tienRac;
    }
}