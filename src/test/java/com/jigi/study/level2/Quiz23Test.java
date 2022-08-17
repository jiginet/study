package com.jigi.study.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Quiz23Test {

    @Test
    @DisplayName("모든 단어의 첫글자를 대문자로 만든다.")
    void solution() {

        Quiz23 quiz = new Quiz23();
        assertThat(quiz.solution("  abc  abc")).isEqualTo("  Abc  Abc");
        assertThat(quiz.solution("3people unFollowed me")).isEqualTo("3people Unfollowed Me");
        assertThat(quiz.solution("for the last week")).isEqualTo("For The Last Week");
        assertThat(quiz.solution("abc  bac  ")).isEqualTo("Abc  Bac  ");
    }
}
