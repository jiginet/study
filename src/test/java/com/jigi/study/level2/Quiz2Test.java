package com.jigi.study.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz2Test {

    @Test
    void solution1() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{3, 0, 6, 1, 5});
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void solution2() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{1, 2, 3, 4, 5});
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void solution3() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{3, 3});
        assertThat(answer).isEqualTo(2);
    }

    @Test
    void solution4() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{3, 3, 4});
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void solution5() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{1});
        assertThat(answer).isEqualTo(1);
    }

    @Test
    void solution6() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{5, 1});
        assertThat(answer).isEqualTo(1);
    }

    @Test
    void solution7() {
        Quiz2 quiz2 = new Quiz2();
        int answer = quiz2.solution(new int[]{1, 5, 1});
        assertThat(answer).isEqualTo(1);
    }
}