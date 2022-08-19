package com.jigi.study.level3;

import java.util.TreeMap;

/**
 * 이중 우선순위 큐 - TreeMap 이용 ( I : 숫자삽입, D 1 : 최댓값 삭제, D -1 : 최솟값 삭제 )
 */
public class Challenge1StepUp {

    public int[] solution(String[] operations) {
        DoublePriorityQueue queue = new DoublePriorityQueue();
        for (int i = 0; i < operations.length; i++) {
            queue.offer(new Operation(operations[i]));
        }
        return queue.pop();
    }

    private class DoublePriorityQueue {

        private final TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        public void offer(Operation operation) {
            if (operation.isInsert()) {
                treeMap.put(operation.getOperand(), operation.getOperand());
                return;
            }
            if (operation.isDeleteMax()) {
                treeMap.pollLastEntry();
                return;
            }
            treeMap.pollFirstEntry();
        }

        public int[] pop() {
            if (treeMap.isEmpty()) {
                return new int[]{0, 0};
            }
            return new int[]{treeMap.lastKey(), treeMap.firstKey()};
        }
    }

    private class Operation {

        public static final String INSERT = "I";
        public static final String DELETE = "D";
        public static final int MAX = 1;
        private final String operator;
        private final int operand;

        public Operation(String operation) {
            String[] split = operation.split(" ");
            this.operator = split[0];
            this.operand = Integer.parseInt(split[1]);
        }

        public int getOperand() {
            return operand;
        }

        public boolean isInsert() {
            return operator.equals(INSERT);
        }

        public boolean isDeleteMax() {
            return operator.equals(DELETE) && operand == MAX;
        }
    }
}
