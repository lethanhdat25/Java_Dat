package baitap_as1;

import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){
        Tamgiac tg=new Tamgiac();
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap canh thu nhat");
        tg.a=sc.nextFloat();
        System.out.println("Moi ban nhap canh thu nhat");
        tg.b=sc.nextFloat();
        System.out.println("Moi ban nhap canh thu nhat");
        tg.c=sc.nextFloat();
        if (tg.kiemtra()==true){
            System.out.println(tg.a+" "+tg.b+" "+tg.c+" la 3 canh cua tam giac");
            tg.inramanhinh();
        }
        else System.out.println(tg.a+" "+tg.b+" "+tg.c+" khong phai la 3 canh cua tam giac");
    }
}
