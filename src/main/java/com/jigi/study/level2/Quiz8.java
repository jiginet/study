package com.jigi.study.level2;

public class Quiz8 {

    public static final int QUEEN = 1;
    public static final int NOT_ALLOW = -1;
    public static final int EMPTY = 0;
    private int[][] array;

    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int answer = 0;
        final int loopCount = (int) Math.ceil(n / 2);
        for (int i = 0; i < loopCount; i++) {
            if (isAvailable(n, 0, i)) {
                answer++;
            };
        }
        
        return answer * 2;
    }

    private boolean isAvailable(int n, int row, int col) {
        initArray(n);
        array[row][col] = QUEEN;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ( i == row || j == col) {
                    array[i][j] = NOT_ALLOW;
                    continue;
                }
            }
        }
        return false;
    }

    private void initArray(int n) {
        array = new int[n][n];
    }
}
