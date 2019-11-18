package day19_sync;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println(account.getBalance());
        
        Withdraw w1 = new Withdraw(account, 4000);
        Withdraw w2 = new Withdraw(account, 5000);
        Withdraw w3 = new Withdraw(account, 3000);
        w1.setName("小明");
        w2.setName("小華");
        w3.setName("小英");
        w1.start();
        w2.start();
        w3.start();
        
    }
}
