package assignment.As6;


import java.util.ArrayList;
import java.util.Scanner;

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
    public void nhapHS(){
        for(int i=0;i<soLuongHocSinh;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Moi ban nhap hoc sinh thu "+i);
            danhSachHocSinh.add(sc.nextLine());        }
    }
}
