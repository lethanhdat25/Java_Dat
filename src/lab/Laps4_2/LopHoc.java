package lab.Laps4_2;

import java.util.ArrayList;

public class LopHoc {
    String malop,tenlop;
    int phonghoc;
    ArrayList<SinhVien> students;
    public LopHoc(){
        students=new ArrayList<SinhVien>();
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(int phonghoc) {
        this.phonghoc = phonghoc;
    }

    public ArrayList<SinhVien> getStudents() {
        return students;
    }

    public void themSv(SinhVien  sv){
         students.add(sv);
    }
    public void xoaSv(SinhVien  sv){
        students.remove(sv);
    }
    public void inra(){
        System.out.print("SV : ");
        for (SinhVien x:students) {
            System.out.print( x.hoten+",");
        }
    }
}
