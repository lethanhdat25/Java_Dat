package lab.Labs6;

public abstract class Phone {
    String phone;
    String name;
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newphone);
    abstract void searchPhone(String name);
    abstract void sort();

}
