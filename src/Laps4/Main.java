package Laps4;

public class Main {
    public static void main(String[] args){
        Account ac1=new Account();
        ac1.setId(1);
        ac1.setName("a");
        ac1.setBalance(20000);
        Account ac2=new Account();
        ac2.setId(1);
        ac2.setName("a");
        ac2.setBalance(10000);
        if (ac1.tranferTo(ac2,50000)) {
            System.out.println("So du tai khoan 1  la: " + ac1.getBalance());
            System.out.println("So du tai khoan 2  la: " + ac2.getBalance());
        }
        else System.out.println("lỗi chuyển tiền không thành công");
    }
}
