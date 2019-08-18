package cn.ttw.kh;

import java.math.BigDecimal;
import java.math.BigInteger;

public class t {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("9999999");
        String s = b1.divide(b2, 15, BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(s);
    }

}
