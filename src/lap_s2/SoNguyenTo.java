package lap_s2;

public class SoNguyenTo {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int d) {
        if(isSoNguyenTo(d)){
            this.a = d;
        }
        else {
            System.out.println("khong set");
        }
    }

    public boolean isSoNguyenTo(int z) {
        if (z == 2 || z == 3 || z == 5 || z == 7 || z == 11) return true;
        else {
            for (int i = 2; i < z; i++) {
                if (z % i == 0) return false;
            }
             return true;
        }
    }
    public int timSoNguyenToTiepTheo(){
        for(int i=a+1;true;i++){
            if(isSoNguyenTo(i)){
                return i;
            }
        }
    }

}
