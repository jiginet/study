package com.jigi.study.level2;

import java.util.Stack;

/**
 * 같은 문자 제거
 */
public class Quiz15 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        stack.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (stack.isEmpty()) {
                return 1;
            }
            if (stack.peek() == array[i]) {
                stack.pop();
                continue;
            }
            stack.push(array[i]);
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
