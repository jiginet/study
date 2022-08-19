package com.jigi.study.level3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map.Entry;
import java.util.TreeMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Challenge1StepUpTest {

    @Test
    @DisplayName("큐가 비어있으면 0, 0을 반환한다.")
    void emptyQueue() {
        Challenge1StepUp challenge = new Challenge1StepUp();
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] answer = {0, 0};
        assertThat(challenge.solution(operations)).isEqualTo(answer);
    }

    @Test
    @DisplayName("큐가 비어 있지않으면 최댓값, 최솟값을 반환한다.")
    void notEmptyQueue() {
        Challenge1StepUp challenge = new Challenge1StepUp();
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] answer = {333, -45};
        assertThat(challenge.solution(operations)).isEqualTo(answer);
    }

    @Test
    @DisplayName("TreeMap 학습")
    void priorityQueue() {

        // 최솟값은 왼쪽 노드로, 최댓값은 오른쪽 노드로 정렬된다.
        TreeMap<Integer, String> tree = new TreeMap<>();

        // 최솟값은 오른쪽 노드로, 최솟값은 왼쪽 노드로 정렬된다.
        // TreeMap<Integer, String> reversTree = new TreeMap<>(Comparator.reverseOrder());

        // 데이터 입력 key, value 형태
        tree.put(2, "b");
        tree.put(1, "a");
        tree.put(3, "c");
        tree.put(4, "d");

        // key 로 value 를 조회한다.
        assertThat(tree.get(1)).isEqualTo("a");

        // key 최솟값을 가져온다.
        assertThat(tree.firstKey()).isEqualTo(1);

        // key 최댓값을 가져온다.
        assertThat(tree.lastKey()).isEqualTo(4);

        // 최소 entry를 가져온다.
        assertThat(tree.firstEntry())
            .extracting(Entry::getKey, Entry::getValue)
            .containsExactly(1, "a");

        // 최대 entry를 가져온다.
        assertThat(tree.lastEntry())
            .extracting(Entry::getKey, Entry::getValue)
            .containsExactly(4, "d");

        // 최소 entry를 가져오고, tree에서 제거한다.
        assertThat(tree.pollFirstEntry())
            .extracting(Entry::getKey, Entry::getValue)
            .containsExactly(1, "a");

        assertThat(tree.containsKey(1)).isFalse();

        // key로 노드를 제거하고, value 를 반환한다.
        assertThat(tree.remove(4))
            .isEqualTo("d");

        assertThat(tree.containsKey(4)).isFalse();
        assertThat(tree.containsValue("d")).isFalse();

        // tree를 모두 비운다.
        tree.clear();
        assertThat(tree.size()).isEqualTo(0);
        assertThat(tree.isEmpty()).isTrue();
    }
}