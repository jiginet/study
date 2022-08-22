package com.jigi.study.level3;

import java.util.HashMap;
import java.util.Map;

/**
 * N으로 표현 (입력값 N을 사칙연산, 괄호를 최소 사용하여 number 를 완성한다.)
 */
public class Challenge2 {

    public static final int LIMIT_COUNT = 8;
    private final Map<String, Integer> resultMap = new HashMap<>();

    // todo : 아직 못품(40점짜리), 어렵다. ㅠㅠ
    public int solution(int N, int number) {
        if (N == number) {
            return 1;
        }
        resultMap.clear();
        resultMap.put(String.valueOf(N), N);
        String[] expressions = resultMap.keySet().toArray(String[]::new);
        return calculateExpression(N, expressions, number);
    }

    private int calculateExpression(final int N, String[] expressions, final int number) {
        int result = findNumber(expressions, N, number);
        if (result == -1) {
            return result;
        }
        if (result > 0) {
            return result;
        }
        String[] newExpressions = resultMap.keySet().toArray(String[]::new);
        return calculateExpression(N, newExpressions, number);
    }

    private int findNumber(String[] expressions, int N, int number) {
        for (String expression : expressions) {
            if (resultMap.containsKey(expression + "+" + N)) {
                continue;
            }
            int nCount = expression.length() - expression.replaceAll(String.valueOf(N), "").length() + 1;
            if (nCount > LIMIT_COUNT) {
                return -1;
            }
            String repeatN = String.valueOf(N).repeat(nCount);
            resultMap.put(repeatN, Integer.parseInt(repeatN));

            Integer calculatedResult = resultMap.get(expression);
            resultMap.put(expression + "+" + N, calculatedResult + N);
            resultMap.put(expression + "-" + N, calculatedResult - N);
            resultMap.put(expression + "*" + N, calculatedResult * N);
            resultMap.put(expression + "/" + N, calculatedResult / N);

            if (calculatedResult + N == number ||
                calculatedResult - N == number ||
                calculatedResult * N == number ||
                calculatedResult / N == number ||
                resultMap.get(repeatN) == number) {
                return nCount;
            }
        }
        return 0;
    }
}
