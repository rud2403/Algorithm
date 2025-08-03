/* 
    works = 일에대한 작업량 works
    n = 남은 시간
*/
import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long sum = 0;
        long answer = 0;
        
        for(int i : works) {
            sum += i;
        }
        if(sum < n) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < works.length; i++) {
            pq.offer(works[i]);
        }
        
        for(int i = 0; i < n; i++) {
            int num = pq.poll() - 1;
            
            pq.offer(num);
        }
        
        while(!pq.isEmpty()) {
            int i = pq.poll();
            answer += i * i;
        }
        
        return answer;
    }
}