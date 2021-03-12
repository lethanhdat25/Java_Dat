package assignment.Practical;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean run=true;
        Hotel hotel=new Hotel();
        Scanner sc=new Scanner(System.in);
        hotel.add("Hotel1","HN","Hung");
        hotel.add("Hotel2","HCM","Quang");
        hotel.add("Hotel3","HN","Lam");
        hotel.add("Hotel4","Hai Phong","Manh");
        hotel.add("Hotel5","DN","Yen");
        hotel.add("Hotel6","HN","Khanh");
        hotel.add("Hotel7","Nha trang","Thanh");
        hotel.add("Hotel8","HN","Dat");
        hotel.add("Hotel9","Nghe An","Chien");
        hotel.add("Hotel10","Thanh Hoa","Bao");
        do{
            hotel.menu();
            hotel.luaChon();
            switch (hotel.luachon){
                case 1:
                    System.out.println("Trong danh sach da co 10 khach san, moi ban nhap ten khach san muon them: ");
                    String ten=sc.nextLine();
                    System.out.println("Moi ban nhap dia chi cua khach san: ");
                    String diachi=sc.nextLine();
                    System.out.println("Moi ban nhap ten chu nhan cua khach san: ");
                    String tenchu=sc.nextLine();
                    hotel.add(ten,diachi,tenchu);
                    System.out.println("Da them thanh cong");
                    break;
                case 2:
                    System.out.println("Nhap ten cua chu khach san ma ban muon tim: ");
                    hotel.check(sc.next());
                    break;
                case 3:
                    System.out.println("Exit!");
                    run=false;
                    break;
            }
        } while (run==true);
    }
}
