package day19_sync;

public class Withdraw extends Thread {
    private Account account;
    private int money;

    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.withdraw(money);
    }
    
}
