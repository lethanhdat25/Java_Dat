package assignment.As6;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc {

    ArrayList<LopHoc> danhSachLopHoc=new ArrayList<LopHoc>();

    @Override
    void themLopHoc(String name, int soluonghocsinh) {
        for (LopHoc x:
             danhSachLopHoc) {
            if (x.getLopHoc().equals(name)){
                System.out.println("Lop hoc nay da co trong danh sach");
                return;
            }
        }
        LopHoc lh=new LopHoc(name,soluonghocsinh);
        danhSachLopHoc.add(lh);
    }

    @Override
    void xoaLopHoc(String name) {
        for (LopHoc x:
             danhSachLopHoc) {
            if (x.getLopHoc().equals(name)){
                danhSachLopHoc.remove(x);
                return;
            }
        }
    }

    @Override
    void sapXep() {

    }

    @Override
    void inDanhSach() {
        for (LopHoc x:
             danhSachLopHoc) {
            System.out.println("Lop hoc: "+x.getLopHoc()+" co "+x.getSoLuongHocSinh()+" hoc sinh");
        }
    }
}
