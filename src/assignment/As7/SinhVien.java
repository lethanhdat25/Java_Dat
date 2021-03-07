package assignment.As7;

import java.util.ArrayList;

public class SinhVien {
    int id,age;
    String name,address;
    float gpa;
    ArrayList<String> Students=new ArrayList<String>();

    public SinhVien() {
    }

    public SinhVien(String name, int id) {
        this.name = name;
    }

    public SinhVien(int id, int age, String name, String address, float gpa) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
}
