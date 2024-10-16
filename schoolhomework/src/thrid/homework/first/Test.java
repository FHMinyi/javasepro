package thrid.homework.first;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(18,"2311","张三","男","计算机",1,"1001");
        System.out.println(s2);
        s1.setAge(12);
        s1.setName("李四");
        s1.setSex("女");
        s1.setId("2310");
        s1.setStudentID("2001");
        s1.setDepartment("音乐与舞蹈");
        s1.setGrade(2);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());
        System.out.println(s1.getId());
        System.out.println(s1.getStudentID());
        System.out.println(s1.getDepartment());
        System.out.println(s1.getGrade());
        System.out.println(s1);
    }
}
