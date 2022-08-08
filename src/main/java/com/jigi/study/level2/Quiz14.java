package com.jigi.study.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 메뉴 리뉴얼
 */
public class Quiz14 {

    public String[] solution(String[] orders, int[] course) {

        Set<String> result = new HashSet<>();
        for (int r : course) {
            Map<String, Integer> candidateMap = new HashMap<>();
            for (String order : orders) {
                String[] menus = order.split("");
                combination(menus, new boolean[menus.length], 0, menus.length, r, candidateMap);
            }
            result.addAll(getResultMap(candidateMap));
        }

        return result.stream()
            .sorted()
            .collect(Collectors.toList())
            .toArray(new String[0]);
    }

    private Set<String> getResultMap(Map<String, Integer> candidateMap) {
        Set<String> result = new HashSet<>();
        int max = candidateMap.keySet().stream()
            .filter(key -> candidateMap.get(key) >= 2)
            .max((s1, s2) -> candidateMap.get(s1) - candidateMap.get(s2))
            .map(key -> candidateMap.get(key))
            .orElse(-1);

        Set<String> menuSet = candidateMap.entrySet().stream()
            .filter(entry -> entry.getValue() == max)
            .map(entry -> entry.getKey())
            .collect(Collectors.toSet());
        result.addAll(menuSet);
        return result;
    }

    private void combination(String[] arr, boolean[] visited, int start, int n, int r,
        Map<String, Integer> candidateMap) {
        if (r == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    stringBuilder.append(arr[i]);
                }
            }
            String[] split = stringBuilder.toString().split("");
            Arrays.sort(split);

            final String menu = Arrays.stream(split).collect(Collectors.joining());
            int menuCount = candidateMap.getOrDefault(menu, 0);
            candidateMap.put(menu, ++menuCount);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, candidateMap);
            visited[i] = false;
        }
    }
}
