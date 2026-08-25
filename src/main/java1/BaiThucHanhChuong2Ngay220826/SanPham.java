package BaiThucHanhChuong2Ngay220826;

public class SanPham {

    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;

    public SanPham(String maSP, String tenSP, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;

        tinhDonGia();
    }

    private void tinhDonGia() {
        if (soLuong <= 10) {
            donGia = 10000;
        } else {
            donGia = 5000;
        }
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getTienHang() {
        return soLuong * donGia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
        tinhDonGia();
    }
}