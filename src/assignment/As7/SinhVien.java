package assignment.As7;

import java.util.ArrayList;

public class SinhVien {
    int id,age;
    String name,address;
    float gpa;
    ArrayList<String> Students=new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public SinhVien() {
    }

    public ArrayList<String> getStudents() {
        return Students;
    }

    public SinhVien(int id, int age, String name, String address, float gpa) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
}
