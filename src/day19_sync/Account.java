package day19_sync;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    // 提款
    public synchronized void withdraw(int money) {
        String user = Thread.currentThread().getName();
        System.out.println(user + "想要提款 $" + money);
        
        // 現在的餘額是 ?
        int balance_now = getBalance();
        System.out.println("目前帳戶餘額 $" + balance_now);
        
        // 運作時間...
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        
        // 開始提款
        if(balance_now >= money) { // 提款成功
            System.out.println("提款成功");
            setBalance(balance_now - money); // 回存
        } else { // 提款失敗
            System.out.println("提款失敗");
        }
        
        // 列印交易清單
        System.out.println("最後帳戶餘額 $" + getBalance());
        
    }
    
    // 列印帳戶餘額
    public void print() {
        // ...
        System.out.println("列印帳戶餘額 $" + getBalance());
    }
    
    
}
