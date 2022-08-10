package com.jigi.study.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz3Test {

    @Test
    @DisplayName("피보나치 수를 구한 후, 1,234,567로 나눈 나머지를 저장한다. ")
    void solution1() {
        Quiz3 quiz3 = new Quiz3();
        assertThat(quiz3.solution(2)).isEqualTo(1);
        assertThat(quiz3.solution(3)).isEqualTo(2);
        assertThat(quiz3.solution(4)).isEqualTo(3);
        assertThat(quiz3.solution(5)).isEqualTo(5);
    }
}