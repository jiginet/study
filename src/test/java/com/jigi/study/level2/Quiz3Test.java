package com.jigi.study.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz3Test {

    @Test
    void solution1() {
        // 이문제 못풀었어 ㅠㅠ
        Quiz3 quiz3 = new Quiz3();
//        assertThat(quiz3.solution(2)).isEqualTo(3);
//        assertThat(quiz3.solution(4)).isEqualTo(11);
        assertThat(quiz3.solution(6)).isEqualTo(14);
        assertThat(quiz3.solution(8)).isEqualTo(22);
        assertThat(quiz3.solution(10)).isEqualTo(25);
        assertThat(quiz3.solution(12)).isEqualTo(33);
        assertThat(quiz3.solution(14)).isEqualTo(36);
    }



}