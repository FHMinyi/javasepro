package thrid.homework.second;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        double b = 10000;
        ConstructionBank cb = new ConstructionBank(b,8.236);
        BankOfChina bc = new BankOfChina(b,8.236);
        System.out.println(cb);
        System.out.println(bc);
        System.out.println("相差" + Math.abs(getInterest(cb.getInterest(), bc.getInterest())) + "元");
//        System.out.println(getInterest(cb.getInterest(), bc.getInterest()));
    }

    public static double getInterest(double a, double b) {
        return (new BigDecimal(a).subtract(new BigDecimal(b))).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
