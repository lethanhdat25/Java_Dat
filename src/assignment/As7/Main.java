package assignment.As7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StudentList stl=new StudentList();
        Scanner sc=new Scanner(System.in);
        SinhVien sv=new SinhVien();
        boolean run=true;
        do {
            stl.menu();
            stl.luaChon();
            switch (stl.luachon){
                case 1:
                    System.out.println("Moi ban nhap ten sinh vien muon them vao");
                    String ten=sc.next();
                    System.out.println("Moi ban nhap id cua sinh vien "+ten);
                    int id=sc.nextInt();
                    System.out.println("Moi ban nhap tuoi cua sinh vien "+ten);
                    int age=sc.nextInt();
                    System.out.println("Moi ban nhap dia chi cua sinh vien "+ten);
                    String diachi=sc.next();
                    System.out.println("Moi ban nhap gpa cua sinh vien "+ten);
                    float gpa=sc.nextFloat();
                    stl.addStudent(id,age,ten,diachi,gpa);
                    break;
                case 2:
                    System.out.println("Moi ban nhap id muon thay the");
                    stl.editStudent(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Moi ban nhap ten sinh vien muon them xoa");
                    stl.deleteStudent(sc.nextLine());
                    stl.menu();
                    stl.luaChon();
                    break;
                case 5:
                    stl.sortStudentName();
                    break;
                case 6:
                    stl.showStudent();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Ban da nhap sai");

            }

        }while (run);

        stl.sortStudentName();
    }
}
