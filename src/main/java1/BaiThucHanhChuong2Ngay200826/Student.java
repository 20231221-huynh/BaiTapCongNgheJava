
import java.util.ArrayList;
public class Student {

    private String maSV;
    private String tenSV;
    private ArrayList<HocPhan> danhSachHocPhan;

    public Student(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.danhSachHocPhan = new ArrayList<>();
    }

    public void themHocPhan(HocPhan hp) {
        danhSachHocPhan.add(hp);
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public ArrayList<HocPhan> getDanhSachHocPhan() {
        return danhSachHocPhan;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
}