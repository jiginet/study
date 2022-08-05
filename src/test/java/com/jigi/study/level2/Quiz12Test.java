package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Quiz12Test {

    @Test
    void solution() {
        Quiz12 quiz = new Quiz12();
        assertThat(quiz.solution(437674, 3)).isEqualTo(3);
        assertThat(quiz.solution(110011, 10)).isEqualTo(2);

        assertThat(quiz.solution(1, 3)).isEqualTo(0);
        assertThat(quiz.solution(1, 10)).isEqualTo(0);

        assertThat(quiz.solution(1_000_000, 3)).isEqualTo(2);
        assertThat(quiz.solution(1_000_000, 10)).isEqualTo(0);
    }

    @Test
    @DisplayName("진법변환 학습")
    void toStringTest() {
        int a = 10;
        System.out.println("3진수 = " + Integer.toString(a, 3));
        System.out.println("8진수 = " + Integer.toString(a, 8));
        System.out.println("2진수 = " + Integer.toString(a, 2));
    }

    @Test
    void prime() {
        Quiz12 quiz = new Quiz12();
        assertThat(quiz.isPrime(1)).isFalse();
        assertThat(quiz.isPrime(2)).isTrue();
        assertThat(quiz.isPrime(3)).isTrue();
        assertThat(quiz.isPrime(4)).isFalse();
        assertThat(quiz.isPrime(5)).isTrue();
    }

    @Test
    @DisplayName("정규식 학습")
    void patterMatcher() {
        String strings = "0111010";
        Pattern pattern = Pattern.compile("0?[^0]+0?");  // 0P0, 0P, P0, P (P는 0 이외의 1개 이상 문자열)
        Matcher matcher = pattern.matcher(strings);

        // find : 매치되는 문자열이 있으면 true 반환
        while (matcher.find()) {
            // group : 매치되는 문자열 반환
            System.out.println("matcher.group() = " + matcher.group());
        }
    }
}
