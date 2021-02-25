package laps3_Room;


import java.util.ArrayList;

public class Room {
        String Tenphong;
        int vitri;

    public String getTenphong() {
        return Tenphong;
    }

    public void setTenphong(String tenphong) {
        Tenphong = tenphong;
    }

    public int getVitri() {
        return vitri;
    }

    public void setVitri(int vitri) {
        this.vitri = vitri;
    }

    ArrayList<String> users=new ArrayList<String>();
        public void addUser(String u){
            users.add(u);
            for (String x:users) {
                System.out.println(x);

            }
        }
}
