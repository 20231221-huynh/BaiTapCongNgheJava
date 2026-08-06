/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congnghejava;

import java.util.Scanner;

/**
 *
 * @author PC DELL
 */
public class BaiLab2_SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem CC: ");
        double diemCC = sc.nextDouble();

        System.out.print("Nhap diem GK: ");
        double diemGK = sc.nextDouble();

        System.out.print("Nhap diem CK: ");
        double diemCK = sc.nextDouble();
        
        if(diemCC<0 || diemCC>10||diemGK<0 || diemGK>10|| diemCK<0 || diemCK>10){
            System.out.printf("Diem khong hop le");
        }

        double tongKet = diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6;

        String xepLoai;
        if (tongKet >= 8.5)
            xepLoai = "A";
        else if (tongKet >= 7)
            xepLoai = "B";
        else if (tongKet >= 5.5)
            xepLoai = "C";
        else if (tongKet >= 4)
            xepLoai = "D";
        else
            xepLoai = "F";

        System.out.println("\n=== THONG TIN SINH VIEN ===");
        System.out.println("ID: " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem tong ket: " + tongKet);
        System.out.println("Xep loai: " + xepLoai);
    }
}
