/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class HocPhan {

    private String tenHocPhan;
    private double diemChuyenCan;
    private double diemGiuaKy;
    private double diemCuoiKy;

    public HocPhan(String tenHocPhan, double diemChuyenCan,
                   double diemGiuaKy, double diemCuoiKy) {

        this.tenHocPhan = tenHocPhan;
        this.diemChuyenCan = diemChuyenCan;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
    }

    public double tinhDiemTongKet() {
        return diemChuyenCan * 0.10
                + diemGiuaKy * 0.30
                + diemCuoiKy * 0.60;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public double getDiemChuyenCan() {
        return diemChuyenCan;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public void setDiemChuyenCan(double diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }
}
