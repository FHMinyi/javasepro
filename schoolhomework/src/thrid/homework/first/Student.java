package thrid.homework.first;

public class Student extends Person{
    private String studentID;
    private String department;
    private int grade;

    public Student(String department, int grade, String studentID) {
        this.department = department;
        this.grade = grade;
        this.studentID = studentID;
    }

    public Student(int age, String id, String name, String sex, String department, int grade, String studentID) {
        super(age, id, name, sex);
        this.department = department;
        this.grade = grade;
        this.studentID = studentID;
    }

    public Student() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "department='" + department + '\'' +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                "} " + super.toString();
    }
}
