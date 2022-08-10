package com.jigi.study.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * 멀리뛰기 : 경우의 수 구하기 : 아직 풀지 못함(ㅠㅠ)
 */
public class Quiz20 {

    private Set<String> uniqueCase = new HashSet<>();

    public long solution(int n) {
        if (n < 3) {
            return n;
        }
        int[] numbers = getPermutationNumbers(n);
        uniqueCase.clear();
        permutation(numbers, new int[n], new boolean[numbers.length], 0, n);
        return uniqueCase.size() % 1234567;
    }

    private void permutation(int[] numbers, int[] result, boolean[] visited, int depth, final int expectedNumber) {
        int sum = 0;
        StringBuilder sumString = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (visited[i]) {
                sum += result[i];
                sumString.append(result[i]);
            }
        }
        if (sum == expectedNumber) {
            uniqueCase.add(sumString.toString());
            return;
        }
        if (sum > expectedNumber || depth == expectedNumber) {
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = numbers[i];
                permutation(numbers, result, visited, depth + 1, expectedNumber);
                visited[i] = false;
            }
        }
    }

    private int[] getPermutationNumbers(int n) {
        int arraySize = n + n / 2;
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            if (i < n) {
                numbers[i] = 1;
                continue;
            }
            numbers[i] = 2;
        }
        return numbers;
    }
}
