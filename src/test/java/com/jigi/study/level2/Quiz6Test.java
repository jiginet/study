package com.jigi.study.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Quiz6Test {

    @Test
    void test1() {
        Quiz6 quiz = new Quiz6();
        Assertions.assertThat(quiz.solution(1)).isEqualTo(1);
        Assertions.assertThat(quiz.solution(2)).isEqualTo(2);
        Assertions.assertThat(quiz.solution(3)).isEqualTo(3);
        Assertions.assertThat(quiz.solution(4)).isEqualTo(5);
        Assertions.assertThat(quiz.solution(5)).isEqualTo(8);
        Assertions.assertThat(quiz.solution(100)).isEqualTo(782204094);
        Assertions.assertThat(quiz.solution(100000)).isEqualTo(967618232);
    }
}