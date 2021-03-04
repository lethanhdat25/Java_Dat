package assignment.As6;


import java.util.ArrayList;

public class LopHoc {
    String lopHoc;
    int soLuongHocSinh;
    ArrayList<String> danhSachHocSinh=new ArrayList<String>();

    public LopHoc(String lopHoc, int soLuongHocSinh) {
        this.lopHoc = lopHoc;
        this.soLuongHocSinh = soLuongHocSinh;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public int getSoLuongHocSinh() {
        return soLuongHocSinh;
    }

    public void setSoLuongHocSinh(int soLuongHocSinh) {
        this.soLuongHocSinh = soLuongHocSinh;
    }

    public ArrayList<String> getDanhSachHocSinh() {
        return danhSachHocSinh;
    }
}
