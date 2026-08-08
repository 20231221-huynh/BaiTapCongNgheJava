/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontapcongnghejava1;
import java.util.Scanner;
/**
 *
 * @author PC DELL
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập id: ");
        String id = sc.nextLine();
        System.out.printf("Nhập họ tên: ");
        String hoten = sc.nextLine();
        System.out.printf("Nhập điểm chuyên cần: ");
        double diemcc = sc.nextDouble();
        System.out.printf("Nhập điểm giữa kỳ: ");
        double diemgk = sc.nextDouble();
        System.out.printf("Nhập điểm cuối kỳ: ");
        double diemck = sc.nextDouble();
        
        if(diemcc<0 || diemcc>10|| diemgk<0 || diemgk>10 || diemck<0 || diemck>10){
            System.out.printf("Diem khong hop le");
            return;
        }
        SinhVien sv = new SinhVien(id, hoten, diemcc, diemgk, diemck);
        
        double diemtongket = TinhDiem.DiemTongKet(sv);
        String xeploai = TinhDiem.XepLoai(diemtongket);
        sv.displayInfo(diemtongket, xeploai);
        sc.close();
    }
}
