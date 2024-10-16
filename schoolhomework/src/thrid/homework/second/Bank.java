package thrid.homework.second;

public class Bank {
    private int year;
    private double balance;//余额
    private double yearInterestRate = 0.035;//年利率

    public Bank(int year, double balance) {
        this.year = year;
        this.balance = balance;
//        this.yearInterestRate = 0.035;
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    public Bank() {}

    public double  computeInterest() {
        return balance * yearInterestRate * year;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getYearInterestRate() {
        return yearInterestRate;
    }

    public void setYearInterestRate(double yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
    }
}
