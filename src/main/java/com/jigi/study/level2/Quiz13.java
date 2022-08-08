package com.jigi.study.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Quiz13 {

    private Set<Integer> uniqueNumbers = new HashSet();

    /** 소수찾기
     *
     * @param numbers
     * @return
     */
    public int solution(String numbers) {

        final int numbersLength = numbers.length();
        String[] splitNumbers = numbers.split("");
        int answer = 0;
        for (int i = 1; i <= numbersLength; i++) {
            answer += permutation(splitNumbers, new String[i], new boolean[splitNumbers.length], 0, i);
        }

        return answer;
    }

    private int permutation(String[] splitNumbers, String[] result, boolean[] visited, int depth, int r) {
        if (depth == r) {
            String mixedNumber = Arrays.stream(result)
                .collect(Collectors.joining());
            int number = Integer.parseInt(mixedNumber);
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
                if (isPrime(number)) {
                    return 1;
                }
            }

            return 0;
        }
        int primeCount = 0;
        for (int i = 0; i < splitNumbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = splitNumbers[i];
                primeCount += permutation(splitNumbers, result, visited, depth + 1, r);
                visited[i] = false;
            }
        }

        return primeCount;
    }

    private boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        final int end = (int) Math.sqrt(number);
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
