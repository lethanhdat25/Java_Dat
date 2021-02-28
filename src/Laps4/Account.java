package Laps4;

public class Account {
    int id;
    String name;
    double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Account(){

    }

    public void credit(int amount){
        if(amount>0) {
            setBalance(getBalance() + amount);
            return;
        }System.out.println("Nap tien that bai.");
    }


    public void debit(int amount){
        if(amount<=getBalance()){
            setBalance(getBalance()-amount);
            return;
        }System.out.println("Thanh toan khong thanh cong.");
    }

    public boolean tranferTo(Account account1,int tien){
        if(this.getBalance()>=tien){
            account1.credit(tien);
            this.debit(tien);
            return true;
        }else return false;
    }
}
