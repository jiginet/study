package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Quiz14Test {

    @Test
    void regularExpress() {
        assertThat("AC".matches(".*A.*C.*F.*")).isFalse();
        assertThat("ABCFG".matches(".*A.*C.*F.*")).isTrue();
    }

    @Test
    void solution() {
        Quiz14 quiz = new Quiz14();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        String[] result = {"AC", "ACDE", "BCFG", "CDE"};
        assertThat(quiz.solution(orders, course)).isEqualTo(result);
    }

    @Test
    void solution2() {
        Quiz14 quiz = new Quiz14();
        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2, 3, 5};
        String[] result = {"ACD", "AD", "ADE", "CD", "XYZ"};
        assertThat(quiz.solution(orders, course)).isEqualTo(result);
    }

    @Test
    void solution3() {
        Quiz14 quiz = new Quiz14();
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};
        String[] result = {"WX", "XY"};
        assertThat(quiz.solution(orders, course)).isEqualTo(result);
    }
}
