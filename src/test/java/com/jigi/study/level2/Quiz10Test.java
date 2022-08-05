package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz10Test {

    @Test
    void solution1() {
        Quiz10 quiz = new Quiz10();
        int[][] arr = {
            {1, 1},
            {1, 0}
        };
        assertThat(quiz.solution(arr)).isEqualTo(new int[]{1, 3});
    }

    @Test
    void solution2() {
        Quiz10 quiz = new Quiz10();
        int[][] arr = {
            {1, 1, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 1},
            {1, 1, 1, 1}
        };
        assertThat(quiz.solution(arr)).isEqualTo(new int[]{4, 9});
    }

    @Test
    void solution3() {
        Quiz10 quiz = new Quiz10();
        int[][] arr = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 1, 1, 1},
            {0, 1, 0, 0, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 1, 1}
        };
        assertThat(quiz.solution(arr)).isEqualTo(new int[]{10, 15});
    }
}
