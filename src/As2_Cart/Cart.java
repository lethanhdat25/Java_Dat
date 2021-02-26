package As2_Cart;

import java.util.ArrayList;

public class Cart {
    int id;
    String customer;
    double grandTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    ArrayList<String> productList;
    String city;
    public Cart(){
        productList=new ArrayList<String>();
    }
    public void add(String a){
        productList.add(a);
    }
    public void remove(String a){
        productList.remove(a);
    }
    public double grandTotal(){
       return grandTotal+= (city=="HN"||city=="HCM")? (((double) 1/100)*grandTotal): (((double) 2/100)*grandTotal);
    }
}
