package com.jigi.study.level3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.PriorityQueue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Challenge1Test {

    @Test
    @DisplayName("큐가 비어있으면 0, 0을 반환한다.")
    void emptyQueue() {
        Challenge1 challenge = new Challenge1();
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] answer = {0, 0};
        assertThat(challenge.solution(operations)).isEqualTo(answer);
    }

    @Test
    @DisplayName("큐가 비어 있지않으면 최댓값, 최솟값을 반환한다.")
    void notEmptyQueue() {
        Challenge1 challenge = new Challenge1();
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] answer = {333, -45};
        assertThat(challenge.solution(operations)).isEqualTo(answer);
    }

    @Test
    @DisplayName("우선순위 큐 학습")
    void priorityQueue() {

        // 작은 숫자가 우선순위가 높음
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 큰 숫자가 우선순위가 높음
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(3);   // queue.add(3); 처럼 사용가능(같은 기능 alias)
        queue.offer(4);
        queue.offer(1);
        queue.offer(2);

        // 우선 순위가 가장 높은 값 출력
        assertThat(queue.peek()).isEqualTo(1);

        // 우선 순위가 가장 높은 값 반환하고, 큐에서 값을 제거
        assertThat(queue.poll()).isEqualTo(1);
        assertThat(queue.poll()).isEqualTo(2);

        // 우선 순위가 가장 높은 값 반환하고, 큐에서 값을 제거(poll 과 같은 기능)
        assertThat(queue.remove()).isEqualTo(3);

        // 지정된 원소값을 제거, 제거할 수 있으면 true, 없으면 false 반환
        assertThat(queue.remove(4)).isEqualTo(true);

        // 큐가 비어있다면 null 반환
        assertThat(queue.poll()).isNull();
    }
}