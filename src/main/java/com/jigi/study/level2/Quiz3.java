package com.jigi.study.level2;

import java.math.BigInteger;

public class Quiz3 {
    public int solution(int n) {
        if (n == 2) {
            return 3;
        }
        if (n == 4) {
            return 11;
        }
        BigInteger a = BigInteger.valueOf(3);
        BigInteger b = BigInteger.valueOf(11);
        BigInteger d = BigInteger.valueOf(11);
        for (int i = 6; i <= n; i = i + 2) {
            BigInteger c;
            if (i % 4 == 0) {
                int div = i / 4;
                c = BigInteger.valueOf(div).multiply(d)  ;
            } else {
                c = a.add(b);
            }
            a = c;
            b = BigInteger.valueOf(3);
        }
        return b.divideAndRemainder(BigInteger.valueOf(1_000_000_007))[1].intValue();
    }
}
