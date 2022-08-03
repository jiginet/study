package com.jigi.study.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Quiz5Test {

    @Test
    void test1() {
        // todo : 여기 문제 다시 풀기 : 행렬 곱셈 문제
        Quiz5 quiz = new Quiz5();
        int[][] arr1 = {
                {1, 4},  // 0,0
                {3, 2},
                {4, 1}
        };
        int[][] arr2 = {
                {3, 3},
                {3, 3}
        };
        int[][] answer = {
                {15, 15},
                {15, 15},
                {15, 15}
        };
        Assertions.assertThat(quiz.solution(arr1, arr2)).isEqualTo(answer);
    }

    @Test
    void test2() {
        Quiz5 quiz = new Quiz5();
        int[][] arr1 = {
                {2, 3, 2},
                {4, 2, 4},
                {3, 1, 4}
        };
        int[][] arr2 = {
                {5, 4, 3},
                {2, 4, 1},
                {3, 1, 1}
        };
        int[][] answer = {
                {22, 22, 11},
                {36, 28, 18},
                {29, 20, 14}
        };
        Assertions.assertThat(quiz.solution(arr1, arr2)).isEqualTo(answer);
    }
}