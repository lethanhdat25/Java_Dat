package assignment.As6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MonHocDaiCuong extends MonHoc {

    ArrayList<LopHoc> danhSachLopHoc = new ArrayList<LopHoc>();

    @Override
    void themLopHoc(String name, int soluonghocsinh) {
        for (LopHoc x :
                danhSachLopHoc) {
            if (x.getLopHoc().equals(name)) {
                System.out.println("Lop hoc nay da co trong danh sach");
                return;
            }
        }
        LopHoc lh = new LopHoc(name, soluonghocsinh);
        danhSachLopHoc.add(lh);
        lh.nhapHS();
    }

    @Override
    void xoaLopHoc(String name) {
        for (LopHoc x :
                danhSachLopHoc) {
            if (x.getLopHoc().equals(name)) {
                danhSachLopHoc.remove(x);
                return;
            }
        }
    }

    @Override
    void sapXep() {
        Collections.sort(danhSachLopHoc, new Comparator<LopHoc>() {
            @Override
            public int compare(LopHoc o1, LopHoc o2) {
                return o2.getSoLuongHocSinh() - o1.getSoLuongHocSinh();
            }
        });
    }

    @Override
    void inDanhSach() {
        sapXep();
        for (LopHoc x :
                danhSachLopHoc) {
            System.out.println("Lop hoc: " + x.getLopHoc() + " co " + x.getSoLuongHocSinh() + " hoc sinh");
            for (int i = 0; i < x.soLuongHocSinh; i++) {
                System.out.println(x.danhSachHocSinh.get(i));
            }
        }
    }
}
