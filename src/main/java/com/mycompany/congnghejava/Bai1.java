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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int s = 0;

        for (int i = 0; i <= n; i+=2){
            s += i;
        }
        System.out.println("Tong = "+ s);
    }
}
