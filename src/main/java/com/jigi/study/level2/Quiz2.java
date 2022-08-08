package com.jigi.study.level2;

import java.util.Arrays;

/**
 * H-index
 */
public class Quiz2 {
    public int solution(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        int remain = n;
        int h = 0;
        for (int i = 0; i < n; i++) {
            remain--;
            if (i == 0) {
                h = Math.min(citations[i], n);
            } else {
                if (citations[i] <= remain + 1) {
                    h = citations[i];
                } else {
                    h = Math.max(Math.min(remain + 1, citations[i]), h);
                }
            }
        }

        return h;
    }
}
