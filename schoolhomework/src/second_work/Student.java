package second_work;

public class Student {
    private String sID;
    private String sName;
    private String sGender;
    private int sScore;
    public Student(String sID, String sName, String sGender, int sScore) {
        this.sID = sID;
        this.sName = sName;
        this.sGender = sGender;
        this.sScore = sScore;
    }
    public Student() {}
    public String getsID() {
        return sID;
    }
    public String getsName() {
        return sName;
    }
    public String getsGender() {
        return sGender;
    }
    public int getsScore() {
        return sScore;
    }
    public void setsID(String sID) {
        this.sID = sID;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public void setsGender(String sGender) {
        this.sGender = sGender;
    }
    public void setsScore(int sScore) {
        this.sScore = sScore;
    }
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
