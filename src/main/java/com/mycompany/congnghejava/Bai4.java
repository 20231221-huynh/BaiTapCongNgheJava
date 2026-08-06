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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 ||
            a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Khong phai tam giac");
        } else if (a == b && b == c) {
            System.out.println("La tam giac deu");
        } else if ((a == b && a * a + b * b == c * c) ||
                   (a == c && a * a + c * c == b * b) ||
                   (b == c && b * b + c * c == a * a)) {
            System.out.println("La tam giac vuong can");
        } else if (a * a + b * b == c * c ||
                   a * a + c * c == b * b ||
                   b * b + c * c == a * a) {
            System.out.println("La tam giac vuong");
        } else if (a == b || a == c || b == c) {
            System.out.println("La tam giac can");
        } else {
            System.out.println("La tam giac thuong");
        }
    }
}

