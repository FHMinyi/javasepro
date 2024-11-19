package fifth.homework.second;

public class Test {
    public static void main(String[] args) {
        int a = 101;
        try {
            Score.scoreCheck(a);
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done!");
        }
    }
}
