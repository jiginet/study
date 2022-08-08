package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz13Test {


    @Test
    void solution() {
        Quiz13 quiz = new Quiz13();
        assertThat(quiz.solution("17")).isEqualTo(3);
        assertThat(quiz.solution("011")).isEqualTo(2);
    }
}
