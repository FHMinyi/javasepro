package second_work;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate() {}
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void yearSetter(int n) {
        year = n;
    }
    public void monthSetter(int n) {
        month = n;
    }
    public void daySetter(int n) {
        day = n;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
}
