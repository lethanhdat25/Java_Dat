package lab.Laps8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        float tongsoluongVN=0;
        float tongsoluongNN=0;

        ArrayList dcs=new ArrayList();
        KhachHangVietNam kh1=new KhachHangVietNam();
        KhachHangVietNam kh2=new KhachHangVietNam();
        KhachHangNuocNgoai khnn1=new KhachHangNuocNgoai();
        KhachHangNuocNgoai khnn2=new KhachHangNuocNgoai();
        kh1.nhapXuat();
        kh2.nhapXuat();
        kh1.thanhTien();
        kh2.thanhTien();
        khnn1.nhapXuat();
        khnn2.nhapXuat();
        khnn1.thanhTien();
        khnn2.thanhTien();
        dcs.add(kh1);
        dcs.add(kh2);
        for (int i=0;i<dcs.size();i++){
            if (dcs.get(i) instanceof KhachHangVietNam){
                 tongsoluongVN+=((KhachHangVietNam) dcs.get(i)).getSoluong();
            }
        }
        for (int i=0;i<dcs.size();i++){
            if (dcs.get(i) instanceof KhachHangNuocNgoai){
                tongsoluongNN+=((KhachHangNuocNgoai) dcs.get(i)).getSoluong();
            }
        }
        System.out.println("Tong so luong: "+tongsoluongVN);
        System.out.println("Tong so luong: "+tongsoluongNN);

    }
}
