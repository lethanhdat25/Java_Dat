package assignment.As7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList implements ISinhVien {
    ArrayList<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
    int luachon;

    public void luaChon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap lua chon: ");
        luachon = sc.nextInt();
    }

    public void menu() {
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit.");
    }

    @Override
    public void addStudent(int id, int age, String name, String address, float gpa) {
        for (SinhVien x :
                danhSachSinhVien) {
            if (x.name.equals(name)) return;
        }
        SinhVien sv = new SinhVien(id, age, name, address, gpa);
        danhSachSinhVien.add(sv);
    }


    @Override
    public void editStudent(int id) {
        for (SinhVien x :
                danhSachSinhVien) {
            if (x.id == id) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Moi ban nhap ten moi:");
                x.setName(sc.nextLine());
                System.out.println("Moi ban nhap tuoi: ");
                x.setAge(sc.nextInt());
                System.out.println("Moi ban nhap dia chi:");
                x.setAddress(sc.next());
                System.out.println("Moi ban nhap gpa:");
                x.setGpa(sc.nextFloat());
            }
        }
    }

    @Override
    public void deleteStudent(String name) {
        for (SinhVien x :
                danhSachSinhVien) {
            if (x.Students.contains(name)) {
                x.Students.remove(name);
                danhSachSinhVien.remove(name);
                return;
            }
        }
    }

    @Override
    public void sortStudentGpa() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.gpa - o2.gpa);
            }
        });
    }

    @Override
    public void sortStudentName() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o2.name.compareTo(o1.name);
            }
        });
    }

    @Override
    public void showStudent() {
        for (SinhVien x :
                danhSachSinhVien) {
            System.out.println(x.name + " - " + x.id + " - " + x.age + " - " + x.address + " - " + x.gpa);
        }
    }
}
