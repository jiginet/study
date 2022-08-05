package com.jigi.study.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Quiz9Text {

    @Test
    void solution() {
        Quiz9 quiz = new Quiz9();
        int[][] maps = {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 0, 1}};
        Assertions.assertThat(quiz.solution(maps)).isEqualTo(11);
    }

    @Test
    void solution2() {
        Quiz9 quiz = new Quiz9();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        Assertions.assertThat(quiz.solution(maps)).isEqualTo(-1);
    }
}
