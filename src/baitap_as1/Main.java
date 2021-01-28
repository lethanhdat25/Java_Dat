package baitap_as1;

public class Main {
    public static  void  main(String[] args){
        Tamgiac tg=new Tamgiac();
        tg.a=4;
        tg.b=5;
        tg.c=6;
        if (tg.kiemtra()==true){
            System.out.println(tg.a+" "+tg.b+" "+tg.c+" la 3 canh cua tam giac");
            tg.inramanhinh();
        }
        else System.out.println(tg.a+" "+tg.b+" "+tg.c+" khong phai la 3 canh cua tam giac");
    }
}
