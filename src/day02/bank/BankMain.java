package day02.bank;

public class BankMain {
    public static void main(String[] args) {
        Account.setBankName("中國信託");
        
        Account acc1 = new Account();
        acc1.setBalance(10000);
        acc1.setBalance(10000);
        acc1.setBalance(-12000);
        acc1.setBalance(10000);
        
        Account acc2 = new Account();
        acc2.setBalance(20000);
        
        System.out.println(Account.getBankName());
        System.out.println(acc1.getBalance(1234));
        System.out.println(acc2.getBalance(1234));
        
    }
}
