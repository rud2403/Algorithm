import java.util.*;

class Solution {
    public int solution(int[] stones, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < stones.length; i++) {
            // 뒤에서부터 현재 값보다 작거나 같은 건 다 제거
            while(!dq.isEmpty() && stones[dq.peekLast()] <= stones[i]) {
                dq.pollLast();
            }
            
            dq.offerLast(i);
            
            // 윈도우 범위 벗어나면 제거
            if (dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            
            // 윈도우가 완성된 시점부터 답 갱신
            if(i >= k - 1) {
                answer = Math.min(answer, stones[dq.peekFirst()]);
            }
        }
        
        return answer;
    }
}