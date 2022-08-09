package com.jigi.study.level2;

/**
 * 삼각달팽이
 */
public class Quiz16 {

    public int[] solution(int n) {

        int[][] array = new int[n][n];
        int[] addX = new int[]{1, 0, -1};
        int[] addY = new int[]{0, 1, -1};
        int sequence = 0;
        int turningPoint = 0;
        int x = -1;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                x = x + addX[turningPoint];
                y = y + addY[turningPoint];
                array[x][y] = ++sequence;
            }
            if (x == n) {
                x = x - 1;
            }
            if (y == n) {
                y = y - 1;
            }
            turningPoint = ++turningPoint % 3;
        }

        int answerSize = n * (n + 1) / 2;
        int[] answer = new int[answerSize];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = array[i][j];
            }
        }

        return answer;
    }
}
