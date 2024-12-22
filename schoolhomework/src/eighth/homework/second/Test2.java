package eighth.homework.second;

public class Test2 {
    public static void main(String[] args) {
        Account account = new Account("User1", 1000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (account) {
                    account.deposit(100);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "存款线程");

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (account) {
                    account.withdraw(150);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "取款线程");

        depositThread.start();
        withdrawThread.start();
    }
}
