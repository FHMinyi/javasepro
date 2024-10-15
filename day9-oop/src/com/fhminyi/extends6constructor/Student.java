package com.fhminyi.extends6constructor;

public class Student extends People{
    private int age;
    private String schoolName;
    //super和this都在构造器的第一行，且不能同时出
    public Student(String name, char sex, int age, String schoolName) {
        super(name, sex);
        this.age = age;
        this.schoolName = schoolName;
    }

    public Student(String name, char sex, int age) {
        this(name, sex, age, "计算机学院");
    }
    public Student()
    {

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", schoolName='" + schoolName + '\'' +
                "} " + super.toString();
    }
}
