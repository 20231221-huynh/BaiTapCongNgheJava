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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + 1.0 / i;
        }
        System.out.println("Tong = " + s);
    }
}
