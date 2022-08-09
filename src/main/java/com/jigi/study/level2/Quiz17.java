package com.jigi.study.level2;

public class Quiz17 {

    /**
     * 블럭 이어 붙이기 : 몇 번째 블럭의 값인지 확인
     *
     * @param begin
     * @param end
     * @return
     */
    public int[] solution(long begin, long end) {
        int size = (int) (end - begin + 1);
        int[] answer = new int[size];
        int index = 0;
        for (long i = begin; i <= end; i++) {
            answer[index++] = getPrimeOrGcd(i);
        }
        return answer;
    }

    private int getPrimeOrGcd(long number) {
        if (number == 1 || number > 10_000_000) {
            return 0;
        }
        final int end = (int) Math.sqrt(number);
        int max = 1;
        boolean isPrime = true;
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                isPrime = false;
                if (i >= max) {
                    max = i;
                }
                if (number / i > max) {
                    max = (int) (number / i);
                }
                continue;
            }
        }
        return isPrime ? 1 : max;
    }
}
