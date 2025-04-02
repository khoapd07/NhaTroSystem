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
    private double tienDienBac4;
    private double tienDienBac5;
    private double tienDienBac6;
    private double tienNuocBac1;
    private double tienNuocBac2;
    private double tienNuocBac3;
    private double tienNuocBac4;
    private double tienWifi;
    private double tienRac;

    public MucGia(double tienDienBac1, double tienDienBac2, double tienDienBac3, double tienDienBac4, double tienDienBac5, double tienDienBac6, double tienNuocBac1, double tienNuocBac2, double tienNuocBac3, double tienNuocBac4, double tienWifi, double tienRac) {
        this.tienDienBac1 = tienDienBac1;
        this.tienDienBac2 = tienDienBac2;
        this.tienDienBac3 = tienDienBac3;
        this.tienDienBac4 = tienDienBac4;
        this.tienDienBac5 = tienDienBac5;
        this.tienDienBac6 = tienDienBac6;
        this.tienNuocBac1 = tienNuocBac1;
        this.tienNuocBac2 = tienNuocBac2;
        this.tienNuocBac3 = tienNuocBac3;
        this.tienNuocBac4 = tienNuocBac4;
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

    public double getTienDienBac4() {
        return tienDienBac4;
    }

    public void setTienDienBac4(double tienDienBac4) {
        this.tienDienBac4 = tienDienBac4;
    }

    public double getTienDienBac5() {
        return tienDienBac5;
    }

    public void setTienDienBac5(double tienDienBac5) {
        this.tienDienBac5 = tienDienBac5;
    }

    public double getTienDienBac6() {
        return tienDienBac6;
    }

    public void setTienDienBac6(double tienDienBac6) {
        this.tienDienBac6 = tienDienBac6;
    }

    public double getTienNuocBac1() {
        return tienNuocBac1;
    }

    public void setTienNuocBac1(double tienNuocBac1) {
        this.tienNuocBac1 = tienNuocBac1;
    }

    public double getTienNuocBac2() {
        return tienNuocBac2;
    }

    public void setTienNuocBac2(double tienNuocBac2) {
        this.tienNuocBac2 = tienNuocBac2;
    }

    public double getTienNuocBac3() {
        return tienNuocBac3;
    }

    public void setTienNuocBac3(double tienNuocBac3) {
        this.tienNuocBac3 = tienNuocBac3;
    }

    public double getTienNuocBac4() {
        return tienNuocBac4;
    }

    public void setTienNuocBac4(double tienNuocBac4) {
        this.tienNuocBac4 = tienNuocBac4;
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

  
    
    public double tinhTienDien(int soDien) {
        double tienDien = 0;
        if (soDien <0 ){
            System.out.println("Số KWh diện không thể âm!");
        }
        if (soDien <= 50 && soDien >=0) {
            tienDien = soDien * this.getTienDienBac1();
        } else if (soDien >50 && soDien <= 100) {
            tienDien = (50 * this.getTienDienBac1()) + ((soDien - 50) * this.getTienDienBac2());
        } else if (soDien >100 && soDien <=200) {
            tienDien = (50 * this.getTienDienBac1()) + (50 * this.getTienDienBac2()) + ((soDien - 100) * this.getTienDienBac3());
        } else if (soDien>200 && soDien<=300){
            tienDien = (50 * this.getTienDienBac1()) + (50 * this.getTienDienBac2()) + (100 * this.getTienDienBac3()) + ((soDien -200) * this.getTienDienBac4());
        } else if (soDien>300 && soDien<= 400){
            tienDien = (50 * this.getTienDienBac1()) + (50 * this.getTienDienBac2()) + (100 * this.getTienDienBac3()) + (100 * this.getTienDienBac4()) + ((soDien - 300) * this.getTienDienBac5());
        } else{
            tienDien = (50 * this.getTienDienBac1()) + (50 * this.getTienDienBac2()) + (100 * this.getTienDienBac3()) + (100 * this.getTienDienBac4()) + (100 * this.getTienDienBac5()) + ((soDien -400)* this.getTienDienBac6());
        }
        return tienDien;
    }
    
    public double tinhTienNuoc(int soNuoc) {
        double tienNuoc = 0;
        if (soNuoc < 0) {
            System.out.println("Số m3 nước không thể âm!");
        }else if(soNuoc <=10){
            tienNuoc = soNuoc * this.getTienNuocBac1();
        }else if (soNuoc>10 && soNuoc <=20){
            tienNuoc = (10* this.getTienNuocBac1()) + ((soNuoc-10)*this.getTienNuocBac2());
        }else if (soNuoc>20 && soNuoc<=30){
            tienNuoc = (10* this.getTienNuocBac1()) + (10 * this.getTienNuocBac2()) + ((soNuoc -20) * this.getTienNuocBac3());
        } else{
            tienNuoc = (10 * this.getTienNuocBac1()) + (10 * this.getTienNuocBac2()) +(10 * this.getTienNuocBac3()) + ((soNuoc-30) *this.getTienNuocBac4());
        }
        return tienNuoc;
    }
    
}
