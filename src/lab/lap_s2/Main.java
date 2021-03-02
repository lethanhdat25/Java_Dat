package lab.lap_s2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SoNguyenTo snt=new SoNguyenTo();
        System.out.println("Moi ban nhap vao mot so bat ky: ");
        int x=sc.nextInt();
        snt.setA(x);
        if(snt.isSoNguyenTo(x)) System.out.println(x+" la so nguyen to");
        else System.out.println(x+" khong phai la so nguyen to");
        System.out.println("So nguyen to tiep theo la: "+snt.timSoNguyenToTiepTheo());
    }
}
