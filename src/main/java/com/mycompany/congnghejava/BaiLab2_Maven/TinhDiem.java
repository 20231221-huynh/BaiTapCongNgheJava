/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congnghejava.BaiLab2_Maven;

/**
 *
 * @author PC DELL
 */
public class TinhDiem {
    public static double DiemTongKet(SinhVien sv){
        return sv.getDiemCC() * 0.1 + sv.getDiemGK() * 0.3 + sv.getDiemCK() * 0.6;
    } 
    
    public static String XepLoai(double diemtongket){
        if (diemtongket >= 8.5){
            return "A";
        }else if(diemtongket >= 7.0){
            return "B";
        }else if(diemtongket >= 5.5){
            return "C";
        }else if(diemtongket >= 4.0){
            return "D";
        }
        else{
            return "F";
        }
    }
}
