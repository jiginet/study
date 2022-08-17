package com.jigi.study.level2;

import java.util.Stack;

/**
 * 짝지어 제거하기
 */
public class Quiz15 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (!stack.isEmpty() && stack.peek() == array[i]) {
                stack.pop();
                continue;
            }
            stack.push(array[i]);
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
