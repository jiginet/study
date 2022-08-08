package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz15Test {

    @Test
    void solution() {
        Quiz15 quiz = new Quiz15();
        assertThat(quiz.solution("baabaa")).isEqualTo(1);
        assertThat(quiz.solution("cdcd")).isEqualTo(0);
        assertThat(quiz.solution("cddcaacc")).isEqualTo(1);
    }
}
