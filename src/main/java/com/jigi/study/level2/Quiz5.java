package com.jigi.study.level2;

public class Quiz5 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;

        int[][] answer = new int[row1][col1];

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        int i = 0, j = 0, k = 0, l = 0;
        for (; i < row1; i++, l++) {
            k = 0;
            j = 0;
            for (; k < col2; j++, k++) {
                System.out.print("(i,j) = " + i + ", " + j);
                System.out.print(" (k,l) = " + k + ", " + l);
                System.out.println("");
            }
        }


        return answer;
    }
}
