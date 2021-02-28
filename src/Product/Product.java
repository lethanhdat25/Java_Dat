package Product;

public class Product {
    public int id,qty;
    public String productName;
    public double price;
    public Product(){
        this.id=1;
        this.qty=10;
        this.productName="ao";
        this.price=22.330;
    }
    public boolean check(int a){
        return a>0?true:false;
    }
}
