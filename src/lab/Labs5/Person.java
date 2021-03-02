package lab.Labs5;

import java.util.Scanner;

public class Person {
    String ten;
    String gioitinh;
    int ngaysinh;
    String diachi;
    public Person(){

    }


    public Person(String ten,String gioitinh,int ngaysinh,String diachi){
        this.ten=ten;
        this.gioitinh=gioitinh;
        this.ngaysinh=ngaysinh;
        this.diachi=diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ten la: ");
        setTen(sc.next());
        System.out.println("gioi tinh la: ");
        setGioitinh(sc.next());
        System.out.println("ngay sinh la: ");
        setNgaysinh(sc.nextInt());
        System.out.println("dia chi la: ");
        setDiachi(sc.next());
    }

    public void inThongTin(){

        System.out.println("Ten: "+getTen()+" gioi tinh: "+getGioitinh()+" ngay sinh: "+getNgaysinh()+" dia chi: "+getDiachi());
    }
}
