package lab.Labs5;

import java.util.Scanner;

public class Student extends Person {
    String masv, email;
    float diem;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }


    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("ma sv la: ");
        setMasv(sc.next());
        System.out.println("diem la: ");
        setDiem(sc.nextInt());
        System.out.println("email la: ");
        setEmail(sc.next());
    }


    public void inThongTin() {
        if (check()) System.out.print(" sinh viên"+super.getTen()+" có được học bông");
        else System.out.print(" sinh viên khong được học bông");
    }

    public boolean check() {
        return getDiem() > 8 ? true : false;
    }
}
