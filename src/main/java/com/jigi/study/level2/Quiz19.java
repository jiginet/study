package com.jigi.study.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Quiz19 {

    public int solution(int N, int[][] road, int K) {
        int[][] nodeArray = mapNodeArray(N, road);
        boolean[] visitedNode = new boolean[N + 1];
        bfs(nodeArray, visitedNode, new Node(1, 0), K);

        int answer = 0;
        for (boolean visited : visitedNode) {
            if (visited) {
                answer++;
            }
        }
        return answer - 1;
    }

    private void bfs(int[][] nodeArray, boolean[] visitedNode, Node node, int maxDistance) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (visitedNode[node.getNumber()] || node.isOverDistance(maxDistance)) {
                continue;
            }

            visitedNode[node.getNumber()] = true;
            System.out.print(node + " ");

            for (int i = 1; i < nodeArray.length; i++) {
                if (nodeArray[node.getNumber()][i] > 0) {
                    int currentDistance = nodeArray[node.getNumber()][i];
                    int passedDistance = node.getPassedDistance();
                    queue.add(new Node(i, currentDistance + passedDistance));
                }
            }
        }
    }

    private int[][] mapNodeArray(int n, int[][] road) {
        int[][] nodeArray = new int[n + 1][n + 1];

        for (int i = 0; i < road.length; i++) {
            int x = road[i][0];
            int y = road[i][1];
            int distance = road[i][2];
            if (nodeArray[x][y] != 0 && nodeArray[x][y] < distance) {
                continue;
            }
            nodeArray[x][y] = distance;
            nodeArray[y][x] = distance;
        }
        return nodeArray;
    }

    private class Node {

        private final int number;
        private final int passedDistance;

        public Node(int number, int passedDistance) {
            this.number = number;
            this.passedDistance = passedDistance;
        }

        public boolean isOverDistance(int maxDistance) {
            return passedDistance > maxDistance;
        }

        public int getNumber() {
            return number;
        }

        public int getPassedDistance() {
            return passedDistance;
        }

        @Override
        public String toString() {
            return number + "[" + passedDistance + "]";
        }
    }
}
