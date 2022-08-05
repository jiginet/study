package com.jigi.study.level2;

public class Quiz10 {

    // 쿼드압축 후 개수 세기
    public int[] solution(int[][] arr) {
        return executeQuad(0, 0, arr, arr.length);
    }

    private int[] executeQuad(int x, int y, final int[][] arr, final int size) {
        if (isAllSameNumber(x, y, arr, size)) {
            if (arr[x][y] == 1) {
                return new int[]{0, 1};
            }
            return new int[]{1, 0};
        }

        final int halfSize = size / 2;
        int[] leftTopResult = executeQuad(x, y, arr, halfSize);
        int[] rightTopResult = executeQuad(x, y + halfSize, arr, halfSize);
        int[] leftDownResult = executeQuad(x + halfSize, y, arr, halfSize);
        int[] rightDownResult = executeQuad(x + halfSize, y + halfSize, arr, halfSize);
        final int zeroCount = leftTopResult[0] + rightTopResult[0] + leftDownResult[0] + rightDownResult[0];
        final int oneCount = leftTopResult[1] + rightTopResult[1] + leftDownResult[1] + rightDownResult[1];
        return new int[]{zeroCount, oneCount};
    }

    private boolean isAllSameNumber(int x, int y, int[][] arr, int size) {
        final int firstNumber = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != firstNumber) {
                    return false;
                }
            }
        }
        return true;
    }
}
