package lab.Labs6;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> number=new ArrayList<String>();

    public PhoneNumber(String name, String phone) {
        this.name=name;
        addPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getNumber() {
        return number;
    }
    public void addPhone(String a){
        number.add(a);
    }
}
