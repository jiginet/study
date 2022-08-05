package com.jigi.study.level2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 진법 변환 후 소수 개수 확인
 */
public class Quiz12 {

    public int solution(int n, int k) {
        String strings = Integer.toString(n, k);
        Pattern pattern = Pattern.compile("0?[^0]+0?");
        Matcher matcher = pattern.matcher(strings);

        int answer = 0;
        while (matcher.find()) {
            String group = matcher.group().replaceAll("0", "");
            if (isPrime(Long.parseLong(group))) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isPrime(long n) {
        if (n == 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
