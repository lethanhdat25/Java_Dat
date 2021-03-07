package assignment.As2_Cart;

import Product.Product;

public class Main {
    public static void main(String[] args){
        Cart cart=new Cart();
        Product pr=new Product();
        cart.add(pr.productName);
        System.out.println(cart.productList.get(0));
        cart.remove("ao1");
        cart.setGrandTotal(2000);
        cart.city="HC";
        System.out.println(cart.grandTotal());
    }
}
