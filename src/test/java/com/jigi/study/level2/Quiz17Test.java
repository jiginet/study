package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Quiz17Test {

    @Test
    void solution() {
        Quiz17 quiz = new Quiz17();
        assertThat(quiz.solution(1, 10)).isEqualTo(new int[]{0, 1, 1, 2, 1, 3, 1, 4, 3, 5});
    }

    @Test
    void bigRange() {
        Quiz17 quiz = new Quiz17();
        int[] answer = {500000, 9901, 500001, 1, 500002, 333335, 500003, 34483, 500004, 3413, 500005};
        assertThat(quiz.solution(1_000_000, 1_000_010)).isEqualTo(answer);
    }

    @Test
    void overRange() {
        Quiz17 quiz = new Quiz17();
        int[] answer = {0, 0};
        assertThat(quiz.solution(10_000_001, 10_000_002)).isEqualTo(answer);
    }
}