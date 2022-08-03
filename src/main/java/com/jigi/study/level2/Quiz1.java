package com.jigi.study.level2;

public class Quiz1 {
    public int solution(int [][]board)
    {

        final int row = board.length;
        final int col = board[0].length;
//        final int greaterNum = findGreaterNum(row, col);

        int answer = 0;
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!isOne(board[i][j])) {
                    continue;
                }

                if (col-1 == j) {

                }

                if (!isOne(board[i][j])) {
                    continue;
                }
            }
        }

        return 9;
    }

    private boolean isOne(int val) {
        return val == 1;
    }

    private int findGreaterNum(int row, int col) {
        return row >= col ? row : col;
    }
}
