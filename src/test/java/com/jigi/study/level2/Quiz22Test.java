package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Quiz22Test {


    @Test
    @DisplayName("* > + > - 순으로 계산시 가장 큰 절대값을 얻는다.")
    void negative() {
        Quiz22 quiz = new Quiz22();
        assertThat(quiz.solution("100-200*300-500+20")).isEqualTo(60420);

    }

    @Test
    @DisplayName("- > * 순으로 계산 시 가장 큰 절대값을 얻는다.")
    void test() {
        Quiz22 quiz = new Quiz22();
        assertThat(quiz.solution("50*6-3*2")).isEqualTo(300);

    }
}
