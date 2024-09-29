package second_work;

public class studentTest {
    public static void print(Student s) {
        System.out.println(s.getsID() + " " + s.getsName() + " " + s.getsGender() + " " + s.getsScore());
    }
    public static void prints(Student[] s) {
        for (Student student : s) {
            print(student);
        }
    }
    public static int arrMin(Student[] s) {
        int min = s[0].getsScore();
        for (int i = 1; i < s.length; i++) {
            if (s[i].getsScore() < min) {
                min = s[i].getsScore();
            }
        }
        return min;
    }
    public static int arrMax(Student[] s) {
        int max = s[0].getsScore();
        for (int i = 1; i < s.length; i++) {
            if (s[i].getsScore() > max) {
                max = s[i].getsScore();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student();
        s[0].setsID("A1001");
        s[0].setsName("郑一");
        s[0].setsGender("女");
        s[0].setsScore(89);
        s[1] = new Student("A1002","张三","男",20);
        s[2] = new Student("A1003","李四","女",30);
        s[3] = new Student("A1004","王五","男",50);
        s[4] = new Student("A1005","赵六","女",80);
        prints(s);
        System.out.println("最大成绩是：" + arrMax(s));
        System.out.println("最小成绩是：" + arrMin(s));

    }
}
