package com.jigi.study.level2;

import java.math.BigInteger;

public class Quiz6 {
    public int solution(int n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return b.divideAndRemainder(BigInteger.valueOf(1_000_000_007))[1].intValue();
    }
}
