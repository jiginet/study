package com.jigi.study.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class quiz1Test {

    @Test
    void solution1() {
        Quiz1 quiz1 = new Quiz1();
        int answer = quiz1.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        assertThat(answer).isEqualTo(9);
    }

    @Test
    void solution2() {
        Quiz1 quiz1 = new Quiz1();
        int answer = quiz1.solution(new int[][]{{0,0,1,1},{1,1,1,1}});
        assertThat(answer).isEqualTo(4);
    }

    @Test
    void solution3() {
        Quiz1 quiz1 = new Quiz1();
        int answer = quiz1.solution(new int[][]{{0,0,0,1},{0,0,0,0}});
        assertThat(answer).isEqualTo(1);
    }

    @Test
    void solution4() {
        Quiz1 quiz1 = new Quiz1();
        int answer = quiz1.solution(new int[][]{{1},{1}});
        assertThat(answer).isEqualTo(1);
    }
}
