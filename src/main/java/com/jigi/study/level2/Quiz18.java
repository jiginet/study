package com.jigi.study.level2;

/**
 * 2차원 배열을 1차원 배열로 쪼개기
 */
public class Quiz18 {

    public int[] solution(int n, long left, long right) {

        final int size = (int) (right - left + 1);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            long row = left / n;
            long col = left % n;
            left++;

            if (row == col || row > col) {
                if (row == n - 1) {
                    answer[i] = n;
                    continue;
                }
                answer[i] = (int) (row + 1);
                continue;
            }
            answer[i] = (int) (col + 1);
        }

        return answer;
    }

}
