package com.jigi.study.level3;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 이중 우선순위 큐 ( I : 숫자삽입, D 1 : 최댓값 삭제, D -1 : 최솟값 삭제 )
 */
public class Challenge1 {

    public int[] solution(String[] operations) {
        DoublePriorityQueue queue = new DoublePriorityQueue();
        for (int i = 0; i < operations.length; i++) {
            queue.execute(new Operation(operations[i]));
        }
        return queue.pop();
    }

    private class DoublePriorityQueue {

        private final PriorityQueue<Integer> forwardQueue = new PriorityQueue<>();
        private final PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Comparator.reverseOrder());

        public void execute(Operation operation) {
            if (operation.isInsert()) {
                forwardQueue.offer(operation.getOperand());
                reverseQueue.offer(operation.getOperand());
                return;
            }
            if (operation.isDeleteMax()) {
                Integer max = reverseQueue.poll();
                forwardQueue.remove(max);
                return;
            }
            Integer min = forwardQueue.poll();
            reverseQueue.remove(min);
        }

        public int[] pop() {
            if (forwardQueue.isEmpty()) {
                return new int[]{0, 0};
            }
            return new int[]{reverseQueue.peek(), forwardQueue.peek()};
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
