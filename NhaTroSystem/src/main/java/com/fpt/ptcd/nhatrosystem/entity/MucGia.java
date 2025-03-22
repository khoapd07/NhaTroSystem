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

    private double tienDienBac1;
    private double tienDienBac2;
    private double tienDienBac3;
    private double tienNuoc;
    private double tienWifi;
    private double tienRac;

    public MucGia(double tienDienBac1, double tienDienBac2, double tienDienBac3, double tienNuoc, double tienWifi, double tienRac) {
        this.tienDienBac1 = tienDienBac1;
        this.tienDienBac2 = tienDienBac2;
        this.tienDienBac3 = tienDienBac3;
        this.tienNuoc = tienNuoc;
        this.tienWifi = tienWifi;
        this.tienRac = tienRac;
    }

    public MucGia() {
        
    }

    public double getTienDienBac1() {
        return tienDienBac1;
    }

    public void setTienDienBac1(double tienDienBac1) {
        this.tienDienBac1 = tienDienBac1;
    }

    public double getTienDienBac2() {
        return tienDienBac2;
    }

    public void setTienDienBac2(double tienDienBac2) {
        this.tienDienBac2 = tienDienBac2;
    }

    public double getTienDienBac3() {
        return tienDienBac3;
    }

    public void setTienDienBac3(double tienDienBac3) {
        this.tienDienBac3 = tienDienBac3;
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
