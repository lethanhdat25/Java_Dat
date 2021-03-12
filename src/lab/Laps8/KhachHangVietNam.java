package lab.Laps8;

import java.util.Scanner;

public class KhachHangVietNam extends KhachHang{
        float thanhtien;
        String doiTuongKh;
    public void nhapXuat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap ten khach hang:");
        setHoTen(sc.next());
        System.out.println("Moi ban nhap ma khach hang:");
        setMaKhachHang(sc.next());
        System.out.println("Moi ban nhap ngay ra hoa don");
        setNgayRaHoaDon(sc.next());
        System.out.println("Moi ban nhap doi tuong khach hang");
        setDoiTuongKh(sc.next());
        System.out.println("Moi ban nhap so luong: ");
        setSoluong(sc.nextInt());
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getDoiTuongKh() {
        return doiTuongKh;
    }

    public void setDoiTuongKh(String doiTuongKh) {
        this.doiTuongKh = doiTuongKh;
    }

    @Override
     protected void thanhTien() {
        if(getSoluong()<=50){
            setThanhtien(getSoluong()*1000);
        }else if(getSoluong()>50&&getSoluong()<=100){
            setThanhtien(50*1000+((getSoluong()-50)*1200));
        }else if(getSoluong()>100&&getSoluong()<=200){
            setThanhtien(50*1000+((getSoluong()-50)*1500));
        }else if (getSoluong()>200){
            setThanhtien(50*1000+((getSoluong()-50)*2000));
        }
        System.out.println("Hoa don cua "+this.getHoTen()+" la: "+thanhtien);
    }
}
