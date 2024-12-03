package sixth.homework.first;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i+1);
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
