/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congnghejava.BaiLab2_Maven;

/**
 *
 * @author PC DELL
 */
public class SinhVien {
    private String id;
    private String hoten;
    private double diemcc;
    private double diemgk;
    private double diemck;
    
    public SinhVien(String id, String hoten, double diemcc, double diemgk, double diemck){
        this.id = id;
        this.hoten = hoten;
        this.diemcc = diemcc;
        this.diemgk = diemgk;
        this.diemck = diemck;
    }
    
    public String getID(){
        return id;
    }
    
    public String getHoTen(){
        return hoten;
    }
    
    public double getDiemCC(){
        return diemcc;
    }
    
    public double getDiemGK(){
        return diemgk;
    }
    
    public double getDiemCK(){
        return diemck;
    }
    
    public void displayInfo(double diemTongKet, String xepLoai) {
        System.out.println("==================Bảng Điểm Sinh Viên====================");
        System.out.println("+----------+----------------------+----------+----------+");
        System.out.printf("| %-8s | %-20s | %-8s | %-8s |%n",
                "ID", "Họ và tên", "Điểm TK", "Xếp lọai");
        System.out.println("+----------+----------------------+----------+----------+");

        System.out.printf("| %-8s | %-20s | %-8.2f | %-8s |%n",
                id, hoten, diemTongKet, xepLoai);

        System.out.println("+----------+----------------------+----------+----------+");
    }
}
