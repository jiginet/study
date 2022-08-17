package com.jigi.study.level2;

import java.util.Stack;

/**
 * 수식 최대화
 */
public class Quiz22 {

    private final static String[][] OPERATOR_PRIORITIES = {
            {"\\*", "\\+" , "-"},
            {"\\*", "-" , "\\+"},
            {"\\+", "\\*" , "-"},
            {"\\+", "-" , "\\*"},
            {"-", "\\*" , "\\+"},
            {"-", "\\+" , "\\*"}
    };

    // todo : 여기서부터 다시 시작 : 아직해결 못함 ㅜㅜ
    public long solution(String expression) {
        long answer = 0;
        for (String[] operators : OPERATOR_PRIORITIES) {
            long result = calculate(expression, operators, 0);
            if (result > answer) {
                answer = result;
            }
        }
        return answer;
    }

    private long calculate(String expression, String[] operators, int i) {
        if (isNumeric(expression)) {
            return Long.parseLong(expression);
        }
        String[] split = expression.split(operators[i]);
        i++;
        long firstResult = calculate(split[0], operators, i);
        long secondResult = calculate(split[1], operators, i);
        switch (operators[i]) {
            case "*":
                return  firstResult * secondResult;
            case "+":
                return  firstResult + secondResult;
            default:
                return  firstResult - secondResult;
        }
    }

    private static boolean isNumeric(String param) {
        return param.chars().allMatch(Character::isDigit);
    }
}
