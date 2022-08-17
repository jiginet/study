package com.jigi.study.level2;

/**
 * 수식 최대화
 */
public class Quiz22 {

    private final static String[] OPERATOR_PRIORITIES = {"*+-", "*-+", "+*-", "+-*", "-*+", "-+*"};

    // todo : 여기서부터 다시 시작
    public long solution(String expression) {
        long answer = 0;
        for (String operatorPriority : OPERATOR_PRIORITIES) {
            long result = calculate(expression, operatorPriority);
            if (result > answer) {
                answer = result;
            }
        }
        return answer;
    }

    private long calculate(String expression, String operatorPriority) {
        String[] operators = operatorPriority.split("");

        return 0;
    }
}
