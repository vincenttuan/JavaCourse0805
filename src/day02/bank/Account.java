package day02.bank;

public class Account {
    // 銀行
    private static String bankName;
    // 餘額
    private int balance;

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        Account.bankName = bankName;
    }

    public int getBalance(int password) {
        if(password == 1234){
            return balance;
        } else {
            return 0;
        }
        
        // return (password == 1234)?balance:0;
    }

    public void setBalance(int balance) {
        if((this.balance + balance) >= 0) {
            this.balance += balance;
        }
    }

    
    
    
}
