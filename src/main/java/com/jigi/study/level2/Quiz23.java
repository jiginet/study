package com.jigi.study.level2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JadenCase 문자열 만들기
 */
public class Quiz23 {

    public String solution(String s) {
        Pattern pattern = Pattern.compile("([\\S]+)");
        Matcher matcher = pattern.matcher(s);

        return matcher
                .replaceAll(x -> x.group().substring(0, 1).toUpperCase()
                        + x.group().substring(1).toLowerCase());
    }
}
