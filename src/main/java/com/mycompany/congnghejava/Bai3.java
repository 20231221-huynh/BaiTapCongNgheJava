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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        boolean snt = true;
        
        if(n < 2){
            snt = false;
        }else{
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    snt = false;
                    break;
                }
            }
        }
        if (snt){
            System.out.print(n + "la so nguyen to");
        }else{
            System.out.print(n + "khong la so nguyen to");
        }   
    }
}
