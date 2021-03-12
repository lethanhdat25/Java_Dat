package lab.Laps8;

import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    String quocTich;
    float thanhTien;

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapXuat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap ten khach hang:");
        setHoTen(sc.next());
        System.out.println("Moi ban nhap quoc tich: ");
        setQuocTich(sc.next());
        System.out.println("Moi ban nhap ma khach hang:");
        setMaKhachHang(sc.next());
        System.out.println("Moi ban nhap ngay ra hoa don");
        setNgayRaHoaDon(sc.next());
        System.out.println("Moi ban nhap so luong: ");
        setSoluong(sc.nextInt());
    }

    @Override
    protected void thanhTien() {
        setThanhTien(getSoluong()*2000);
        System.out.println("Hoa don cua "+this.getHoTen()+" la: "+thanhTien);

    }
}
