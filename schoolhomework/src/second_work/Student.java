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
}
