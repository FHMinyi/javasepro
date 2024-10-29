package com.fhminyi.interface3;

/**
 * 打印学生信息和平均成绩
 *
 * 方案1
 * 打印出班级全部学生信息和全部学生的平均分
 *
 * 方案2
 * 打印全部学生信息（含男女人数）；打印平均分（去掉最高分和最低分）
 */
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("张三", '男', 90);
        students[1] = new Student("李四", '女', 80);
        students[2] = new Student("王五", '男', 70);
        students[3] = new Student("赵六", '女', 60);
        students[4] = new Student("钱七", '男', 50);
        students[5] = new Student("孙八", '女', 40);
        students[6] = new Student("周九", '男', 30);
        students[7] = new Student("吴十", '女', 20);
        students[8] = new Student("郑十一", '男', 10);
        students[9] = new Student("王十二", '女', 0);

        // 方案1
        ClassDataInter cdi = new ClassDataInter1(students);
        cdi.printAllSutudentInfo();
        cdi.printAverageScore();
        System.out.println();
        System.out.println("=========================================================");
        System.out.println();
        // 方案2
        ClassDataInter cdi2 = new ClassDataInter2(students);
        cdi2.printAllSutudentInfo();
        cdi2.printAverageScore();
    }

}
