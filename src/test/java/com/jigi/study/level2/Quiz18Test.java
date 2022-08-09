package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz18Test {

    @Test
    void three() {
        Quiz18 quiz = new Quiz18();
        int[] answer = {3, 2, 2, 3};
        assertThat(quiz.solution(3, 2, 5)).isEqualTo(answer);
    }

    @Test
    void four() {
        Quiz18 quiz = new Quiz18();
        int[] answer = {4, 3, 3, 3, 4, 4, 4, 4};
        assertThat(quiz.solution(4, 7, 14)).isEqualTo(answer);
    }

    @Test
    void one() {
        Quiz18 quiz = new Quiz18();
        int[] answer = {1};
        assertThat(quiz.solution(1, 0, 0)).isEqualTo(answer);
    }

    @Test
    void bigNumber() {
        Quiz18 quiz = new Quiz18();
        int[] answer = {1, 2, 3, 4, 5, 6};
        assertThat(quiz.solution(10_000_000, 0, 5)).isEqualTo(answer);
    }
}
