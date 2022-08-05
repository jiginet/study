package com.jigi.study.level2;

/**
 * 연속된 자연수의 합계
 */
public class Quiz11 {

    public int solution(int n) {
        int answer = 1;
        int start = (int) Math.ceil((float) n / 2);
        for (int i = start; i > 1; i--) {
            if (isAvailableNumber(i, n)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isAvailableNumber(int number, int goalNumber) {
        if (sumNumber(number, goalNumber) == goalNumber) {
            return true;
        }
        return false;
    }

    private int sumNumber(int number, int goalNumber) {
        int result = 0;
        for (int i = number; i > 0; i--) {
            result += i;
            if (result >= goalNumber) {
                return result;
            }
        }
        return result;
    }

}
