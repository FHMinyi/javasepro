package thrid.homework.second;

import java.math.BigDecimal;

public class BankOfChina extends Bank{
    private double year;
    private double dayInterestRate = 0.00012;//日利率
    private  double interest;//利息

    public BankOfChina(double balance, double year) {
        super(balance);
        this.year = year;
        computeInterest();
    }

    @Override
    public double computeInterest() {
        int days = getDays(year);
//        System.out.println("days:"+days);
        super.setYear((int) this.year);
        interest = super.computeInterest() + (days * dayInterestRate * super.getBalance());
        BigDecimal gi = new BigDecimal(interest);
        gi = gi.setScale(2, BigDecimal.ROUND_HALF_UP);
        interest = gi.doubleValue();
        return interest;
    }

    private int getDays(double year) {
        String tmpYear = Double.toString(year);
        String tmp =  (tmpYear.substring(tmpYear.indexOf(".") + 1, tmpYear.length()));
        return Integer.parseInt(tmp);
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return super.getBalance() + "元存在中国银行" +
                super.getYear() + "年零" +
                getDays(year) + "天的利息为：" + String.format("%.2f", interest) + "元";
    }
}
