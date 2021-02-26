package As2_Cart;

public class Main {
    public static void main(String[] args){
        Cart cart=new Cart();
        cart.add("ao1");
        System.out.println(cart.productList.get(0));
        cart.remove("ao1");
        cart.setGrandTotal(2000);
        cart.city="HC";
        System.out.println(cart.grandTotal());

    }
}
