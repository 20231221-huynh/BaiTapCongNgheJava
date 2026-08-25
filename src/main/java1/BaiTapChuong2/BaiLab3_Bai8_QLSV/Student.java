/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapChuong2.BaiLab3_Bai8_QLSV;

/**
 *
 * @author PC DELL
 */
public class Student {
    
    private String msv;
    private String hoten;
    private double dtb;

    public Student(String msv, String hoten, double dtb) {
        this.msv = msv;
        this.hoten = hoten;
        this.dtb = dtb;
    }

    public String getMsv() {
        return msv;
    }

    public String getHoten() {
        return hoten;
    }

    public double getDtb() {
        return dtb;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    
    public String xepLoai() {
        if (dtb >= 8.5) {
            return "Giỏi";
        } else if (dtb >= 7) {
            return "Khá";
        } else if (dtb >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}
