package baitap_as1;
public class Tamgiac {
    float a;
    float b;
    float c;
    boolean kiemtra(){
        if(Math.abs(b-c)<a&&a<(b+c)||Math.abs(a-c)<b&&b<(a+c)||Math.abs(b-a)<c&&c<(b+a)){
            return true;
        }
        else return false;
    }
    void inramanhinh(){
        chuvi();
        dientich();
    }
    void chuvi(){
        float chuvi;
        chuvi=a+b+c;
        System.out.println("Chu vi cua tam giac la "+chuvi);

    }
    void dientich(){
        double dientich;
        float p;
        p= (a+b+b)/2;
        dientich=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich cua tam giac la "+dientich);

    }
}
