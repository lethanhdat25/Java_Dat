package assignment.As7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StudentList stl=new StudentList();
        Scanner sc=new Scanner(System.in);
        SinhVien sv=new SinhVien();

        stl.menu();
        stl.luaChon();

        switch (stl.luachon){
            case 1:
                System.out.println("Moi ban nhap ten sinh vien muon them vao");
                String ten=sc.nextLine();
                System.out.println("Moi ban nhap id cua sinh vien "+ten);
                int id=sc.nextInt();
                System.out.println("Moi ban nhap tuoi cua sinh vien "+ten);
                int age=sc.nextInt();
                System.out.println("Moi ban nhap dia chi cua sinh vien "+ten);
                sc.next();
                String diachi=sc.nextLine();
                System.out.println("Moi ban nhap gpa cua sinh vien "+ten);
                float gpa=sc.nextFloat();
                stl.addStudent(id,age,ten,diachi,gpa);
                stl.showStudent();
                break;
            case 3:
                System.out.println("Moi ban nhap ten sinh vien muon them xoa");
                stl.deleteStudent(sc.nextLine());
                stl.menu();
                stl.luaChon();
                break;
            case 0:
        }
        stl.sortStudentName();
    }
}
