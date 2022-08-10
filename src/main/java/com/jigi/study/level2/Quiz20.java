package com.jigi.study.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 멀리뛰기 : 경우의 수 구하기 : 아직 풀지 못함(ㅠㅠ)
 */
public class Quiz20 {

    private Set<String> uniqueCase = new HashSet<>();

    public long solution(int n) {
        if (n < 3) {
            return n;
        }
        Jump[] jumps = getJumps(n);
        uniqueCase.clear();
        permutation(jumps, new Jump[n], 0, n);
        return uniqueCase.size() % 1234567;
    }



    private void permutation(Jump[] jumps, Jump[] result, int depth, final int expectedDistance) {
        int jumpDistance = Arrays.stream(result)
            .filter(Objects::nonNull)
            .filter(Jump::isVisited)
            .mapToInt(Jump::getDistance)
            .sum();
        if (jumpDistance == expectedDistance) {
            String jumpString = Arrays.stream(result)
                .filter(Jump::isVisited)
                .map(Jump::getDistance)
                .map(String::valueOf)
                .collect(Collectors.joining(""));
            uniqueCase.add(jumpString);
            return;
        }
        if (jumpDistance > expectedDistance || depth == expectedDistance) {
            return;
        }

        for (int i = 0; i < jumps.length; i++) {
            Jump jump = Optional.ofNullable(result[i]).orElse(jumps[i].copy());
            if (!jump.isVisited()) {
                jump.visit();
                result[depth] = jumps[i].copy();
                permutation(jumps, result, depth + 1, expectedDistance);
                jumps[i].cancelVisit();
            }
        }
    }

    private Jump[] getJumps(int n) {
        int arraySize = n + n / 2;
        Jump[] jumps = new Jump[arraySize];
        for (int i = 0; i < arraySize; i++) {
            if (i < n) {
                jumps[i] = new Jump(1);
                continue;
            }
            jumps[i] = new Jump(2);
        }
        return jumps;
    }

    private class Jump {

        private final int distance;
        private boolean visited;

        public Jump(int distance) {
            this.distance = distance;
        }

        public boolean isVisited() {
            return visited;
        }

        public void visit() {
            visited = true;
        }

        public void cancelVisit() {
            visited = false;
        }

        public int getDistance() {
            return distance;
        }

        public Jump copy() {
            return new Jump(distance);
        }
    }
}
