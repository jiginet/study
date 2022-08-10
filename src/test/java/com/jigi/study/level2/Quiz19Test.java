package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Quiz19Test {

    @Test
    @DisplayName("노드가 5개인 그래프 탐색")
    void solution() {
        Quiz19 quiz = new Quiz19();
        // 입력값 a, b, c : a, b는 노드, c는 a, b 노드간 거리(가중치)
        // 1, 2 노드 거리는 1
        // 2, 3 노드 거리는 3
        int[][] road = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
        assertThat(quiz.solution(5, road, 3)).isEqualTo(3);
        assertThat(quiz.solution(5, road, 4)).isEqualTo(4);
    }

    @Test
    @DisplayName("특정 노드간에 거리(가중치)가 2개 이상이 있는경우")
    void solution2() {
        Quiz19 quiz = new Quiz19();
        int[][] road = {{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}};
        assertThat(quiz.solution(6, road, 1)).isEqualTo(1);
        assertThat(quiz.solution(6, road, 2)).isEqualTo(2);
        assertThat(quiz.solution(6, road, 3)).isEqualTo(2);
        assertThat(quiz.solution(6, road, 4)).isEqualTo(3);
        assertThat(quiz.solution(6, road, 5)).isEqualTo(5);
    }

}
