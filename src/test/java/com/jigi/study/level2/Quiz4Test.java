package com.jigi.study.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Quiz4Test {
    @Test
    void solution() {
        Quiz4 quiz = new Quiz4();
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };

        String[] answer = {
                "Prodo님이 들어왔습니다.",
                "Ryan님이 들어왔습니다.",
                "Prodo님이 나갔습니다.",
                "Prodo님이 들어왔습니다."
        };
        Assertions.assertThat(quiz.solution(record)).isEqualTo(answer);
    }

    @Test
    void solution2() {
        Quiz4 quiz = new Quiz4();
        String[] record = {
                "Enter uid1234 Muzi",
                "Change uid1234 Prodo",
                "Enter uid1235 Prodo",
                "Enter uid1236 Prodo",
                "Enter uid4567 Prodo"
        };

        String[] answer = {
                "Prodo님이 들어왔습니다.",
                "Prodo님이 들어왔습니다.",
                "Prodo님이 들어왔습니다.",
                "Prodo님이 들어왔습니다."
        };
        Assertions.assertThat(quiz.solution(record)).isEqualTo(answer);
    }
}