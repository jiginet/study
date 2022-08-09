package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz16Test {

    @Test
    void solution() {
        Quiz16 quiz = new Quiz16();

        int[] answer1 = {1, 2, 9, 3, 10, 8, 4, 5, 6, 7};
        assertThat(quiz.solution(4)).isEqualTo(answer1);

        int[] answer2 = {1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9};
        assertThat(quiz.solution(5)).isEqualTo(answer2);

        int[] answer3 = {1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11};
        assertThat(quiz.solution(6)).isEqualTo(answer3);
    }
}
