import java.util.*;

public class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int size = 0;
        for (String operation : operations) {
            String[] tokens = operation.split(" ");
            if (tokens[0].equals("I")) { // 삽입 연산
                int value = Integer.parseInt(tokens[1]);
                maxHeap.offer(value);
                minHeap.offer(value);
                size++;
            } else { // 삭제 연산
                if (size == 0) continue;
                if (tokens[1].equals("1")) { // 최댓값 삭제
                    maxHeap.poll();
                } else { // 최솟값 삭제
                    minHeap.poll();
                }
                size--;
                if (size == 0) {
                    maxHeap.clear();
                    minHeap.clear();
                }
            }
        }
        if (size == 0) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxHeap.peek(), minHeap.peek()};
        }
    }
}