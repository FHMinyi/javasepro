package second_work;

public class Test_MyDate {
    public static void print(MyDate d) {
        System.out.println(d.getYear()+"/"+d.getMonth()+"/"+d.getDay());
    }
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(2024,10,1);
        date1.yearSetter(2024);
        date1.monthSetter(9);
        date1.daySetter(29);
        System.out.print("date1:");
        print(date1);
        System.out.print("date2:");
        print(date2);
    }
}
