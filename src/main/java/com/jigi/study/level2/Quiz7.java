package com.jigi.study.level2;

import java.math.BigInteger;

public class Quiz7 {
    public int solution(int n) {
        n = n - 1;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return b.divideAndRemainder(BigInteger.valueOf(1_234_567))[1].intValue();
    }
}
