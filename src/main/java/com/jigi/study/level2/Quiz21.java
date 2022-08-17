package com.jigi.study.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 후보키 : 테이블의 PK를 찾아라
 */
public class Quiz21 {

    // todo : 아직 풀지못함. ㅠㅠ
    public int solution(String[][] relation) {
        final int columnSize = relation[0].length;
        int answer = 0;

        // step1. 열을 행으로 변환하여 각각의 리스트로 담는다.
        List<String>[] columns = mapToColumns(relation);

        // step2. 각 리스트 중에 중복값이 없는 리스트 찾는다. 반환값에 +n개
        boolean[] uniqueColumns = findUniqueColumns(columns);
        for (boolean isUnique : uniqueColumns) {
            if(isUnique) {
                answer++;
            }
        }

        // step3. 중복값이 있는 리스트의 조합의 수를 찾는다. 작은 수부터 찾기 시작함
        int multiUniqueColumnCount = countMultiUniqueColumns(uniqueColumns, columns);

        // step5. 찾은 리스트의 개수를 반환한다.
        return answer;
    }

    // todo : 여기서부터 다시 시작
    private int countMultiUniqueColumns(boolean[] uniqueColumns, List<String>[] columns) {

        return 0;
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

    private boolean[] findUniqueColumns(List<String>[] columns) {
        final int columnSize = columns.length;
        boolean[] uniqueColumns = new boolean[columnSize];
        for (int i = 0; i < columnSize; i++) {
            long distinctCount = columns[i].stream()
                .distinct()
                .count();
            if (columns[i].size() == distinctCount) {
                uniqueColumns[i] = true;
            }
        }
        return uniqueColumns;
    }

    private List<String>[] mapToColumns(String[][] relation) {
        final int columnSize = relation[0].length;
        List<String>[] columns = new ArrayList[columnSize];
        for (int j = 0; j < columnSize; j++) {
            ArrayList<String> column = new ArrayList<>();
            for (int i = 0; i < relation.length; i++) {
                column.add(relation[i][j]);
            }
            columns[j] = column;
        }
        return columns;
    }
}
