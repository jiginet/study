package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz8Test {

    @Test
    void solution() {
        Quiz8 quiz = new Quiz8();
        assertThat(quiz.solution(4)).isEqualTo(2);
    }

    @Test
    void solution2() {
        Quiz8 quiz = new Quiz8();
        assertThat(quiz.solution(1)).isEqualTo(1);
    }

    @Test
    void solution3() {
        Quiz8 quiz = new Quiz8();
        assertThat(quiz.solution(2)).isEqualTo(0);
    }

    @Test
    void solution4() {
        Quiz8 quiz = new Quiz8();
        assertThat(quiz.solution(3)).isEqualTo(0);
    }

    @Test
    void ceil() {
        System.out.println("ceil = " + (int) Math.ceil(1.1));
    }
}
