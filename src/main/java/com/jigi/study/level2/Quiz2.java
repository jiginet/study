package com.jigi.study.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz2 {
    public int solution(int[] citations) {
        List<Integer> list = Arrays.stream(citations)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        final int size = citations.length;

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                answer = list.get(i);
                continue;
            }
            if (answer > list.get(i)) {
                answer = list.get(i);
            }
            if (i + 1 >= answer) {
                break;
            }
        }
        return answer > size ? size : answer;
    }
}
