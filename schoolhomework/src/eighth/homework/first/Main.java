package eighth.homework.first;

public class Main {
    public static void main(String[] args) {
        // 输出名字
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("name");
            }
        });

        // 输出学号
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("231110038");
            }
        });


        thread1.start();
        thread2.start();
    }
}
