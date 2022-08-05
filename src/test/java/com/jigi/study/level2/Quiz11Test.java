package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz11Test {

    @Test
    void solution() {
        Quiz11 quiz = new Quiz11();
        assertThat(quiz.solution(15)).isEqualTo(4);
        assertThat(quiz.solution(1)).isEqualTo(1);
        assertThat(quiz.solution(2)).isEqualTo(1);
        assertThat(quiz.solution(3)).isEqualTo(2);
    }
}
