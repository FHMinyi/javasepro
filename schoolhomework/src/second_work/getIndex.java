package second_work;

import java.util.Scanner;

public class getIndex {
    public static int getMaxIndex(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int getMinIndex(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums;
        nums = new int[10];
        System.out.println("请输入10个数字");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        int minIndex = getMinIndex(nums);
        int maxIndex = getMaxIndex(nums);
        System.out.println("最小元素下标是："+minIndex);
        System.out.println("最大元素下标是："+maxIndex);
    }
}
