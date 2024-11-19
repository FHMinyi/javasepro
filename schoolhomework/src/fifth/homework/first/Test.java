package fifth.homework.first;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 1};

        try {
            System.out.println(a[3]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Index out of bounds");
        } finally {
            assert System.out != null;
            System.out.println("Done!");
        }

    }
}
