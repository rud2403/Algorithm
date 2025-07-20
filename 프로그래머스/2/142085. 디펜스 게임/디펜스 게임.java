import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        int round = 0;

        for (int e : enemy) {
            pq.offer(e);
            n -= e;

            if (n < 0) {
                if (k > 0) {
                    n += pq.poll(); // 가장 큰 적을 무적 처리
                    k--;
                } else {
                    break;
                }
            }
            round++;
        }

        return round;
    }
}
