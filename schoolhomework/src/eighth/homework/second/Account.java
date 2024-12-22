package eighth.homework.second;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
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

    // 存钱方法
    public void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " 存入 " + amount + ", 当前余额: " + balance);
    }

    // 取钱方法
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " 取出 " + amount + ", 当前余额: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " 取钱失败，余额不足: " + balance);
        }
    }
}
