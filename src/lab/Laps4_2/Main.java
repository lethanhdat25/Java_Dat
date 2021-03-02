package lab.Laps4_2;

public class Main {
    public static void main(String[] args){
        SinhVien sv=new SinhVien();
        sv.setHoten("a1");
        sv.setSdt("01");
        sv.setDiachi("nghe an");
        SinhVien sv2=new SinhVien();
        sv2.setHoten("a2");
        sv2.setSdt("02");
        sv2.setDiachi("nghe an");
        SinhVien sv3=new SinhVien();
        sv3.setHoten("a3");
        sv3.setSdt("03");
        sv3.setDiachi("nghe an");

        LopHoc lh=new LopHoc();
        lh.themSv(sv);
        lh.themSv(sv2);
        lh.themSv(sv3);
        lh.inra();
    }

}
