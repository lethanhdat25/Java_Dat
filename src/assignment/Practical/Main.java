package assignment.Practical;


public class Main {
    public static void main(String[] args){
        int a=0;
        Hotel hotel=new Hotel();
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
        for (Hotel x:
             hotel.listHotel) {
            System.out.println("Ten khach san: "+x.name+", dia chi: "+x.location+", ten chu khach san: "+x.ownerName);
        }
        hotel.check("Chien");
        hotel.check("Dat");
    }
}
