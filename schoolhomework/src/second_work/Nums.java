package second_work;

//import java.util.Scanner;

import static java.lang.System.exit;

public class Nums {
    public static boolean isMid(int[] a, int idx) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < idx; i++) {
            sum1 += a[i];
        }
        for (int i = idx + 1; i < a.length; i++) {
            sum2 += a[i];
        }
        if (sum1 == sum2) return true;
        return false;
    }
    public static void findMid(int[] a) {
        int idx = 0;
        printArray(a);
        do{
            if(isMid(a,idx)) {
                System.out.println(idx);
                return;
            }
            idx++;
        }while (idx < a.length);
        System.out.println(-1);
    }
    public static void printArray(int[] a) {
        System.out.print("数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("的中心下标为");
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[]{1,7,3,6,5,6}, nums2 = new int[]{1,2,3}, nums3 = new int[]{2,1,-1};
//        nums = new int[sc.nextInt()];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//            nums[i] = sc.nextInt();
//        }
//        int idx = 0;
//        do{
//            if(isMid(nums,idx)) {
//                System.out.println(idx);
//                exit(0);
//            }
//            idx++;
//        }while (idx < nums.length);
//        System.out.println(-1);
        findMid(nums1);
        findMid(nums2);
        findMid(nums3);
    }
}
