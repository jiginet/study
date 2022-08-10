package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Quiz20Test {

    @Test
    @DisplayName("3보다 작은 수")
    void predefined() {
        Quiz20 quiz = new Quiz20();
        assertThat(quiz.solution(1)).isEqualTo(1);
        assertThat(quiz.solution(2)).isEqualTo(2);
    }

    @Test
    @DisplayName("3이상인 수")
    void solution2() {
        Quiz20 quiz = new Quiz20();
        assertThat(quiz.solution(3)).isEqualTo(3);
        assertThat(quiz.solution(4)).isEqualTo(5);
        assertThat(quiz.solution(5)).isEqualTo(8);
    }

    @Test
    @DisplayName("서로다른 배열의 값이 순서와 값 모두 같으면, 같은 배열이다.")
    void arrayEquals() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertThat(Arrays.equals(a, b)).isTrue();
    }
}
