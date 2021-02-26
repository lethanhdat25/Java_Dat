package Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Product pr=new Product();
        if(pr.check(pr.qty)) System.out.println("San pham con hang");
        else System.out.println("San pham da het hang");
    }
}
