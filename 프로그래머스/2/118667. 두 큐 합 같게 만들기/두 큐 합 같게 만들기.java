import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0;
        long sum2 = 0;
        long totalSum = 0;
        
        
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        
        for(int i : queue1) {
            deque1.offerLast(i);
            sum1 += i;
        }
        for(int i : queue2) {
            deque2.offerLast(i);
            sum2 += i;
        }
        
        totalSum = sum1 + sum2;
        
        if(totalSum % 2 != 0) return -1;
        
        for(int i = 0; i < queue1.length * 3; i++) {
            if(sum1 == sum2) return answer;
            
            if(sum1 > sum2) {
                int n = deque1.pollFirst();
                deque2.offerLast(n);
                
                sum1 -= n;
                sum2 += n;

            } else if(sum1 < sum2) {
                int n = deque2.pollFirst();
                deque1.offerLast(n);
                
                sum1 += n;
                sum2 -= n;
            }
            answer++;
        }
        
        return -1;
    }
}