package lab.Labs5;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    ArrayList<String> listStudent=new ArrayList<String>();
    float mucLuong;
    int soMon;
    String cacMon;

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }

    public String getCacMon() {
        return cacMon;
    }

    public void setCacMon(String cacMon) {
        this.cacMon = cacMon;
    }

    public ArrayList<String> getListStudent() {
        return listStudent;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("danh sach lop: ");
        listStudent.add(sc.nextLine());
        System.out.println("muc luong: ");
        setMucLuong(sc.nextFloat());
        System.out.println("So mon day: ");
        setSoMon(sc.nextInt());
        System.out.println("Cac mon giang day: ");
        setCacMon(sc.nextLine());

    }

    @Override
    public void inThongTin() {
        System.out.println("Ten: "+getTen()+" gioi tinh: "+getGioitinh()+
                " ngay sinh: "+getNgaysinh()+" dia chi: "+getDiachi()+
                " danh sach lop: "+getListStudent()+" muc luong: "+getMucLuong()+" so mon day: "+getSoMon()+" cac mon day: "+getCacMon());

    }
}
