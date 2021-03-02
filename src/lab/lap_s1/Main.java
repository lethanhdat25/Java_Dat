package lab.lap_s1;

public class Main {
    public static void main(String[] args) {

        // write your code here
        Product pr = new Product();
        Product pr2 = new Product();
        Product pr3 = new Product();
        pr.MaSP = 1;
        pr.TenSp = "SP1";
        pr.GiaTien = 10;
        pr.Soluong = 8;
        pr.Donvi = "chiec";
        pr2.MaSP = 1;
        pr2.TenSp = "SP1";
        pr2.GiaTien = 10;
        pr2.Soluong = 8;
        pr2.Donvi = "chiec";
        pr3.MaSP = 1;
        pr3.TenSp = "SP1";
        pr3.GiaTien = 10;
        pr3.Soluong = 8;
        pr3.Donvi = "chiec";
        if (pr.check() == false) System.out.println("con hang");
        else System.out.println("het hang");
    }
}
