package lab.lap_s3;

public class Main {
    public static void main(String[] args){
        Phanso ps=new Phanso();
        ps.Nhapphanso();
        ps.Inraphanso();
        ps.Rutgonphanso(ps.getTuso(), ps.getMauso());
        ps.Rutgonphanso(ps.getTuso2(), ps.getMauso2());
        ps.Nghichdao();
        ps.add();
        ps.sub();
        ps.mul();
        ps.div();
    }
}
