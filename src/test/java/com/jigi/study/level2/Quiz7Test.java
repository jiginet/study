package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz7Test {

    @Test
    void solution() {
        Quiz7 quiz = new Quiz7();
        assertThat(quiz.solution(2)).isEqualTo(1);
        assertThat(quiz.solution(3)).isEqualTo(2);
        assertThat(quiz.solution(5)).isEqualTo(5);
    }
}
