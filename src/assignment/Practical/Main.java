package assignment.Practical;


public class Main {
    public static void main(String[] args){
        int a=0;
        Hotel hotel=new Hotel();
        hotel.add("Khachsan1","HN","Hung");
        hotel.add("Khachsan2","HN","Quang");
        hotel.add("Khachsan3","HN","Lam");
        hotel.add("Khachsan4","HN","Manh");
        hotel.add("Khachsan5","HN","Yen");
        hotel.add("Khachsan6","HN","Khanh");
        hotel.add("Khachsan7","HN","Thanh");
        hotel.add("Khachsan8","HN","Dat");
        hotel.add("Khachsan9","HN","Chien");
        hotel.add("Khachsan10","HN","Bao");
        for (Hotel x:
             hotel.listHotel) {
            System.out.println("Ten khach san: "+x.name+", dia chi: "+x.location+", ten chu khach san: "+x.ownerName);
        }
        hotel.check("Khanh");
    }
}
