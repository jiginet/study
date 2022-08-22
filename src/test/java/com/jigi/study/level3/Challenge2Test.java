package com.jigi.study.level3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Challenge2Test {

    @Test
    @DisplayName("N을 최소한 사용하여 number를 찾는다.")
    void findNumber() {
        Challenge2 challenge = new Challenge2();
        assertThat(challenge.solution(5,12)).isEqualTo(4);
        assertThat(challenge.solution(2,11)).isEqualTo(3);
        assertThat(challenge.solution(5,26)).isEqualTo(4);
    }

    @Test
    @DisplayName("N과 number 가 같으면 1을 반환한다.")
    void equalNumber() {
        Challenge2 challenge = new Challenge2();
        assertThat(challenge.solution(5,5)).isEqualTo(1);
        assertThat(challenge.solution(3,3)).isEqualTo(1);
    }

    @Test
    @DisplayName("N != 1이고, number == 1 인 경우는 2를 리턴한다.")
    void findNumber2() {
        Challenge2 challenge = new Challenge2();
        assertThat(challenge.solution(3,1)).isEqualTo(2);
    }

    @Test
    @DisplayName("최솟값이 8을 초과하면 -1을 리턴한다.")
    void notFindNumber() {
        Challenge2 challenge = new Challenge2();
        assertThat(challenge.solution(9,32_000)).isEqualTo(-1);
    }

    @Test
    void name() {

        // list to array
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String[] strings = list.toArray(String[]::new);

        // array to list
        String[] array = {"a", "b", "c", "d"};
        List<String> list2 = Arrays.asList(array);
        list2.add("e");
    }
}