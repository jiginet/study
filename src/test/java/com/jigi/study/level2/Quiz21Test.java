package com.jigi.study.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Quiz21Test {

    @Test
//    @DisplayName("")
    void predefined() {
        Quiz21 quiz = new Quiz21();
        String[][] relation = {
            {"100", "ryan", "music", "2"},
            {"200", "apeach", "math", "2"},
            {"300", "tube", "computer", "3"},
            {"400", "con", "computer", "4"},
            {"500", "muzi", "music", "3"},
            {"600", "apeach", "music", "2"}
        };
        assertThat(quiz.solution(relation)).isEqualTo(2);
    }
}
