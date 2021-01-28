package lap_s1;

import java.text.DecimalFormat;

public class Product {
    int MaSP;
    String TenSp;
    int GiaTien;
    int Soluong;
    String Donvi;
    void changeQty(int change){
        Soluong+=change;
    }
    void changePrice(int change){
        GiaTien+=change;
    }
    boolean check(){
        if (Soluong<=0) return true;
        else return false;
    }
}
