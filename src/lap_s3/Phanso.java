package lap_s3;

import java.util.Scanner;

public class Phanso {
    int tuso;
    int mauso;
    int tuso2;
    int mauso2;
    int rutgontu;
    int rutgonmau;
    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    public int getTuso2() {
        return tuso2;
    }

    public void setTuso2(int tuso2) {
        this.tuso2 = tuso2;
    }

    public int getMauso2() {
        return mauso2;
    }

    public void setMauso2(int mauso2) {
        this.mauso2 = mauso2;
    }

    public int getTuso() {
        return tuso;
    }

    public void Nhapphanso(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap tu so: ");
        int tu= sc.nextInt();
        System.out.println("Moi ban nhap mau so: ");
        int mau=sc.nextInt();
        setTuso(tu);
        setMauso(mau);
        System.out.println("Moi ban nhap tu so thu 2: ");
        tuso2= sc.nextInt();
        System.out.println("Moi ban nhap mau so thu 2: ");
        mauso2=sc.nextInt();
        setTuso2(tuso2);
        setMauso2(mauso2);
    }


    public void Inraphanso(){
        System.out.println("Phan so cua ban la:"+tuso+"/"+mauso+" va "+tuso2+"/"+mauso2);
    }
    public void Rutgonphanso(int a,int b){
        for (int i=2;i<12;i++){
            if(a%i==0&&b%i==0){
                a/=i;
                b/=i;
                while (a%i==0&&b%i==0){
                    a/=i;
                    b/=i;
                }
            }
        }
        rutgontu=a;
        rutgonmau=b;
    }
    public void Nghichdao(){
        int luu,luu2;
        int tunghich1=tuso;
        int maunghich1=mauso;
        int tunghich2=tuso2;
        int maunghich2=mauso2;
        luu=tunghich1;
        tunghich1=maunghich1;
        maunghich1=luu;
        luu2=tunghich2;
        tunghich2=maunghich2;
        maunghich2=luu2;
        System.out.println("Phan so nghich dao cua ban la: "+tunghich1+"/"+maunghich1+" va "+tunghich2+"/"+maunghich2);
    }
    public void add(){
        int tuso1=this.tuso;
        int mauso1=this.mauso;
        int tongtu=(tuso1*mauso2)+(tuso2*mauso1);
        int tongmau=mauso1*mauso2;
        Rutgonphanso(tongtu,tongmau);
        System.out.println("Ket qua phep cong la:"+rutgontu+"/"+rutgonmau);

    }
    public void sub(){
        int tuso1=tuso;
        int mauso1=mauso;
        int tongtu=(tuso1*mauso2)-(tuso2*mauso1);
        int tongmau=mauso1*mauso2;
        Rutgonphanso(tongtu,tongmau);
        System.out.println("Ket qua phep tru la:"+rutgontu+"/"+rutgonmau);

    }
    public void mul(){
        int tuso1=tuso;
        int mauso1=mauso;
        int tongtu=tuso1*tuso2;
        int tongmau=mauso1*mauso2;
        Rutgonphanso(tongtu,tongmau);
        System.out.println("Ket qua phep nhan la:"+rutgontu+"/"+rutgonmau);

    }
    public void div(){
        int tuso1=tuso;
        int mauso1=mauso;
        int tongtu=tuso1*mauso2;
        int tongmau=mauso1*tuso2;
        Rutgonphanso(tongtu,tongmau);
        System.out.println("Ket qua phep chia la:"+rutgontu+"/"+rutgonmau);
    }
}
