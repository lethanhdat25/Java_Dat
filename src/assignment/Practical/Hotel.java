package assignment.Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    String name;
    String location;
    String ownerName;
    int luachon;
    ArrayList<Hotel> listHotel;
    public Hotel() {
        listHotel=new ArrayList<>();
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Hotel> getListHotel() {
        return listHotel;
    }

    public  void add(String name,String location,String ownerName){
        for (Hotel ht:
             listHotel) {
            if (ht.getName().equals(name)) return;
        }
        Hotel h=new Hotel(name,location,ownerName);
        listHotel.add(h);
    }
    public void luaChon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap lua chon: ");
        luachon = sc.nextInt();
    }

    public void menu() {
        System.out.println("1.Them Khach San");
        System.out.println("2.Tim Khach San.");
        System.out.println("3. Exit.");
    }

    public  void check(String ownerName){
        for (Hotel hotel:
             listHotel) {
            if (hotel.getOwnerName().equals(ownerName)){
                System.out.println("Thong tin khac san cua "+ownerName+" la: ");
                System.out.println("Ten khach san: "+hotel.getName()+", vi tri: "+hotel.getLocation());
                return;
            }
        }
        System.out.println("Khong tim thay");
    }
}
