package LAB7.zad2;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount){
        if((balance -= amount) < 0){ throw new InsufficientFundsException();}
        else{ balance-=amount; }
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
