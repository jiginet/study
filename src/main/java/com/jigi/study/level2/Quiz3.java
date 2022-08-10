package com.jigi.study.level2;

import java.math.BigInteger;

/**
 * 피보나치 수
 */
public class Quiz3 {

    public int solution(int n) {
        BigInteger[] results = new BigInteger[n + 1];
        BigInteger result = getFibonacciNumber(n, results);
        return result.divideAndRemainder(BigInteger.valueOf(1_234_567))[1].intValue();
    }

    private BigInteger getFibonacciNumber(int n, BigInteger[] results) {
        if (results[n] != null) {
            return results[n];
        }
        if (n <= 2) {
            results[n] = BigInteger.ONE;
            return BigInteger.ONE;
        }
        results[n] = getFibonacciNumber(n - 1, results).add(getFibonacciNumber(n - 2, results));
        return results[n];
    }
}
